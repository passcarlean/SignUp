package com.example.android.signup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {

    private Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        buttonLogin = (Button) findViewById(R.id.login);


    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

    }

    public void login(View v) {
        finish();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));//only email apps
        intent.putExtra(Intent.EXTRA_SUBJECT, "Login:" );
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        };
    }

}

