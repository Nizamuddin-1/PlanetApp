package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Contact_Model> arrayList=new ArrayList<>();
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_wb_sunny_24,"Sun","1"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_mood_24,"Moon","2"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_next_plan_24,"Earth","3"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_wb_sunny_24,"Sun","1"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_mood_24,"Moon","2"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_next_plan_24,"Earth","3"));
        arrayList.add(new Contact_Model(R.drawable.ic_baseline_wb_sunny_24,"Sun","1"));
        myAdapter adapter=new myAdapter(this,arrayList);
        listView.setAdapter(adapter);
    }
}