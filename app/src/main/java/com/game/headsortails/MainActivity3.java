package com.game.headsortails;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    ImageView imagePenta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imagePenta = findViewById(R.id.imagePenta);


        Dialog settingsDialog = new Dialog(MainActivity3.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain3
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();


        imagePenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random random = new Random();
                int randomNumber = random.nextInt(5)+1;
                Handler handler = new Handler();

                switch (randomNumber){
                    case 1:
                        imagePenta.clearAnimation();
                        RotateAnimation anim = new RotateAnimation(30, 18000, imagePenta.getWidth()/2, imagePenta.getHeight()/2);
                        anim.setFillAfter(true);
                        anim.setRepeatCount(0);
                        anim.setDuration(6000);
                        imagePenta.startAnimation(anim);
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Dialog settingsDialog = new Dialog(MainActivity3.this);
                                settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.spiritforest
                                        , null));
                                settingsDialog.getWindow().setGravity(Gravity.TOP);
                                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                settingsDialog.show();
                            }
                        }, 6500);
                        break;
                    case 2:
                        imagePenta.clearAnimation();
                        RotateAnimation anim1 = new RotateAnimation(30, 18070, imagePenta.getWidth()/2, imagePenta.getHeight()/2);
                        anim1.setFillAfter(true);
                        anim1.setRepeatCount(0);
                        anim1.setDuration(6000);
                        imagePenta.startAnimation(anim1);
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Dialog settingsDialog = new Dialog(MainActivity3.this);
                                settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.waterfinal
                                        , null));
                                settingsDialog.getWindow().setGravity(Gravity.TOP);
                                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                settingsDialog.show();
                            }
                        }, 6500);
                        break;
                    case 3:
                        imagePenta.clearAnimation();
                        RotateAnimation anim3 = new RotateAnimation(30, 18130, imagePenta.getWidth()/2, imagePenta.getHeight()/2);
                        anim3.setFillAfter(true);
                        anim3.setRepeatCount(0);
                        anim3.setDuration(6000);
                        imagePenta.startAnimation(anim3);
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Dialog settingsDialog = new Dialog(MainActivity3.this);
                                settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.firefinal
                                        , null));
                                settingsDialog.getWindow().setGravity(Gravity.TOP);
                                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                settingsDialog.show();
                            }
                        }, 6500);
                        break;
                    case 4:
                        imagePenta.clearAnimation();
                        RotateAnimation anim4 = new RotateAnimation(30, 18220, imagePenta.getWidth()/2, imagePenta.getHeight()/2);
                        anim4.setFillAfter(true);
                        anim4.setRepeatCount(0);
                        anim4.setDuration(6000);
                        imagePenta.startAnimation(anim4);
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Dialog settingsDialog = new Dialog(MainActivity3.this);
                                settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.earthfinal
                                        , null));
                                settingsDialog.getWindow().setGravity(Gravity.TOP);
                                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                settingsDialog.show();
                            }
                        }, 6500);
                        break;
                    case 5:
                        imagePenta.clearAnimation();
                        RotateAnimation anim5 = new RotateAnimation(30, 18310, imagePenta.getWidth()/2, imagePenta.getHeight()/2);
                        anim5.setFillAfter(true);
                        anim5.setRepeatCount(0);
                        anim5.setDuration(6000);
                        imagePenta.startAnimation(anim5);
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                Dialog settingsDialog = new Dialog(MainActivity3.this);
                                settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.skyfinal
                                        , null));
                                settingsDialog.getWindow().setGravity(Gravity.TOP);
                                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                settingsDialog.show();
                            }
                        }, 6500);
                        break;



                }


            }
        });
        
        

    }

}