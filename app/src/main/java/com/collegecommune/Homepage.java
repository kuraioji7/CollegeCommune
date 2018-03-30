package com.collegecommune;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.collegecommune.Authentication.LoginPage;
import com.collegecommune.Authentication.RegisterPage;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Button login = findViewById(R.id.login_button);
        Button register = findViewById(R.id.register_button);


        login.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i_login = new Intent (Homepage.this, LoginPage.class);
                        startActivity(i_login);
                    }
                }
        );

        register.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i_register = new Intent (Homepage.this, RegisterPage.class);
                        startActivity(i_register);
                    }
                }
        );
    }
}
