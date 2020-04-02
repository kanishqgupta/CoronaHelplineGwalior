package com.ysi.coronavolunteergwalior.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.ysi.coronavolunteergwalior.MainActivity;
import com.ysi.coronavolunteergwalior.R;
import com.ysi.coronavolunteergwalior.volunterr.SignInActivity;

public class SignUpActivity extends AppCompatActivity {

    AppCompatEditText name, email, phone, otp, password;
    Button signup_btn, back_btn;
    TextView invalid_textview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        name = (AppCompatEditText) findViewById(R.id.signup_firstname);
        email = (AppCompatEditText) findViewById(R.id.email);
        phone = (AppCompatEditText) findViewById(R.id.signup_phone);
        otp = (AppCompatEditText) findViewById(R.id.signup_otp);
        password = (AppCompatEditText) findViewById(R.id.signup_password);

        signup_btn = (Button) findViewById(R.id.sign_up_btn);
        back_btn = (Button) findViewById(R.id.back_btn);

        invalid_textview = (TextView) findViewById(R.id.signup_invalid_cred);


        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o  = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(o);
            }
        });


    }
}