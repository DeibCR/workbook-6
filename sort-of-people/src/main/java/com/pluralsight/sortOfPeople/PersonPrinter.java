package com.pluralsight.sortOfPeople;

import java.util.function.Consumer;

public class PersonPrinter implements Consumer<Person> {
    @Override
    public void accept(Person person) {
        System.out.println(person);
    }
}
