package com.ramisha.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    TextView resultTv;
    String number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 =findViewById(R.id.editText1);
        editText2 =findViewById(R.id.editText2);
        resultTv =findViewById(R.id.resultTv);
    }
    public void add(View view) {
        getDataFromEditText();
        checkNull(0);
    }

    private void checkNull (int i) {
        if(number1.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else if (number2.isEmpty()){
            Toast.makeText(this, "Enter any number ", Toast.LENGTH_SHORT).show();
        }
        else {
            switch (i){
                case 0:
                    double result = Double.parseDouble(number1)+Double.parseDouble(number2);
                    resultTv.setText(String.valueOf(result));
                    break;

                case 1:
                    double result1 = Double.parseDouble(number1)-Double.parseDouble(number2);
                    resultTv.setText(String.valueOf(result1));
                    break;
                case 2:
                    double result2 = Double.parseDouble(number1)*Double.parseDouble(number2);
                    resultTv.setText(String.valueOf(result2));
                    break;

                case 3:
                    double result3 = Double.parseDouble(number1)/Double.parseDouble(number2);
                    resultTv.setText(String.valueOf(result3));
                    break;
            }

        }
    }
    private void getDataFromEditText(){
        number1 = editText1.getText().toString();
        number2 = editText2.getText().toString();
    }
    public void sub(View view) {
        getDataFromEditText();
        checkNull(1);
    }
    public void multiply(View view) {

        getDataFromEditText();
        checkNull(2);
    }

    public void division(View view) {
        getDataFromEditText();
        checkNull(3);
    }
}