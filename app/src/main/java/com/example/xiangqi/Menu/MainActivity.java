package com.example.xiangqi.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.xiangqi.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToPlay();
            }
        });

        final ImageButton imageButtonInstructions = findViewById(R.id.imgBtnIns);
        imageButtonInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToInstructions();
            }
        });

    }
    public void goToPlay(){
        Intent intentJugar = new Intent(this, Play.class);
        startActivity(intentJugar);
    }

    public void goToInstructions(){
        Intent intentInstructiones = new Intent(this, Instructions.class);
        startActivity(intentInstructiones);
    }
}