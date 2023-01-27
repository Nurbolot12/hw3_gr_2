package com.example.iman_tulenaliev_hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AccessoriesAdapter adapter;
    private ArrayList<Accessories> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recycler_view_accessories);

    }

    private void fillList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Accessories("Razer Barracuda X", "Price: 99.99$", R.drawable.razer_barracuda_x));
        arrayList.add(new Accessories("Razer Kiyo Pro Ultra", "Price: 299.99$", R.drawable.kiyo_pro_ultra));
        arrayList.add(new Accessories("Razer Seiren v2 Pro", "Price: 149.99$", R.drawable.seiren_v2_pro));
        arrayList.add(new Accessories("SteelSeries ARCTIS 7X", "Price: 149.99$", R.drawable.a7x));
        arrayList.add(new Accessories("SteelSeries NIMBUS+", "Price: 59.99$", R.drawable.nimbus__plus));
    }

    private void setAdapter() {
        adapter = new AccessoriesAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }

}