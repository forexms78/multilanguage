package com.example.multilanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText te;
    Button bu;
    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        te = (EditText)findViewById(R.id.text);
        bu = (Button)findViewById(R.id.button);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                te.setText(R.string.mytext);
            }
        };
        bu.setOnClickListener(cl);
    }
}
