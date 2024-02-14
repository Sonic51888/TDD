package ru.netology;

import java.util.Objects;

public class PhoneBook {
   private String name ;
    private long phoneNumber;



    public int add(String name, long phoneNumber) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return phoneNumber == phoneBook.phoneNumber && Objects.equals(name, phoneBook.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
