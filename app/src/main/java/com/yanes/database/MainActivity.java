package com.yanes.database;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {
    private DBDataSource dbDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dbDataSource = new DBDataSource(getApplicationContext());

    }

    @Override
    protected void onStart() {
        super.onStart();
        dbDataSource.open();

        List<Person> people = dbDataSource.getAllPeople();

        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(getApplicationContext(),android.R.layout.simple_list_item_1, people);
        setListAdapter(adapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        dbDataSource.close();
    }

}
