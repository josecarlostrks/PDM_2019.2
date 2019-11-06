package com.example.brasileiro;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Classificacao  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        List<Time> times;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classificacao);

        listView = (ListView) findViewById(R.id.times);
        times = Time.getTimes();

        listView.setAdapter(new TimeAdapter(this, times));

        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
