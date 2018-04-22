package com.yanes.database;

import android.provider.ContactsContract;

/**
 * Created by claud on 4/20/2018.
 */

public class Final {
    private String State;
    private String Type;
    private String Name;
    private String Description;
    private int Imagen;

    Final(){}
    public Final(String state, String type, String name, String description, int imagen) {
        Name = name;
        State = state;
        Type = type;
        Description = description;
        Imagen = imagen;
    }





    public String getState() {
        return State;
    }

    public String getType() {
        return Type;
    }
    public String getName() { return Name; }

    public String getDescription() {
        return Description;
    }
    public int getImagen() {
        return Imagen;
    }
    public void setState(String state) {
        State = state;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setName(String name) { Name = name;  }

    public void setDescription(String description) {
        Description = description;
    }
    public void setImagen(int imagen) {
        Imagen = imagen;
    }



    @Override
    public String toString() {
        return Name;
    }

}
