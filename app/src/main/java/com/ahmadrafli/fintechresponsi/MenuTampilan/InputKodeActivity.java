package com.ahmadrafli.fintechresponsi.MenuTampilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.ahmadrafli.fintechresponsi.MainActivity;
import com.ahmadrafli.fintechresponsi.R;


public class InputKodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_kode);
        ImageButton buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(InputKodeActivity.this, MainActivity.class));
            }
        });
    }
}