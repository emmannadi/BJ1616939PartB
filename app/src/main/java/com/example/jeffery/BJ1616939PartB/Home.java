package com.example.jeffery.BJ1616939PartB;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by JEFFERY on 4/30/2016.
 */
public class Home extends Activity {

    ListView listView;
    int [] doctor_image_resource = {R.drawable.image1,R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6};

    String [] doctor_title;
    String[]doctor_rating;
    DoctorAdpater adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView userView = (TextView) findViewById(R.id.users);
        userView.setText(getIntent().getExtras().getString("userName"));

        listView = (ListView) findViewById(R.id.listView);
        doctor_rating = getResources().getStringArray(R.array.doctor_ratings);
        doctor_title = getResources().getStringArray(R.array.doctor_names);

        int i = 0;
        adapter = new DoctorAdpater(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for(String titles:doctor_title)
        {
            DoctorDataProvider dataProvider = new DoctorDataProvider(doctor_image_resource[i],
                    titles,doctor_rating[i]);
            adapter.add(dataProvider);
            i++;
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // toast = Toast.makeText(getApplicationContext(), "You Selected " + doctor_title[position], Toast.LENGTH_SHORT);
                //toast.show();
                switch (position){
                    case 0:
                        Intent intent = new Intent(Home.this, Kpj_hos.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Home.this, gle_hos.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Home.this, Opt.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Home.this, pantai.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Home.this, prin.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Home.this, sun.class);
                        startActivity(intent5);
                        break;
                }

            }
        });

    }

    public void setSupportActionBar(Toolbar toolbar) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
