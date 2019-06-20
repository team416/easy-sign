package com.example.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qiandaojilu extends Activity implements View.OnClickListener {
  Button fh=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qiandaojilu);
        fh = (Button) findViewById(R.id.fanhui);
        fh.setOnClickListener(new View.OnClickListener()
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
