package com.example.jordy.tarot;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class MainActivity2 extends AppCompatActivity {

    MediaPlayer mPlayer;

    private TextView mTextView;
    private Button mButton;

    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = (TextView) findViewById(R.id.textView1);
        mButton = (Button) findViewById(R.id.button1);

        Intent it=getIntent();
        Bundle bundle=it.getExtras();
        sum=bundle.getInt("SUM");

         new CountDownTimer(10000, 1000) {

            @Override
            public void onFinish() {
                mTextView.setText("結果出來囉~");
                mButton.setVisibility(View.VISIBLE);
            }

            @Override
            public void onTick(long millisUntilFinished) {
                mTextView.setText("解牌中，請稍後..." + millisUntilFinished / 1000);
            }


        }.start();
    }


    public void get (View v){
        Intent it = new Intent(this, MainActivity3.class);

        Bundle bundle=new Bundle();
        bundle.putInt("SUM",sum);
        it.putExtras(bundle);

        startActivityForResult(it, 100);
        finish();
    }

}
