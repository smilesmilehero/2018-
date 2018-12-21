package com.example.jordy.tarot;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;

public class MainActivity1 extends AppCompatActivity {



    EditText name;
    EditText CCCC;
    EditText MM;
    EditText DD;
    Integer name2, CCCCss, MMss, DDss,se=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
<<<<<<< HEAD
                    case R.id.radioButton4:
                        se=1;
                        break;
                    case R.id.radioButton5:
                        se=2;
                        break;
                    case R.id.radioButton6:
=======
                    case R.id.radioButton:
                        se=1;
                        break;
                    case R.id.radioButton2:
                        se=2;
                        break;
                    case R.id.radioButton3:
>>>>>>> changed1
                        se=3;
                        break;

                }
            }
        });

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
                MMs.isEmpty()||MMs.equals(".")||DDs.isEmpty()||DDs.equals(".")||se==0)
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
                int sumb;
                sumb = (int)(Math.random()* 87);
                suma = CCCCss + MMss + DDss + sumb;
                //  Random x = new Random();
                //   sumb = x.nextInt(78);

                sum= (suma*se) % 155 + 1;

                Bundle bundle=new Bundle();
                bundle.putInt("SUM",sum);
                it.putExtras(bundle);
                startActivityForResult(it, 100);
            }
        }

    }
}
