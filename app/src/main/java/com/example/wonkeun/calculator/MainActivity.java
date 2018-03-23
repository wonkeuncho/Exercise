package com.example.wonkeun.calculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        Button subtractButton = (Button) findViewById(R.id.subtractButton);
        Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
        Button devideButton = (Button) findViewById(R.id.devideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = (EditText) findViewById(R.id.number1);
                EditText number2 = (EditText) findViewById(R.id.number2);
                TextView result = (TextView) findViewById(R.id.result);
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                result.setText(Integer.toString(n1 + n2));

            }
        });







    }
}
