package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import com.example.task1.adapter.RecycleViewAdapter;
import com.example.task1.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleViewAdapter recycleViewAdapter;

    List<Question> questions;
    TextView chronometer;

    private static final long START_TIME_IN_MILLIS = 600000;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    private static final String PREFS ="Massages pref" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sharedPreferences = getSharedPreferences( PREFS,MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("q1", "14 August");
        editor.putString("q2", "1992");
        editor.putString("q3", "Monday");
        editor.putString("q4", "islamabad");
        editor.putString("q5", "Even");
        editor.putString("q6", "-4");
        editor.putString("q7", "2022");
        editor.putString("q8", "karachi");
        editor.apply();

        recyclerView = findViewById( R.id.rv_test );
        chronometer = findViewById( R.id.chronometer );
        questions = new ArrayList<>();

        questions.add( new Question("Which is indepandence day of pakistan??","14 August","15 August","16 August","17 August",1));
        questions.add( new Question("Pakistan win Cricket  World Cup in??? ","1988","2000","1992","1988",3 ));
        questions.add( new Question("Today is ???","Freiday","Saturday","Thursday","Monday",4));
        questions.add( new Question("Which city is capital of pakistan??","Lahore","islamabad","karachi","Faisalabad",2));

        questions.add( new Question("which number is 2??","Odd","Even","Primitive","Non Premitive",1));
        questions.add( new Question("If 5x plus 32 equals 4 minus 2x what is the value of x ??? ","-4","2","7","10",1 ));
        questions.add( new Question("Next Football WorldCup Date is ???","2025","2023","2024","2022",4));
        questions.add( new Question("Largest City In Pakistan ??","Lahore","islamabad","karachi","Faisalabad",2));


        recycleViewAdapter = new RecycleViewAdapter( questions, MainActivity2.this );
        recyclerView.setAdapter( recycleViewAdapter );
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                mTimerRunning = false;
//                mButtonStartPause.setText("Start");
//                mButtonStartPause.setVisibility(View.INVISIBLE);
//                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();
        mTimerRunning = true;
       // mButtonStartPause.setText("pause");
      //  mButtonReset.setVisibility(View.INVISIBLE);

    }
    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 700) / 60;
        int seconds = (int) (mTimeLeftInMillis / 700) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        chronometer.setText(timeLeftFormatted);
    }

//    public void nextToActivityResult(View view) {
//        startActivity(new Intent(MainActivity2.this,MainActivity3.class));
//    }
}