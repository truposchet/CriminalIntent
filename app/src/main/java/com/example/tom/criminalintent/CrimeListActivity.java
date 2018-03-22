package com.example.tom.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Tom on 05.03.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {return new CrimeListFragment();}
}
