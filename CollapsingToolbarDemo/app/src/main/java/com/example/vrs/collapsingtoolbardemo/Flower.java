package com.example.vrs.collapsingtoolbardemo;

/**
 * Created by vrs on 7/10/15.
 */
public class Flower {

    String name;
    String value;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public Flower(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
