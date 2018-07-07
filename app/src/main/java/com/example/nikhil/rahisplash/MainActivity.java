package com.example.nikhil.rahisplash;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;


public class MainActivity extends AppCompatActivity {

    ViewPager mPager;
    Adapter adapter;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES = {R.drawable.tenor, R.drawable.one, R.drawable.two, R.drawable.three};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        adapter = new Adapter(getApplicationContext(),IMAGES);

        mPager.setAdapter(adapter);
        CircleIndicator circleIndicator = findViewById(R.id.indicator);
        circleIndicator.setViewPager(mPager);


    }
}
