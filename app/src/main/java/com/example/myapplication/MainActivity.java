package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
   String[] name={"abc","def","dddd","ssss"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(ad);




    }
}
