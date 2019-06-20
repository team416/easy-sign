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

public class zhuceActivity extends Activity implements View.OnClickListener{
     Button zhuceBtn=null;
    EditText zhuceId = null;
    EditText zhucepass = null;
    EditText querenpass = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        zhuceBtn = (Button) findViewById(R.id.zhuceBtn);
        zhuceBtn.setOnClickListener(this);
        zhuceId = (EditText) findViewById(R.id.zhuceId);
        zhucepass = (EditText) findViewById(R.id.zhucepass);
        querenpass = (EditText) findViewById(R.id.querenpass);
    }
    @Override
    public void onClick(View v) {

    }
}
