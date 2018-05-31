package com.example.bjqiru.nativeandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //startActivity();
        //Intent intent = new Intent(this, MyReactActivity.this);
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MyReactActivity.class);
        startActivity(intent);
    }
}
