package com.urangcoding.project3pertemuan2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText angkaPertama, angkaKedua;
    private Button tambah, kurang, kali, bagi;
    private TextView txt_hasil;
    private double hasil = 0, angka1 = 0, angka2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaPertama = findViewById(R.id.idAngka1);
        angkaKedua = findViewById(R.id.idAngka2);

        tambah = findViewById(R.id.btn_tambah);
        kurang = findViewById(R.id.btn_kurang);
        kali = findViewById(R.id.btn_kali);
        bagi = findViewById(R.id.btn_bagi);

        txt_hasil = findViewById(R.id.txt_hasil);

        tambah.setOnClickListener(view -> {
            txt_hasil.setText(String.valueOf(calculate("tambah")));
        });

        kurang.setOnClickListener(view -> {

            txt_hasil.setText(String.valueOf(calculate("kurang")));
        });

        kali.setOnClickListener(view -> {

            txt_hasil.setText(String.valueOf(calculate("kali")));
        });

        bagi.setOnClickListener(view -> {

            txt_hasil.setText(String.valueOf(calculate("bagi")));
        });
    }

    public double calculate(String type) {

        angka1 = Double.parseDouble(angkaPertama.getText().toString());
        angka2 = Double.parseDouble(angkaKedua.getText().toString());

        if (type.equals("tambah")) {
            hasil = angka1 + angka2;
        } else if (type.equals("kurang")) {
            hasil = angka1 - angka2;
        } else if (type.equals("kali")) {
            hasil = angka1 * angka2;
        } else if (type.equals("bagi")) {
            hasil = angka1 / angka2;
        }

        return hasil;
    }
}