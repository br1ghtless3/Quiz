package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults1 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results1);

        final AppCompatButton StartQuizBtn1 = findViewById(R.id.StartBtn1);
        final TextView correctAnswers1 = findViewById(R.id.corans1);
        final TextView incorrectAnswers1 = findViewById(R.id.incorans1);

        final int CorrectAns1 = getIntent().getIntExtra("correct", 0);
        final int IncorrectAns1 = getIntent().getIntExtra("incorrect", 0);

        correctAnswers1.setText("Количесво правильных ответов: " + CorrectAns1);
        incorrectAnswers1.setText("Количесво не правильных ответов: " + IncorrectAns1);


        StartQuizBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults1.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults1.this,
                MainActivity.class));
        finish();
    }

}