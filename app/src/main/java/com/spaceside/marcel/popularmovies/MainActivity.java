package com.spaceside.marcel.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton doot = (ImageButton) findViewById(R.id.doot);
        Picasso.with(this).load("http://www.sfzoo.org/images/gallery/turkeyvulture/img_turkeyvulture_mh_large.jpg").into(doot);
        
    }
}
