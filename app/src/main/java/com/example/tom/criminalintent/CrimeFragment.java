package com.example.tom.criminalintent;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Tom on 26.02.2018.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
