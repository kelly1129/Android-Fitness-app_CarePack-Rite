package com.pooja.carepack.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pooja.carepack.R;

/**
 * Created by Vinay Rathod on 24/11/15.
 */
public class DashboardFragment extends BaseFragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frg_dashboard, container, false);
        return view;
    }
}
