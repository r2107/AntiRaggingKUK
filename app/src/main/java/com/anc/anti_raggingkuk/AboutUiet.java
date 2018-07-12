package com.anc.anti_raggingkuk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AboutUiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_uiet);
        LinearLayout fb = findViewById(R.id.ufb1);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fbPageUrl = "https://www.facebook.com/uietkuk/";

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
        LinearLayout gm = findViewById(R.id.gm1);
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","uietkuk@mailinator.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
        LinearLayout cs = findViewById(R.id.cs1);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutUiet.this, AboutDev.class);
               startActivity(i);
            }
        });
    }
}
