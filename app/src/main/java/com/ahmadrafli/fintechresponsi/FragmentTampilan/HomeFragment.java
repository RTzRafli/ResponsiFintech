package com.ahmadrafli.fintechresponsi.FragmentTampilan;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmadrafli.fintechresponsi.R;
import com.ahmadrafli.fintechresponsi.HalamanUtamaTampilan.GridMarginDecoration;
import com.ahmadrafli.fintechresponsi.HalamanUtamaTampilan.Home;
import com.ahmadrafli.fintechresponsi.HalamanUtamaTampilan.HomeListAdapter;

import java.util.ArrayList;
import java.util.List;


import android.content.Context;

import android.widget.Toast;


/**
 * Created by wim on 4/14/16.
 */
public class HomeFragment extends Fragment implements HomeListAdapter.OnGridItemSelectedListener{

    private RecyclerView lvSingle;
    private GridLayoutManager gridLayoutManager;
    private HomeListAdapter homeListAdapter;
    private Context context;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        lvSingle = (RecyclerView) rootView.findViewById(R.id.rv_data);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        homeListAdapter = new HomeListAdapter(this);
        // grid 2 kolom
        gridLayoutManager = new GridLayoutManager(context, 2);
        lvSingle.setLayoutManager(gridLayoutManager);

        // set margin 2 dp
        lvSingle.addItemDecoration(new GridMarginDecoration(context, 2, 2, 2, 2));
        lvSingle.setAdapter(homeListAdapter);
        loadData();
    }

    private void loadData(){
        List<Home> singleList = new ArrayList<>();
        Home single;
        int img[] = {R.drawable.aa, R.drawable.ab,
                R.drawable.ac, R.drawable.ad,
                R.drawable.ae, R.drawable.af,
                R.drawable.ag, R.drawable.ah, R.drawable.ai, R.drawable.aj};
        String title[] = {"Judul 1", "Judul 2",
                "Judul 3", "Judul 4",
                "Judul 5", "Judul 6",
                "Judul 7", "Judul 8", "Judul 9", "Judul 10"};
        String pengarang[] = {"dawen", "ijoo",
                "mukinem", "reloo",
                "Baini", "Soeharto",
                "Rehan", "nengro", "Wulan", "Jilo"};
        for (int i = 0; i < img.length; i++){
            single = new Home();
            single.setImg(img[i]);
            single.setTitle(title[i]);
            single.setPengarang(pengarang[i]);
            singleList.add(single);
        }
        homeListAdapter.addAll(singleList);
    }

    @Override
    public void onGridItemClick(View v, int position) {
        Toast.makeText(context, homeListAdapter.getItem(position).getTitle(), Toast.LENGTH_SHORT).show();
    }

}