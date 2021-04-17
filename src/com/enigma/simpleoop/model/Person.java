package com.enigma.simpleoop.model;

public class Person {

    private String fullName;
    private Integer age;
    private String address;

    public Person() {}

    public Person(String fullName, Integer age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nama saya adalah " + fullName + " saya berumur " + age + " dan alamat saya di " + address;
    }
}
