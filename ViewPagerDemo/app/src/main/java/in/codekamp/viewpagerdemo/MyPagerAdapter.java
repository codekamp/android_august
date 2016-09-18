package in.codekamp.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by cerebro on 18/09/16.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {



    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if((position % 2) == 0) {
            return new FragmentOne();
        }

        return new FragmentTwo();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "page " + position;
    }
}
