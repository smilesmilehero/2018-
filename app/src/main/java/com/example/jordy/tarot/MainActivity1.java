package com.example.jordy.tarot;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {



    EditText name;                                                                                   //設定各必須變數
    EditText CCCC;
    EditText MM;
    EditText DD;
    Integer name2, CCCCss, MMss, DDss,se=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {                                       //group選項，偵測使用者所選擇的問題，給與相對值
                switch (checkedId)
                {
                    case R.id.radioButton:
                        se=1;
                        break;
                    case R.id.radioButton2:
                        se=2;
                        break;
                    case R.id.radioButton3:
                        se=3;
                        break;
                    case R.id.radioButton4:
                        se=4;
                        break;

                }
            }
        });

        name=(EditText) findViewById(R.id.name);                                                     //讀取使用者輸入值
        CCCC=(EditText) findViewById(R.id.CCCC);
        MM=(EditText) findViewById(R.id.MM);
        DD=(EditText) findViewById(R.id.DD);

        MediaPlayer mp=MediaPlayer.create(this,R.raw.luvletter);                                //音樂播放
        mp.start();

    }


    public void got(View v){
        String names=name.getText().toString();                                                      //將值轉換為字串
        String CCCCs=CCCC.getText().toString();
        String MMs=MM.getText().toString();
        String DDs=DD.getText().toString();



        if (names.isEmpty()||names.equals(".")||CCCCs.isEmpty()||CCCCs.equals(".")||                 //判斷是否有位輸入的空格
                MMs.isEmpty()||MMs.equals(".")||DDs.isEmpty()||DDs.equals(".")||se==0)
        {
            Toast.makeText(this,"請確認是否值皆有填",Toast.LENGTH_SHORT).show();    //toast彈出提示訊息
        }

        else {                                                          //將字串轉為數字
            CCCCss = Integer.parseInt(CCCCs);
            MMss = Integer.parseInt(MMs);
            DDss = Integer.parseInt(DDs);
            if ((MMss>12) || (1>MMss)||(1>DDss)||(DDss>31)||((MMss==2)&&(DDss>29))) {                //判斷月份日期輸入是否正確
                Toast.makeText(this, "輸入值有錯誤", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent it = new Intent(this, MainActivity2.class);                  //將資料傳至第2介面
                int sum;
                int suma;
                int sumb;
                sumb = (int)(Math.random()* 87);
                suma = CCCCss + MMss + DDss + sumb;                                                  //產生一個亂數資料

                sum= (suma*se) % 155 + 1;

                Bundle bundle=new Bundle();                                                          //建立bundle來打包東西
                bundle.putInt("SUM",sum);
                it.putExtras(bundle);
                startActivityForResult(it, 100);                                       //進入下個主畫面
            }
        }

    }
}