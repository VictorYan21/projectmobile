package com.projet.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageButton;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private ImageButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.bt_segunda_tela);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                startActivity(intent);
            }
        });
        bt = findViewById(R.id.bt_terceira_tela);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tela3.class);
                startActivity(intent);
            }

     });
    }
}
