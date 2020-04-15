package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mountainNames = {"Matterhorn", "Mont Blanc", "Denali"};
        String[] mountainLocation ={"Alps", "Alps", "Alaska"};
        int [] mountainHeights = {4478, 4808, 6190};

        ArrayList<String> listData=new ArrayList<>(Arrays.asList(mountainNames));

        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this,R.layout.list_items_textview, R.id.list_item, listData);

        ListView myListView = findViewById(R.id.list_view);

        myListView.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "you did it", Toast.LENGTH_SHORT).show();
            }
        };

        myListView.setOnItemClickListener(listener);

    }
}
