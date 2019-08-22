package com.lukinovitasari.muslimapp;


import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import koding.web.muslimapp.R;

public class MainActivity extends AppCompatActivity {

    private TextView solat, produk, doa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solat = (TextView)findViewById(R.id.jadwalSholat);
        produk = (TextView)findViewById(R.id.produkHalal);
        doa = (TextView)findViewById(R.id.doaHarian);

        solat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SholatTest.class);
                startActivity(intent);
            }
        });

        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainHalal.class);
                startActivity(intent);
            }
        });

        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainDoa.class);
                startActivity(intent);
            }
        });

    }
}
