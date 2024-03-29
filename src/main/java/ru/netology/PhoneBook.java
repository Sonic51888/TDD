package ru.netology;

import java.util.Comparator;
import java.util.Iterator;
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
        Iterator<PhoneBookList> itr = phoneBookSet.iterator();
        PhoneBookList phoneBookList;
        while (itr.hasNext()) {
            phoneBookList = itr.next();
            if (phoneBookList.getPhoneNumber() == phoneNumber) {
                return phoneBookList.getName();
            }
        }
        return "Абонент с номером " + phoneNumber + " не существует.\n";
    }

    public long findByName(String name) {
        Iterator<PhoneBookList> itr = phoneBookSet.iterator();
        PhoneBookList phoneBookList;
        while (itr.hasNext()) {
            phoneBookList = itr.next();
            if (phoneBookList.getName().equals(name)) {
                return phoneBookList.getPhoneNumber();
            }
        }
        System.out.println("Абонент с именем " + name + " не существует.\n");
        return Long.MIN_VALUE;
    }
    public Set <PhoneBookList> printAllNames(){
        return phoneBookSet;
    }
}
