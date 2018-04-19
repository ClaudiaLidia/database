package com.yanes.database;

/**
 * Created by claud on 4/5/2018.
 */

public class Person {
    private int personId;
    private String first;
    private String last;
    private int age;

    Person(){}

    public Person(String first, String last, int age) {
        this.personId =-1;
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return first + " " + last + "(" + age +")";
    }
}
