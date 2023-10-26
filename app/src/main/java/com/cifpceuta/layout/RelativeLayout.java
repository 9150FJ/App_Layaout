package com.cifpceuta.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RelativeLayout extends AppCompatActivity {


    ListView listView;
    String[] listItem;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        listView=(ListView) findViewById(R.id.listViewz);
        listItem=getResources().getStringArray(R.array.arrayModulos);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,listItem);
        listView.setAdapter(adapter);
    }
}