package com.example.call_phone_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText phn;
    Button btn;
    Intent i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phn = findViewById(R.id.number);
        btn = findViewById(R.id.call_btn);
        btn.setOnClickListener(this);
    }

    public void onClick(View view) {
        i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phn.getText().toString()));
        startActivity(i);
    }
}