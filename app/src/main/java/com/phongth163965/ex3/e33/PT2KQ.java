package com.phongth163965.ex3.e33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.phongth163965.ex3.R;

public class PT2KQ extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt2_kq);

        tv1 = findViewById(R.id.pt2KQ);

        Intent i1 = getIntent();

        int a = Integer.parseInt(i1.getExtras().getString("hsa"));
        int b = Integer.parseInt(i1.getExtras().getString("hsb"));
        int c = Integer.parseInt(i1.getExtras().getString("hsc"));

        int delta = b*b - 4*a*c;

        if(delta < 0 ){
            tv1.setText(" vo nghiem ");
        }else if ((delta == 0)){
            tv1.setText(" nghiem kep x=" + (-b)/(2*a));
        }else {
            float x1= (float) (-b+Math.sqrt(delta)/(2*a));
            float x2= (float) (-b-Math.sqrt(delta)/(2*a));
            tv1.setText("Pt 2 nghiem x1 =" + x1 + "va x2 =" + x2);
        }
    }
}