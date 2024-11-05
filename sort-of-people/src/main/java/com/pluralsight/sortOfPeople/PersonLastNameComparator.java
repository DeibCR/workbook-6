package com.pluralsight.sortOfPeople;

import java.util.Comparator;

public class PersonLastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        String p1Name=p1.getLastName();
        String p2Name= p2.getLastName();
        return p1Name.compareToIgnoreCase(p2Name);
    }
}
