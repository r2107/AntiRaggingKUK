package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Zone4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone4);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Deputy Proctor", "9416214826"));
        androidFlavors.add(new Committeedetails("Officer Incharge, Security", "7082113044"));
        androidFlavors.add(new Committeedetails("Chairpersons, Dept.of Instrumentation, School of Management and Commerce will nominate one teacher to the Anti-Ragging Squad and same to the Proctor", "9466045776, 9416782192, 9416322106"));
        androidFlavors.add(new Committeedetails("Dean, Faculty of Sciences, Social Sciences, Life Sciences, Arts and Languages, Indic Studies will nominate one teacher of faculty to the Anti-Ragging Squad and same to the Proctor", "9416038561, 9991140540, 9896045695, 9416448939, 9416570371"));
        androidFlavors.add(new Committeedetails("Four Students Representatives(two fresher and two seniors) to be nominated by the Dean Student's Welfare", ""));
        androidFlavors.add(new Committeedetails("Police Officials, Officer Incharge, Security will take measure for seeking help from the District Admin.", ""));


        CommitteeAdapter flavorAdapter2 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.zone3listview);
        listView.setAdapter(flavorAdapter2);
    }
}
