package com.example.aboutmeapplication.ui.plans;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmeapplication.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class PlansFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_plans, container, false);
    }
}