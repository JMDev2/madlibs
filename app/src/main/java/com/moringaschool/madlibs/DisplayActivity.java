package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DisplayActivity extends AppCompatActivity {
    @BindView(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ButterKnife.bind(this);

        //fetch the user input from main activity
        Intent intent = getIntent();
        String person = intent.getStringExtra("person");
        String color= intent.getStringExtra("color");
        String food = intent.getStringExtra("food");
        String adjective = intent.getStringExtra("adjective");
        String thing = intent.getStringExtra("thing");
        mStoryTextView.setText(getString(R.string.story,person,color,food,adjective,thing));
    }
}