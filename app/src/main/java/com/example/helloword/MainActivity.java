package com.example.helloword;
// New Commit
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button B;
    EditText E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B = (Button) findViewById(R.id.Hellobutton);
        E = (EditText) findViewById(R.id.PersonName);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                sendData(s);


            }
        });
    }

    private void sendData(String s) {
        Intent intent = new Intent(this, HelloActivity2.class);
        intent.putExtra( "PersonName", s);

        startActivity(intent);
    }
}