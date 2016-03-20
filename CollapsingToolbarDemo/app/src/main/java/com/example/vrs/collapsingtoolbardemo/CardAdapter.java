package com.example.vrs.collapsingtoolbardemo;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;



public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private Context mContext;
    List<Flower> list = new ArrayList<>();


    public CardAdapter(Context mContext, List<Flower> list) {
        this.mContext = mContext;
        this.list = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {



    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public Flower getItem(int i) {
        return list.get(i);
    }





    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView cardimage;
        TextView cardtitle;
        Flower Flower;

        public ViewHolder(View itemView) {
            super(itemView);

            cardimage = (TextView) itemView.findViewById(R.id.textView);
            cardtitle = (TextView) itemView.findViewById(R.id.textView1);
        }
    }


}

