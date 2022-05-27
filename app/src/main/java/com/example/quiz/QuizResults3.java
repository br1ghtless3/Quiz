package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results3);

        final AppCompatButton StartQuizBtn3 = findViewById(R.id.StartBtn3);
        final TextView correctAnswers3 = findViewById(R.id.corans3);
        final TextView incorrectAnswers3 = findViewById(R.id.incorans3);

        final int CorrectAns3 = getIntent().getIntExtra("correct", 0);
        final int IncorrectAns3 = getIntent().getIntExtra("incorrect", 0);

        correctAnswers3.setText("Количесво правильных ответов: " + CorrectAns3);
        incorrectAnswers3.setText("Количесво не правильных ответов: " + IncorrectAns3);


        StartQuizBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults3.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults3.this,
                MainActivity.class));
        finish();
    }

}