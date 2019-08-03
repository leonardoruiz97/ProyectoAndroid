package edu.cibertec.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.cibertec.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VendedoresFragment extends Fragment {


    public VendedoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vendedores, container, false);
    }

}
