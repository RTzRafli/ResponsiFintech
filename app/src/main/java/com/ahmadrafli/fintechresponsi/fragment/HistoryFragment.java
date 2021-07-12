package com.arhakim.fintechresponsi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arhakim.fintechresponsi.R;
import com.arhakim.fintechresponsi.historyrecyclerview.Distro;
import com.arhakim.fintechresponsi.historyrecyclerview.DistroAdapter;
import com.arhakim.fintechresponsi.historyrecyclerview.DistroData;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {

    // Add RecyclerView member
    private RecyclerView recyclerView;

//    Code untuk menampilkan recyclerview di fragment dengan LiniearLayout

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.rv_data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        ArrayList<Distro> distros = new ArrayList<>();
        distros.addAll(DistroData.getDatas());
        DistroAdapter distroAdapter = new DistroAdapter(distros);
        recyclerView.setAdapter(distroAdapter);
        return view;
    }

}