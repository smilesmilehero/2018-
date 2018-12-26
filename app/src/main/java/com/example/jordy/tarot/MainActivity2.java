package com.example.jordy.tarot;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {


    private TextView mTextView;
    private Button mButton;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = (TextView) findViewById(R.id.textView1);
        mButton = (Button) findViewById(R.id.button1);

        Intent it=getIntent();                                                                       //將前一bundle值讀取出來
        Bundle bundle=it.getExtras();
        sum=bundle.getInt("SUM");

         new CountDownTimer(10000, 1000) {                         //進入倒數畫面

            @Override                                                                                //倒數完成時
            public void onFinish() {
                mTextView.setText("結果出來囉~");
                mButton.setVisibility(View.VISIBLE);                                                 //顯示按鈕
            }

            @Override
            public void onTick(long millisUntilFinished) {                                           //倒數尚未結束
                mTextView.setText("解牌中，請稍後..." + millisUntilFinished / 1000);
            }


        }.start();
    }


    public void get (View v){
        Intent it = new Intent(this, MainActivity3.class);                          //將結果傳至下個主畫面

        Bundle bundle=new Bundle();                                                                  //將值打包
        bundle.putInt("SUM",sum);
        it.putExtras(bundle);

        startActivityForResult(it, 100);                                               //進入下個主畫面
        finish();                                                                                    //結束此頁面
    }

}
