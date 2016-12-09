package com.startupmatters.nagarjuna.singlepageapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class FacilitiesViewHolder extends RecyclerView.ViewHolder {

    ImageView facImageview;
    TextView facTextView;

    public FacilitiesViewHolder(View itemView) {
        super(itemView);

        facImageview = (ImageView) itemView.findViewById(R.id.facilities_icon);
        facTextView = (TextView) itemView.findViewById(R.id.ficon_text);
    }
}
