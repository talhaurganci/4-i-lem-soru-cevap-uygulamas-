package com.example.matematikoyunu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SonucEkrani extends AppCompatActivity {
    EditText dogru;
    EditText yanlis;
    Button buton;
    Button buton2;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sonuc_ekrani);

        dogru = (EditText)findViewById(R.id.editText);
        yanlis = (EditText)findViewById(R.id.editText2);
        buton = (Button)findViewById(R.id.button10);


        Bundle extras = getIntent().getExtras();
        Integer dogruSayisi = extras.getInt("dogru_sayisi");
        Integer yanlisSayisi = extras.getInt("yanlis_sayisi");

        dogru.setText(String.valueOf(dogruSayisi));
        yanlis.setText(String.valueOf(yanlisSayisi));

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              System.exit(0);
            }
        });

    }

}
