package com.example.week1helloworld;

public class Student {

    public String name;
    public int id;

    public Student() {
        name = "";
        id = 0;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String CreateWelecomeMes (){
        return "Welcome New Student " + name + ", Your id is " + id;

    }

}
