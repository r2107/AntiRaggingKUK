package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Zone1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone1);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Chief Warden (Boys)", "7082113081"));
        androidFlavors.add(new Committeedetails("Deputy CSO for Boys Hostel Zone", "7082113090"));
        androidFlavors.add(new Committeedetails("Warden (Partap Bhawan)", "7082113089"));
        androidFlavors.add(new Committeedetails("Warden (Narhari Bhawan)", "7082113100"));
        androidFlavors.add(new Committeedetails("Warden (Harsh Bhawan)", "7082113096"));
        androidFlavors.add(new Committeedetails("Warden (Arjun Bhawan)", "7082113095"));
        androidFlavors.add(new Committeedetails("Warden (Bhim Bhawan)", "7082113098"));
        androidFlavors.add(new Committeedetails("Warden (Tagore Bhawan)", "7082113099"));
        androidFlavors.add(new Committeedetails("Warden (Ambedkar Bhawan)", "7082113088"));
        androidFlavors.add(new Committeedetails("Warden (Ch. Devi Lal Bhawan)", "7082113097"));
        androidFlavors.add(new Committeedetails("Warden (International Hostel)", "9728851400"));
        androidFlavors.add(new Committeedetails("Warden (Ch. Ranbir Singh Bhawan)", "9813919922"));
        androidFlavors.add(new Committeedetails("Warden (Swami Vivekanand Bhawan)", "7082113090"));
        androidFlavors.add(new Committeedetails("Warden (Shaheed Bhagat Singh Bhawan)", "7082113132"));
        androidFlavors.add(new Committeedetails("One Student Representative from each Hostel to be selected by the concerned Warden of the Hostel", ""));


        CommitteeAdapter flavorAdapter1 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.zone1listview);
        listView.setAdapter(flavorAdapter1);
    }
}
