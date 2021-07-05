package com.example.r1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import maes.tech.intentanim.CustomIntent;

public class HomePage extends AppCompatActivity {

    Button android,apple,hand;
    androidx.cardview.widget.CardView cardView1,cardView2;
    ImageView logo_image;
    TextView logo_text;
    LinearLayout title_layout;
    String osValue = null;

    LayoutInflater inflater;
    Toast toast;
    View views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        android = findViewById(R.id.android);
        apple = findViewById(R.id.apple);
        hand = findViewById(R.id.hand);
        title_layout = findViewById(R.id.title_layout);

        cardView1 = findViewById(R.id.title_card);
        cardView2 = findViewById(R.id.bottom_card);

        logo_image = findViewById(R.id.logo_image);
        logo_text = findViewById(R.id.logo_text);

        animationRTL();

        inflater = getLayoutInflater();
        views = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.toast_layout));
        toast = new Toast(getApplicationContext());
        toast.setView(views);
        toast.setDuration(Toast.LENGTH_LONG);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                osValue = "Android";

                YoYo.with(Techniques.Bounce).duration(1000).playOn(android);

                apple.setBackgroundResource(R.drawable.custom_button);
                apple.setTextColor(Color.BLACK);
                apple.setCompoundDrawablesWithIntrinsicBounds(R.drawable.apple,0,0,0);

                android.setBackgroundResource(R.drawable.custom_button2);
                android.setTextColor(Color.WHITE);
                android.setCompoundDrawablesWithIntrinsicBounds(R.drawable.android2,0,0,0);

            }
        });

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                osValue = "IOS";

                YoYo.with(Techniques.Bounce).duration(1000).playOn(apple);

                android.setBackgroundResource(R.drawable.custom_button);
                android.setTextColor(Color.BLACK);
                android.setCompoundDrawablesWithIntrinsicBounds(R.drawable.android,0,0,0);

                apple.setBackgroundResource(R.drawable.custom_button2);
                apple.setTextColor(Color.WHITE);
                apple.setCompoundDrawablesWithIntrinsicBounds(R.drawable.apple2,0,0,0);

            }
        });

        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(osValue != null) {

                    YoYo.with(Techniques.RubberBand).duration(1000).playOn(view);

                    Intent intent = new Intent(HomePage.this, GuideOptions.class);
                    intent.putExtra("osValue", osValue);
                    startActivity(intent);

                    CustomIntent.customType(HomePage.this,"bottom-to-up");

                }
                else {
                    YoYo.with(Techniques.RubberBand).duration(1000).playOn(view);
                    YoYo.with(Techniques.Shake).duration(1000).playOn(views);
                    toast.show();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        osValue = null;

        apple.setBackgroundResource(R.drawable.custom_button);
        apple.setTextColor(Color.BLACK);
        apple.setCompoundDrawablesWithIntrinsicBounds(R.drawable.apple,0,0,0);

        android.setBackgroundResource(R.drawable.custom_button);
        android.setTextColor(Color.BLACK);
        android.setCompoundDrawablesWithIntrinsicBounds(R.drawable.android,0,0,0);

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        CustomIntent.customType(HomePage.this,"right-to-left");
        animationLTR();

    }

    public void animationLTR() {

        cardView1.setTranslationX(-1400);
        cardView1.setAlpha((float)0.1);
        cardView1.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(0);

        logo_image.setTranslationX(-1400);
        logo_image.setAlpha((float)0.1);
        logo_image.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(200);

        logo_text.setTranslationX(-1400);
        logo_text.setAlpha((float)0.1);
        logo_text.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(300);

        cardView2.setTranslationX(-1400);
        cardView2.setAlpha((float)0.1);
        cardView2.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(400);

        title_layout.setTranslationX(-1400);
        title_layout.setAlpha((float)0.1);
        title_layout.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(500);

        android.setTranslationX(-1400);
        android.setAlpha((float)0.1);
        android.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(600);

        apple.setTranslationX(-1400);
        apple.setAlpha((float)0.1);
        apple.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(700);

        hand.setTranslationX(-1400);
        hand.setAlpha((float)0.1);
        hand.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(800);

    }

    public void animationRTL() {
        cardView1.setTranslationX(1400);
        cardView1.setAlpha((float)0.1);
        cardView1.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(0);

        logo_image.setTranslationX(1400);
        logo_image.setAlpha((float)0.1);
        logo_image.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(200);

        logo_text.setTranslationX(1400);
        logo_text.setAlpha((float)0.1);
        logo_text.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(300);

        cardView2.setTranslationX(1400);
        cardView2.setAlpha((float)0.1);
        cardView2.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(400);

        title_layout.setTranslationX(1400);
        title_layout.setAlpha((float)0.1);
        title_layout.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(500);

        android.setTranslationX(1400);
        android.setAlpha((float)0.1);
        android.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(600);

        apple.setTranslationX(1400);
        apple.setAlpha((float)0.1);
        apple.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(700);

        hand.setTranslationX(1400);
        hand.setAlpha((float)0.1);
        hand.animate().translationX(0).alpha((float)1.0).setDuration(700).setStartDelay(800);
    }

}