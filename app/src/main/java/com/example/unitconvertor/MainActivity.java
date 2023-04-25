package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton currency, length, temperature, weight;
    EditText editText;
    TextView value1, value2, value3, value4;
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currency =findViewById(R.id.currency);
        length =findViewById(R.id.length);
        temperature =findViewById(R.id.temperature);
        weight =findViewById(R.id.weight);
        editText=findViewById(R.id.input);
        value1 =findViewById(R.id.value1);
//        value2 =findViewById(R.id.value2);
//        value3 =findViewById(R.id.value3);
//        value4 =findViewById(R.id.value4);
    }
    public void onRadioButtonClicked(View view) { //Need to implement the button somewhere here.
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.length:
                if (checked){
                    //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    String temp=editText.getText().toString();
                    int value=Integer.parseInt(temp);

                    value1.setText(value+" Meter = "+value*100.00+" Centimeter");

                } break;
            case R.id.currency:
                if (checked) {
                    //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    String temp=editText.getText().toString();
                    int value=Integer.parseInt(temp);

                    value1.setText(value+" Gram = "+value/1000.00+" Kilogram");
                }
                break;
            case R.id.weight:
                if (checked){
                  //  Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    String temp=editText.getText().toString();
                    int value=Integer.parseInt(temp);

                    value1.setText(value+" Kilogram = "+value*1000.00+"grams");

                }

                break;
            case R.id.temperature:
                if (checked){
                   // Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    String temp=editText.getText().toString();
                    int value=Integer.parseInt(temp);

                    value1.setText(value+" Centimeter = "+value/100.00+" meter");
                }

                break;
        }
    }
}