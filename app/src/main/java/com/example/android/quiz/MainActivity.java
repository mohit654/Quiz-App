package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void result(View view) {
        RadioButton btn1 = (RadioButton) findViewById(R.id.q1a);
        boolean bttn1 = btn1.isChecked();
        TextView text1 = (TextView) findViewById(R.id.ans1);
        if (bttn1) {
            text1.setText("Correct!");
        } else {
            text1.setText("Incorrect\nCorrect Answer: Fernando");
        }
        RadioButton btn2 = (RadioButton) findViewById(R.id.q2c);
        boolean bttn2 = btn2.isChecked();
        TextView text2 = (TextView) findViewById(R.id.ans2);
        if (bttn2) {
            text2.setText("Correct!");
        } else {
            text2.setText("Incorrect\nCorrect Answer: Agent Mahone");
        }
        RadioButton btn3 = (RadioButton) findViewById(R.id.q3b);
        boolean bttn3 = btn3.isChecked();
        TextView text3 = (TextView) findViewById(R.id.ans3);
        if (bttn3) {
            text3.setText("Correct!");
        } else {
            text3.setText("Incorrect\nCorrect Answer: False");
        }
        RadioButton btn4 = (RadioButton) findViewById(R.id.q4d);
        boolean bttn4 = btn4.isChecked();
        TextView text4 = (TextView) findViewById(R.id.ans4);
        if (bttn4) {
            text4.setText("Correct!");
        } else {
            text4.setText("Incorrect\nCorrect Answer: Theodore Bagwell");}

            EditText btn5 = (EditText) findViewById(R.id.q5);
            String bttn5 = btn5.getText().toString();
            TextView text5 = (TextView) findViewById(R.id.ans5);
            if (bttn5.equals("C-note"))
            {
                text5.setText("Correct!");
            }
            else
            {
                text5.setText("Incorrect\nCorrect Answer: C-note");
            }
        }
    }