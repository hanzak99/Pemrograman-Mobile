package com.hanzpro.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_profile,null);
        TextView profil = root.findViewById(R.id.tvProfile);
        TextView nama = root.findViewById(R.id.tvName);
        TextView alamat = root.findViewById(R.id.tvAddress);
        TextView hobi = root.findViewById(R.id.tvHobby);
        TextView quote = root.findViewById(R.id.tvQuote);
        profil.setText(R.string.profile);
        nama.setText(R.string.name);
        alamat.setText(R.string.address);
        hobi.setText(R.string.hobby);
        quote.setText(R.string.quote);
        return root;

    }

}
