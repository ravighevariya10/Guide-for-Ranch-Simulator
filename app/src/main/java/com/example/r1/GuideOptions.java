package com.example.r1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import maes.tech.intentanim.CustomIntent;

public class GuideOptions extends AppCompatActivity {

    String osValue;
    TextView os_text,logo_text_guide;
    ImageView logo_image_guide;
    androidx.cardview.widget.CardView title_card_guide,options_card;
    int infoValue = 0;

    Button install,play,about,idea,star,strategy,privacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_options);

        animationRTL();
        animationBTU();

        os_text = findViewById(R.id.os_text);
        logo_text_guide = findViewById(R.id.logo_text_guide);
        logo_image_guide = findViewById(R.id.logo_image_guide);
        title_card_guide = findViewById(R.id.title_card_guide);
        options_card = findViewById(R.id.options_card);
        install = findViewById(R.id.install);
        play = findViewById(R.id.play);
        about = findViewById(R.id.about);
        idea = findViewById(R.id.idea);
        star = findViewById(R.id.star);
        strategy = findViewById(R.id.strategy);
        privacy = findViewById(R.id.privacy);

        osValue = getIntent().getStringExtra("osValue");
        os_text.setText(osValue);

        install.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 1;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(install);

                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 2;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(play);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 3;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(about);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        idea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 4;
                if(infoValue != 0)
                {

                    YoYo.with(Techniques.Bounce).duration(1000).playOn(idea);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 5;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(star);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        strategy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 6;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(strategy);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoValue = 7;
                if(infoValue != 0)
                {
                    YoYo.with(Techniques.Bounce).duration(1000).playOn(privacy);
                    Intent intent = new Intent(GuideOptions.this,Information.class);
                    intent.putExtra("osValue",osValue);
                    intent.putExtra("infoValue",infoValue);
                    startActivity(intent);

                    CustomIntent.customType(GuideOptions.this,"left-to-right");

                }
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        animationLTR();
        animationBTU();
        CustomIntent.customType(GuideOptions.this,"right-to-left");

    }

    public void animationRTL() {
        os_text = findViewById(R.id.os_text);
        logo_text_guide = findViewById(R.id.logo_text_guide);
        logo_image_guide = findViewById(R.id.logo_image_guide);
        title_card_guide = findViewById(R.id.title_card_guide);
        options_card = findViewById(R.id.options_card);

        title_card_guide.setTranslationX(1400);
        title_card_guide.setAlpha((float)0.1);
        title_card_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(0);

        logo_image_guide.setTranslationX(1400);
        logo_image_guide.setAlpha((float)0.1);
        logo_image_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(200);

        logo_text_guide.setTranslationX(1400);
        logo_text_guide.setAlpha((float)0.1);
        logo_text_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        os_text.setTranslationX(1400);
        os_text.setAlpha((float)0.1);
        os_text.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        options_card.setTranslationX(1400);
        options_card.setAlpha((float)0.1);
        options_card.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(400);
    }

    public void animationLTR() {
        os_text = findViewById(R.id.os_text);
        logo_text_guide = findViewById(R.id.logo_text_guide);
        logo_image_guide = findViewById(R.id.logo_image_guide);
        title_card_guide = findViewById(R.id.title_card_guide);
        options_card = findViewById(R.id.options_card);

        title_card_guide.setTranslationX(-1400);
        title_card_guide.setAlpha((float)0.1);
        title_card_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(0);

        logo_image_guide.setTranslationX(-1400);
        logo_image_guide.setAlpha((float)0.1);
        logo_image_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(200);

        logo_text_guide.setTranslationX(-1400);
        logo_text_guide.setAlpha((float)0.1);
        logo_text_guide.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        os_text.setTranslationX(-1400);
        os_text.setAlpha((float)0.1);
        os_text.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        options_card.setTranslationX(-1400);
        options_card.setAlpha((float)0.1);
        options_card.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(400);
    }

    public void animationBTU() {
        install = findViewById(R.id.install);
        play = findViewById(R.id.play);
        about = findViewById(R.id.about);
        idea = findViewById(R.id.idea);
        star = findViewById(R.id.star);
        strategy = findViewById(R.id.strategy);
        privacy = findViewById(R.id.privacy);

        install.setTranslationY(1400);
        install.setAlpha((float)0.1);
        install.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(500);

        play.setTranslationY(1400);
        play.setAlpha((float)0.1);
        play.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(600);

        about.setTranslationY(1400);
        about.setAlpha((float)0.1);
        about.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(700);

        idea.setTranslationY(1400);
        idea.setAlpha((float)0.1);
        idea.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(800);

        star.setTranslationY(1400);
        star.setAlpha((float)0.1);
        star.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(900);

        strategy.setTranslationY(1400);
        strategy.setAlpha((float)0.1);
        strategy.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(1000);

        privacy.setTranslationY(1400);
        privacy.setAlpha((float)0.1);
        privacy.animate().translationY(0).alpha((float)1.0).setDuration(1000).setStartDelay(1100);

    }

}