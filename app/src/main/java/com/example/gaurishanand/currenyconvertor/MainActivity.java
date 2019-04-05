package com.example.gaurishanand.currenyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.*;
public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText editText=(EditText)findViewById(R.id.PoundseditText);
        String amountinPounds=editText.getText().toString();
        double amountinpoundsDouble=Double.parseDouble(amountinPounds);
        double amountinruppeesdouble=amountinpoundsDouble*57;
        String amountinruppees=String.format("%.2f",amountinruppeesdouble);
        Toast.makeText(this,"Pounds = "+amountinPounds+" Ruppees = "+ amountinruppees,Toast.LENGTH_LONG).show();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
