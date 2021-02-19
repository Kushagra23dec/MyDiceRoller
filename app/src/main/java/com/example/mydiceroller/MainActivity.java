package com.example.mydiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random ranNo = new Random();
    private ImageView img_1,img_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_1 = findViewById(R.id.imageView);
        img_2 = findViewById(R.id.imageView2);

    }

    public void rollMyDice(View d) {
        int rNo_1 = ranNo.nextInt(6) + 1;
        int rNo_2 = ranNo.nextInt(6) + 1;

        switch (rNo_1) {
            case 1: img_1.setImageResource(R.drawable.dice1);
                    break;
            case 2: img_1.setImageResource(R.drawable.dice2);
                    break;
            case 3: img_1.setImageResource(R.drawable.dice3);
                    break;
            case 4: img_1.setImageResource(R.drawable.dice4);
                    break;
            case 5: img_1.setImageResource(R.drawable.dice5);
                    break;
            case 6: img_1.setImageResource(R.drawable.dice6);
                    break;
        }

        switch (rNo_2) {
            case 1: img_2.setImageResource(R.drawable.dice1);
                    break;
            case 2: img_2.setImageResource(R.drawable.dice2);
                    break;
            case 3: img_2.setImageResource(R.drawable.dice3);
                    break;
            case 4: img_2.setImageResource(R.drawable.dice4);
                    break;
            case 5: img_2.setImageResource(R.drawable.dice5);
                    break;
            case 6: img_2.setImageResource(R.drawable.dice6);
                    break;
        }

    }

}