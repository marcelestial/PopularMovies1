package com.spaceside.marcel.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String[] fakedata = new String[] {"movie1", "movie2", "movie3", "movie4"};
        List<String> data = new ArrayList<>(Arrays.asList(fakedata));

        ArrayAdapter<String> posterAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                fakedata);

        GridView GridView = (GridView) findViewById(R.id.gridview_posters);
        GridView.setAdapter(posterAdapter);
    }
}
