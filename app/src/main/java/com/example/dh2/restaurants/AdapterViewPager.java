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

        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.tegui, "Tegui \n (Buenos Aires - Argentina"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.astridygaston, "Astrid y  Gastón\n(Lima - Peru)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.borago, "Boragó\n(Santiago - Chile)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.dom, "D.O.M.\n(San Pablo - Brasil)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.maido, "Maido\n(Lima - Peru)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.mani, "Maní\n(San Pablo - Brasil)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.quintonil, "Quintonil\n (DF - Mexico)"));
        fragments.add(RestaurantsFragment.fabricameElFragment(R.drawable.central, "Central\n (Lima - Perú)"));

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
