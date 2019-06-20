package com.example.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
public class gerenzhongxin extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "login";
    Button tc= null;
    Button mima=null;
    Button fh=null;
    Button jl=null;
    Button mb=null;
    TextView xh=null;
    Button bb=null;
    ImageView a1;
    ImageView a2;
    ImageView a3;
    ImageView a4;
    ImageView a5;
    ImageView a6;
    ImageView a7;
    ImageView a8;
    ImageView a9;
    ImageView a10;
    ImageView a11;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenzhongxin);
        mima = (Button) findViewById(R.id.xiugai);
        mima.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent2=new Intent("com.example.androidtest.gmm_START");
                startActivity(intent2);
            }
        });
        mb = (Button) findViewById(R.id.mibao);
        mb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent8=new Intent("com.example.androidtest.mibao");
                startActivity(intent8);
            }
        });
        jl = (Button) findViewById(R.id.jilu);
        jl.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent7=new Intent("com.example.androidtest.jilu_START");
                startActivity(intent7);
            }
        });
        fh = (Button) findViewById(R.id.fanhui);
        fh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent5=new Intent("com.example.androidtest.ACTION_START");
                startActivity(intent5);
            }
        });
        tc=(Button)findViewById(R.id.tuichu);
        tc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent_login = new Intent();
                intent_login.setClass(gerenzhongxin.this,MainActivity.class);
                intent_login.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //关键的一句，将新的activity置为栈顶
                startActivity(intent_login);
                finish();
        }
        });
        xh = (TextView) findViewById(R.id.xuehao);
        bb = (Button) findViewById(R.id.gengxin);
        a1=(ImageView)findViewById(R.id.imageView15);
        a2=(ImageView)findViewById(R.id.imageView14);
        a3=(ImageView)findViewById(R.id.imageView);
        a4=(ImageView)findViewById(R.id.imageView12);
        a5=(ImageView)findViewById(R.id.imageView11);
        a6=(ImageView)findViewById(R.id.imageView10);
        a7=(ImageView)findViewById(R.id.imageView9);
        a8=(ImageView)findViewById(R.id.imageView8);
        a9=(ImageView)findViewById(R.id.imageView6);
        a10=(ImageView)findViewById(R.id.imageView5);
        a11=(ImageView)findViewById(R.id.imageView4);

    }
    @Override
    public void onClick(View v) {

    }

}
