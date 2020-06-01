package com.example.aboutmeapplication.ui.aboutme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmeapplication.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class AboutMeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_aboutme, container, false);
    }
}