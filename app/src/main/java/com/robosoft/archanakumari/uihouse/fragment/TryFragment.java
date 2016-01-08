package com.robosoft.archanakumari.uihouse.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robosoft.archanakumari.uihouse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TryFragment extends Fragment {


    public TryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_try, container, false);
    }


}
