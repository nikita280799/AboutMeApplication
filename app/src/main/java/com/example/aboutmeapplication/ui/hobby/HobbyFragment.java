package com.example.aboutmeapplication.ui.hobby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmeapplication.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class HobbyFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hobby, container, false);
    }
}