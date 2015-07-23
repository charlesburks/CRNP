package com.example.charlesburks.crnp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Tab3 extends ActionBarActivity {

    Integer[] Seasons = {R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04,
            R.drawable.image05, R.drawable.image06, R.drawable.image07, R.drawable.image08, R.drawable.image09};
    int clicks = 0;
    MediaPlayer buttonNoise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);
        final ImageView mainImg = (ImageView) findViewById(R.id.mainView);
        final Button button = (Button) findViewById(R.id.Btt1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[0]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }

                mainImg.setBackgroundResource(Seasons[0]);
            }
        });
        final Button button2 = (Button) findViewById(R.id.Btt2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[1]);


                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.Btt3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[2]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button4 = (Button) findViewById(R.id.Btt4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[3]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button5 = (Button) findViewById(R.id.Btt5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[4]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button6 = (Button) findViewById(R.id.Btt6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[5]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button7 = (Button) findViewById(R.id.Btt7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[6]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button8 = (Button) findViewById(R.id.Btt8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[7]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button9 = (Button) findViewById(R.id.Btt9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks) {
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[8]);

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });


    }
}