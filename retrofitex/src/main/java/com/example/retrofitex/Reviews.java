package com.example.retrofitex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Priyanka on 07-09-2016.
 */
public class Reviews extends ArrayAdapter {
    Context c;
    List<Photo_model.ResultBean.ReviewsBean> datalist;
    public Reviews(Context c,List<Photo_model.ResultBean.ReviewsBean> datalist){
        super(c,R.layout.reviews);
        this.c=c;
        this.datalist=datalist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.reviews, parent, false);
        // mageView image= (ImageView) itemView.findViewById(R.id.pto);
        TextView name,date,review;
        name= (TextView) itemView.findViewById(R.id.review_name);
        date= (TextView) itemView.findViewById(R.id.review_date);
        review= (TextView) itemView.findViewById(R.id.review_desc);
        name.setText(datalist.get(position).getAuthorName());
        review.setText(datalist.get(position).getText());
        return itemView;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }
}
