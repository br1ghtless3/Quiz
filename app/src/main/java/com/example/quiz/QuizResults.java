package com.example.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResults extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton StartQuizBtn = findViewById(R.id.StartBtn);
        final TextView correctAnswers = findViewById(R.id.corans);
        final TextView incorrectAnswers = findViewById(R.id.incorans);

        final int CorrectAns = getIntent().getIntExtra("correct", 0);
        final int IncorrectAns = getIntent().getIntExtra("incorrect", 0);

        correctAnswers.setText("Количесво правильных ответов: " + CorrectAns);
        incorrectAnswers.setText("Количесво не правильных ответов: " + IncorrectAns);


        StartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this,
                MainActivity.class));
        finish();
    }
}
