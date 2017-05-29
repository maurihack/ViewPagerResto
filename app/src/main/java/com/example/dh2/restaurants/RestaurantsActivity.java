package com.example.dh2.restaurants;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPagerRestaurants);
        AdapterViewPager adapter = new AdapterViewPager(getSupportFragmentManager());
        viewPager.setAdapter(adapter);



    }
}
