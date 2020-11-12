package com.example.multimpleacrivitypetrov;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] things = { "Флаг 1", "Флаг 2", "Флаг 3", "Флаг 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent1 = new Intent(MainActivity.this, Clock.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, Illusion.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, Image.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, Rubik.class);
                        startActivity(intent4);
                        break;
                }
                Toast.makeText(getApplicationContext(), "Вы выбрали "
                        + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemListener);
    }
}