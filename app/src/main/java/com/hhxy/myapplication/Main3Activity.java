package com.hhxy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void Btn(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("flag",1);
        startActivity(intent);
        finish();
    }

}
