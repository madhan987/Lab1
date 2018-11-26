package com.hp.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

       static  String msg;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.editText);
         Toast.makeText(getBaseContext(), "first page.", Toast.LENGTH_SHORT).show();
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra(msg, et1.getText().toString());
                startActivity(i);
            }
        });
    }
}