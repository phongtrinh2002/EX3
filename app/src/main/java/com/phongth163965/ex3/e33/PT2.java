package com.phongth163965.ex3.e33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.phongth163965.ex3.R;

public class PT2 extends AppCompatActivity {

    EditText txtA, txtB, txtC;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt2);

        txtA = findViewById(R.id.pt2txt1);
        txtB = findViewById(R.id.pt2txt2);
        txtC = findViewById(R.id.pt2txt3);
        btn1 = findViewById(R.id.pt2btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }

    private void sendData(){
        String a = txtA.getText().toString();
        String b = txtB.getText().toString();
        String c = txtC.getText().toString();

        Intent intent = new Intent(PT2.this, PT2KQ.class);

        intent.putExtra("hsa", a);
        intent.putExtra("hsb", b);
        intent.putExtra("hsc", c);

        startActivity(intent);
    }
}