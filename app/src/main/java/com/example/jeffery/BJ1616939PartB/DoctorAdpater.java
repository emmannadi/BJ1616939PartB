package com.example.jeffery.BJ1616939PartB;

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
 * Created by JEFFERY on 5/10/2016.
 */
public class DoctorAdpater extends ArrayAdapter {
    List list = new ArrayList();
    public DoctorAdpater(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler
    {
        ImageView image;
        TextView title;
        TextView rating;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.image = (ImageView) row.findViewById(R.id.doctor_image);
            handler.title = (TextView) row.findViewById(R.id.doctor_title);
            handler.rating = (TextView) row.findViewById(R.id.doctor_rating);
            row.setTag(handler);
        }
        else {
            handler = (DataHandler)row.getTag();
        }
        DoctorDataProvider dataProvider;
        dataProvider = (DoctorDataProvider) this.getItem(position);
        handler.image.setImageResource(dataProvider.getDoctor_image_resource());
        handler.title.setText(dataProvider.getDoctor_title());
        handler.rating.setText(dataProvider.getDoctor_rating());

        return row;
    }
}
