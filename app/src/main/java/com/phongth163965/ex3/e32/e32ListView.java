package com.phongth163965.ex3.e32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.phongth163965.ex3.R;

public class e32ListView extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e32_list_view);
        listView = findViewById(R.id.e32Lv);
        getDataToListView();
    }

    private void getDataToListView(){
        String[] arr = new String[]{
                "Trinh Hong Phong",
                "Nguyen Hong Son",
                "Phan Gia Bao",
                "Bui Quoc Anh",
                "Le Anh Dung"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(e32ListView.this,
                android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(adapter);
    }
}