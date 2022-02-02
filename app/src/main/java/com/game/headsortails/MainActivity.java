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
import android.widget.TextView;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView OsiOno;
    ImageView animalGuide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv_image);

        OsiOno = findViewById(R.id.OsiOno);

        animalGuide = findViewById(R.id.animalGuide);


        Dialog settingsDialog = new Dialog(MainActivity.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain1
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                boolean result = random.nextBoolean();
                ThreadLocalRandom animalResult = ThreadLocalRandom. current();
                int animalR = random.nextInt(14)+1;

                    if (result == true){

                        imageView.clearAnimation();
                        RotateAnimation anim = new RotateAnimation(30, 18000, imageView.getWidth()/2, imageView.getHeight()/2);
                        anim.setFillAfter(true);
                        anim.setRepeatCount(0);
                        anim.setDuration(5000);
                        imageView.startAnimation(anim);





                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                OsiOno.setText("Yes");
                                if(animalR == 1){
                                    animalGuide.setBackgroundResource(R.drawable.cane);
                                }else if(animalR == 2){
                                    animalGuide.setBackgroundResource(R.drawable.cervo);
                                }else if(animalR == 3){
                                    animalGuide.setBackgroundResource(R.drawable.cicogna);
                                }else if(animalR == 4){
                                    animalGuide.setBackgroundResource(R.drawable.civetta);
                                }else if(animalR == 5){
                                    animalGuide.setBackgroundResource(R.drawable.elefante);
                                }else if(animalR == 6){
                                    animalGuide.setBackgroundResource(R.drawable.farfalla);
                                }else if(animalR == 7){
                                    animalGuide.setBackgroundResource(R.drawable.gatto);
                                }else if(animalR == 8){
                                    animalGuide.setBackgroundResource(R.drawable.gorilla);
                                }else if(animalR == 9){
                                    animalGuide.setBackgroundResource(R.drawable.gufo);
                                }else if(animalR == 10){
                                    animalGuide.setBackgroundResource(R.drawable.jimbo);
                                }else if(animalR == 11){
                                    animalGuide.setBackgroundResource(R.drawable.orso);
                                }else if(animalR == 12){
                                    animalGuide.setBackgroundResource(R.drawable.orsobianco);
                                }else if(animalR == 13){
                                    animalGuide.setBackgroundResource(R.drawable.squirrel);
                                }else if(animalR == 14){
                                    animalGuide.setBackgroundResource(R.drawable.volpe);
                                }









                            }
                        },5000);




                    }else{
                        imageView.clearAnimation();
                        RotateAnimation anim = new RotateAnimation(30, 18000, imageView.getWidth()/2, imageView.getHeight()/2);
                        anim.setFillAfter(true);
                        anim.setRepeatCount(0);
                        anim.setDuration(5000);
                        imageView.startAnimation(anim);
                        Handler handler = new Handler();


                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                OsiOno.setText("No");
                                if(animalR == 1){
                                    animalGuide.setBackgroundResource(R.drawable.cane);
                                }else if(animalR == 2){
                                    animalGuide.setBackgroundResource(R.drawable.cervo);
                                }else if(animalR == 3){
                                    animalGuide.setBackgroundResource(R.drawable.cicogna);
                                }else if(animalR == 4){
                                    animalGuide.setBackgroundResource(R.drawable.civetta);
                                }else if(animalR == 5){
                                    animalGuide.setBackgroundResource(R.drawable.elefante);
                                }else if(animalR == 6){
                                    animalGuide.setBackgroundResource(R.drawable.farfalla);
                                }else if(animalR == 7){
                                    animalGuide.setBackgroundResource(R.drawable.gatto);
                                }else if(animalR == 8){
                                    animalGuide.setBackgroundResource(R.drawable.gorilla);
                                }else if(animalR == 9){
                                    animalGuide.setBackgroundResource(R.drawable.gufo);
                                }else if(animalR == 10){
                                    animalGuide.setBackgroundResource(R.drawable.jimbo);
                                }else if(animalR == 11){
                                    animalGuide.setBackgroundResource(R.drawable.orso);
                                }else if(animalR == 12){
                                    animalGuide.setBackgroundResource(R.drawable.orsobianco);
                                }else if(animalR == 13){
                                    animalGuide.setBackgroundResource(R.drawable.squirrel);
                                }else if(animalR == 14){
                                    animalGuide.setBackgroundResource(R.drawable.volpe);
                                }
                            }
                        },5000);


                    }



            }
        });


    }


}