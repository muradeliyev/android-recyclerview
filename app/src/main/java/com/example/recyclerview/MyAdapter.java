package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<PeopleItemHolder> {
    private List<PeopleItem> peopleItemList;
    private Activity applicationContext;
    public MyAdapter(Activity context) {
        this.applicationContext = context;
    }
    public void submitList(List<PeopleItem> list) {
        peopleItemList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public PeopleItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.item_people, parent, false);
        return new PeopleItemHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleItemHolder holder, int position) {
        holder.bindItem(peopleItemList.get(position), this.applicationContext);
    }

    @Override
    public int getItemCount() {
        return peopleItemList.size();
    }
}
