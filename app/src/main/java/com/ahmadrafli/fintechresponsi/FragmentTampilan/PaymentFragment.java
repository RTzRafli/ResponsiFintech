package com.ahmadrafli.fintechresponsi.FragmentTampilan;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.ahmadrafli.fintechresponsi.R;


public class PaymentFragment extends Fragment implements OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_payment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        Button InputKode = (Button) getActivity().findViewById(
                R.id.input_kode);
        InputKode.setOnClickListener((OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), com.ahmadrafli.fintechresponsi.MenuTampilan.InputKodeActivity.class);
        startActivity(intent);
    }



}


