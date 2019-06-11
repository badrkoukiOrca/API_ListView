package com.example.webservicemvvm.utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.example.webservicemvvm.R;
import com.example.webservicemvvm.model.User;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<String> {
    Activity  context ;

    private String[] subtitle = null;
    private String[] imgid = null ;
    private String[] title = null ;
    public ListViewAdapter(Activity context, List<Object> list) {
        super(context, R.layout.list_item, ExtractUsers.getNames(list));
        this.title = ExtractUsers.getNames(list) ;
        this.subtitle=ExtractUsers.getDescription(list);
        this.imgid=ExtractUsers.getPics(list);
        this.context=context;
    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(title[position]);
        // Create glide request manager
        RequestManager requestManager = Glide.with(context);
        // Create request builder and load image.
        RequestBuilder requestBuilder = requestManager.load(imgid[position]);
        // Show image into target imageview.
        requestBuilder.into(imageView);
        subtitleText.setText(subtitle[position]);
        return rowView;
    }


}
