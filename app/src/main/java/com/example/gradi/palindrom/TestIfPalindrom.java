package com.example.gradi.palindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestIfPalindrom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_if_palindrom);

        final TextView message1 = (TextView) findViewById(R.id.message1);
        final TextView message2 = (TextView) findViewById(R.id.message2);
        final TextView message3 = (TextView) findViewById(R.id.message3);
        final TextView message4 = (TextView) findViewById(R.id.message4);
        final EditText editString = (EditText) findViewById(R.id.editString);

        Button palindromButton = findViewById(R.id.palindromButton);
        palindromButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String eingegebenerString = editString.getText().toString();

                if(eingegebenerString.length() >= 5){
                    String space = " ";
                    if(eingegebenerString.indexOf(space) > 0){
                        message4.setVisibility(View.VISIBLE);
                    }
                    else{
                        boolean text = isPalindrome(eingegebenerString);

                        if(text == true){
                            message1.setVisibility(View.VISIBLE);
                        }
                        else{
                            message2.setVisibility(View.VISIBLE);
                        }
                    }
                }
                else{
                    message3.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
