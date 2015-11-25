package it.enrichman.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

/**
 * Copyright (c) 2015 Enrico Candino
 * <p>
 * Distributed under the MIT License.
 */
public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private ScreenSlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.my_view_pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
    }


    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        private int[] fragmentColors = {
                R.color.color_1,
                R.color.color_2,
                R.color.color_3,
                R.color.color_4,
                R.color.color_5
        };

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new ScrollableFragment();

            Bundle args = new Bundle();
            int color = ContextCompat.getColor(MainActivity.this, fragmentColors[position]);
            args.putInt("color", color);
            fragment.setArguments(args);

            return fragment;
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}