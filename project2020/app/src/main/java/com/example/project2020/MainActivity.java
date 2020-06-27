package com.example.project2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private ProgressBar Happiness;

    private CountDownTimer HappinessTimer;





            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                Happiness = findViewById(R.id.Happiness);


                Happiness.setMax(20000);

                HappinessTimer = new CountDownTimer(20000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {


                        Happiness.setProgress((int) millisUntilFinished);

                    }

                    @Override
                    public void onFinish() {
                        Happiness.setProgress(0);
                        goHealth();
                    }
                };
                HappinessTimer.start();







        }
    public void goHealth(){ Intent Health = new Intent(this,Health.class);
        startActivity(Health); }

    }
