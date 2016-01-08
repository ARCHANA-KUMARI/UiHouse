package com.robosoft.archanakumari.uihouse.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robosoft.archanakumari.uihouse.R;
import com.robosoft.archanakumari.uihouse.adapter.RecylerViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {

    private Context mContext;
    private RecylerViewAdapter mRecyclerViewAdapter;
    private  RecyclerView mRecyclerview;
 private View mOneRow;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mContext = container.getContext();
         mOneRow = inflater.inflate(R.layout.fragment_recycler, container, false);
        Log.i("Helllo ", "Hi i am in onCreateView Created");
        mRecyclerview = (RecyclerView) mOneRow.findViewById(R.id.recyclerView);

       return mOneRow;


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Helllo ", "Hi i am in onActivity Created");
        mRecyclerViewAdapter = new RecylerViewAdapter(mContext);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(linearLayoutManager);
        mRecyclerview.setAdapter(mRecyclerViewAdapter);
    }
}



