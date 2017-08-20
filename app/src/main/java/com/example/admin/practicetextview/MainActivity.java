package com.example.admin.practicetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHello, txtWorld;
    private Button btnClick;
    private String hello = "Hello";
    private String world = "World";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHello.setText(hello);
                txtWorld.setText(world);
            }
        });
    }

    private void addControls() {
        txtHello = (TextView) findViewById(R.id.txtHello);
        txtWorld = (TextView) findViewById(R.id.txtWorld);
        btnClick = (Button) findViewById(R.id.btnClick);
    }
}
