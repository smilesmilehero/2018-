package com.example.jordy.tarot;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity1 extends AppCompatActivity {



    EditText name;
    EditText CCCC;
    EditText MM;
    EditText DD;
    Integer name2, CCCCss, MMss, DDss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        name=(EditText) findViewById(R.id.name);
        CCCC=(EditText) findViewById(R.id.CCCC);
        MM=(EditText) findViewById(R.id.MM);
        DD=(EditText) findViewById(R.id.DD);

        MediaPlayer mp=MediaPlayer.create(this,R.raw.luvletter);
        mp.start();

    }


    public void got(View v){
        String names=name.getText().toString();
        String CCCCs=CCCC.getText().toString();
        String MMs=MM.getText().toString();
        String DDs=DD.getText().toString();



       if (names.isEmpty()||names.equals(".")||CCCCs.isEmpty()||CCCCs.equals(".")||
               MMs.isEmpty()||MMs.equals(".")||DDs.isEmpty()||DDs.equals("."))
        {
            Toast.makeText(this,"請確認是否值皆有填",Toast.LENGTH_SHORT).show();
        }

        /*else {
           try {
               name2 = Integer.parseInt(names);
               CCCCss = Integer.parseInt(CCCCs);
               MMss = Integer.parseInt(MMs);
               DDss = Integer.parseInt(DDs);
           }catch (Exception e){
               Toast.makeText(this, "有錯誤", Toast.LENGTH_SHORT).show();
           }*/
        else {
                //name2 = Integer.parseInt(names);
                CCCCss = Integer.parseInt(CCCCs);
                MMss = Integer.parseInt(MMs);
                DDss = Integer.parseInt(DDs);
                if ((MMss>12) || (1>MMss)||(1>DDss)||(DDss>31)||((MMss==2)&&(DDss>29))) {
                    Toast.makeText(this, "輸入值有錯誤", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent it = new Intent(this, MainActivity2.class);
                    int sum;
                    int suma;
                   // int sumb;
                   // int rb;
                   // rb = (int)(Math.random())*154;
                    //rc =(int)(Math.random())*77;
                   // suma = (CCCCss*rb) * (MMss * DDss);
                    Random x = new Random();
                    sum = x.nextInt(155)+1;


                   // sum= suma % 155  ;


                        Bundle bundle = new Bundle();
                        bundle.putInt("SUM", sum);
                        it.putExtras(bundle);
                        startActivityForResult(it, 100);

                }
           }

    }
}
