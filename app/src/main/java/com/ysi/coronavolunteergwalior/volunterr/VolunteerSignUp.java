package com.ysi.coronavolunteergwalior.volunterr;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ysi.coronavolunteergwalior.R;

import org.w3c.dom.Text;

public class VolunteerSignUp extends AppCompatActivity {

    TextView name, event, number;
    Button confirm_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vol_signup);

        name = (TextView) findViewById(R.id.t1);
        event = (TextView) findViewById(R.id.t2);
        number = (TextView) findViewById(R.id.t3);

        confirm_btn = (Button) findViewById(R.id.register_btn);
    }

}