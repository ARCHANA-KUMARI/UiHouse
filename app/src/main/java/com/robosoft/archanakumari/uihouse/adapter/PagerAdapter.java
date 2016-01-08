package com.robosoft.archanakumari.uihouse.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.robosoft.archanakumari.uihouse.R;
import com.robosoft.archanakumari.uihouse.fragment.BlankFragment;
import com.robosoft.archanakumari.uihouse.fragment.RecyclerFragment;
import com.robosoft.archanakumari.uihouse.fragment.TryFragment;

/**
 * Created by archanakumari on 2/1/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    Context context;
    private String mTabName[];
    public PagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        mTabName = context.getResources().getStringArray(R.array.name);
    }
  RecyclerFragment recyclerFragment;

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            Log.i("Hello", "Hi i am in position 0");
            recyclerFragment = new RecyclerFragment();
            return recyclerFragment;

        }
        else if(position==1){
     BlankFragment  blankFragment = new BlankFragment();
            return blankFragment;
        }
        else{
            TryFragment tryFragment = new TryFragment();
            return  tryFragment;
        }



    }


    @Override
    public int getCount() {
      Log.i("Hellow","Hi i am in getCount()");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.i("Hellow","Hi i am in getPageTitle()");
        return mTabName[position];
    }
}
