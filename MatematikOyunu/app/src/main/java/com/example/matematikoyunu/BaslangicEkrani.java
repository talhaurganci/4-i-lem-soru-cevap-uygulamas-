package com.example.matematikoyunu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BaslangicEkrani extends Activity {

    Button toplama;
    Button cikarma;
    Button carpma;
    Button bolme;
    Button yardım;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.baslangic);

        toplama = (Button)findViewById(R.id.button6);
        cikarma = (Button)findViewById(R.id.button7);
        carpma = (Button)findViewById(R.id.button8);
        bolme = (Button)findViewById(R.id.button9);
        yardım = (Button)findViewById(R.id.button11);

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(BaslangicEkrani.this, ToplamaEkrani.class);
                startActivity(MainActivity);
            }
        });

        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(BaslangicEkrani.this, CikarmaEkrani.class);
                startActivity(MainActivity);
            }
        });

        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(BaslangicEkrani.this, CarpmaEkrani.class);
                startActivity(MainActivity);
            }
        });

        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(BaslangicEkrani.this, BolmeEkrani.class);
                startActivity(MainActivity);
            }
        });

        yardım.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"İşlem türünü seçtikten sonra size 10 adet soru sorulacaktır. Her soru için 10 saniye süreniz olacak. Başarılar!",Toast.LENGTH_LONG).show();
            }
        });
    }


}
