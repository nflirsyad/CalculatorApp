package com.vsga.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText angka1, angka2;
    int getAngka1, getAngka2;
    Button ButtonTambah, ButtonKurang, ButtonKali, ButtonBagi, ButtonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.enNumber1);
        angka2 = findViewById(R.id.enNumber2);
        hasil = findViewById(R.id.resultnumber);

        ButtonTambah = findViewById(R.id.btnTambah);
        ButtonKurang = findViewById(R.id.btnKurang);
        ButtonKali = findViewById(R.id.btnKali);
        ButtonBagi = findViewById(R.id.btnBagi);
        ButtonClear = findViewById(R.id.btnClear);


        ButtonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngka1 = Integer.valueOf(angka1.getText().toString());
                getAngka2 = Integer.valueOf(angka2.getText().toString());
                int hasilTambah = getAngka1 + getAngka2;
                hasil.setText(String.valueOf(hasilTambah));
            }
        });

        ButtonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngka1 = Integer.valueOf(angka1.getText().toString());
                getAngka2 = Integer.valueOf(angka2.getText().toString());
                int hasilKurang = getAngka1 - getAngka2;
                hasil.setText(String.valueOf(hasilKurang));
            }
        });

        ButtonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngka1 = Integer.valueOf(angka1.getText().toString());
                getAngka2 = Integer.valueOf(angka2.getText().toString());
                int hasilKali = getAngka1 * getAngka2;
                hasil.setText(String.valueOf(hasilKali));
            }
        });

        ButtonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngka1 = Integer.valueOf(angka1.getText().toString());
                getAngka2 = Integer.valueOf(angka2.getText().toString());
                int hasilKali = getAngka1 / getAngka2;
                hasil.setText(String.valueOf(hasilKali));
            }
        });

        ButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1.setText("");
                angka2.setText("");
                hasil.setText("0");
                angka1.requestFocus();
            }
        });

    }
}