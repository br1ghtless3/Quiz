package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;

public class QuizAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView bakeBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView nameTopic = findViewById(R.id.nameTopic);


        final String getTopic = getIntent().getStringExtra("selectedTopic");

        nameTopic.setText(getTopic);
    }
}