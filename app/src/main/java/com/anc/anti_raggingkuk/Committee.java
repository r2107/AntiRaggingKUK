package com.anc.anti_raggingkuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Committee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Proctor", "9466522694"));
        androidFlavors.add(new Committeedetails("Dean of Colleges", "9466066674"));
        androidFlavors.add(new Committeedetails("Dean Students Welfare", "7082113109"));
        androidFlavors.add(new Committeedetails("Deputy Proctor", "9416214826"));
        androidFlavors.add(new Committeedetails("Chief Warden (Boys)", "7082113081"));
        androidFlavors.add(new Committeedetails("Chief Warden (Girls)", "9896343783"));
        androidFlavors.add(new Committeedetails("Office Incharge, Security(CSO)", "7082113044"));
        androidFlavors.add(new Committeedetails("Director, Public Relations", "7082113123"));
        androidFlavors.add(new Committeedetails("President,KUTA", "9416088861"));
        androidFlavors.add(new Committeedetails("President,KUNETA", "9467170000"));
        androidFlavors.add(new Committeedetails("Director, Women Studies Research Centre", "9996119909"));
        androidFlavors.add(new Committeedetails("SDM, Thanesar(Nominee of DC, KKR)", "9034433168"));
        androidFlavors.add(new Committeedetails("DSP, Pehowa (Nominee of SP, KKR)", "7056700104"));
        androidFlavors.add(new Committeedetails("Sh. Vijay Shabharwal, Local Media Representative", "9896244822"));
        androidFlavors.add(new Committeedetails("Mr. Vinod Jindal, Local Media Representative", "9896334769"));
        androidFlavors.add(new Committeedetails("Director, Dr. B.R. Ambedkar Studies Centre", "9416911668"));


        CommitteeAdapter flavorAdapter = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.committeelistview);
        listView.setAdapter(flavorAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Get the selected item text from ListView
//
//                //Log.v("Committee","yrweuhwe wrhgdkfgre erthjdf  rehj  gr ehj ty");
//                TextView v = (TextView) view.findViewById(R.id.cnumber);
//                Intent intent = new Intent(Committee.this, Main2Activity.class);
//                intent.putExtra("number",v.getText());
//                startActivity(intent);
//            }
//        });
    }
}
