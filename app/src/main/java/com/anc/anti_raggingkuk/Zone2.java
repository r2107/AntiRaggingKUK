package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Zone2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone2);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Chief Warden (Girls)", "9896343783"));
        androidFlavors.add(new Committeedetails("Deputy Chief Warden", "7082113108"));
        androidFlavors.add(new Committeedetails("Deputy CSO for Girls Hostel Zone", "7082113105"));
        androidFlavors.add(new Committeedetails("Warden (Bharti Bhawan)", "9996088190"));
        androidFlavors.add(new Committeedetails("Warden (Meera Bhawan)", "7082113137"));
        androidFlavors.add(new Committeedetails("Warden (Kasturba Bhawan)", "7082113104"));
        androidFlavors.add(new Committeedetails("Warden (Saraswati Bhawan)", "7082113106"));
        androidFlavors.add(new Committeedetails("Warden (Gargi Bhawan)", "9896065661"));
        androidFlavors.add(new Committeedetails("Warden (Subhadra Bhawan)", "7082113101"));
        androidFlavors.add(new Committeedetails("Warden (Ahilya Bhawan)", "7082113102"));
        androidFlavors.add(new Committeedetails("Warden (Ganga Bhawan)", "7082113102"));
        androidFlavors.add(new Committeedetails("Warden (Uttra Bhawan)", "7082113107"));
        androidFlavors.add(new Committeedetails("Warden (Devyani Bhawan)", "7082113103"));
        androidFlavors.add(new Committeedetails("Warden (Kalpana Chawla Bhawan)", "7082113147"));
        androidFlavors.add(new Committeedetails("Warden (Laxmi Bai Bhawan)", "7082113108"));
        androidFlavors.add(new Committeedetails("Warden (Yamuna Bhawan)", "7082113106"));
        androidFlavors.add(new Committeedetails("One Student Representative from each Hostel to be selected by the concerned Warden of the Hostel", ""));


        CommitteeAdapter flavorAdapter2 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.zone2listview);
        listView.setAdapter(flavorAdapter2);
    }
}
