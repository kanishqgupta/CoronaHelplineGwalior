package com.ysi.coronavolunteergwalior.donation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.ysi.coronavolunteergwalior.R;

public class ReqestHelp extends AppCompatActivity {

    AppCompatEditText name, phone, location, comment;
    Button request_now, back_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_help);

        name = (AppCompatEditText) findViewById(R.id.request_name);
        phone = (AppCompatEditText) findViewById(R.id.request_phone);
        location = (AppCompatEditText) findViewById(R.id.reques_location);
        comment = (AppCompatEditText)  findViewById(R.id.reques_cmt);

        request_now = (Button) findViewById(R.id.request_btn);
        back_btn = (Button) findViewById(R.id.back_btn);



        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
