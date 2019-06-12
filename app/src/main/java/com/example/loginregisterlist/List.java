package com.example.loginregisterlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mylist=(ListView)findViewById(R.id.mylist);
        ArrayList<String> Fruits=new ArrayList<>();
        Fruits.add("Avoca");
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Orange");
        Fruits.add("Banana");
        Fruits.add("Guava");
        ArrayAdapter<String>Marc=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Fruits);
        mylist.setAdapter(Marc);

    }
}
