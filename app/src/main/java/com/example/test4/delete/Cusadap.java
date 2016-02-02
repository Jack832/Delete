package com.example.test4.delete;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by bridgelabz4 on 5/1/16.
 */
public class Cusadap extends PagerAdapter {
    private int [] image={R.drawable.ip1,R.drawable.ic_heart_0,R.drawable.warner};
    private Context context;
    private LayoutInflater layoutInflater;
    public  Cusadap(Context ctx){
        this.context=ctx;

    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.swip,container,false);
        ImageView img=(ImageView)view.findViewById(R.id.ima);
        TextView txt=(TextView)view.findViewById(R.id.imagecount);
        img.setImageResource(image[position]);
        txt.setText(+position + "image");
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    container.removeView((LinearLayout)object);

    }
}
