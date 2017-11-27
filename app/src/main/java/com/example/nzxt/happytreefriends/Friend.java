package com.example.nzxt.happytreefriends;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Friend extends AppCompatActivity {
    String nama_friend[] = { "cuddles","giggles","lumpy","nutty","toothy","bear","cro","cub","flaky","flippy",
    "handy","lammy","lifty","lumpy","mime","mole","monkey","pickles","pop","russell","shifty","sniffles","splendid"};

    int gambar_friend[] = { R.drawable.cuddles,R.drawable.giggles,R.drawable.lumpy,R.drawable.nutty,R.drawable.toothy,
    R.drawable.bear,R.drawable.cro,R.drawable.cub,R.drawable.flaky,R.drawable.flippy,R.drawable.handy,R.drawable.lammy,
    R.drawable.lifty,R.drawable.lumpy,R.drawable.mime,R.drawable.mole,R.drawable.monkey,
    R.drawable.pickels,R.drawable.pop,R.drawable.russell,R.drawable.shifty,R.drawable.sniffles,R.drawable.splendid};

    int detail_friend[] = {R.string.cuddles,R.string.giggles,R.string.lumpy,R.string.nuty,R.string.toothy,
            R.string.bear,R.string.cro,R.string.cub,R.string.flaky,R.string.flippy,R.string.handy,R.string.lammy,
            R.string.lifty,R.string.lumpy,R.string.mime,R.string.mole,R.string.monkey,
            R.string.pickles,R.string.pop,R.string.russell,R.string.shifty,R.string.sniffles,R.string.splendid};


        ListView listfriend;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list_friend);
            listfriend = (ListView) findViewById((R.id.listfriend));

            Adapter_Friend Adapter_Friend = new Adapter_Friend(Friend.this,nama_friend,gambar_friend);
            listfriend.setAdapter(Adapter_Friend);
            listfriend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intenkirim = new Intent(Friend.this , DetailFriend.class);
                    intenkirim.putExtra("nF",nama_friend[position]);
                    intenkirim.putExtra("gF",gambar_friend[position]);
                    intenkirim.putExtra("dF",detail_friend[position]);
                    //intenkirim.putExtra("sF",suara_friend[position]);
                    startActivity(intenkirim);
                }

            });
    }

        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {


            switch (keyCode){

                case KeyEvent.KEYCODE_BACK :

                    AlertDialog.Builder builder = new AlertDialog.Builder(Friend.this);
                    builder.setTitle("Informasi");
                    builder.setMessage("Apakah teman ingin keluar ?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });

                    builder.show();

            }

            return super.onKeyDown(keyCode, event);
        }

        @Override
        public void onBackPressed() {

            AlertDialog.Builder builder = new AlertDialog.Builder(Friend.this);
            builder.setTitle("Informasi");
            builder.setMessage("Apakah teman ingin keluar ?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            builder.show();

            super.onBackPressed();

        }
}
