package com.sematec.sematecandroidbasictir98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    List<String> myList;

    public RecyclerAdapter(List<String> list) {

        myList = list;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_recycler_item, parent, false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        String name = myList.get(position);
        holder.txtName.setText(name);


    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
