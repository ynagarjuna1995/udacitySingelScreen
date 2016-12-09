package com.startupmatters.nagarjuna.singlepageapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;


public class RecyclerAdapter extends RecyclerView.Adapter<FacilitiesViewHolder> {

    private int[] facIcons = {R.drawable.television,R.drawable.cctv,R.drawable.cleaning_service,
            R.drawable.elevator,R.drawable.bathtub, R.drawable.beds,R.drawable.laptop,R.drawable.location,
    R.drawable.meal,R.drawable.no_smoking,R.drawable.no_alcohol};

    private Context mContext;
    private String[] facIconsText;

    public RecyclerAdapter(Context mContext) {
        this.mContext = mContext;
        facIconsText = mContext.getResources().getStringArray(R.array.FIconsDisc);
    }


    @Override
    public FacilitiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.facilities_icons,parent,false);
        FacilitiesViewHolder holder = new FacilitiesViewHolder(mView);
        return holder;

    }

    @Override
    public void onBindViewHolder(FacilitiesViewHolder holder, int position) {
        holder.facImageview.setImageResource(facIcons[position]);
        holder.facTextView.setText(facIconsText[position]);
    }

    @Override
    public int getItemCount() {
        return facIcons.length;
    }
}
