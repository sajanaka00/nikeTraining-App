package com.example.niketraining.tabLayouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.niketraining.R;
import com.example.niketraining.listAdapters.ListAdapterCollections;
import com.example.niketraining.listData.ListData_1imgView_2textViews;

public class Collections extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;

    private ListAdapterCollections adapter;
    private ListAdapterCollections adapter2;

    private View view;

    //recyclerView 1
    ListData_1imgView_2textViews[] listData3 = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Best of Abs, Arms and Glutes", "12 Workouts, All levels", R.drawable.collection_1),
            new ListData_1imgView_2textViews("Get Leaner Strong Abs", "8 Workouts, All levels", R.drawable.collection_2),
            new ListData_1imgView_2textViews("Get Strong to Get Toned", "6 Workouts, All levels", R.drawable.collection_3),
    };

    //recyclerView 2
    ListData_1imgView_2textViews[] listData3_2 = new ListData_1imgView_2textViews[] {
            new ListData_1imgView_2textViews("Boost Your Mood", "12 Workouts, All levels", R.drawable.collection_4),
            new ListData_1imgView_2textViews("For the whole family", "16 Workouts, All levels", R.drawable.collection_5),
            new ListData_1imgView_2textViews("Big Workouts for Small Spaces", "12 Workouts, All levels", R.drawable.collection_6),
    };

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_collections, container, false);

        //recyclerView 1
        recyclerView = view.findViewById(R.id.recyclerViewC);
        adapter = new ListAdapterCollections(listData3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        //recyclerView 2
        recyclerView2 = view.findViewById(R.id.recyclerViewC_2);
        adapter2 = new ListAdapterCollections(listData3_2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter2);

        return view;
    }
}