package com.example.matematikoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class ToplamaEkrani extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textview6;
    int number1;
    int number2;
    Button buton;
    Button buton2;
    Button buton3;
    Button buton4;
    Button buton5;
    int toplam;
    int a;
    int yanlis1;
    int yanlis2;
    int yanlis3;
    int yanlis4;
    int yanlis5;
    static int dogrucevap=0;
    static int yanliscevap=0;
    int b;
    CountDownTimer sure;
    int counter = 100;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toplama_ekrani);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textview6 = (TextView) findViewById(R.id.textView6);
        buton = (Button) findViewById(R.id.button);
        buton2 = (Button) findViewById(R.id.button2);
        buton3 = (Button) findViewById(R.id.button3);
        buton4 = (Button) findViewById(R.id.button4);
        buton5 = (Button) findViewById(R.id.button5);

        sayiuret();
        butonata();
        sure();
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton.getText().toString()) == toplam) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                }
            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton2.getText().toString()) == toplam) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                }
            }

        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton3.getText().toString()) == toplam) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                }
            }
        });

        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton4.getText().toString()) == toplam) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                }
            }
        });

        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton5.getText().toString()) == toplam) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();


                }
            }
        });

    }

    public void butonata() {

        Random random = new Random();
        b=random.nextInt(5)+1;

        if(b==1)
            buton2.setText(String.valueOf(toplam));
        if(b==2)
            buton.setText(String.valueOf(toplam));
        if(b==3)
            buton3.setText(String.valueOf(toplam));
        if(b==4)
            buton4.setText(String.valueOf(toplam));
        if(b==5)
            buton5.setText(String.valueOf(toplam));

        if(b!=1)
            buton2.setText(String.valueOf(yanlis5));
        if(b!=2)
            buton.setText(String.valueOf(yanlis1));
        if(b!=3)
            buton3.setText(String.valueOf(yanlis2));
        if(b!=4)
            buton4.setText(String.valueOf(yanlis3));
        if(b!=5)
            buton5.setText(String.valueOf(yanlis4));
    }

    public void sayiuret(){

        Random random = new Random();

        number1 = random.nextInt(50) + 1;
        number2 = random.nextInt(50) + 1;

        textView.setText(String.valueOf(number1));
        textView2.setText(String.valueOf(number2));
        toplam = number1 + number2;

        do {
            yanlis1 = toplam+random.nextInt(10)+1;
        }while(toplam==yanlis1);

        do {
            yanlis2 = toplam-random.nextInt(10)-1;
        }while(toplam==yanlis2);
        do {
            yanlis3 = toplam+10;
        }while (toplam==yanlis3);
        do {
            yanlis4 = toplam-10;
        }while (toplam==yanlis4);
        do {
            yanlis5 = random.nextInt(100);
        }while (toplam==yanlis5);
    }

    public void gecis(){
        Intent intent = new Intent(ToplamaEkrani.this, SonucEkrani.class);
        intent.putExtra("dogru_sayisi",dogrucevap);
        intent.putExtra("yanlis_sayisi",yanliscevap);
        if(dogrucevap+yanliscevap==10){
            sure.cancel();
            startActivity(intent);

        }
    }
    public void sure(){
       sure = new CountDownTimer(10000,1000){
            public void onTick(long millisUntilFinished){

            }
            public void onFinish(){

                yanliscevap=yanliscevap+1;
                Toast.makeText(getApplicationContext(), "Süre Doldu!", Toast.LENGTH_SHORT).show();
                sayiuret();
                butonata();
                gecis();
                sure();
            }
        }
        .start();
    }

    public void kontrol(){
        if(sure!=null){
        sure.cancel();
        }
    }

    /*
    public void progresbar(){
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override

            public void run()
            {


                counter--;
                progressBar.setProgress(counter);

                if(counter == 0)
                    t.cancel();
            }
        };

        t.schedule(tt,0,100);
    }
    */
}
