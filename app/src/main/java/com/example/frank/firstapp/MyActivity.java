package com.example.frank.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {

    private Button bt_ClickHere;
    private EditText et_SomeText;
    private TextView tv_SomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);

        bt_ClickHere = (Button) findViewById(R.id.btClickHere);
        et_SomeText = (EditText) findViewById(R.id.etSomeText);
        tv_SomeText = (TextView) findViewById(R.id.tvSomeText);

        tv_SomeText.setText("");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void Button1_Click(View view) {
        String someText;

        someText = String.valueOf(et_SomeText.getText());

        tv_SomeText.setText("You type " + someText);
    }
}
