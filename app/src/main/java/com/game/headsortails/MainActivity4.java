package com.game.headsortails;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    ImageView img;
    RelativeLayout rel;
    private float currentX;
    private float currentY;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);




        img = findViewById(R.id.pennino);
        rel = findViewById(R.id.root);








            Dialog settingsDialog = new Dialog(MainActivity4.this) {
                @Override
                public boolean dispatchTouchEvent(MotionEvent event) {
                    dismiss();
                    return false;
                }

            };
            settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain4
                    , null));
            settingsDialog.getWindow().setGravity(Gravity.TOP);
            settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            settingsDialog.setCanceledOnTouchOutside(false);
            settingsDialog.show();







        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels - 300;
        int height = displaymetrics.heightPixels- 400;



        rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random r = new Random();
                int translationX = r.nextInt(width);
                int translationY = r.nextInt(height);




                TranslateAnimation anim = new TranslateAnimation( currentX, translationX , currentY, translationY ); //Use current view position instead of `currentX` and `currentY`
                anim.setDuration(1000);
                anim.setFillAfter(true);
                img.startAnimation(anim);

                currentX = translationX;
                currentY = translationY;


            }
        });



    }


}