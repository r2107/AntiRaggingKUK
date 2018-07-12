package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MonitoringCell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring_cell);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Registrar", ""));
        androidFlavors.add(new Committeedetails("Dean, Academic Affairs", "7082113003"));
        androidFlavors.add(new Committeedetails("Proctor", "9466522694"));
        androidFlavors.add(new Committeedetails("Dean of Colleges", "7082113042"));
        androidFlavors.add(new Committeedetails("Dean Student's Welfare", "7082113109"));

        CommitteeAdapter flavorAdapter2 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.monitorlistview);
        listView.setAdapter(flavorAdapter2);
    }
}
