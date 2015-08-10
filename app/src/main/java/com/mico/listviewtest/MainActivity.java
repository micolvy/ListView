package com.mico.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.mico.listviewtest.adapter.MyListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_item);

        setDates();

        listView.setAdapter(new MyListAdapter(MainActivity.this,items));

    }

    private void setDates() {

        for (int i = 0; i < 100; i++) {

            String s = "" + i;
            items.add(s);
        }

    }

}
