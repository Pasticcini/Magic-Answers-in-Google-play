package com.game.headsortails;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;


public class MainActivity6 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

RelativeLayout oracleBt;
RelativeLayout ouijaBt;
RelativeLayout pentagramBt;
RelativeLayout diceBt;
RelativeLayout alienBt;
RelativeLayout zingaraBt;
RelativeLayout tarocchiBt;
RelativeLayout egypt;


DrawerLayout myScrollViewLayout;
AnimationDrawable animationDrawable;
DrawerLayout drawerLayout;
NavigationView navigationView;
Toolbar toolbar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        

        oracleBt = findViewById(R.id.exOracle);
        ouijaBt = findViewById(R.id.exOuija);
        pentagramBt = findViewById(R.id.exPenta);
        diceBt = findViewById(R.id.exDice);
        alienBt = findViewById(R.id.exAlien);
        zingaraBt = findViewById(R.id.exZingara);
        tarocchiBt = findViewById(R.id.tarocchi);
        egypt = findViewById(R.id.exEgypt);


        ///Drawerlayout
        drawerLayout = findViewById(R.id.mybackground);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);



        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawner_open,R.string.navigation_drawner_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);






        myScrollViewLayout = findViewById(R.id.mybackground);
        animationDrawable = (AnimationDrawable) myScrollViewLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



        oracleBt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                    Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                    startActivity(intent);


            }
         });

        ouijaBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity4.class);
                startActivity(intent);

            }
        });
        pentagramBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        diceBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        alienBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent);
            }
        });
        zingaraBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity.class);
                startActivity(intent);
            }
        });
        tarocchiBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intent);
            }
        });
        egypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity6.this,MainActivity9.class);
                startActivity(intent);

            }
        });






    }



/////item selected drawer_layout
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_privacy:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http to see your privacy site")));

                break;
            case R.id.nav_shareus:

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "http to let the users share your app";
                String shareSub = "Hey! With this app you can have a lot of fun ...";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share"));
                break;
            case R.id.nav_email:
                String str = "str:your email" +
                        "?cc=" +
                        "&subject=" + Uri.encode("[Magic answers] Message for the Customer Support");
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse(str));

                try {
                    startActivity(emailIntent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity6.this, "Error to open email app", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.nav_rateus:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http to rate your app")));
                break;
            case R.id.nav_plus:
                //implement in app purchase if you want//
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}