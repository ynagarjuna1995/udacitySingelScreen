package com.startupmatters.nagarjuna.singlepageapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BAAdapter extends PagerAdapter {

    private Context mContext;
    private int[] BAImages = {R.drawable.psr1,R.drawable.psr2,R.drawable.psr3, R.drawable.psr4, R.drawable.psr5, R.drawable.psr6, R.drawable.psr7, R.drawable.psr8};
    private String[] BAImageDisc;
    private LayoutInflater mLayoutInflater;

    public BAAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        BAImageDisc = mContext.getResources().getStringArray(R.array.BAImage_Disc);
    }


    @Override
    public int getCount() {
        return BAImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View secOneView = mLayoutInflater.inflate(R.layout.business_assets,container,false);

        ImageView BAImage = (ImageView) secOneView.findViewById(R.id.BAImages);
        BAImage.setImageResource(BAImages[position]);

        TextView BADisc = (TextView) secOneView.findViewById(R.id.BAText);
        BADisc.setText(BAImageDisc[position]);

        container.addView(secOneView);

        return secOneView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
