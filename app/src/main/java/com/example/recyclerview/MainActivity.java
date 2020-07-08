package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FakeDatabase dataBase = new FakeDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();
        configureRecyclerView();
    }

    private void bindUI() {
        recyclerView = findViewById(R.id.recyclerview_people);
    }

    private void configureRecyclerView() {
        // use a linear layout manager
        LinearLayoutManager linearLayout = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayout);

        // specifying an adapter
        PeopleRecyclerViewAdapter myAdapter = new PeopleRecyclerViewAdapter();
        recyclerView.setAdapter(myAdapter);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        myAdapter.submitList(dataBase.getPeopleList());
    }

}