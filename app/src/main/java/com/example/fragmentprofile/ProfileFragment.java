package com.example.fragmentprofile; // Sesuaikan dengan package proyek

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Menghubungkan class ini dengan layout fragment_profile
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}