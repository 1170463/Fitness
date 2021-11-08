package com.example.assigment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assigment1.Model.MainActivity2;
import com.example.assigment1.Model.typeExercises;
import com.example.assigment1.Model.ExercisesFactory;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class activity3 extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);


        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<typeExercises> listAdapter = new ArrayAdapter<typeExercises>(this,
                android.R.layout.simple_list_item_1,
                Arrays.asList(typeExercises.Items));

        listView.setAdapter(listAdapter);




        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(activity3.this,
                        MainActivity2.class);
                intent.putExtra("item_id", (int) id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }


}
