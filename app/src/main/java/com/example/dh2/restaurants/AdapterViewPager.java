package com.example.dh2.restaurants;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh2 on 29/05/17.
 */

public class AdapterViewPager extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private FragmentManager fragmentManager;

    public AdapterViewPager(FragmentManager fm) {
        super(fm);

        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.tegui, "Tegui"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.astridygaston, "Astrid Gaston"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.borago, "Borago"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.dom, "Dom"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.maido, "Maido"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.mani, "Mani"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.quintonil, "Quintonil"));

    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
