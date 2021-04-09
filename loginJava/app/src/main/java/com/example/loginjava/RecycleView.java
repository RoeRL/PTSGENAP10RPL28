package com.example.loginjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    TextView textViewRecycle;
    RecyclerView recyclerView;
    RecyclerView adapterRecyclerView;
    ArrayList<googleAdapter>googleAdapterView;
    private RecycleFill adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);


        addAdapter();

        adapter = new RecycleFill(googleAdapterView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleView.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addAdapter(){
        googleAdapterView = new ArrayList<>();
        googleAdapterView.add(new googleAdapter("Google Image", "https://images.google.com/imghp?hl=en&gl=ar&gws_rd=ssl"));
        googleAdapterView.add(new googleAdapter("Google Maps", "https://www.google.com/maps/@-6.7439227,110.8433709,15z"));
        googleAdapterView.add(new googleAdapter("Google Video", "https://www.google.com/videohp"));
    }
}