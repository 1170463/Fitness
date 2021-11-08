package com.example.assigment1;

import static com.example.assigment1.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    private Spinner goalspen;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String goals[] = {"ARM", "CORE", "BUTT", "LEG"};
        goalspen = findViewById(R.id.goalspen);
//       goalspen.setOnItemSelectedListener(this);


        setContentView(R.layout.activity_main);
    arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, goals);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        goalspen.setAdapter(arrayAdapter);

    }
    public void getStart(View view) {
        Intent intent = new Intent(this,layout.class);
        startActivity(intent);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
