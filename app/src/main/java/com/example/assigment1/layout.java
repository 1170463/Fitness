package com.example.assigment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class layout extends AppCompatActivity {
    public static final String Wight = "Wight";
    public static final String HIGH = "HIGH";
    private SharedPreferences.Editor editor;
    private SharedPreferences prefs;
    private EditText wight1;
    private EditText high1;
    private RadioGroup group;
    private Spinner goalspen;
    private RadioButton male;
    private RadioButton Female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        high1 = findViewById(R.id.high1);
        wight1 = findViewById(R.id.wight1);
        goalspen = findViewById(R.id.goalspen);
        group = findViewById(R.id.group);
        male=findViewById(R.id.male);
        Female=findViewById(R.id.female);
       // checkPrefs();
        setupSharedPrefs();

    }
    public void next(View view){
            Intent intent = new Intent(this, activity3.class);
            startActivity(intent);
        String height = high1.getText().toString();
        String weight = wight1.getText().toString();

        editor.putString(height,height);
        editor.putString(weight,weight);
        editor.commit();
        prefs.edit().putBoolean("bntChecked", male.isChecked()).apply();

        }
    private void checkPrefs(){


        String height = prefs.getString(HIGH,"");
        String weight = prefs.getString(Wight,"");

        high1.setText(height);
        wight1.setText(weight);


    }
    private void setupSharedPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();


    }




}
