package com.yanes.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by claud on 4/5/2018.
 */

public class DBDataSource {
    private SQLiteDatabase database;
    private MySQLiteHelper databaseHelper;

    public DBDataSource(Context context){
        databaseHelper = new MySQLiteHelper(context);
    }

    public void open(){
        database = databaseHelper.getReadableDatabase();
    }

    public void close(){
        database.close();
    }

    public List <Person> getAllPeople(){
        List<Person> people = new ArrayList<>();

        String[] columnNames = MySQLiteHelper.PersonColum.names();

        // select person_id, last_name, first_name, age
        //from Person
        //order by last_name

        Cursor cursor = database.query(
                MySQLiteHelper.PERSON_TABLE,
                columnNames,
                null,null,null,null,
                MySQLiteHelper.PersonColum.last_name.toString() //ordena por last name
        );
        cursor.moveToFirst();
        while (! cursor.isAfterLast()) {
            Person person = cursorToPerson(cursor);
            people.add(person);
            cursor.moveToNext();
        }
        cursor.close();

        return people;
    }

    private Person cursorToPerson(Cursor cursor){
        Person p = new Person();

        int personId = cursor.getInt(MySQLiteHelper.PersonColum.person_id.ordinal());
        p.setPersonId(personId);

        String  lastName = cursor.getString(MySQLiteHelper.PersonColum.last_name.ordinal());
        p.setLast(lastName);

        String  firstName = cursor.getString(MySQLiteHelper.PersonColum.first_name.ordinal());
        p.setFirst(firstName);

        int age = cursor.getInt(MySQLiteHelper.PersonColum.age.ordinal());
        p.setAge(age);

        return p;

    }
}
