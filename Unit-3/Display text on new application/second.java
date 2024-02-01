package com.example.displayonanotherfile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class second extends Activity {
    TextView t;
    Intent i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t = findViewById(R.id.show_name);
        i = getIntent();

        if (i != null && i.hasExtra("text")) {
            String text = i.getStringExtra("text");
            t.setText(text);
        }
    }
}
