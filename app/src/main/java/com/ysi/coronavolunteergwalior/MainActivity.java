package com.ysi.coronavolunteergwalior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ysi.coronavolunteergwalior.donation.DonateActivity;
import com.ysi.coronavolunteergwalior.donation.ReqestHelp;
import com.ysi.coronavolunteergwalior.registration.SignUpActivity;
import com.ysi.coronavolunteergwalior.volunterr.SignInActivity;
import com.ysi.coronavolunteergwalior.volunterr.VolunteerSignUp;

public class MainActivity extends AppCompatActivity {

    Button donate_btn, request_btn, vol_login_btn, vol_signup_btn, call_btn, about_btn;
    Button safety_btn, precautions_btn, news_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donate_btn= (Button )findViewById(R.id.b1);
        request_btn = (Button) findViewById(R.id.b11);
        vol_signup_btn = (Button) findViewById(R.id.b2);
        vol_login_btn = (Button) findViewById(R.id.b3);
        call_btn = (Button) findViewById(R.id.b4);
        about_btn = (Button) findViewById(R.id.b5);

        safety_btn = (Button) findViewById(R.id.safet_button);
        precautions_btn = (Button) findViewById(R.id.prec_button);
        news_btn =  (Button) findViewById(R.id.news_button);

        donate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DonateActivity.class);
                startActivity(i);

            }
        });

        request_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ReqestHelp.class);
                startActivity(i);
            }
        });

        vol_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(i);

            }
        });

        vol_signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, VolunteerSignUp.class);
                startActivity(i);
            }
        });

        call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "1075";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });

    }
}
