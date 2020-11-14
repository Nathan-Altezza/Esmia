package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
         ListView ls = (ListView)findViewById(R.id.list);
         listItem = getResources().getStringArray(R.array.Liste);
         final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,listItem);
         ls.setAdapter(adapter);
         ls.setOnItemClickListener((adapterView, view, position,l)->{

             String value=adapter.getItem(position);
             Toast.makeText(getApplication(),value, Toast.LENGTH_SHORT).show();
         });


    }
}