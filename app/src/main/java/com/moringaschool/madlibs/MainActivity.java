package com.moringaschool.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.personEditText) EditText mPersonEditText;
    @BindView(R.id.colorEditText) EditText mColorEditText;
    @BindView(R.id.foodEditText) EditText mFoodEditText;
    @BindView(R.id.adjective) EditText mAdjective;
    @BindView(R.id.thingEditText) EditText mThingEditText;
    @BindView(R.id.button) Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);




        mSubmitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //capture user input
                String person = mPersonEditText.getText().toString();
                String color = mColorEditText.getText().toString();
                String food = mFoodEditText.getText().toString();
                String adjective = mAdjective.getText().toString();
                String thing = mThingEditText.getText().toString();


                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("person", person);
                intent.putExtra("color", color);
                intent.putExtra("food", food);
                intent.putExtra("adjective", adjective);
                intent.putExtra("thing", thing);
                Log.d("MainActivity", person);
                Log.d("MainActivity", color);
                Log.d("MainActivity", food);
                Log.d("MainActivity", adjective);
                Log.d("MainActivity", thing);

                startActivity(intent);

            }
        });
    }
}