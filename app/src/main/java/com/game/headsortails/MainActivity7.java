package com.game.headsortails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
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
import android.widget.ImageView;
import java.util.Random;

public class MainActivity7 extends AppCompatActivity {


    ImageView imageView;
    ConstraintLayout constraintLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        constraintLayout = findViewById(R.id.alienHand);
        imageView = findViewById(R.id.imageView);
        imageView . setAlpha(0.0f);



        Dialog settingsDialog = new Dialog(MainActivity7.this) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent event) {
                dismiss();
                return false;
            }

        };
        settingsDialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
        settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.tutorialmain7
                , null));
        settingsDialog.getWindow().setGravity(Gravity.TOP);
        settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        settingsDialog.setCanceledOnTouchOutside(false);
        settingsDialog.show();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                        constraintLayout,
                        PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                        PropertyValuesHolder.ofFloat("scaleY", 1.2f));
                scaleDown.setDuration(2000);

                scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
                scaleDown.setRepeatMode(ObjectAnimator.REVERSE);

                scaleDown.start();



                Random random = new Random();
                int randomNumber = random.nextInt(15)+1;
                Handler handler = new Handler();

                switch (randomNumber){
                    case 1:

                        handler.postDelayed(new Runnable() {


                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienyes);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);

                            }
                        },2000);

                        break;
                    case 2:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienadmmitmistakes);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);

                        break;
                    case 3:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienaskforfeedback);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 4:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienbecurious);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 5:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropaliendriveforresult);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 6:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropaliengoforit);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 7:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienletssleeponit);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 8:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienno);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 9:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienrecognizesuccesses);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 10:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienthinkbigger);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 11:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalientimetofold);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 12:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalientodayistheday);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 13:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienwithoutadoubt);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 14:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropalienyoubet);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;
                    case 15:
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ObjectAnimator.ofFloat(imageView, View.ALPHA, 0.2f, 1.0f).setDuration(1000).start();
                                imageView.setImageResource(R.drawable.cropaliethestarssayyes);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        ConstraintLayout constraintLayout = new ConstraintLayout(MainActivity7.this);
                                        ObjectAnimator.ofFloat(constraintLayout, View.ALPHA, 0.2f, 1.0f).setDuration(10000).start();
                                        constraintLayout.setBackgroundResource(R.drawable.alienend); //or whatever your image is
                                        setContentView(constraintLayout); //you might be forgetting this
                                    }
                                },5000);
                            }
                        },2000);
                        break;





                }


                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Animation fadeOut = new AlphaAnimation(1, 0);
                        fadeOut.setInterpolator(new AccelerateInterpolator());
                        fadeOut.setDuration(3000);
                        imageView.startAnimation(fadeOut);
                        imageView.setVisibility(View.GONE);


                    }
                },5000);






            }
        });
    }


}
