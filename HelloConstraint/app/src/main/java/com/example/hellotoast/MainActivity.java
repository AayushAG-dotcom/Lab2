package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.relativelayout);
       // setContentView(R.layout.linearlayout);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);

        button = findViewById(R.id.button_count);
        button1 = findViewById(R.id.zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)

            mShowCount.setText(Integer.toString(mCount));
        if(mCount%2 == 0){
            button.setBackgroundColor(Color.GREEN);
        }
        else{
            button.setBackgroundColor(Color.RED);
        }
    }

    public void showZero(View view) {
        mCount = 0;
        String StringmShowCount;
        int intmShowCount;
        StringmShowCount = mShowCount.getText().toString();
        intmShowCount = Integer.parseInt(StringmShowCount);
        if(mShowCount != null) {
                if(intmShowCount == 0){
                    button.setBackgroundColor(Color.DKGRAY);
                }
                else{
                    button.setBackgroundColor(Color.BLUE);
                }

            button1.setBackgroundColor(Color.DKGRAY);

            mShowCount.setText(Integer.toString(mCount));
        }
    }
}