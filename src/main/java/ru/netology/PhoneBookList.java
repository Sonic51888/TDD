package ru.netology;

import java.util.Objects;

public class PhoneBookList {
    private String name;
    private long phoneNumber;

    public PhoneBookList(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBookList phoneBookList = (PhoneBookList) o;
        return phoneNumber == phoneBookList.phoneNumber && Objects.equals(name, phoneBookList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneBookList{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
