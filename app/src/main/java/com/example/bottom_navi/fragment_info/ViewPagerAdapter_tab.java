package com.example.bottom_navi.fragment_info;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.bottom_navi.fragment.Fragment1;
import com.example.bottom_navi.fragment.Fragment2;
import com.example.bottom_navi.fragment.Fragment3;

public class ViewPagerAdapter_tab extends FragmentStatePagerAdapter {
    /**
     * Constructor for {@link FragmentStatePagerAdapter}.
     * <p>
     * If {@link #BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT} is passed in, then only the current
     * Fragment is in the {@link Lifecycle.State#RESUMED} state, while all other fragments are
     * capped at {@link Lifecycle.State#STARTED}. If {@link #BEHAVIOR_SET_USER_VISIBLE_HINT} is
     * passed, all fragments are in the {@link Lifecycle.State#RESUMED} state and there will be
     * callbacks to {@link Fragment#setUserVisibleHint(boolean)}.
     *
     * @param fm       fragment manager that will interact with this adapter
     * @param behavior determines if only current fragments are in a resumed state
     */
    public ViewPagerAdapter_tab(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    // Constructor using FragmentActivity
    public ViewPagerAdapter_tab(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity.getSupportFragmentManager());
    }

    // Constructor using FragmentManager
    public ViewPagerAdapter_tab(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Return the fragment corresponding to the position
        switch (position) {
            case 0:
                return new Fragment_tab1();
            case 1:
                return new Fragment_tab2();
            case 2:
                return new Fragment_tab3();
            default:
                return new Fragment_tab1(); // Return default fragment if position is invalid
        }
    }

    @Override
    public int getCount() {
        // Return the number of fragments to be displayed
        return 3;
    }

    // Optional: If you want to provide titles for the tabs
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Trường học";
            case 1:
                return "Quê hương";
            case 2:
                return "Xã hội";
            default:
                return "Trường học";  // Return a default title if the position is out of range
        }
    }
}
