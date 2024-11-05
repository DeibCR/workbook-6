package com.pluralsight.sortOfPeople;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {

    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Judith","Rodriguez", 63));
        myFamily.add(new Person("Cynthia","Villalobos", 37));
        myFamily.add(new Person("Treysi","Villalobos", 23));
        myFamily.add(new Person("Alissa","Sosa", 18));
        myFamily.add(new Person("Yustin","Villalobos", 31));
        myFamily.add(new Person("Samantha","Villalobos", 9));
        myFamily.add(new Person("Thair","Villalobos", 7));
        myFamily.add(new Person("Ailany","Villalobos", 4));
        Collections.sort(myFamily);
        Collections.reverse(myFamily);

        myFamily.forEach(System.out::println);

        Collections.sort(myFamily,new PersonLastNameComparator());
        myFamily.forEach(System.out::println);

        Collections.sort(myFamily,new PersonAgeComparator());
        myFamily.forEach(new PersonPrinter());

        myFamily.sort(new PersonLastNameComparator());
        myFamily.forEach(new PersonPrinter());

    }
}
