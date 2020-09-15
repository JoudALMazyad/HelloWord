package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class HelloActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);

        TextView v;
        v = (TextView)findViewById(R.id.textView);
        Intent i = getIntent();
        v.setText("Hello, "+ i.getStringExtra("PersonName"));
    }
}