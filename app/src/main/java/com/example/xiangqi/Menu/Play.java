package com.example.xiangqi.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xiangqi.ChessBoard.Chessboard;
import com.example.xiangqi.R;


public class Play extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final EditText txtPlayer1 = findViewById(R.id.editTextPlayer1);
        final EditText txtPlayer2 = findViewById(R.id.editTextPlayer2);

        final Button btnPlay = findViewById(R.id.btnJugar);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namePlayer1 = txtPlayer1.getText().toString();
                String namePlayer2 = txtPlayer2.getText().toString();

                if(namePlayer1.equals("") || namePlayer2.equals("")){
                    Toast toastNombre = Toast.makeText(getApplicationContext(),"ERROR, El nombre esta vacio.",Toast.LENGTH_SHORT);
                    toastNombre.setMargin(1000,500);
                    toastNombre.show();
                }else{
                    gotoChessboard();
                }
            }
        });

    }

    public void gotoChessboard(){
        Intent intentChessboard = new Intent(this, Chessboard.class);
        startActivity(intentChessboard);
    }
}