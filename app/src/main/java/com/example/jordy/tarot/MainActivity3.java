package com.example.jordy.tarot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity
{

    ImageView imv;
    ImageView imv2;
    TextView textres;
    private Button Button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imv=(ImageView)findViewById(R.id.imv);
        imv2=(ImageView)findViewById(R.id.imv2);
        textres=(TextView)findViewById(R.id.textres);
        Button3 = (Button) findViewById(R.id.button3);

        Intent it=getIntent();
        Bundle bundle=it.getExtras();
        int sum=bundle.getInt("SUM");
        switch(sum)
        {

            case 1:
                imv.setImageResource(R.drawable.tarot1);
                imv2.setImageResource(R.drawable.tarot1);
                textres.setText("現在的想法可以解決所有問題");
                break;
            case 2:
                imv.setImageResource(R.drawable.tarot2);
                imv2.setImageResource(R.drawable.tarot2);
                textres.setText("沉穩的腳步，思考能帶給你方向");
                break;
            case 3:
                imv.setImageResource(R.drawable.tarot3);
                imv2.setImageResource(R.drawable.tarot3);
                textres.setText("豐富充實的一天!");
                break;
            case 4:
                imv.setImageResource(R.drawable.tarot4);
                imv2.setImageResource(R.drawable.tarot4);
                textres.setText("嚴以律己，寬以待人");
                break;
            case 5:
                imv.setImageResource(R.drawable.tarot5);
                imv2.setImageResource(R.drawable.tarot5);
                textres.setText("受到長輩的照顧，或照顧年紀小的人");
                break;
            case 6:
                imv.setImageResource(R.drawable.tarot6);
                imv2.setImageResource(R.drawable.tarot6);
                textres.setText("交談甚歡，告白順利");
                break;
            case 7:
                imv.setImageResource(R.drawable.tarot7);
                imv2.setImageResource(R.drawable.tarot7);
                textres.setText("勇敢去做，必有收穫");
                break;
            case 8:
                imv.setImageResource(R.drawable.tarot8);
                imv2.setImageResource(R.drawable.tarot8);
                textres.setText("找隻寵物療癒自己，power up");
                break;
            case 9:
                imv.setImageResource(R.drawable.tarot9);
                imv2.setImageResource(R.drawable.tarot9);
                textres.setText("安靜的過完一天");
                break;
            case 10:
                imv.setImageResource(R.drawable.tarot10);
                imv2.setImageResource(R.drawable.tarot10);
                textres.setText("凡事將會愈來愈好");
                break;
            case 11:
                imv.setImageResource(R.drawable.tarot11);
                imv2.setImageResource(R.drawable.tarot11);
                textres.setText("以公正角度判斷每一件事");
                break;
            case 12:
                imv.setImageResource(R.drawable.tarot12);
                imv2.setImageResource(R.drawable.tarot12);
                textres.setText("停下腳步，慢慢觀察");
                break;
            case 13:
                imv.setImageResource(R.drawable.tarot666);
                imv2.setImageResource(R.drawable.tarot666);
                textres.setText("重獲新生，新的開始");
                break;
            case 14:
                imv.setImageResource(R.drawable.tarot14);
                imv2.setImageResource(R.drawable.tarot14);
                textres.setText("有說不完的話，多與人聊聊");
                break;
            case 15:
                imv.setImageResource(R.drawable.tarot15);
                imv2.setImageResource(R.drawable.tarot15);
                textres.setText("切勿衝動行事，有意外之財");
                break;
            case 16:
                imv.setImageResource(R.drawable.tarot16);
                imv2.setImageResource(R.drawable.tarot16);
                textres.setText("事出突然，聽天由命囉");
                break;
            case 17:
                imv.setImageResource(R.drawable.tarot17);
                imv2.setImageResource(R.drawable.tarot17);
                textres.setText("萬丈星空，充滿的無數希望");
                break;
            case 18:
                imv.setImageResource(R.drawable.tarot18);
                imv2.setImageResource(R.drawable.tarot18);
                textres.setText("讓人摸不清方向，請別迷失自我，慢慢等待");
                break;
            case 19:
                imv.setImageResource(R.drawable.tarot19);
                imv2.setImageResource(R.drawable.tarot19);
                textres.setText("高能量+高人氣，美好的一天");
                break;
            case 20:
                imv.setImageResource(R.drawable.tarot20);
                imv2.setImageResource(R.drawable.tarot20);
                textres.setText("接受命運的安排，會有好的結果");
                break;
            case 21:
                imv.setImageResource(R.drawable.tarot21);
                imv2.setImageResource(R.drawable.tarot21);
                textres.setText("萬事圓滿，進入另一環節");
                break;
            case 22:
                imv.setImageResource(R.drawable.tarot22);
                imv2.setImageResource(R.drawable.tarot22);
                textres.setText("事情開端，向前行");
                break;
            case 23:
                imv.setImageResource(R.drawable.tarot23);
                imv2.setImageResource(R.drawable.tarot23);
                textres.setText("對目標進行抉擇，好好思考");
                break;
            case 24:
                imv.setImageResource(R.drawable.tarot24);
                imv2.setImageResource(R.drawable.tarot24);
                textres.setText("完成部分進度，打起精神再向其他方向拓展");
                break;
            case 25:
                imv.setImageResource(R.drawable.tarot25);
                imv2.setImageResource(R.drawable.tarot25);
                textres.setText("穩固的關係，修成正果");
                break;
            case 26:
                imv.setImageResource(R.drawable.tarot26);
                imv2.setImageResource(R.drawable.tarot26);
                textres.setText("努力打拼");
                break;
            case 27:
                imv.setImageResource(R.drawable.tarot27);
                imv2.setImageResource(R.drawable.tarot27);
                textres.setText("勝利，高高在上");
                break;
            case 28:
                imv.setImageResource(R.drawable.tarot28);
                imv2.setImageResource(R.drawable.tarot28);
                textres.setText("處於優處，別被打下來了");
                break;
            case 29:
                imv.setImageResource(R.drawable.tarot29);
                imv2.setImageResource(R.drawable.tarot29);
                textres.setText("好消息就快到來!");
                break;
            case 30:
                imv.setImageResource(R.drawable.tarot30);
                imv2.setImageResource(R.drawable.tarot30);
                textres.setText("遍體麟傷，盡忠職守");
                break;
            case 31:
                imv.setImageResource(R.drawable.tarot31);
                imv2.setImageResource(R.drawable.tarot31);
                textres.setText("安分守己，行動緩慢，充滿個性的大好人");
                break;
            case 32:
                imv.setImageResource(R.drawable.tarot32);
                imv2.setImageResource(R.drawable.tarot32);
                textres.setText("充滿幹勁，照感覺走");
                break;
            case 33:
                imv.setImageResource(R.drawable.tarot33);
                imv2.setImageResource(R.drawable.tarot33);
                textres.setText("性動力，自己開創機會");
                break;
            case 34:
                imv.setImageResource(R.drawable.tarot34);
                imv2.setImageResource(R.drawable.tarot34);
                textres.setText("大方且樂於表達");
                break;
            case 35:
                imv.setImageResource(R.drawable.tarot35);
                imv2.setImageResource(R.drawable.tarot35);
                textres.setText("對人成熟勇敢行動");
                break;
            case 36:
                imv.setImageResource(R.drawable.tarot36);
                imv2.setImageResource(R.drawable.tarot36);
                textres.setText("充滿交流，無話不說");
                break;
            case 37:
                imv.setImageResource(R.drawable.tarot37);
                imv2.setImageResource(R.drawable.tarot37);
                textres.setText("與他人相談甚歡，可有好結果");
                break;
            case 38:
                imv.setImageResource(R.drawable.tarot38);
                imv2.setImageResource(R.drawable.tarot38);
                textres.setText("小聚會成功，計畫順利完成");
                break;
            case 39:
                imv.setImageResource(R.drawable.tarot39);
                imv2.setImageResource(R.drawable.tarot39);
                textres.setText("思考何謂自己所要");
                break;
            case 40:
                imv.setImageResource(R.drawable.tarot40);
                imv2.setImageResource(R.drawable.tarot40);
                textres.setText("面對悲傷，珍惜所擁有");
                break;
            case 41:
                imv.setImageResource(R.drawable.tarot41);
                imv2.setImageResource(R.drawable.tarot41);
                textres.setText("上對下的關係，無微不至的照顧");
                break;
            case 42:
                imv.setImageResource(R.drawable.tarot42);
                imv2.setImageResource(R.drawable.tarot42);
                textres.setText("滿滿的美夢，想全部擁有");
                break;
            case 43:
                imv.setImageResource(R.drawable.tarot43);
                imv2.setImageResource(R.drawable.tarot43);
                textres.setText("尋找心中缺失的遺憾");
                break;
            case 44:
                imv.setImageResource(R.drawable.tarot44);
                imv2.setImageResource(R.drawable.tarot44);
                textres.setText("事情告一段落，圓滿順利，沾沾自喜");
                break;
            case 45:
                imv.setImageResource(R.drawable.tarot45);
                imv2.setImageResource(R.drawable.tarot45);
                textres.setText("收穫滿滿，一切完美成功");
                break;
            case 46:
                imv.setImageResource(R.drawable.tarot46);
                imv2.setImageResource(R.drawable.tarot46);
                textres.setText("內向，有想法的好孩子");
                break;
            case 47:
                imv.setImageResource(R.drawable.tarot47);
                imv2.setImageResource(R.drawable.tarot47);
                textres.setText("謙虛且樂於交流的好角色");
                break;
            case 48:
                imv.setImageResource(R.drawable.tarot48);
                imv2.setImageResource(R.drawable.tarot48);
                textres.setText("心靈上的治療師");
                break;
            case 49:
                imv.setImageResource(R.drawable.tarot49);
                imv2.setImageResource(R.drawable.tarot49);
                textres.setText("負責任且內心頗有想法的");
                break;
            case 50:
                imv.setImageResource(R.drawable.tarot50);
                imv2.setImageResource(R.drawable.tarot50);
                textres.setText("知道怎麼做是最好的!");
                break;
            case 51:
                imv.setImageResource(R.drawable.tarot51);
                imv2.setImageResource(R.drawable.tarot51);
                textres.setText("打從心底的抗拒");
                break;
            case 52:
                imv.setImageResource(R.drawable.tarot52);
                imv2.setImageResource(R.drawable.tarot52);
                textres.setText("傷心總是難免的");
                break;
            case 53:
                imv.setImageResource(R.drawable.tarot53);
                imv2.setImageResource(R.drawable.tarot53);
                textres.setText("好好的休息一天吧");
                break;
            case 54:
                imv.setImageResource(R.drawable.tarot54);
                imv2.setImageResource(R.drawable.tarot54);
                textres.setText("爭鬥過後的勝利者，但別太囂張");
                break;
            case 55:
                imv.setImageResource(R.drawable.tarot55);
                imv2.setImageResource(R.drawable.tarot55);
                textres.setText("用些時間好好治癒自己的心吧");
                break;
            case 56:
                imv.setImageResource(R.drawable.tarot56);
                imv2.setImageResource(R.drawable.tarot56);
                textres.setText("或許偷雞摸狗也可以達成目標?有偏財");
                break;
            case 57:
                imv.setImageResource(R.drawable.tarot57);
                imv2.setImageResource(R.drawable.tarot57);
                textres.setText("不願行動，故步自封");
                break;
            case 58:
                imv.setImageResource(R.drawable.tarot58);
                imv2.setImageResource(R.drawable.tarot58);
                textres.setText("腦中無限煩惱，頭痛。");
                break;
            case 59:
                imv.setImageResource(R.drawable.tarot59);
                imv2.setImageResource(R.drawable.tarot59);
                textres.setText("坦然面對失敗，事情會更好。");
                break;
            case 60:
                imv.setImageResource(R.drawable.tarot60);
                imv2.setImageResource(R.drawable.tarot60);
                textres.setText("有果斷抉擇力，尚未成熟的角色");
                break;
            case 61:
                imv.setImageResource(R.drawable.tarot61);
                imv2.setImageResource(R.drawable.tarot61);
                textres.setText("死不放手，為何不讓自己輕鬆一點?");
                break;
            case 62:
                imv.setImageResource(R.drawable.tarot62);
                imv2.setImageResource(R.drawable.tarot62);
                textres.setText("勇敢的為自己殺出一條血路");
                break;
            case 63:
                imv.setImageResource(R.drawable.tarot63);
                imv2.setImageResource(R.drawable.tarot63);
                textres.setText("斬斷非自己所要，明白一切");
                break;
            case 64:
                imv.setImageResource(R.drawable.tarot64);
                imv2.setImageResource(R.drawable.tarot64);
                textres.setText("王者風範，帶人較為鋒利");
                break;
            case 65:
                imv.setImageResource(R.drawable.tarot65);
                imv2.setImageResource(R.drawable.tarot65);
                textres.setText("穩固的開始");
                break;
            case 66:
                imv.setImageResource(R.drawable.tarot66);
                imv2.setImageResource(R.drawable.tarot66);
                textres.setText("在兩事情間取得平衡");
                break;
            case 67:
                imv.setImageResource(R.drawable.tarot67);
                imv2.setImageResource(R.drawable.tarot67);
                textres.setText("請求專業人士之建議");
                break;
            case 68:
                imv.setImageResource(R.drawable.tarot68);
                imv2.setImageResource(R.drawable.tarot68);
                textres.setText("固執不願變通");
                break;
            case 69:
                imv.setImageResource(R.drawable.tarot69);
                imv2.setImageResource(R.drawable.tarot69);
                textres.setText("處於劣勢但不放棄求生意志");
                break;
            case 70:
                imv.setImageResource(R.drawable.tarot70);
                imv2.setImageResource(R.drawable.tarot70);
                textres.setText("大方樂於分享");
                break;
            case 71:
                imv.setImageResource(R.drawable.tarot71);
                imv2.setImageResource(R.drawable.tarot71);
                textres.setText("思考自己需要多少，而不是多就好");
                break;
            case 72:
                imv.setImageResource(R.drawable.tarot72);
                imv2.setImageResource(R.drawable.tarot72);
                textres.setText("精心雕刻，熱忠某事物");
                break;
            case 73:
                imv.setImageResource(R.drawable.tarot73);
                imv2.setImageResource(R.drawable.tarot73);
                textres.setText("高尚，聖潔，擁有財富");
                break;
            case 74:
                imv.setImageResource(R.drawable.tarot74);
                imv2.setImageResource(R.drawable.tarot74);
                textres.setText("豐衣足食，滿滿收穫");
                break;
            case 75:
                imv.setImageResource(R.drawable.tarot75);
                imv2.setImageResource(R.drawable.tarot75);
                textres.setText("乖乖的小孩子");
                break;
            case 76:
                imv.setImageResource(R.drawable.tarot76);
                imv2.setImageResource(R.drawable.tarot76);
                textres.setText("你說一句，我做一事");
                break;
            case 77:
                imv.setImageResource(R.drawable.tarot77);
                imv2.setImageResource(R.drawable.tarot77);
                textres.setText("珍惜擁有的一切。");
                break;
            case 78:
                imv.setImageResource(R.drawable.tarot78);
                imv2.setImageResource(R.drawable.tarot78);
                textres.setText("別用你的聰明才智，去幹些壞壞的事。");
                break;
            case 79:
                imv.setImageResource(R.drawable.tarot79);
                imv2.setImageResource(R.drawable.tarot79);
                textres.setText("多聽周遭友人建議，好嗎?");
                break;
            case 80:
                imv.setImageResource(R.drawable.tarot80);
                imv2.setImageResource(R.drawable.tarot80);
                textres.setText("就算沉不住氣，凡是也請三思，不要做會讓自己後悔的事");
                break;
            case 81:
                imv.setImageResource(R.drawable.tarot81);
                imv2.setImageResource(R.drawable.tarot81);
                textres.setText("身旁有爛桃花出現，特別注意");
                break;
            case 82:
                imv.setImageResource(R.drawable.tarot82);
                imv2.setImageResource(R.drawable.tarot82);
                textres.setText("你說的話將不會有人聽從");
                break;
            case 83:
                imv.setImageResource(R.drawable.tarot83);
                imv2.setImageResource(R.drawable.tarot83);
                textres.setText("你想當妙禪嗎?");
                break;
            case 84:
                imv.setImageResource(R.drawable.tarot84);
                imv2.setImageResource(R.drawable.tarot84);
                textres.setText("注意與友人戀人的溝通行為");
                break;
            case 85:
                imv.setImageResource(R.drawable.tarot85);
                imv2.setImageResource(R.drawable.tarot85);
                textres.setText("橫衝直撞請注意!");
                break;
            case 86:
                imv.setImageResource(R.drawable.tarot86);
                imv2.setImageResource(R.drawable.tarot86);
                textres.setText("濫用力量事會被反噬的");
                break;
            case 87:
                imv.setImageResource(R.drawable.tarot87);
                imv2.setImageResource(R.drawable.tarot87);
                textres.setText("一昧聽從別人不是件好事");
                break;
            case 88:
                imv.setImageResource(R.drawable.tarot88);
                imv2.setImageResource(R.drawable.tarot88);
                textres.setText("最近狀況不好，多注意安全");
                break;
            case 89:
                imv.setImageResource(R.drawable.tarot89);
                imv2.setImageResource(R.drawable.tarot89);
                textres.setText("不要與人起爭議，會吃虧");
                break;
            case 90:
                imv.setImageResource(R.drawable.tarot90);
                imv2.setImageResource(R.drawable.tarot90);
                textres.setText("坐而言不如起而行，欠缺觀察力");
                break;
            case 91:
                imv.setImageResource(R.drawable.tarot91);
                imv2.setImageResource(R.drawable.tarot91);
                textres.setText("不能接受現狀的改變");
                break;
            case 92:
                imv.setImageResource(R.drawable.tarot92);
                imv2.setImageResource(R.drawable.tarot92);
                textres.setText("容易與人溝通不良，造成誤解");
                break;
            case 93:
                imv.setImageResource(R.drawable.tarot93);
                imv2.setImageResource(R.drawable.tarot93);
                textres.setText("陷入金錢與慾望的漩渦。不要去憎恨他人");
                break;
            case 94:
                imv.setImageResource(R.drawable.tarot94);
                imv2.setImageResource(R.drawable.tarot94);
                textres.setText("接受失敗挫折的事實。");
                break;
            case 95:
                imv.setImageResource(R.drawable.tarot95);
                imv2.setImageResource(R.drawable.tarot95);
                textres.setText("雖然是滿滿星空，但卻即將消逝，珍惜相處時光");
                break;
            case 96:
                imv.setImageResource(R.drawable.tarot96);
                imv2.setImageResource(R.drawable.tarot96);
                textres.setText("迷惘的事情即將有結果");
                break;
            case 97:
                imv.setImageResource(R.drawable.tarot97);
                imv2.setImageResource(R.drawable.tarot97);
                textres.setText("有點熱過頭了，別人會被你熱跑");
                break;
            case 98:
                imv.setImageResource(R.drawable.tarot98);
                imv2.setImageResource(R.drawable.tarot98);
                textres.setText("須接受兩面結果的事情可能不如你預期");
                break;
            case 99:
                imv.setImageResource(R.drawable.tarot99);
                imv2.setImageResource(R.drawable.tarot99);
                textres.setText("一切或許不圓滿，但也快結束了，堅持住。");
                break;
            case 100:
                imv.setImageResource(R.drawable.tarot100);
                imv2.setImageResource(R.drawable.tarot100);
                textres.setText("別用力過頭了");
                break;
            case 101:
                imv.setImageResource(R.drawable.tarot101);
                imv2.setImageResource(R.drawable.tarot101);
                textres.setText("先把能顧好的就好");
                break;
            case 102:
                imv.setImageResource(R.drawable.tarot102);
                imv2.setImageResource(R.drawable.tarot102);
                textres.setText("在出發之前，請注意自己是否真的都已經準備好了");
                break;
            case 103:
                imv.setImageResource(R.drawable.tarot103);
                imv2.setImageResource(R.drawable.tarot103);
                textres.setText("不穩固的關係。");
                break;
            case 104:
                imv.setImageResource(R.drawable.tarot104);
                imv2.setImageResource(R.drawable.tarot104);
                textres.setText("競爭中的弱勢者。");
                break;
            case 105:
                imv.setImageResource(R.drawable.tarot105);
                imv2.setImageResource(R.drawable.tarot105);
                textres.setText("低調。成功一小步不要太臭屁");
                break;
            case 106:
                imv.setImageResource(R.drawable.tarot106);
                imv2.setImageResource(R.drawable.tarot106);
                textres.setText("忙到翻，被拆台");
                break;
            case 107:
                imv.setImageResource(R.drawable.tarot107);
                imv2.setImageResource(R.drawable.tarot107);
                textres.setText("事情較晚才能得知結果。");
                break;
            case 108:
                imv.setImageResource(R.drawable.tarot108);
                imv2.setImageResource(R.drawable.tarot108);
                textres.setText("再也撐不住現在的壓力");
                break;
            case 109:
                imv.setImageResource(R.drawable.tarot109);
                imv2.setImageResource(R.drawable.tarot109);
                textres.setText("不訪放下一些事務，讓自己走的輕鬆點會更好");
                break;
            case 110:
                imv.setImageResource(R.drawable.tarot110);
                imv2.setImageResource(R.drawable.tarot110);
                textres.setText("野小孩不怕死");
                break;
            case 111:
                imv.setImageResource(R.drawable.tarot111);
                imv2.setImageResource(R.drawable.tarot111);
                textres.setText("注意車關，容易超速");
                break;
            case 112:
                imv.setImageResource(R.drawable.tarot112);
                imv2.setImageResource(R.drawable.tarot112);
                textres.setText("心裡想的跟做的方向不同");
                break;
            case 113:
                imv.setImageResource(R.drawable.tarot113);
                imv2.setImageResource(R.drawable.tarot113);
                textres.setText("要走不代表隨便走。");
                break;
            case 114:
                imv.setImageResource(R.drawable.tarot114);
                imv2.setImageResource(R.drawable.tarot114);
                textres.setText("缺乏與人溝通的能力");
                break;
            case 115:
                imv.setImageResource(R.drawable.tarot115);
                imv2.setImageResource(R.drawable.tarot115);
                textres.setText("與異性交流狀態不佳");
                break;
            case 116:
                imv.setImageResource(R.drawable.tarot116);
                imv2.setImageResource(R.drawable.tarot116);
                textres.setText("聚會變調");
                break;
            case 117:
                imv.setImageResource(R.drawable.tarot117);
                imv2.setImageResource(R.drawable.tarot117);
                textres.setText("想太多或更加貪心");
                break;
            case 118:
                imv.setImageResource(R.drawable.tarot118);
                imv2.setImageResource(R.drawable.tarot118);
                textres.setText("過於難過而不去珍惜所擁有");
                break;
            case 119:
                imv.setImageResource(R.drawable.tarot119);
                imv2.setImageResource(R.drawable.tarot119);
                textres.setText("過於溺愛或被溺愛");
                break;
            case 120:
                imv.setImageResource(R.drawable.tarot120);
                imv2.setImageResource(R.drawable.tarot120);
                textres.setText("更加不切實際。");
                break;
            case 121:
                imv.setImageResource(R.drawable.tarot121);
                imv2.setImageResource(R.drawable.tarot121);
                textres.setText("回頭珍惜已有的");
                break;
            case 122:
                imv.setImageResource(R.drawable.tarot122);
                imv2.setImageResource(R.drawable.tarot122);
                textres.setText("現在就滿足可能會致使失敗");
                break;
            case 123:
                imv.setImageResource(R.drawable.tarot123);
                imv2.setImageResource(R.drawable.tarot123);
                textres.setText("事情並沒有那麼圓滿。");
                break;
            case 124:
                imv.setImageResource(R.drawable.tarot124);
                imv2.setImageResource(R.drawable.tarot124);
                textres.setText("不會說話的小鬼");
                break;
            case 125:
                imv.setImageResource(R.drawable.tarot125);
                imv2.setImageResource(R.drawable.tarot125);
                textres.setText("拈花惹草。注意車關");
                break;
            case 126:
                imv.setImageResource(R.drawable.tarot126);
                imv2.setImageResource(R.drawable.tarot126);
                textres.setText("摸不清真正適合自己的是甚麼");
                break;
            case 127:
                imv.setImageResource(R.drawable.tarot127);
                imv2.setImageResource(R.drawable.tarot127);
                textres.setText("花心而不可性任的");
                break;
            case 128:
                imv.setImageResource(R.drawable.tarot128);
                imv2.setImageResource(R.drawable.tarot128);
                textres.setText("做錯決定");
                break;
            case 129:
                imv.setImageResource(R.drawable.tarot129);
                imv2.setImageResource(R.drawable.tarot129);
                textres.setText("更懼怕，更不願面對困難與挑戰");
                break;
            case 130:
                imv.setImageResource(R.drawable.tarot130);
                imv2.setImageResource(R.drawable.tarot130);
                textres.setText("容易讓別人傷心。");
                break;
            case 131:
                imv.setImageResource(R.drawable.tarot131);
                imv2.setImageResource(R.drawable.tarot131);
                textres.setText("缺乏休息，工作過度。");
                break;
            case 132:
                imv.setImageResource(R.drawable.tarot132);
                imv2.setImageResource(R.drawable.tarot132);
                textres.setText("廝殺之中的失敗者");
                break;
            case 133:
                imv.setImageResource(R.drawable.tarot133);
                imv2.setImageResource(R.drawable.tarot133);
                textres.setText("需要更長的養傷時間。");
                break;
            case 134:
                imv.setImageResource(R.drawable.tarot134);
                imv2.setImageResource(R.drawable.tarot134);
                textres.setText("事跡敗露。難堪。");
                break;
            case 135:
                imv.setImageResource(R.drawable.tarot135);
                imv2.setImageResource(R.drawable.tarot135);
                textres.setText("有機會找出自己的方向");
                break;
            case 136:
                imv.setImageResource(R.drawable.tarot136);
                imv2.setImageResource(R.drawable.tarot136);
                textres.setText("更加深層的噩夢。去燒香拜拜ㄅ");
                break;
            case 137:
                imv.setImageResource(R.drawable.tarot137);
                imv2.setImageResource(R.drawable.tarot137);
                textres.setText("已經死透，就接受現實。");
                break;
            case 138:
                imv.setImageResource(R.drawable.tarot138);
                imv2.setImageResource(R.drawable.tarot138);
                textres.setText("不懂得尊重人");
                break;
            case 139:
                imv.setImageResource(R.drawable.tarot139);
                imv2.setImageResource(R.drawable.tarot139);
                textres.setText("無謀之戰，車關");
                break;
            case 140:
                imv.setImageResource(R.drawable.tarot140);
                imv2.setImageResource(R.drawable.tarot140);
                textres.setText("無法做出正確的理性判斷");
                break;
            case 141:
                imv.setImageResource(R.drawable.tarot141);
                imv2.setImageResource(R.drawable.tarot141);
                textres.setText("說話過於鋒利嚴肅的，使人不敢接近");
                break;
            case 142:
                imv.setImageResource(R.drawable.tarot142);
                imv2.setImageResource(R.drawable.tarot142);
                textres.setText("損失");
                break;
            case 143:
                imv.setImageResource(R.drawable.tarot143);
                imv2.setImageResource(R.drawable.tarot143);
                textres.setText("失去兩者間平衡");
                break;
            case 144:
                imv.setImageResource(R.drawable.tarot144);
                imv2.setImageResource(R.drawable.tarot144);
                textres.setText("找錯人，基礎不穩");
                break;
            case 145:
                imv.setImageResource(R.drawable.tarot145);
                imv2.setImageResource(R.drawable.tarot145);
                textres.setText("抓的越緊，越容易溜掉");
                break;
            case 146:
                imv.setImageResource(R.drawable.tarot146);
                imv2.setImageResource(R.drawable.tarot146);
                textres.setText("錯失了能幫助你的人事物");
                break;
            case 147:
                imv.setImageResource(R.drawable.tarot147);
                imv2.setImageResource(R.drawable.tarot147);
                textres.setText("給得太多反而掏空了自我");
                break;
            case 148:
                imv.setImageResource(R.drawable.tarot148);
                imv2.setImageResource(R.drawable.tarot148);
                textres.setText("不懂得飲水思源");
                break;
            case 149:
                imv.setImageResource(R.drawable.tarot149);
                imv2.setImageResource(R.drawable.tarot149);
                textres.setText("小心手受傷，過於刁鑽");
                break;
            case 150:
                imv.setImageResource(R.drawable.tarot150);
                imv2.setImageResource(R.drawable.tarot150);
                textres.setText("受外在影響，失去自我的風格");
                break;
            case 151:
                imv.setImageResource(R.drawable.tarot151);
                imv2.setImageResource(R.drawable.tarot151);
                textres.setText("財務問題，事情還沒告段落");
                break;
            case 152:
                imv.setImageResource(R.drawable.tarot152);
                imv2.setImageResource(R.drawable.tarot152);
                textres.setText("bang胖，內向");
                break;
            case 153:
                imv.setImageResource(R.drawable.tarot153);
                imv2.setImageResource(R.drawable.tarot153);
                textres.setText("懶人不會騎馬，車關");
                break;
            case 154:
                imv.setImageResource(R.drawable.tarot154);
                imv2.setImageResource(R.drawable.tarot154);
                textres.setText("內心太過於封閉保守。");
                break;
            case 155:
                imv.setImageResource(R.drawable.tarot0);
                imv2.setImageResource(R.drawable.tarot0);
                textres.setText("相信直覺，做你自己");
                break;
            case 156:
                imv.setImageResource(R.drawable.tarot155);
                imv2.setImageResource(R.drawable.tarot155);
                textres.setText("為了自我形象給自己太大壓力。");
                break;
                default:
                    textres.setText("不再範圍值內");
        }
    }

    public void gett (View v){
        finish();
    }


        public void trh (View v){
        imv2.setVisibility(View.VISIBLE);
        Button3.setVisibility(View.GONE);
    }
        public void trh2 (View v){
        imv2.setVisibility(View.GONE);
        Button3.setVisibility(View.VISIBLE);
    }

}
