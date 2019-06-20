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

public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "login";
    Button loginBtn = null;
    Button register=null;
    Button forgetpass=null;
    EditText useridEt = null;
    EditText passEt = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(this);
        register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent2=new Intent("com.example.androidtest.ZHUCE_START");
                startActivity(intent2);
            }
        });
        forgetpass=(Button)findViewById(R.id.forgetpass);
        forgetpass.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                Intent intent6=new Intent("com.example.androidtest.zhaohui_START");
                startActivity(intent6);
            }
        });
        useridEt = (EditText) findViewById(R.id.userId);
        passEt = (EditText) findViewById(R.id.pass);

    }
    @Override
    public void onClick(View v) {
        String userid = useridEt.getText().toString().trim();
        String pass = passEt.getText().toString().trim();
        if (userid.equals("123") && pass.equals("123")) {
            Toast.makeText(MainActivity.this, R.string.loginSuccess, Toast.LENGTH_LONG).show();
            Intent intent=new Intent("com.example.androidtest.ACTION_START");
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, R.string.loginError, Toast.LENGTH_LONG).show();
        }
    }

}