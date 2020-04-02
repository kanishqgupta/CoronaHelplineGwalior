package com.ysi.coronavolunteergwalior.donation;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import com.google.android.material.textfield.TextInputEditText;
import com.shreyaspatil.EasyUpiPayment.EasyUpiPayment;
import com.ysi.coronavolunteergwalior.R;


public class DonateActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextInputEditText name, phone, amount, item;
    String username, userphone, useramount,usertype,  useritem, transactionId, transactionStatus, extraString;
    AppCompatSpinner typeSpinner;
    Button payment_btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate_layout);
        name = (TextInputEditText) findViewById(R.id.name_box);
        phone = (TextInputEditText) findViewById(R.id.phone_box);
        amount = (TextInputEditText) findViewById(R.id.money_box);
        item = (TextInputEditText) findViewById(R.id.item_box);
        typeSpinner = (AppCompatSpinner) findViewById(R.id.type_box);
        item.setVisibility(View.INVISIBLE);

        typeSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.types, R.layout.spinner_item);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        typeSpinner.setAdapter(arrayAdapter);
        payment_btn = (Button) findViewById(R.id.btn_donate);
        payment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              payment();
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        usertype = parent.getItemAtPosition(position).toString();


        if (usertype.contains("Food"))
        {
            amount.setVisibility(View.INVISIBLE);
            item.setVisibility(View.VISIBLE);
            getITem("i");

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void getITem(String item11)
    {
        if (item.equals("i")) {
            useritem = item.getText().toString();
        } else {
            useramount = amount.getText().toString();
        }
    }




    public  void payment()
    {
        double payment = Double.parseDouble(amount.getText().toString());

        final EasyUpiPayment easyUpiPayment = new EasyUpiPayment.Builder()
                .with(this)
                .setPayeeVpa("9630334488@ybl")
                .setPayeeName("Tanishq Gupta")
                .setTransactionId("UNIQUE_TRANSACTION_ID")
                .setTransactionRefId("UNIQUE_TRANSACTION_REF_ID")
                .setDescription("DESCRIPTION_OR_SMALL_NOT")
                .setAmount(String.valueOf(payment))
                .build();

        easyUpiPayment.startPayment();
    }

}
