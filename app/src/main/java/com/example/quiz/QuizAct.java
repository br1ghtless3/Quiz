package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizAct extends AppCompatActivity {

    private TextView question;
    private TextView quis;

    private AppCompatButton oneotvet, twootvet, threeotvet, foureotvet;

    private AppCompatButton nextbtn;
    private Timer qtimer;

    private int seconds = 0;
    private int minuts = 1;

    private List<QuestionList> questionLists;

    private int curQuestNow = 0;

    private String usersotvet = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView nameTopic = findViewById(R.id.nameTopic);


        question = findViewById(R.id.question);
        quis = findViewById(R.id.quis);

        oneotvet = findViewById(R.id.oneotvet);
        twootvet = findViewById(R.id.twootvet);
        threeotvet = findViewById(R.id.threeotvet);
        foureotvet = findViewById(R.id.foureotvet);

        nextbtn = findViewById(R.id.nextbtn);


        final String getTopic = getIntent().getStringExtra("selectedTopic");

        nameTopic.setText(getTopic);

        questionLists = Bank.getQuestion(getTopic);

        startTimer(timer);

        question.setText((curQuestNow + 1) + "/" + questionLists.size());
        quis.setText(questionLists.get(0).getQuestion());
        oneotvet.setText(questionLists.get(0).getOneotvet());
        twootvet.setText(questionLists.get(0).getTwootvet());
        threeotvet.setText(questionLists.get(0).getThreeotvet());
        foureotvet.setText(questionLists.get(0).getFoureotvet());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtimer.purge();
                qtimer.cancel();

                startActivity(new Intent(QuizAct.this, MainActivity.class));
                finish();
            }
        });

        oneotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usersotvet.isEmpty()) {

                    usersotvet = oneotvet.getText().toString();
                    oneotvet.setBackgroundResource(R.drawable.incorrectbtn);
                    oneotvet.setTextColor(Color.WHITE);

                    Answerrev();

                    questionLists.get(curQuestNow).setUsersans(usersotvet);
                }
            }
        });

        twootvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usersotvet.isEmpty()) {

                    usersotvet = twootvet.getText().toString();
                    twootvet.setBackgroundResource(R.drawable.incorrectbtn);
                    twootvet.setTextColor(Color.WHITE);

                    Answerrev();

                    questionLists.get(curQuestNow).setUsersans(usersotvet);
                }
            }
        });

        threeotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usersotvet.isEmpty()) {

                    usersotvet = threeotvet.getText().toString();
                    threeotvet.setBackgroundResource(R.drawable.incorrectbtn);
                    threeotvet.setTextColor(Color.WHITE);

                    Answerrev();

                    questionLists.get(curQuestNow).setUsersans(usersotvet);
                }
            }
        });

        foureotvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usersotvet.isEmpty()) {

                    usersotvet = foureotvet.getText().toString();
                    foureotvet.setBackgroundResource(R.drawable.incorrectbtn);
                    foureotvet.setTextColor(Color.WHITE);

                    Answerrev();

                    questionLists.get(curQuestNow).setUsersans(usersotvet);
                }
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usersotvet.isEmpty()) {
                    Toast.makeText(QuizAct.this, "Пожалуйста, сделайте выбор.", Toast.LENGTH_LONG).show();
                } else {
                    ChangeQuiz();
                }

            }
        });
    }

    private void startTimer(TextView timerTextView) {

        qtimer = new Timer();
        qtimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (seconds == 0 && minuts != 0) {
                    minuts--;
                    seconds = 59;
                } else if (seconds == 0 && minuts == 0) {
                    qtimer.purge();
                    qtimer.cancel();

                    Toast.makeText(QuizAct.this, "Время вышло", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizAct.this, QuizResults.class);
                    intent.putExtra("correct", correctAns());
                    intent.putExtra("incorrect", incorrectAns());


                    startActivity(intent);
                    finish();

                } else {
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finmin = String.valueOf(minuts);
                        String finsecond = String.valueOf(seconds);

                        if (finmin.length() == 1) {
                            finmin = "0" + finmin;
                        }
                        if (finsecond.length() == 1) {
                            finsecond = "0" + finsecond;
                        }

                        timerTextView.setText(finmin + ":" + finsecond);

                    }
                });

            }
        }, 1000, 1000);

    }

    private int correctAns() {

        int correctans = 0;

        for (int i = 0; i < questionLists.size(); i++) {

            final String UsAnsGet = questionLists.get(i).getUsersans();
            final String GetAns = questionLists.get(i).getAns();

            if (UsAnsGet.equals(GetAns)) {
                correctans++;
            }

        }

        return correctans;

    }

    private int incorrectAns() {

        int incorrectans = 0;

        for (int i = 0; i < questionLists.size(); i++) {

            final String UsAnsGet = questionLists.get(i).getUsersans();
            final String GetAns = questionLists.get(i).getAns();

            if (!UsAnsGet.equals(GetAns)) {
                incorrectans++;
            }

        }

        return incorrectans;

    }

    @Override
    public void onBackPressed() {
        qtimer.purge();
        qtimer.cancel();

        startActivity(new Intent(QuizAct.this, MainActivity.class));
        finish();
    }

    private void Answerrev() {

        final String getAns = questionLists.get(curQuestNow).getAns();
        if (oneotvet.getText().toString().equals(getAns)){
            oneotvet.setBackgroundResource(R.drawable.correctbtn);
            oneotvet.setTextColor(Color.BLACK);
        }
        else if (twootvet.getText().toString().equals(getAns)){
            twootvet.setBackgroundResource(R.drawable.correctbtn);
            twootvet.setTextColor(Color.BLACK);
        }
        else if (threeotvet.getText().toString().equals(getAns)){
            threeotvet.setBackgroundResource(R.drawable.correctbtn);
            threeotvet.setTextColor(Color.BLACK);
        }
        else if (foureotvet.getText().toString().equals(getAns)){
            foureotvet.setBackgroundResource(R.drawable.correctbtn);
            foureotvet.setTextColor(Color.BLACK);
        }
    }

    private void ChangeQuiz(){
        curQuestNow++;

        if((curQuestNow + 1) == questionLists.size()){
            nextbtn.setText("Результаты");
        }

        if (curQuestNow < questionLists.size()){
            usersotvet = "";

            oneotvet.setBackgroundResource(R.drawable.backround_otvet);
            oneotvet.setTextColor(Color.parseColor("#CC000000"));

            twootvet.setBackgroundResource(R.drawable.backround_otvet);
            twootvet.setTextColor(Color.parseColor("#CC000000"));

            threeotvet.setBackgroundResource(R.drawable.backround_otvet);
            threeotvet.setTextColor(Color.parseColor("#CC000000"));

            foureotvet.setBackgroundResource(R.drawable.backround_otvet);
            foureotvet.setTextColor(Color.parseColor("#CC000000"));

            question.setText((curQuestNow + 1) + "/" + questionLists.size());
            quis.setText(questionLists.get(curQuestNow).getQuestion());
            oneotvet.setText(questionLists.get(curQuestNow).getOneotvet());
            twootvet.setText(questionLists.get(curQuestNow).getTwootvet());
            threeotvet.setText(questionLists.get(curQuestNow).getThreeotvet());
            foureotvet.setText(questionLists.get(curQuestNow).getFoureotvet());
        } else{

            Intent intent = new Intent(QuizAct.this, QuizResults.class);
            intent.putExtra("correct", correctAns());
            intent.putExtra("incorrect", incorrectAns());


            startActivity(intent);
            finish();
        }
    }
}