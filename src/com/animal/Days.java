package com.animal;

public enum Days {

    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англис тили сабагын окуйм"),
    THURSDAY("practice"),
    WEDNESDAY("Test"),
    FRIDAY("English"),
    SATURDAY("weekend"),
    SUNDAY("sleeping");


     private String lessons;

    Days(String lessons) {
        this.lessons=lessons;

    }

    public String getLessons() {
        return lessons;
    }
}
