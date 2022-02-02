package com.game.headsortails;

import androidx.appcompat.app.AppCompatActivity;
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
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity8 extends AppCompatActivity {

    ImageView zingarabtn;
    ImageView primacarta;
    ImageView secondacarta;
    ImageView terzacarta;
    ImageView quartacarta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        zingarabtn = findViewById(R.id.zingaratarocchi);
        primacarta = findViewById(R.id.primacarta);
        secondacarta = findViewById(R.id.secondacarta);
        terzacarta = findViewById(R.id.terzacarta);
        quartacarta = findViewById(R.id.quartacarta);

        primacarta.setAlpha(0f);
        secondacarta.setAlpha(0f);
        terzacarta.setAlpha(0f);
        quartacarta.setAlpha(0f);



        Dialog settingsDialog = new Dialog(MainActivity8.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain8
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();


        zingarabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCardprima();
                performCardseconda();
                performCardterza();
                performCardquarta();
                letturaTar();
            }


        });
    }


    private  void letturaTar(){
        Random random = new Random();
        int randomNumber = random.nextInt(20)+1;
        Handler handler = new Handler();

        switch (randomNumber){
            case 1:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay1
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 2:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay2
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
            case 3:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay3
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
            case 4:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay4
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 5:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay5
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 6:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay6
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 7:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay7
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 8:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay8
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
            case 9:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay9
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 10:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay10
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 11:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay11
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
            case 12:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay12
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 13:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay13
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 14:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay14
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 15:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay15
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 16:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay16
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 17:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay17
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 18:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay18
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;

            case 19:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay19
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
            case 20:
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
                        Dialog settingsDialog = new Dialog(MainActivity8.this);
                        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
                        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.zingarareplay20
                                , null));
                        settingsDialog.getWindow().setGravity(Gravity.TOP);
                        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        settingsDialog.show();
                    }
                },6000);
                break;
        }




    }



    private void performCardprima(){

        zingarabtn.clearAnimation();
        RotateAnimation anim5 = new RotateAnimation(30, 18000, zingarabtn.getWidth()/2, zingarabtn.getHeight()/2);
        anim5.setFillAfter(true);
        anim5.setRepeatCount(0);
        anim5.setDuration(6000);
        zingarabtn.startAnimation(anim5);

        zingarabtn.animate().alpha(1).setDuration(1000).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() {
            @Override
            public void run() {
                zingarabtn.animate().alpha(0).setDuration(1000).setInterpolator(new AccelerateInterpolator()).start();
            }
        }).start();

        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        Handler handler = new Handler();

        switch (randomNumber){
            case 1:

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.thechariot);

                    }
                },2000);

                break;
            case 2:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.thedeath);
                    }
                },2000);

                break;
            case 3:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.thedevil);
                    }
                },2000);
                break;
            case 4:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.theemperor);
                    }
                },2000);
                break;
            case 5:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.theempress);
                    }
                },2000);
                break;
            case 6:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(primacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        primacarta.setImageResource(R.drawable.thefool);
                    }
                },2000);
                break;


        }



    }
    private void performCardseconda() {
        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        Handler handler = new Handler();

        switch (randomNumber){
            case 1:

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.thehangedman);
                    }
                },3000);

                break;
            case 2:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.theheremit);
                    }
                },3000);

                break;
            case 3:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.thehierophant);
                    }
                },3000);
                break;
            case 4:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.thehightpriestess);
                    }
                },3000);
                break;
            case 5:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.thejudgement);
                    }
                },3000);
                break;
            case 6:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(secondacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        secondacarta.setImageResource(R.drawable.thejustice);
                    }
                },3000);
                break;
    }

  }

  private void performCardterza(){
      Random random = new Random();
      int randomNumber = random.nextInt(5)+1;
      Handler handler = new Handler();

      switch (randomNumber){
          case 1:

              handler.postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      ObjectAnimator.ofFloat(terzacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                      terzacarta.setImageResource(R.drawable.thelovers);
                  }
              },4000);

              break;
          case 2:
              handler.postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      ObjectAnimator.ofFloat(terzacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                      terzacarta.setImageResource(R.drawable.themagician);
                  }
              },4000);

              break;
          case 3:
              handler.postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      ObjectAnimator.ofFloat(terzacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                      terzacarta.setImageResource(R.drawable.themoon);
                  }
              },4000);
              break;
          case 4:
              handler.postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      ObjectAnimator.ofFloat(terzacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                      terzacarta.setImageResource(R.drawable.thestar);
                  }
              },4000);
              break;
          case 5:
              handler.postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      ObjectAnimator.ofFloat(terzacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                      terzacarta.setImageResource(R.drawable.thestrenght);
                  }
              },4000);
              break;

      }
  }

    private void performCardquarta(){
        Random random = new Random();
        int randomNumber = random.nextInt(5)+1;
        Handler handler = new Handler();

        switch (randomNumber){
            case 1:

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(quartacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        quartacarta.setImageResource(R.drawable.thesun);
                    }
                },5000);

                break;
            case 2:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(quartacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        quartacarta.setImageResource(R.drawable.thetemperance);
                    }
                },5000);

                break;
            case 3:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(quartacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        quartacarta.setImageResource(R.drawable.thetower);
                    }
                },5000);
                break;
            case 4:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(quartacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        quartacarta.setImageResource(R.drawable.theworld);
                    }
                },5000);
                break;
            case 5:
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ObjectAnimator.ofFloat(quartacarta, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                        quartacarta.setImageResource(R.drawable.wheeloffortune);
                    }
                },5000);
                break;

        }
    }
}