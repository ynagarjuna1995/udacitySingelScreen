package com.startupmatters.nagarjuna.singlepageapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private BAAdapter secOneAdpater;
    private ViewPager secOneViewPager, secTwoViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secOneViewPager = (ViewPager) findViewById(R.id.BAViewPager);
        secOneAdpater = new BAAdapter(this);
        secOneViewPager.setAdapter(secOneAdpater);

        RecyclerView facilitiesRecycler = (RecyclerView) findViewById(R.id.facilities_recycler);

        RecyclerAdapter mRecyclerAdapter = new RecyclerAdapter(this);

        facilitiesRecycler.setAdapter(mRecyclerAdapter);
        facilitiesRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }
}
