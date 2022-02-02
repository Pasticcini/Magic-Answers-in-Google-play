package com.game.headsortails;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    ImageView diceIntro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        diceIntro = findViewById(R.id.diceIntro);


        Dialog settingsDialog = new Dialog(MainActivity2.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain2
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();



        diceIntro.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void onClick(View v) {





                diceIntro.clearAnimation();
                RotateAnimation anim = new RotateAnimation(30, 18000, diceIntro.getWidth()/2, diceIntro.getHeight()/2);
                anim.setFillAfter(true);
                anim.setRepeatCount(0);
                anim.setDuration(6000);
                diceIntro.startAnimation(anim);


                Random random = new Random();
                int randomNumber = random.nextInt(24)+1;
                Handler handler = new Handler();
                switch (randomNumber){
                    case 1:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa1);
                            }
                        },5000);

                        break;
                    case 2:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa2);
                            }
                        },5000);

                        break;
                    case 3:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa3);
                            }
                        },5000);

                        break;
                    case 4:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa4);
                            }
                        },5000);

                        break;
                    case 5:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa5);
                            }
                        },5000);

                        break;
                    case 6:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa6);
                            }
                        },5000);

                    case 7:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa7);
                            }
                        },5000);

                        break;
                    case 8:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa8);
                            }
                        },5000);

                        break;
                    case 9:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa9);
                            }
                        },5000);

                        break;
                    case 10:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa10);
                            }
                        },5000);

                        break;
                    case 11:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa11);
                            }
                        },5000);

                        break;
                    case 12:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa12);
                            }
                        },5000);

                    case 13:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa13);
                            }
                        },5000);

                        break;
                    case 14:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa14);
                            }
                        },5000);

                        break;
                    case 15:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa15);
                            }
                        },5000);

                        break;
                    case 16:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa16);
                            }
                        },5000);

                        break;
                    case 17:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa17);
                            }
                        },5000);

                        break;
                    case 18:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa18);
                            }
                        },5000);
                    case 19:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa19);
                            }
                        },5000);

                        break;
                    case 20:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa20);
                            }
                        },5000);

                        break;
                    case 21:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa21);
                            }
                        },5000);

                        break;
                    case 22:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa22);
                            }
                        },5000);

                        break;
                    case 23:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa23);
                            }
                        },5000);

                        break;
                    case 24:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                diceIntro.setImageResource(R.drawable.runa24);
                            }
                        },5000);





                }

            }
        });

    }
}