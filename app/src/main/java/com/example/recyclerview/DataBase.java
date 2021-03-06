package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<PeopleItem> people = new ArrayList<>();

    public DataBase() {
        people.add(new PeopleItem(1, "", "Harold Rhoads", 2302, 30));
        people.add(new PeopleItem(2, "", "Phylis Woods", 2127, 30));
        people.add(new PeopleItem(3, "", "Frank Guy", 1992, 28));
        people.add(new PeopleItem(4, "", "Corinne Gregg", 1942, 28));
        people.add(new PeopleItem(5, "", "Alan Foland", 1864, 26));
        people.add(new PeopleItem(6, "", "Arthur Rice", 1856, 26));
        people.add(new PeopleItem(7, "", "Shannon Fitzpatrick", 1832, 26));
        people.add(new PeopleItem(8, "", "Beverly Scott", 1791, 25));
        people.add(new PeopleItem(9, "", "Sandra Pendleton", 1782, 25));
        people.add(new PeopleItem(10, "", "Michael Nichols", 1721, 25));
    }

    public List<PeopleItem> getPeople() {
        return people;
    }
}
