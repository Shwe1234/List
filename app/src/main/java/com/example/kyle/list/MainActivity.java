package com.example.kyle.list;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Bacon","Ham","Tuna","Candy","Metball","Potato"};

       // ListAdapter shweAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,foods);

        ListAdapter shweAdapter=new CustomAdapter(this,foods);

        ListView shweList=(ListView)findViewById(R.id.listView);

        shweList.setAdapter(shweAdapter);

        shweList.setOnItemClickListener(
                new OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        String food = String.valueOf(parent.getItemAtPosition(position));

                        Toast.makeText(getBaseContext(),food,Toast.LENGTH_SHORT).show();
                    }

                }

        );
    }
}
