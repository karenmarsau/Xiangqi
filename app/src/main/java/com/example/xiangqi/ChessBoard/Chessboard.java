package com.example.xiangqi.ChessBoard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.xiangqi.R;

public class Chessboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chessboard);

        ImageView viewChessboardBlacks[][] = new ImageView[4][8];
        ImageView viewChessBoardReds[][] = new ImageView[4][8];


        ImageView BlackPieces[] = new ImageView[16];
        ImageView RedPieces[] = new ImageView[16];


    }
}