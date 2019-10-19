package com.example.mad314_1895757_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent getIntent = getIntent();
        final Intent myIntent = new Intent(this,MainActivity.class);
        Button backButton = findViewById(R.id.backbutton);
        TextView myAddition = findViewById(R.id.Sum);
        TextView myProduct = findViewById(R.id.Product);
        int Sum = getIntent().getIntExtra("Sum",0);
        int Product = getIntent().getIntExtra("Product",0);
        myAddition.setText(Integer.toString(Sum));
        myProduct.setText(Integer.toString(Product));



    }
}
