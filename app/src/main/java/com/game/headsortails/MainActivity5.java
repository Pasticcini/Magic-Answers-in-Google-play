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
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        imageView = findViewById(R.id.cropOracle);


        Dialog settingsDialog = new Dialog(MainActivity5.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain5
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.clearAnimation();
                RotateAnimation anim5 = new RotateAnimation(30, 18000, imageView.getWidth()/2, imageView.getHeight()/2);
                anim5.setFillAfter(true);
                anim5.setRepeatCount(0);
                anim5.setDuration(6000);
                imageView.startAnimation(anim5);

                Random random = new Random();
                int randomNumber = random.nextInt(15)+1;
                Handler handler = new Handler();

                switch (randomNumber){
                    case 1:

                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayyes);

                            }
                        },5000);

                        break;
                    case 2:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayno);
                            }
                        },5000);

                        break;
                    case 3:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaynowillp);
                            }
                        },5000);
                        break;
                    case 4:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaycounton);
                            }
                        },5000);
                        break;
                    case 5:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaymaybe);
                            }
                        },5000);
                        break;
                    case 6:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayhot);
                            }
                        },5000);
                        break;
                    case 7:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayagain);
                            }
                        },5000);
                        break;
                    case 8:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaynodoubt);
                            }
                        },5000);
                        break;
                    case 9:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayabsolutely);
                            }
                        },5000);
                        break;
                    case 10:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaygoforit);
                            }
                        },5000);
                        break;
                    case 11:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaywaitfor);
                            }
                        },5000);
                        break;
                    case 12:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaynotfornow);
                            }
                        },5000);
                        break;
                    case 13:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplaycannottellnow);
                            }
                        },5000);
                        break;
                    case 14:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayverylikely);
                            }
                        },5000);
                        break;
                    case 15:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.magicreplayitisok);
                            }
                        },5000);
                        break;


                }


                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                      fadeOutAndHideImage(imageView);

                    }
                },7000);




            }
        });
    }

    private void fadeOutAndHideImage(final ImageView img)
    {
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(3000);

        fadeOut.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                imageView.setImageResource(R.drawable.cropcirclerid);

            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });

        img.startAnimation(fadeOut);
    }


}