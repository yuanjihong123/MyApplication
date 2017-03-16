package com.hhxy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        int flag = intent.getIntExtra("flag",0);
        City city = (City) intent.getSerializableExtra("city");
        if(flag != 1){
            textView.setText(city.getName()+","+city.getSex());
        }
    }
    public void Btn2(View v){
        startActivity(new Intent(this,SetActivity.class));
    }
}
