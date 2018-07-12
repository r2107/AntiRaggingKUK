package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Zone3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone3);
        ArrayList<Committeedetails> androidFlavors = new ArrayList<Committeedetails>();
        androidFlavors.add(new Committeedetails("Deputy Proctor", "9416214826"));
        androidFlavors.add(new Committeedetails("Officer Incharge, Security", "7082113044"));
        androidFlavors.add(new Committeedetails("Director of UIET, Inst.of Law, Inst.of Pharmacy, IMC MT, Inst.of Management will depute two senior teachers from each Inst. and will inimate to the Proctor", "9416280555, 9416129222, 9991302121, 9896174084, 9466174047"));
        androidFlavors.add(new Committeedetails("Principal, University College and Univ. Clg. of Education will depute two teachers from each college and will inimate to the Proctor", "7082113047, 708211308"));
        androidFlavors.add(new Committeedetails("Supervisor, Security", "7082113065"));
        androidFlavors.add(new Committeedetails("Police Officials, Officer Incharge, Security will take measure for seeking help from the District Admin.", ""));
        androidFlavors.add(new Committeedetails("Four Students Representatives(two fresher and two seniors) to be nominated by the Dean Student's Welfare", ""));


        CommitteeAdapter flavorAdapter2 = new CommitteeAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.zone3listview);
        listView.setAdapter(flavorAdapter2);
    }
}
