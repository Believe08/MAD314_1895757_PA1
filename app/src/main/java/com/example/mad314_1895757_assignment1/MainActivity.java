package com.example.mad314_1895757_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EditTextNumber_1 = findViewById(R.id.number1);
        final EditText EditTextNumber_2 = findViewById(R.id.number2);
        final EditText EditTextNumber_3 = findViewById(R.id.number3);
        final Button SubmitButton =findViewById(R.id.Submit);

        final Integer Number1;
        final Integer Number2;
        final Integer Number3;
        final Integer Summation;
        final Integer Product;

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Number1 = Integer.parseInt(EditTextNumber_1.getText().toString());
                int Number2 = Integer.parseInt(EditTextNumber_2.getText().toString());
                int Number3 = Integer.parseInt(EditTextNumber_3.getText().toString());

                int Summation = Number1 + Number2 + Number3;
                int Product = Number1*Number2*Number3;
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Sum",Summation);
                intent.putExtra("Product",Product);
                startActivity(intent);

            }






        });
    }
}
