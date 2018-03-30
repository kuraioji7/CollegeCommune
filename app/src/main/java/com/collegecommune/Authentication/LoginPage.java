package com.collegecommune.Authentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;

import com.collegecommune.MainPage;
import com.collegecommune.R;


public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_page);

        Button login = findViewById(R.id.button);

        login.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i_login = new Intent (LoginPage.this, MainPage.class);
                        startActivity(i_login);
                    }
                }
        );
    }
}