package com.example.hoduchieu.login_registerandroidphp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String email = intent.getStringExtra("EMAIL");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("HELLO: "+email);

    }
}