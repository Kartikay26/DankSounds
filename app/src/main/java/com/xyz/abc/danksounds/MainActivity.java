package com.xyz.abc.danksounds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ImageButton bt_one;
    MediaPlayer mp;
    View viewLayout;
    ArrayList<MediaPlayer> mplist = new ArrayList<MediaPlayer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // LayoutInflater inflater = getLayoutInflater();

       /* viewLayout =    inflater.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.llCustom));

        Toast t = new Toast(getApplicationContext());
        t.setView(viewLayout);
        t.show();*/




    }

    @Override
    protected void onStop() {
        stop();
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        SubMenu Sm = menu.addSubMenu(Menu.NONE,Menu.FIRST,Menu.NONE, "Change Color");
        menu.add(Menu.NONE,11,Menu.NONE,"About Developer");

        Sm.add(0,10,Menu.NONE,"Purple");
        inflater.inflate(R.menu.action_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_stop:
                stop();
                break;
            case 11:
                Intent intent = new Intent(getApplicationContext(),about_dev.class);
                startActivity(intent);
                break;
            case 12:
                break;


        }

        return super.onOptionsItemSelected(item);
    }

    void roblox_death(View view){
        mp = MediaPlayer.create(this,R.raw.roblox_death);
        mp.start();
        mplist.add(mp);
    }
    void illumminati_death(View view){
        mp = MediaPlayer.create(this,R.raw.illuminati_roblox);
        mp.start();
        mplist.add(mp);

    }
    void roblox_thomas(View view){
        mp = MediaPlayer.create(this,R.raw.roblox_thomas);
        mp.start();
        mplist.add(mp);

    }
    void harrypotter(View view){
        mp = MediaPlayer.create(this,R.raw.harrypotter);
        mp.start();
        mplist.add(mp);
    }
    void happybday(View view){
        mp = MediaPlayer.create(this,R.raw.happybday);
        mp.start();
        mplist.add(mp);
    }
    void stop(){
        for(MediaPlayer m : mplist){
            if(m.isPlaying()){
                m.reset();
            }
        }
        mplist.clear();
    }
    void hmmm(View view){
        mp = MediaPlayer.create(this,R.raw.hmmm);
        mp.start();
        mplist.add(mp);
    }
    void yeboiii(View view){
        mp = MediaPlayer.create(this,R.raw.yeboiii);
        mp.start();
        mplist.add(mp);
    }
    void yeboiiismokerofweed(View view){
        mp = MediaPlayer.create(this,R.raw.yeeboiiismokerodweed);
        mp.start();
        mplist.add(mp);
    }
    void alotofdamage(View view){
        mp = MediaPlayer.create(this,R.raw.alotofdamage);
        mp.start();
        mplist.add(mp);
    }
    void datboiii(View view){
        mp = MediaPlayer.create(this,R.raw.yeeboiiismokerodweed);
        mp.start();
        mplist.add(mp);
    }


}
