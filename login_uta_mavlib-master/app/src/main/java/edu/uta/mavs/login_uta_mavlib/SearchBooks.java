package edu.uta.mavs.login_uta_mavlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_books);

        ListView lsitView = (ListView) findViewById(R.id.list_view_search_books);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Software Engineering");
        arrayList.add("Theory of Computation");
        arrayList.add("Design Patterns");
        arrayList.add("Artificial Intelligence");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        lsitView.setAdapter(arrayAdapter);
    }
}
