package com.example.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mibao extends AppCompatActivity implements View.OnClickListener{
Button baocun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibao);
        baocun= (Button) findViewById(R.id.baocun);
        baocun.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent2=new Intent("com.example.androidtest.zhongxin_START");
                startActivity(intent2);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
