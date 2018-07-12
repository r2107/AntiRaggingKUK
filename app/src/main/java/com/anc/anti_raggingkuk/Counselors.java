package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Counselors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselors);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Dr. Hardeep Lal Joshi, Dept. of Psychology", "9416785865"));
        androidFlavors.add(new Committeedetails("Dr. Rakesh Pal Sharma, MD (Psychiatric), Aggarwal Hospital, KKR", "9812434648"));
        androidFlavors.add(new Committeedetails("Dr. (Mrs.) Ranjana, Dept. of Psychology", "9466064490"));
        androidFlavors.add(new Committeedetails("Nodal Officer for all teaching Departments, Inst. : Proctor and Univ. maintained colleges", ""));
        androidFlavors.add(new Committeedetails("Nodal Officer for affiliated colleges : Dean of Colleges", ""));

        CommitteeAdapter flavorAdapter2 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.counlistview);
        listView.setAdapter(flavorAdapter2);
    }
}
