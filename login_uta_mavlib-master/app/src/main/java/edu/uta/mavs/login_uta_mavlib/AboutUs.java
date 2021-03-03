package edu.uta.mavs.login_uta_mavlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ListView lsitView = (ListView) findViewById(R.id.listview_about);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Ajinkya");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        lsitView.setAdapter(arrayAdapter);
    }
}
