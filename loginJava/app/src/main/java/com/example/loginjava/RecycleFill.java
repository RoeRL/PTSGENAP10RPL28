package com.example.loginjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleFill extends RecyclerView.Adapter<RecycleFill.googleViewHolder> {

    private ArrayList<googleAdapter> dataList;

    public RecycleFill(ArrayList<googleAdapter> dataList) {
        this.dataList = dataList;
    }

    @Override
    public googleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_recycle_fill, parent, false);
        return new googleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(googleViewHolder holder, int position) {
        holder.textGoogle.setText(dataList.get(position).getgoogleName());
        holder.textLink.setText(dataList.get(position).getlink());
    }


    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class googleViewHolder extends RecyclerView.ViewHolder{
        private TextView textGoogle, textLink;

        public googleViewHolder(View itemView) {
            super(itemView);
            textGoogle = (TextView) itemView.findViewById(R.id.googleName);
            textLink = (TextView) itemView.findViewById(R.id.link);
        }

    }
}