package com.anc.anti_raggingkuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class AboutKuk extends AppCompatActivity {
    WebView wbku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_kuk);
        LinearLayout l = findViewById(R.id.kuk);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fbPageUrl = "https://www.facebook.com/KUKHaryana/?ref=br_rs";

                try {
                    getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1490772567815224" ));
                    startActivity(fb);
                } catch (Exception e) {
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse(fbPageUrl));
                    startActivity(fb);
                }

            }
        });
        this.wbku = findViewById(R.id.wbkuk);
        this.wbku.loadData(("<html><body ><p align=\"justify\">" + getString(R.string.ku)) + "</p></body></html>", "text/html", "utf-8");

    }
}
