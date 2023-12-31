package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextHeight = findViewById(R.id.editTextHeight);
        EditText editTextWeight = findViewById(R.id.editTextWeight);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView textViewResult = findViewById(R.id.textViewResult);

        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                float ht = Float.parseFloat(String.valueOf(editTextHeight.getText())) / 100;
                float wt = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float bmi =wt / (ht * ht);
                textViewResult.setText(String.valueOf(bmi));


                if (bmi > 24){
                    textViewResult.setText("You're Overweight:" +bmi);
                    textViewResult.setBackgroundColor(Color.parseColor("#FFA500"));
                }else if (bmi < 18){
                    textViewResult.setText("You're Underweight: " +bmi);
                    textViewResult.setBackgroundColor(Color.parseColor("#ff0000"));
                }else {
                    textViewResult.setText("You're Healthy: " +bmi);
                    textViewResult.setBackgroundColor(Color.parseColor("#19B81F"));
                }

            }
        });



    }
}