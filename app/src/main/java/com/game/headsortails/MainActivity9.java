package com.game.headsortails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

import java.util.Random;

public class MainActivity9 extends AppCompatActivity {

    ConstraintLayout tutankhamen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        tutankhamen = findViewById(R.id.tutankhamen);


        Dialog settingsDialog = new Dialog(MainActivity9.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain9
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();



        tutankhamen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator.ofFloat(tutankhamen, View.ALPHA, 0.2f, 1.0f).setDuration(3000).start();
                tutankhamen.setBackgroundResource(R.drawable.tutankhamenccrophorror);
                letturaEgypt();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tutankhamen.setBackgroundResource(R.drawable.tutankhamenccrop);
                    }
                },4500);

            }
        });




        }
    private  void letturaEgypt() {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        Handler handler = new Handler();

        switch (randomNumber) {
            case 1:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi1
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 2:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi2
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
            case 3:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi3
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
            case 4:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi4
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 5:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.terocchi5
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 6:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi6
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 7:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi7
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 8:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi8
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
            case 9:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi9
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 10:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi10
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 11:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi11
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
            case 12:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi12
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 13:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi13
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 14:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi14
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 15:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi15
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 16:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi16
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 17:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi17
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 18:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi18
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;

            case 19:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi19
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
            case 20:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Dialog settingsDialog = new Dialog(MainActivity9.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tarocchi20
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                }, 4000);
                break;
        }
}}