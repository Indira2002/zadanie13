package com.example.zadanie13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        int[][] massivchek = new int[10][10];
        for (int a=0;a < massivchek.length;a++){
            for (int b=0;b < massivchek[a].length;b++){
                massivchek[a][b]=(int)(Math.random()*10);
            }
        }
        for (int i=0;i < massivchek.length;i++,System.out.println()){
            for (int j=0;j < massivchek[i].length;j++){
                System.out.print(massivchek[i][j]+" ");
            }}
        for ( int r = 0; r < massivchek.length; ++r ) {
            for ( int c = 0; c < massivchek[r].length; ++c ) {
                int lastC = c + 1;
                for ( int lastR = r; lastR < massivchek.length; ++lastR ) {
                    while ( lastC < massivchek[lastR].length) {
                        if ( massivchek[lastR][lastC] < massivchek[r][c] ) {
                            int tmp = massivchek[r][c];
                            massivchek[r][c] = massivchek[lastR][lastC];
                            massivchek[lastR][lastC] = tmp;
                        }
                        ++lastC;
                    }
                    lastC = 0;
                }
            }
        }
        for ( int i = 0; i < massivchek.length; ++i )
            System.out.println(java.util.Arrays.toString(massivchek[i]));
    }
}
