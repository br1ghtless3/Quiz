package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results2);

        final AppCompatButton StartQuizBtn2 = findViewById(R.id.StartBtn2);
        final TextView correctAnswers2 = findViewById(R.id.corans2);
        final TextView incorrectAnswers2 = findViewById(R.id.incorans2);

        final int CorrectAns2 = getIntent().getIntExtra("correct", 0);
        final int IncorrectAns2 = getIntent().getIntExtra("incorrect", 0);

        correctAnswers2.setText("Количесво правильных ответов: " + CorrectAns2);
        incorrectAnswers2.setText("Количесво не правильных ответов: " + IncorrectAns2);


        StartQuizBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults2.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults2.this,
                MainActivity.class));
        finish();
    }

}