package com.store.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.preference.PreferenceManager;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    TextView tv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Objects.requireNonNull(getSupportActionBar()).hide();//hide bar
        tv_name=(TextView) findViewById(R.id.tv_name);
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(HomeActivity.this);
        String name=sp.getString("name","Not Found");
        tv_name.setText(name);


        //button1
        ImageButton button1= findViewById(R.id.book1);
        button1.setOnClickListener( v -> openBook1Activity());

        //button2
        ImageButton button2= findViewById(R.id.book2);
        button2.setOnClickListener( v -> openBook2Activity());


    }
    ///Book1
    public void openBook1Activity(){

        Intent intent = new Intent(this, Book1Activity.class);
        startActivity(intent);

    }

    public void openBook2Activity(){

        Intent intent = new Intent(this, Book2Activity.class);
        startActivity(intent);

    }




}