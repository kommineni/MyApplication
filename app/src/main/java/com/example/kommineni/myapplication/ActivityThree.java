package com.example.kommineni.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        System.out.println("This is last screen \n Tesing for new feature");
    }
}
