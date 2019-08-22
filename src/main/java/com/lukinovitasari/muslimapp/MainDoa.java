package com.lukinovitasari.muslimapp;


import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import koding.web.muslimapp.R;

public class MainDoa extends AppCompatActivity {
    private Button DoaMasukRumah;
    private Button DoaKeluarRumah;
    private Button DoaSebelumBelajar;
    private Button DoaSesudahBelajar;
    private Button DoaMasukMasjid;
    private Button DoaKeluarMasjid;
    private Button DoaMasukKamarMandi;
    private Button DoaKeluarKamarMandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        DoaMasukRumah= (Button)findViewById(R.id.btn_Doa_Masuk_Rumah);
        DoaKeluarRumah=(Button)findViewById(R.id.btn_Doa_Keluar_Rumah);
        DoaSebelumBelajar=(Button)findViewById(R.id.btn_Doa_Sebelum_Belajar);
        DoaSesudahBelajar=(Button)findViewById(R.id.btn_Doa_Sesudah_Belajar);
        DoaMasukMasjid=(Button)findViewById(R.id.btn_Doa_Masuk_Mesjid);
        DoaKeluarMasjid=(Button)findViewById(R.id.btn_Doa_Keluar_Masjid);
        DoaMasukKamarMandi=(Button)findViewById(R.id.btn_Doa_Masuk_KamarMandi);
        DoaKeluarKamarMandi=(Button)findViewById(R.id.btn_Doa_Keluar_KamarMandi);



        DoaMasukRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaMasukRumah.class);
                startActivity(luki);

            }
        });

        DoaKeluarRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaKeluarRumah.class);
                startActivity(luki);
            }
        });

        DoaSebelumBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaSebelumBelajar.class);
                startActivity(luki);
            }
        });

        DoaSesudahBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaSetelahBelajar.class);
                startActivity(luki);
            }
        });

        DoaMasukMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaMasukMesjid.class);
                startActivity(luki);
            }
        });

        DoaKeluarMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaKeluarMesjid.class);
                startActivity(luki);
            }
        });

        DoaMasukKamarMandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaMasukKamarMandi.class);
                startActivity(luki);
            }
        });

        DoaKeluarKamarMandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent luki = new Intent(MainDoa.this, DoaKeluarKamarMandi.class);
                startActivity(luki);
            }
        });

    }
}
