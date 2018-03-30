package com.collegecommune.Authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.collegecommune.MainPage;
import com.collegecommune.R;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i_reg = new Intent (RegisterPage.this, MainPage.class);
                        startActivity(i_reg);
                    }
                }
        );
    }
}
