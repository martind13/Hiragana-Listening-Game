package com.example.devma.listeninggame;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Random rnd = new Random();
    public int[] soundFiles = new int[]{R.raw.a, R.raw.i, R.raw.u, R.raw.e, R.raw.o, R.raw.ka, R.raw.ki, R.raw.ku, R.raw.ke, R.raw.ko, R.raw.ga, R.raw.gi, R.raw.gu, R.raw.ge, R.raw.go};
    public int[] btns_orange = new int[]{R.drawable.a_orange, R.drawable.i_orange, R.drawable.u_orange, R.drawable.e_orange, R.drawable.o_orange, R.drawable.ka_orange, R.drawable.ki_orange, R.drawable.ku_orange, R.drawable.ke_orange, R.drawable.ko_orange, R.drawable.ga_orange, R.drawable.gi_orange, R.drawable.gu_orange, R.drawable.ge_orange, R.drawable.go_orange};
    //private int[] btns_red = new int[]{R.drawable.a_red, R.drawable.i_red, R.drawable.u_red, R.drawable.e_red, R.drawable.o_red, R.drawable.ka_red, R.drawable.ki_red, R.drawable.ku_red, R.drawable.ke_red, R.drawable.ko_red};
    private int[] btns_green = new int[]{R.drawable.a_green, R.drawable.i_green, R.drawable.u_green, R.drawable.e_green, R.drawable.o_green, R.drawable.ka_green, R.drawable.ki_green, R.drawable.ku_green, R.drawable.ke_green, R.drawable.ko_green, R.drawable.ga_green, R.drawable.gi_green, R.drawable.gu_green, R.drawable.ge_green, R.drawable.go_green};
    private int[] mButtons = new int[]{R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    public int y;
    public int noise = rnd.nextInt(soundFiles.length);
    final int ans = rnd.nextInt(mButtons.length);

    List<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for (int i = 0; i < soundFiles.length; i++) {
            numbers.add(i);
        }

        y = getRand();
        Button one = (Button) findViewById(R.id.practice1);
        final MediaPlayer mp1 = MediaPlayer.create(this, soundFiles[y]);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();

            }
        });
        //setAns();
        setBoard();
    }

    public int getRand(){

        int arrIndex = (int) ((double) numbers.size() * Math.random());
        int x = numbers.get(arrIndex);
        numbers.remove(arrIndex);
        return x;

    }

  /* public void setAns(){

       findViewById(mButtons[ans]).setBackgroundResource(btns_orange[y]);

   }
*/
    public void setBoard() {

        final ImageButton button1 = (ImageButton)findViewById(R.id.btn1);
        final ImageButton button2 = (ImageButton)findViewById(R.id.btn2);
        final ImageButton button3 = (ImageButton)findViewById(R.id.btn3);
        final ImageButton button4 = (ImageButton)findViewById(R.id.btn4);
        final ImageButton button5 = (ImageButton)findViewById(R.id.btn5);
        final ImageButton button6 = (ImageButton)findViewById(R.id.btn6);
        final ImageButton button7 = (ImageButton)findViewById(R.id.btn7);
        final ImageButton button8 = (ImageButton)findViewById(R.id.btn8);
        final ImageButton button9 = (ImageButton)findViewById(R.id.btn9);

        for(int i = 0; i < mButtons.length; i++) {

            findViewById(mButtons[ans]).setBackgroundResource(btns_orange[y]);

            if(mButtons[i] != mButtons[ans]) {
                findViewById(mButtons[i]).setBackgroundResource(btns_orange[getRand()]);
                i++;
            }
        }

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button1 == findViewById(mButtons[ans])){
                    button1.setBackgroundResource(btns_green[y]);
                } else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);
            }
        });

        button2.setBackgroundResource(btns_orange[getRand()]);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button2 == findViewById(mButtons[ans])){
                    button2.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });

        button3.setBackgroundResource(btns_orange[getRand()]);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button3 == findViewById(mButtons[ans])){
                    button3.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });
        button4.setBackgroundResource(btns_orange[getRand()]);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button4 == findViewById(mButtons[ans])){
                    button4.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });
        button5.setBackgroundResource(btns_orange[getRand()]);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button5 == findViewById(mButtons[ans])){
                    button5.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });
        button6.setBackgroundResource(btns_orange[getRand()]);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button6 == findViewById(mButtons[ans])){
                    button6.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });
        button7.setBackgroundResource(btns_orange[getRand()]);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button7 == findViewById(mButtons[ans])){
                    button7.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });

        button8.setBackgroundResource(btns_orange[getRand()]);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button8 == findViewById(mButtons[ans])){
                    button8.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }


                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });
        button9.setBackgroundResource(btns_orange[getRand()]);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(button9 == findViewById(mButtons[ans])){
                    button9.setBackgroundResource(btns_green[y]);
                }else{
                    findViewById(mButtons[ans]).setBackgroundResource(btns_green[y]);
                }

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resetGame();
                    }
                }, 700);

            }
        });

    }

    public void resetGame() {
        startActivity(new Intent(this, MainActivity.class));
    }
}