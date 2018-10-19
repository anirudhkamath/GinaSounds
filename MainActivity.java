package com.example.mahe.ginasounds;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m[]=new MediaPlayer[3];
    Button one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)this.findViewById(R.id.btn1);
        two = (Button)this.findViewById(R.id.btn2);
        three = (Button)this.findViewById(R.id.btn3);
        for(int i=0;i<3;i++){
            switch (i){
                case 0: m[0]=MediaPlayer.create(this,R.raw.wronganswer); break;
                case 1: m[1]=MediaPlayer.create(this,R.raw.ihy); break;
                case 2: m[2]=MediaPlayer.create(this,R.raw.lesstalkmoresolve); break;
            }
        }
        //final MediaPlayer m = MediaPlayer.create(this, R.raw.wronganswer);
    }

    public void firstClick(View v){
        OnClickListener myListener = new OnClickListener() {
            public void onClick(View v) {
                m[0].start();
            }
        };
        one.setOnClickListener(myListener);
    }

    public void secondClick(View v){
        OnClickListener myListener = new OnClickListener() {
            public void onClick(View v) {
                m[1].start();
            }
        };
        two.setOnClickListener(myListener);
    }

    public void thirdClick(View v){
        OnClickListener myListener = new OnClickListener() {
            public void onClick(View v) {
                m[2].start();
            }
        };
        three.setOnClickListener(myListener);
    }
}
