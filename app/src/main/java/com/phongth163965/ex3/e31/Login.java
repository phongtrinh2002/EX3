package com.phongth163965.ex3.e31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.phongth163965.ex3.R;

public class Login extends AppCompatActivity {
    EditText txt1, txt2;

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt1 = findViewById(R.id.txt1Login);
        txt2 = findViewById(R.id.txt2Login);
        btn1 = findViewById(R.id.btn1Login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login(){
        if(txt1.getText().toString().equals("admin") && txt2.getText().toString().equals("123456")){
            Toast.makeText( Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText( Login.this, "Wrong! Please enter again", Toast.LENGTH_SHORT).show();
        }
    }
}