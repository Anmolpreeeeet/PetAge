package com.example.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateAge(View buttonView){
        TextView txt = findViewById(R.id.textView2);
        EditText txt2 = findViewById(R.id.editTextNumber);
        int petAge = Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(txt2.getText().toString());
        txt.setText(petAge + "");
//        txt.setText((2022-Integer.parseInt(txt2.getText().toString()))+"");
    }
}