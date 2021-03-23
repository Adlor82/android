package com.example.myappcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;

    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] buttonNumId = new int[] {
                R.id.button1,
                R.id.button2,
                R.id.button3,
                R.id.button4,
                R.id.button5,
                R.id.button6,
                R.id.button7,
                R.id.button8,
                R.id.button9,
                R.id.button0,
                R.id.buttonPoint
        };

        int [] buttonActId = new int[] {
                R.id.buttonAC,
                R.id.buttonDiv,
                R.id.buttonSub,
                R.id.buttonAdd,
                R.id.buttonPerc,
                R.id.buttonMul,
                R.id.buttonEqa
        };

        infoTextView = findViewById(R.id.infoTextView);

        calculator = new Calculator();

        View.OnClickListener buttonNumClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPress(view.getId());
                infoTextView.setText(calculator.getText());
            }
        };

        View.OnClickListener buttonActOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onActPress(view.getId());
                infoTextView.setText(calculator.getText());
            }
        };

        for (int i = 0; i < buttonNumId.length; i++) {
            findViewById(buttonNumId[i]).setOnClickListener(buttonNumClickListener);
        }

        for (int i = 0; i < buttonActId.length; i++) {
            findViewById(buttonActId[i]).setOnClickListener(buttonActOnClickListener);
        }


    }
}