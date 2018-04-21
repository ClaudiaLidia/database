package com.yanes.database;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by claud on 4/20/2018.
 */

public class States extends Activity implements AdapterView.OnItemClickListener{
    public static String State;

   static final String[] STATES={
            "Tn","As","sss","CA",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.states);

        ListView lv= (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, STATES
        );
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String name= (String) adapterView.getItemAtPosition(i);
        State = name;
        Intent intent=new Intent(this,type.class);
        startActivity(intent);
    }
}
