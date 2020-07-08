package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PeopleRecyclerViewAdapter extends RecyclerView.Adapter<PeopleItemHolder> {

    private List<PeopleItem> peopleItemList;

    public PeopleRecyclerViewAdapter() {
        peopleItemList = new ArrayList<>();
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
        holder.bindItem(peopleItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return peopleItemList.size();
    }

    public void submitList(List<PeopleItem> list) {
        peopleItemList = list;
        notifyDataSetChanged();
    }

}
