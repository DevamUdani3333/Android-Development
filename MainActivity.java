package com.example.displayonanotherfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nmtxt;
    Button btn;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmtxt = findViewById(R.id.name);
        btn = findViewById(R.id.subbtn);

        btn.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        i=new Intent(this,second.class);
        i.putExtra("nm",nmtxt.getText().toString());
        startActivity(i);
    }
}