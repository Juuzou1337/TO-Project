package com.example.user.to.fragment_tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.to.R;

public class ApplicationFragment extends Fragment {

    private static final int LAYOUT = R.layout.application;
    private View view;

    public static ApplicationFragment getInstance(){
        Bundle args = new Bundle();
        ApplicationFragment applicationFragment = new ApplicationFragment();
        applicationFragment.setArguments(args);
        return  applicationFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
