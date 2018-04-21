package com.yanes.database;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by claud on 4/19/2018.
 */

public class Info extends ListActivity {
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

        List<Final> people = dbDataSource.getAll();

        ArrayAdapter<Final> adapter = new ArrayAdapter<Final>(getApplicationContext(),android.R.layout.simple_list_item_1, people);

setListAdapter(adapter);
    }
}
