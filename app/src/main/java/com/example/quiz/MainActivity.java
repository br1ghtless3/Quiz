package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout sssr = findViewById(R.id.sssr);
        final LinearLayout winx = findViewById(R.id.winx);
        final LinearLayout disney = findViewById(R.id.disney);

        final Button startquiz = findViewById(R.id.startquiz);
        final Button infoaboutme = findViewById(R.id.infoaboutme);
        final Button pravila = findViewById(R.id.pravila);




        sssr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "sssr";
                sssr.setBackgroundResource(R.drawable.round_select_topik);

                winx.setBackgroundResource(R.drawable.round_back_white_10);
                disney.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });

        winx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "winx";
                winx.setBackgroundResource(R.drawable.round_select_topik);

                sssr.setBackgroundResource(R.drawable.round_back_white_10);
                disney.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });

        disney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "disney";
                disney.setBackgroundResource(R.drawable.round_select_topik);

                winx.setBackgroundResource(R.drawable.round_back_white_10);
                sssr.setBackgroundResource(R.drawable.round_back_white_10);

            }
        });



        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Выберите викторину", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizAct.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }

            }
        });

        infoaboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, InfoAboutMe.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
            }
        });

        pravila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Pravila.class);
                intent.putExtra("selectedTopic", selectedTopic);
                startActivity(intent);
                finish();
            }
        });

    }
}
