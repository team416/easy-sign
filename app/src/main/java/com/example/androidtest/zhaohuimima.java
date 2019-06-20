package com.example.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

public class zhaohuimima extends Activity implements View.OnClickListener{
    Button zh=null;
    EditText wt = null;
    EditText da = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhaohuimima);
        zh = (Button) findViewById(R.id.zhaohui);
        zh.setOnClickListener(this);
        wt = (EditText) findViewById(R.id.wenti);
        da = (EditText) findViewById(R.id.daan);
    }
    @Override
    public void onClick(View v) {

    }
}