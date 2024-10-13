package com.example.bottom_navi.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment1(); // Replace with your actual fragment
            case 1:
                return new Fragment2(); // Replace with your actual fragment
            case 2:
                return new Fragment3(); // Replace with your actual fragment
            default:
                return new Fragment1();

        }
    }

    @Override
    public int getCount() {
        return 3; // Number of fragments you have
    }
}
