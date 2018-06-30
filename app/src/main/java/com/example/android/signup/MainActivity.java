package com.example.android.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Thread th = new Thread() {

                public void run() {
                    try {
                        sleep(2000);
                        startActivity(new Intent(getApplicationContext(), loginActivity.class));
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    finally {
                        finish();
                    }
                }
            };
            th.start();
        }

        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();

        }
    }
