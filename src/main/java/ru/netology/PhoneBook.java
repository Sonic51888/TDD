package ru.netology;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    private Set<PhoneBookList> phoneBookSet = new TreeSet<>(Comparator.comparing(PhoneBookList::getName)
            .thenComparing(PhoneBookList::getPhoneNumber));


    public int add(String name, long phoneNumber) {
        phoneBookSet.add(new PhoneBookList(name, phoneNumber));
        return phoneBookSet.size();
    }

    public String findByNumber(long phoneNumber) {
        return null;
    }

}
