package com.spaceside.marcel.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fakedata = {"movie1", "movie2", "movie3", "movie4"};
        List<String> data = new ArrayList<>(Arrays.asList(fakedata));

        ArrayAdapter<String> posterAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                fakedata);

        ListView listView = (ListView) findViewById(R.id.listview_posters);
        listView.setAdapter(posterAdapter);
    }
}
