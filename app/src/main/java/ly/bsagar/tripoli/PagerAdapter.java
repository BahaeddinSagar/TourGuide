package ly.bsagar.tripoli;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContex;

    PagerAdapter(Context contex, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContex = contex;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragments();
        } else if (position == 1) {
            return new CitiesFragment();
        } else if (position ==2){
            return new ResturantFragment();
        } else {
            return new EventsFragments();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContex.getString(R.string.Landmarks);
        } else if (position == 1) {
            return mContex.getString(R.string.Cities);
        } else if (position ==2){
            return mContex.getString(R.string.Resturants);
        } else {
            return mContex.getString(R.string.Events);
        }
    }
}
