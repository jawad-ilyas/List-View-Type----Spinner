package com.example.lissttype_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // for work with spinner we need to find id
    Spinner spCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // find the id
        spCountry = findViewById(R.id.spCountry);

        // create a Array list beacuase we want to show data into screen
        ArrayList<String> arrSpinner = new ArrayList<>();

        arrSpinner.add("pakistan");
        arrSpinner.add("india");
        arrSpinner.add("bangledash");
        arrSpinner.add("nepal");
        arrSpinner.add("srilanka");


        // need to create adapter soo we need to show data
        ArrayAdapter<String> spinnerAdp =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrSpinner);

        // now we need to embaned data
        spCountry.setAdapter(spinnerAdp);

    }
}