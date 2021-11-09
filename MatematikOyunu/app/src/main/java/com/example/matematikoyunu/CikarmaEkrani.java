package com.example.matematikoyunu;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class CikarmaEkrani extends AppCompatActivity {
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
    int sonuc;
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cikarma_ekrani);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textview6 = (TextView) findViewById(R.id.textView6);
        buton = (Button) findViewById(R.id.button);
        buton2 = (Button) findViewById(R.id.button2);
        buton3 = (Button) findViewById(R.id.button3);
        buton4 = (Button) findViewById(R.id.button4);
        buton5 = (Button) findViewById(R.id.button5);

       /* textView3.setText("Doğru Cevap:" + dogrucevap);
        textview6.setText("Yanlış Cevap:" + yanliscevap);
*/
        sayiuret();
        butonata();
        sure();
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton.getText().toString()) == sonuc) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                  //  textView3.setText("Doğru Cevap:" + dogrucevap);

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                    //textview6.setText("Yanlış Cevap:" + yanliscevap);

                }
            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton2.getText().toString()) == sonuc) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                  //  textView3.setText("Doğru Cevap:" + dogrucevap);

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                  //  textview6.setText("Yanlış Cevap:" + yanliscevap);

                }
            }

        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton3.getText().toString()) == sonuc) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                   // textView3.setText("Doğru Cevap:" + dogrucevap);

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                  //  textview6.setText("Yanlış Cevap:" + yanliscevap);

                }
            }
        });

        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton4.getText().toString()) == sonuc) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                   // textView3.setText("Doğru Cevap:" + dogrucevap);

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                   // textview6.setText("Yanlış Cevap:" + yanliscevap);

                }
            }
        });

        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(buton5.getText().toString()) == sonuc) {
                    Toast.makeText(getApplicationContext(), "Doğru Cevap!", Toast.LENGTH_SHORT).show();
                    dogrucevap = dogrucevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                   // textView3.setText("Doğru Cevap:" + dogrucevap);

                } else {
                    Toast.makeText(getApplicationContext(), "Yanlış Cevap!", Toast.LENGTH_SHORT).show();
                    yanliscevap = yanliscevap + 1;
                    kontrol();
                    sure();
                    sayiuret();
                    butonata();
                    gecis();
                    //textview6.setText("Yanlış Cevap:" + yanliscevap);

                }
            }
        });
    }

    public void butonata() {

        Random random = new Random();
        b=random.nextInt(5)+1;

        if(b==1)
            buton2.setText(String.valueOf(sonuc));
        if(b==2)
            buton.setText(String.valueOf(sonuc));
        if(b==3)
            buton3.setText(String.valueOf(sonuc));
        if(b==4)
            buton4.setText(String.valueOf(sonuc));
        if(b==5)
            buton5.setText(String.valueOf(sonuc));

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

        do {
            number1 = random.nextInt(80) + 1;
            number2 = random.nextInt(80) + 1;
}
            while (number1 < number2);

            textView.setText(String.valueOf(number1));
            textView2.setText(String.valueOf(number2));
            sonuc = number1 - number2;

        do {
            yanlis1 = sonuc+random.nextInt(10)+1;
        }while(sonuc==yanlis1);

        do {
            yanlis2 = sonuc-random.nextInt(10)-1;
            if(yanlis2<0)
                yanlis2=random.nextInt(100);
        }while(sonuc==yanlis2);
        do {
            yanlis3 = sonuc+10;
        }while (sonuc==yanlis3);
        do {
            yanlis4 = sonuc-10;
            if(yanlis4<0)
                yanlis4=random.nextInt(100);
        }while (sonuc==yanlis4&&yanlis2==yanlis4);
        do {
            yanlis5 = random.nextInt(100);
        }while (sonuc==yanlis5);
    }

    public void gecis(){
        Intent intent = new Intent(CikarmaEkrani.this, SonucEkrani.class);
        intent.putExtra("dogru_sayisi",dogrucevap);
        intent.putExtra("yanlis_sayisi",yanliscevap);
        if(dogrucevap+yanliscevap==10){
            sure.cancel();
            startActivity(intent);
        }
    }
    public void sure(){
      sure =  new CountDownTimer(10000,10){
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

}

