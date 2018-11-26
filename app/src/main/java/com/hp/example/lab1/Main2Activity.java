package com.hp.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtView = (TextView) findViewById(R.id.textView2);
       // String msg;
        Intent i2=getIntent();
        Bundle b=i2.getExtras();

        Toast.makeText(this,"second page "+b.getString(MainActivity.msg),Toast.LENGTH_SHORT).show();

       // Toast.makeText(getBaseContext(), "second page!" , Toast.LENGTH_SHORT ).show();
    }
}
