/*
 * CS5520 In-class Assignment 1
 * Name: Ziyang Wang
 * Date: 2023-01-27
 */
package com.example.cs4520_inclass_ziyang8317;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonPractice;
    private Button buttonInClass01;
    private Button buttonInClass02;

    private Button buttonInClass03;
    private Button buttonInClass04;
    private Button buttonInClass05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Match the variable with the button and set OnClick listener.
        buttonPractice = findViewById(R.id.PracticeButton);
        buttonInClass01 = findViewById(R.id.button_class1);
        buttonPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toPracticeActivity = new Intent(MainActivity.this,PracticeActivity.class);
                startActivity(toPracticeActivity);
            }
        });

        buttonInClass01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInClass01 = new Intent(MainActivity.this,InClass01.class);
                startActivity(toInClass01);
            }
        });

        buttonInClass02 = findViewById(R.id.button_class2);
        buttonInClass02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInClass02 = new Intent(MainActivity.this,InClass02.class);
                startActivity(toInClass02);
            }
        });

        buttonInClass03 = findViewById(R.id.button_class3);
        buttonInClass03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInClass03 = new Intent(MainActivity.this,InClass03.class);
                startActivity(toInClass03);
            }
        });

        buttonInClass04 = findViewById(R.id.button_class4);
        buttonInClass04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toClass04 = new Intent(MainActivity.this,InClass04.class);
                startActivity(toClass04);
            }
        });

        buttonInClass05 = findViewById(R.id.button_class5);
        buttonInClass05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toClass05 = new Intent(MainActivity.this,InClass05.class);
                startActivity(toClass05);
            }
        });






    }
}