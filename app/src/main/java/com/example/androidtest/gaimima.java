package  com.example.androidtest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.androidtest.R.id.zhuceBtn;

public class gaimima extends Activity implements View.OnClickListener {
    private static final String TAG = "login";
    Button bc = null;
    EditText jm = null;
    EditText xm = null;
    EditText zxm=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaimima);
        bc = (Button) findViewById(R.id.baocun);
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent4=new Intent("com.example.androidtest.zhongxin_START");
                startActivity(intent4);
            }
        });
        jm = (EditText) findViewById(R.id.old);
        xm = (EditText) findViewById(R.id.newpass);
        zxm= (EditText) findViewById(R.id.renew);
    }
    @Override
    public void onClick(View v) {

    }

}