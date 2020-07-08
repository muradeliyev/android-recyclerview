package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleItemHolder extends RecyclerView.ViewHolder {

    private TextView order_num, name, points, level;

    public PeopleItemHolder(@NonNull View itemView) {
        super(itemView);
        order_num = itemView.findViewById(R.id.text_view_order_number);
        name = itemView.findViewById(R.id.text_view_name);
        points = itemView.findViewById(R.id.text_view_points);
        level = itemView.findViewById(R.id.text_view_level);
    }

    public void bindItem(PeopleItem peopleItem) {
        order_num.setText(String.valueOf(peopleItem.getNum())); //parse int to String
        points.setText(String.valueOf(peopleItem.getPoints()));
        level.setText(String.valueOf(peopleItem.getLevel()));
        name.setText(peopleItem.getName());
    }

}
