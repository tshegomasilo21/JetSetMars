package com.example.user.jetsetmars;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView listMars;
    // for Mars
    String[] itemname ={
            "Titanium",
            "Aluminium"
    };

    String[] firstLine={
            "Melting Point = 1668 c",
            "Melting Point = 660,3 c",


    };
    String[] secondLine ={
            "Density = 4.5g/cm3",
            "Density = 2,7g/cm3",

    };
    String[] thirdLine ={
            "Yield Strength = 1480 mpa",
            "Yield Strength = 660.39 mpa",

    };

    //for earth values
    String[] itemnameEarth ={
            "Titanium",
            "Aluminium"
    };

    String[] firstLineEarth={
            "Melting Point = 1668 c",
            "Melting Point = 660,3 c",

    };
    String[] secondLineEarth ={
            "Density = 4.5g/cm3",
            "Density = 2,7g/cm3",

    };
    String[] thirdLineEarth ={
            "Yield Strength = 1480 mpa",
            "Yield Strength = 660.39 mpa",
    };
    //for Moon values

    String[] itemnameMoon ={
            "Platinum",
            "Titanium",
            "Aluminium",
    };

    String[] firstLineMoon={
            "Melting Point = 1668 c",
            "Melting Point = 660,3 c",
            "Melting Point = 160,3 c",

    };
    String[] secondLineMoon ={
            "Density = 4.5g/cm3",
            "Density = 2,7g/cm3",
            "Density = 4,7g/cm3",
    };
    String[] thirdLineMoon ={
            "Yield Strength = 1480 mpa",
            "Yield Strength = 660.39 mpa",
            "Yield Strength = 1180 mpa",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "http://www.eolss.net/sample-chapters/c05/e6-36-05-03.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        int value = getIntent().getExtras().getInt("bucketno");

        if(value == 1)
        {
            CustomListAdapter adapter=new CustomListAdapter(this, itemname, firstLine, secondLine,thirdLine);
            listMars = (ListView)findViewById(R.id.listview);
            listMars.setAdapter(adapter);
        }
        else if (value == 2)
        {
            CustomListAdapter adapter=new CustomListAdapter(this, itemnameMoon, firstLineMoon, secondLineMoon,thirdLineMoon);
            listMars = (ListView)findViewById(R.id.listview);
            listMars.setAdapter(adapter);

        }else if(value == 3)
        {
            CustomListAdapter adapter=new CustomListAdapter(this, itemnameEarth, firstLineEarth, secondLineEarth,thirdLineEarth);
            listMars = (ListView)findViewById(R.id.listview);
            listMars.setAdapter(adapter);
        }
    }

}
