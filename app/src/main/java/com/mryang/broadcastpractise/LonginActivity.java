package com.mryang.broadcastpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LonginActivity extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin);
        accountEdit = (EditText)findViewById(R.id.account);
        passwordEdit = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if(account.equals("admin") && password.equals("admin888")){
                    Intent intent = new Intent(LonginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LonginActivity.this,"account or password is error.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
