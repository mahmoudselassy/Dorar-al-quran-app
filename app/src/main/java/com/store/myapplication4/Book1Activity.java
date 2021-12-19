package com.store.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;

import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class Book1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        Objects.requireNonNull(getSupportActionBar()).hide();//hide bar
        Intent intent=new Intent(getApplicationContext(),MyService.class);


       // Intent i=new Intent(getApplicationContext(),DownloadService.class);


        ///1st row of buttons
        //download button
        ImageButton b1= (ImageButton) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=0;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b2=(ImageButton) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=0;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b3= (ImageButton) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=0;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///2nd row of buttons
        //download button
        ImageButton b4= (ImageButton) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=1;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b5=(ImageButton) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=1;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b6= (ImageButton) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=1;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///3rd row of buttons
        //download button
        ImageButton b7= (ImageButton) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=2;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b8=(ImageButton) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=2;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b9= (ImageButton) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=2;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///4th row of buttons
        //download button
        ImageButton b10= (ImageButton) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=3;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b11=(ImageButton) findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=3;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b12= (ImageButton) findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=3;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///5th row of buttons
        //download button
        ImageButton b13= (ImageButton) findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=4;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b14=(ImageButton) findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=4;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b15= (ImageButton) findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=4;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///6th row of buttons
        //download button
        ImageButton b16= (ImageButton) findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=5;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b17=(ImageButton) findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=5;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b18= (ImageButton) findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=5;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///7th row of buttons
        //download button
        ImageButton b19= (ImageButton) findViewById(R.id.button19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=6;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b20= (ImageButton) findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=6;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b21= (ImageButton) findViewById(R.id.button21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=6;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///8th row of buttons
        //download button
        ImageButton b22=(ImageButton) findViewById(R.id.button22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=7;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b23= (ImageButton) findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=7;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b24= (ImageButton) findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=7;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///9th row of buttons
        //download button
        ImageButton b25=(ImageButton) findViewById(R.id.button25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=8;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b26= (ImageButton) findViewById(R.id.button26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=8;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b27= (ImageButton) findViewById(R.id.button27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=8;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///10th row of buttons
        //download button
        ImageButton b28=(ImageButton) findViewById(R.id.button28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=9;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b29= (ImageButton) findViewById(R.id.button29);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=9;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b30= (ImageButton) findViewById(R.id.button30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=9;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///11st row of buttons
        //download button
        ImageButton b31=(ImageButton) findViewById(R.id.button31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=10;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b32= (ImageButton) findViewById(R.id.button32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=10;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b33= (ImageButton) findViewById(R.id.button33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=10;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///12nd row of buttons
        //download button
        ImageButton b34=(ImageButton) findViewById(R.id.button34);
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=11;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b35= (ImageButton) findViewById(R.id.button35);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=11;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b36= (ImageButton) findViewById(R.id.button36);
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=11;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///13th row of buttons
        //download button
        ImageButton b37=(ImageButton) findViewById(R.id.button37);
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=12;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b38= (ImageButton) findViewById(R.id.button38);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=12;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b39= (ImageButton) findViewById(R.id.button39);
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=12;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///14th row of buttons
        //download button
        ImageButton b40=(ImageButton) findViewById(R.id.button40);
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=13;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b41= (ImageButton) findViewById(R.id.button41);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=13;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b42= (ImageButton) findViewById(R.id.button42);
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=13;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //*********************************************
        ///15th row of buttons
        //download button
        ImageButton b43=(ImageButton) findViewById(R.id.button43);
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Book1Activity.this,DownloadService.class);
                int order=14;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });
        //stop button
        ImageButton b44= (ImageButton) findViewById(R.id.button44);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=14;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                stopService(i);
            }
        });
        //play button
        ImageButton b45= (ImageButton) findViewById(R.id.button45);
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Book1Activity.this,MyService.class);
                int order=14;
                String type="RQ";
                i.putExtra("order", order);
                i.putExtra("type",type);
                startService(i);
            }
        });






    }
/*
    //Method for start buttons
    public void startservice(ImageButton button, Intent intent) {
        button.setOnClickListener(v ->  startService(intent));
    }
    //Mthod for stop buttons
    public void stopservice(ImageButton button, Intent intent) {
        button.setOnClickListener(v -> stopService(intent));

    }
    //Mthod for download buttons
    public void downloadservice(ImageButton button, Intent i) {
        button.setOnClickListener(v -> startService(i));

    }*/


}