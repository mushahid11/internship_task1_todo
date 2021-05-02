package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    public  TextView tv_score,tv_per;
    int counter_value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv_score = findViewById(R.id.tv_score);
        tv_per = findViewById(R.id.tv_per);


        Intent intent = getIntent();
        String score = intent.getStringExtra("score");
        String per = intent.getStringExtra("per");
        tv_score.setText("Score: "+score);
        tv_per.setText(per);

//    public static  void update_counter(int value){
//        try{
//            tv_score.setText(value);
//        }
//        catch (Exception ex){
//          //  Log.d("Exception","Exception of type"+ex.getMessage());
//        }
//    }
    }
}