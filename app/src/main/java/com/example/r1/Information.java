package com.example.r1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    String osValue;
    TextView os_text_information,logo_text_information;
    ImageView logo_image_information;
    androidx.cardview.widget.CardView title_card_information,info_card;
    int infoValue;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        os_text_information = findViewById(R.id.os_text_information);
        logo_text_information = findViewById(R.id.logo_text_information);
        logo_image_information = findViewById(R.id.logo_image_information);
        title_card_information = findViewById(R.id.title_card_information);

        info_card = findViewById(R.id.info_card);
        webView = findViewById(R.id.webView);

        osValue = getIntent().getStringExtra("osValue");
        os_text_information.setText(osValue);

        animationRTL();

        infoValue = getIntent().getIntExtra("infoValue",0);

        if(infoValue == 1)
            webView.loadUrl("file:///android_asset/install.html");
        if(infoValue == 2)
            webView.loadUrl("file:///android_asset/play.html");
        if(infoValue == 3)
            webView.loadUrl("file:///android_asset/about.html");
        if(infoValue == 4)
            webView.loadUrl("file:///android_asset/tips.html");
        if(infoValue == 5)
            webView.loadUrl("file:///android_asset/star.html");
        if(infoValue == 6)
            webView.loadUrl("file:///android_asset/strategy.html");
        if(infoValue == 7)
            webView.loadUrl("file:///android_asset/privacy.html");

    }

    @Override
    protected void onResume() {
        super.onResume();
        animationRTL();
    }

    public void animationRTL() {
        os_text_information = findViewById(R.id.os_text_information);
        logo_text_information = findViewById(R.id.logo_text_information);
        logo_image_information = findViewById(R.id.logo_image_information);
        title_card_information = findViewById(R.id.title_card_information);
        info_card = findViewById(R.id.info_card);
        webView = findViewById(R.id.webView);

        title_card_information.setTranslationX(1400);
        title_card_information.setAlpha((float)0.1);
        title_card_information.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(0);

        logo_image_information.setTranslationX(1400);
        logo_image_information.setAlpha((float)0.1);
        logo_image_information.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(200);

        logo_text_information.setTranslationX(1400);
        logo_text_information.setAlpha((float)0.1);
        logo_text_information.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        os_text_information.setTranslationX(1400);
        os_text_information.setAlpha((float)0.1);
        os_text_information.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(300);

        info_card.setTranslationX(1400);
        info_card.setAlpha((float)0.1);
        info_card.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(400);

        webView.setTranslationX(1400);
        webView.setAlpha((float)0.1);
        webView.animate().translationX(0).alpha((float)1.0).setDuration(1000).setStartDelay(500);
    }

}