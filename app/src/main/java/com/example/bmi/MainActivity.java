package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, height, weight;
    Button calculatorBT;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        calculatorBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameRS = name.getText().toString();
                String heightString = height.getText().toString();
                double heightRS = Double.parseDouble(heightString);
                String weightString = weight.getText().toString();
                int weightRS = Integer.parseInt(weightString);
                double BMI = weightRS/(heightRS*heightRS);
                double BMIRS = ((double) Math.round(BMI * 10) / 10);
                if(BMIRS>35)
                    result.setText(nameRS + " là người béo phì độ III");
                else
                    if (BMIRS>29.9)
                        result.setText(nameRS + " là người béo phì độ II");
                    else
                        if(BMIRS>24.9)
                            result.setText(nameRS + " là người béo phì độ I");
                        else
                            if(BMIRS>17.9)
                                result.setText(nameRS + " là người bình thường");
                            else
                                result.setText(nameRS + " là người gầy");
//                System.out.println(BMIRS);
            }
        });
    }
    public void AnhXa(){
        name = (EditText) findViewById(R.id.nameET);
        height = (EditText) findViewById(R.id.heightET);
        weight = (EditText) findViewById(R.id.weightET);
        calculatorBT = (Button) findViewById(R.id.calcuBT);
        result = (TextView) findViewById(R.id.resultTV);
    }
}