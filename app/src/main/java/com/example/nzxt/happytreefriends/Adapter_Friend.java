package com.example.nzxt.happytreefriends;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter_Friend extends BaseAdapter {
    String namafriend[];
    int gambarfriend[];
    int detailfriend[];
    Activity activity;

    public Adapter_Friend(Friend Friend, String[] nama_friend, int[] gambar_friend)
    {
        activity = Friend;
        this.namafriend =nama_friend;
        gambarfriend=gambar_friend;
    }

    @Override
    public int getCount()
    {
        return namafriend.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)activity.getSystemService(activity.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.activity_costume_friend,parent,false);
        ImageView imgfriend = (ImageView)convertView.findViewById(R.id.imgfriend);
        TextView txtfriend = (TextView)convertView.findViewById(R.id.txtfriend);

        txtfriend.setText(namafriend[position]);
        imgfriend.setImageResource(gambarfriend[position]);

        return convertView;

    }
}