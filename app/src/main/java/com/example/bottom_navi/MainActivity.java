package com.example.bottom_navi;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.example.bottom_navi.fragment.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // optional, depending on your needs
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        if (viewpager != null) {
            viewpager.setAdapter(adapter);
        } else {
            Log.e("Fragment3", "ViewPager is null!");
        }

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.account).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.info).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.d("Navigation", "Item selected: " );
                if (item.getItemId() == R.id.home) {
                    viewpager.setCurrentItem(0);
                    return true;
                } else if (item.getItemId() == R.id.account) {
                    viewpager.setCurrentItem(1);
                    return true;
                } else if (item.getItemId() == R.id.info) {
                    viewpager.setCurrentItem(2);
                    return true;
                } else {
                    return false;
                }




            }
        }); // Closing parenthesis and brace added here
    }
}
