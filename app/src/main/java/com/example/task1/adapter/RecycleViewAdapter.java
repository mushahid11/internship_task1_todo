package com.example.task1.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task1.MainActivity2;
import com.example.task1.MainActivity3;
import com.example.task1.R;
import com.example.task1.model.Question;

import java.util.List;
import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;
import static java.util.Objects.*;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private final List<Question> questionList;
    private final Context context;
    private String A1;
    int totalScore = 0;
    double percentage = (float) 0.0;
    private static final String PREFS = "Massages pref";

    public RecycleViewAdapter(List<Question> questionList, Context context) {
        this.questionList = questionList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.quiz_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        A1 = sharedPreferences.getString("q1", "Nothing Yet");
        final String A2 = sharedPreferences.getString("q2", "Nothing Yet");
        final String A3 = sharedPreferences.getString("q3", "Nothing Yet");
        final String A4 = sharedPreferences.getString("q4", "Nothing Yet");
        final String A5 = sharedPreferences.getString("q5", "Nothing Yet");
        final String A6 = sharedPreferences.getString("q6", "Nothing Yet");
        final String A7 = sharedPreferences.getString("q7", "Nothing Yet");
        final String A8 = sharedPreferences.getString("q8", "Nothing Yet");

        Question question = questionList.get(position);
        holder.question.setText(questionList.get(position).getQuestion());
        holder.rb1.setText(questionList.get(position).getRb1());
        holder.rb2.setText(questionList.get(position).getRb2());
        holder.rb3.setText(questionList.get(position).getRb3());
        holder.rb4.setText(questionList.get(position).getRb4());

        holder.rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.rb1.getText().toString().equals(A1)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A2)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A3)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A4)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A5)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A6)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A7)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb1.getText().toString().equals(A8)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                }
            }
        });

        holder.rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.rb2.getText().toString().equals(A1)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A2)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A3)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A4)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A5)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A6)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A7)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb2.getText().toString().equals(A8)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                }
//                if (position == 3) {
//                    String a = "islamabad";
//                    if (a .equals(holder.rb2.getText().toString()) ) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//                    }
//                }
//                if (position == 4) {
//                    String a = "Even";
//                    if (a .equals( holder.rb2.getText().toString())) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//
//                    }
//                }
            }
        });

        holder.rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.rb3.getText().toString().equals(A1)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A2)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A3)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A4)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A5)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A6)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A7)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb3.getText().toString().equals(A8)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                }

//                if (position == 1) {
//                    String a = "1992";
//                    if (a .equals(holder.rb3.getText().toString()) ) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//
//                    }
//                }
//                if (position == 7) {
//                    String a = "Even";
//                    if (a .equals(holder.rb3.getText().toString()) ) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//
//                    }
//                }
            }
        });

        holder.rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (holder.rb4.getText().toString().equals(A1)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A2)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A3)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A4)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A5)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A6)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A7)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                } else if (holder.rb4.getText().toString().equals(A8)) {
                    Toast.makeText(context, "Correct Answer", Toast.LENGTH_SHORT).show();
                    totalScore++;
                }

//                if (position == 2) {
//                    String a = " ";
//                    if (a .equals( holder.rb4.getText().toString())) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//
//                        // MainActivity3.score();
//                    }
//                }
//                if (position == 6) {
//                    String a = "2022";
//                    if (a .equals(holder.rb4.getText().toString()) ) {
//                        Toast.makeText(context, "Answer Correct", Toast.LENGTH_SHORT).show();
//                        totalScore++;
//
//                    }
//                }
            }
        });

        Button done = ((MainActivity2) context).findViewById(R.id.btn_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentage = (totalScore / 8f) * 100;
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("score", String.valueOf(totalScore));
                intent.putExtra("per", String.valueOf(percentage));

                v.getContext().startActivity(intent);
            }
        });

////       holder.phoneNumber.setText( questionList.get( position ).getPhoneNumber() );
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView question;
        private RadioGroup radioGroup;
        private RadioButton rb1, rb2, rb3, rb4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question = itemView.findViewById(R.id.row_question_textView);
            radioGroup = itemView.findViewById(R.id.radioGroup);
            rb1 = itemView.findViewById(R.id.radioButton1);
            rb2 = itemView.findViewById(R.id.radioButton2);
            rb3 = itemView.findViewById(R.id.radioButton3);
            rb4 = itemView.findViewById(R.id.radioButton4);
        }
    }
}
