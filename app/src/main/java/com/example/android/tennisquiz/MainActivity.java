package com.example.android.tennisquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.tennisquiz.R.id.a1;
import static com.example.android.tennisquiz.R.id.a2;
import static com.example.android.tennisquiz.R.id.a3;
import static com.example.android.tennisquiz.R.id.a4;
import static com.example.android.tennisquiz.R.id.a5_1;
import static com.example.android.tennisquiz.R.id.a5_2;
import static com.example.android.tennisquiz.R.id.a5_3;
import static com.example.android.tennisquiz.R.id.a5_4;
import static com.example.android.tennisquiz.R.id.a5_5;
import static com.example.android.tennisquiz.R.id.a5_6;
import static com.example.android.tennisquiz.R.id.a6_1;
import static com.example.android.tennisquiz.R.id.a6_2;
import static com.example.android.tennisquiz.R.id.a6_3;
import static com.example.android.tennisquiz.R.id.a6_4;
import static com.example.android.tennisquiz.R.id.a6_5;
import static com.example.android.tennisquiz.R.id.a6_6;
import static com.example.android.tennisquiz.R.id.a7;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grade(View view) {
        int score = 0;
        String toast = "";
        RadioButton button = (RadioButton) findViewById(a1);
        if (button.isChecked()) {
            score += 5;
            toast += "Q1 is correct";
        } else {
            toast += "Q1 is incorrect";
        }

        button = (RadioButton) findViewById(a2);
        if (button.isChecked()) {
            score += 5;
            toast += "\nQ2 is correct";
        } else {
            toast += "\nQ2 is incorrect";
        }

        button = (RadioButton) findViewById(a3);
        if (button.isChecked()) {
            score += 5;
            toast += "\nQ3 is correct";
        } else {
            toast += "\nQ3 is incorrect";
        }

        button = (RadioButton) findViewById(a4);
        if (button.isChecked()) {
            score += 5;
            toast += "\nQ4 is correct";
        } else {
            toast += "\nQ4 is incorrect";
        }

        CheckBox box1 = (CheckBox) findViewById(a5_1);
        CheckBox box2 = (CheckBox) findViewById(a5_2);
        CheckBox box3 = (CheckBox) findViewById(a5_3);
        CheckBox box4 = (CheckBox) findViewById(a5_4);
        CheckBox box5 = (CheckBox) findViewById(a5_5);
        CheckBox box6 = (CheckBox) findViewById(a5_6);
        if (box1.isChecked() && box2.isChecked() && box3.isChecked() && !box4.isChecked()
                && !box5.isChecked() && !box6.isChecked()) {
            score += 5;
            toast += "\nQ5 is correct";
        } else {
            toast += "\nQ5 is incorrect";
        }

        box1 = (CheckBox) findViewById(a6_1);
        box2 = (CheckBox) findViewById(a6_2);
        box3 = (CheckBox) findViewById(a6_3);
        box4 = (CheckBox) findViewById(a6_4);
        box5 = (CheckBox) findViewById(a6_5);
        box6 = (CheckBox) findViewById(a6_6);
        if (box1.isChecked() && box2.isChecked() && !box3.isChecked() && !box4.isChecked()
                && !box5.isChecked() && !box6.isChecked()) {
            score += 5;
            toast += "\nQ6 is correct";
        } else {
            toast += "\nQ6 is incorrect";
        }

        EditText text = (EditText) findViewById(a7);
        String ans = text.getText().toString().trim();
        String correct = "French Open";
        if (ans.equalsIgnoreCase(correct)) {
            score += 5;
            toast += "\nQ7 is correct";
        } else {
            toast += "\nQ7 is incorrect";
        }
        toast += "\nYour total score is " + score;

        Toast.makeText(this, toast, Toast.LENGTH_LONG).show();
    }
}