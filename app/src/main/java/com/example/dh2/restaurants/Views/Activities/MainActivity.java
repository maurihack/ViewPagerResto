package com.example.dh2.restaurants.Views.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.dh2.restaurants.Views.Fragments.AboutUsFragment;
import com.example.dh2.restaurants.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intentRestaurants = new Intent(this, RestaurantsActivity.class);
        final Intent intentRecetas = new Intent(this, RecetasActivity.class);

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayoutMainActivity);
        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.itemRestaurants)
                    startActivity(intentRestaurants);
                drawerLayout.closeDrawers();

                if (item.getItemId() == R.id.itemAboutUs) {
                    AboutUsFragment aboutUs = new AboutUsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contenedorAboutUs, aboutUs ).addToBackStack(null).commit();
                    drawerLayout.closeDrawers();
                }
                if (item.getItemId() == R.id.itemlistaRecetas){
                    startActivity(intentRecetas);
                    drawerLayout.closeDrawers();
                }
                return true;
            }
        });
    }

}
