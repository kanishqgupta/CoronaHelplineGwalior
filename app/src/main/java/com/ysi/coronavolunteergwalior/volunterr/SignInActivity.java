package com.ysi.coronavolunteergwalior.volunterr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ysi.coronavolunteergwalior.R;
import com.ysi.coronavolunteergwalior.registration.SignUpActivity;

import org.w3c.dom.Text;

public class SignInActivity extends AppCompatActivity {

    Button login_btn;
    TextInputEditText phone, password;
    TextView become_textview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        phone =(TextInputEditText) findViewById(R.id.login_phone);
        password =(TextInputEditText) findViewById(R.id.login_pass);

        login_btn = (Button) findViewById(R.id.login_button);

        become_textview = (TextView) findViewById(R.id.become_textview);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, VolunteerTaskList.class);
                startActivity(intent);
            }
        });

        become_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignInActivity.this, VolunteerSignUp.class);
                startActivity(i);
            }
        });






    }
}
