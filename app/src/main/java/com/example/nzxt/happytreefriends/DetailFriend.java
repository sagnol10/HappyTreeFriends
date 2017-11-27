package com.example.nzxt.happytreefriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFriend extends AppCompatActivity {
    ImageView imgfriend;
    TextView txtfriend,txtdetailfriend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_friend);
        imgfriend = (ImageView) findViewById(R.id.imgdetailfriend);
        txtfriend = (TextView) findViewById(R.id.txtfriend1);
        txtdetailfriend = (TextView) findViewById(R.id.txtdetailfriend);

        Intent terimafriend = getIntent();

        imgfriend.setImageResource(terimafriend.getIntExtra("gF",0));
        txtfriend.setText(terimafriend.getStringExtra("nF"));
        txtdetailfriend.setText(terimafriend.getIntExtra("dF",0));
    }
}
