package ru.netology;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Саша", 80000000000L);
        System.out.println(phoneBook.findByNumber(80000000000l));
        System.out.println(phoneBook.findByNumber(8000l));


    }
}