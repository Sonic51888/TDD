package ru.netology;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    public static Set<PhoneBookList> phoneBookSet = new TreeSet<>(Comparator.comparing(PhoneBookList::getName)
            .thenComparing(PhoneBookList::getPhoneNumber));



    public int add(String name, long phoneNumber) {
        phoneBookSet.add(new PhoneBookList(name,phoneNumber));
        return phoneBookSet.size();
    }
}
