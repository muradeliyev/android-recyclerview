package com.example.recyclerview;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleItemHolder extends RecyclerView.ViewHolder {
    private TextView order_num, name, points, level;

    public PeopleItemHolder(@NonNull View itemView) {
        super(itemView);
        order_num = itemView.findViewById(R.id.order_number);
        name = itemView.findViewById(R.id.name);
        points = itemView.findViewById(R.id.points);
        level = itemView.findViewById(R.id.level);
    }

    public void bindItem(PeopleItem peopleItem, Activity context) {
        order_num.setText(peopleItem.getNum());
        name.setText(peopleItem.getName());
        points.setText(context.getString(R.string.pts_text, peopleItem.getPoints()));
        level.setText(context.getString(R.string.level_text, peopleItem.getLevel()));
    }
}
