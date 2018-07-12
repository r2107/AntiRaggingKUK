package com.anc.anti_raggingkuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class AboutDev extends AppCompatActivity {

    WebView wbcse1,wbcse2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dev);
        LinearLayout l1= findViewById(R.id.mk1);
        //LinearLayout l2= findViewById(R.id.mk2);
        LinearLayout l3= findViewById(R.id.rh1);
        //LinearLayout l4= findViewById(R.id.rh2);
        LinearLayout l5= findViewById(R.id.mk3);
        LinearLayout l6= findViewById(R.id.rh3);

        //this.wbcse1 = findViewById(R.id.wbcse);
        this.wbcse2 = findViewById(R.id.wbcse1);
        // wbece2.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        //this.wbcse1.loadData(("<html><body ><p align=\"justify\">" + getString(R.string.cse1)) + "</p></body></html>", "text/html", "utf-8");
        this.wbcse2.loadData(("<html><body ><p align=\"justify\">" + getString(R.string.cse2)) + "</p></body></html>", "text/html", "utf-8");


        l3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String instaProfileUrl = "https://www.instagram.com/lather_rahul/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("instag://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }

            }

        });
        /*l2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String twPageUrl = "https://www.twitter.com/mksharma34?s=08";

                try {
                    getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("tw://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }
            }

        });*/
        l1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String instaProfileUrl = "https://www.instagram.com/eccentric_challenger/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("instag://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }

            }

        });
        /*l4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String twPageUrl = "https://www.twitter.com/AmgryNrd?s=08";

                try {
                    getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("tw://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }

            }

        });*/
        l5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                String twPageUrl = "https://www.linkedin.com/in/mohit-sharma-863025146";

                try {
                    getPackageManager().getPackageInfo("com.linkedin.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("tw://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }

            }

        });
        l6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String twPageUrl = "https://www.linkedin.com/in/rahul-lather-3a2927161";

                try {
                    getPackageManager().getPackageInfo("com.linkedin.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("tw://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }
            }

        });
    }
}
