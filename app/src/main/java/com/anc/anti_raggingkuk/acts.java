package com.anc.anti_raggingkuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class acts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acts);
        ArrayList<Committeedetails1> androidFlavors = new ArrayList<Committeedetails1>();
        androidFlavors.add(new Committeedetails1("Any Conduct by any student whether by words spoken or written or by an act which has the effect of teasing, treating or handling with rudeness or any other student.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Indulging in rowdy or indisciplined activities by any student which causes or is likely to cause annoyance, hardship, physical or psychological harm or to raise fear or apprehension thereof in any fresher or any other student.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Asking any student to do any act which such student will not in the ordinary course do and which has the effect of causing or generating a sense of shame, or torment or embarrassment so as to adversely affect the physique or psyche of such fresher or any other student.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act by a senior student that prevents, disrupts the regular academic activity of any other student or a fresher.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Exploiting the services of a fresher or any other student for completing the academic tasks assigned to an individual or a group of students.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act of financial extortion or forceful expenditure burden put on a fresher or any other student by students.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act of physical abuse  including all variants of it : sexual abuse, homosexual assaults, stripping, forcing obscene and lewd acts, gestures, causing bodily harm or any other danger to health or person.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act or abuse by spoken words, e-mails, post, public insults, which would also include deriving perverted pleasure, vicarious or sadistic thrill from actively or passively participating in the discomfiture to fresher or any other student.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act that affects the mental health and self-confidence of a fresher or any other student with or without an intent to derive a sadistic pleasure or showing off power, authority or superiority by a student over any fresher or any other student.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Any act of physical or mental abuse(including bullying and exclusion) targeted at another student (fresher or otherwise) on the ground of colour, race, religion, origins, linguistic identity, place of birth, place of residence or economic background.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("All the senior students are advised to guide and treat junior students affectionately.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Junior students may contact their Chairperson or other University functionaries like Proctor, Dean Students Welfare, Chief Warden, Wardens or Chief Security Officer for help and guidance.", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Warden (Swami Vivekanand Bhawan)", R.drawable.dots));
        androidFlavors.add(new Committeedetails1("Warden (Shaheed Bhagat Singh Bhawan)", R.drawable.dots));


        ImageAdapter flavorAdapter1 = new ImageAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.actslistview);
        listView.setAdapter(flavorAdapter1);
    }
}
