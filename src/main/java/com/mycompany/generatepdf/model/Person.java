/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generatepdf.model;

/**
 *
 * @author Erwin
 */
public class Person {

    String name;
    String surname;
    String sex;
    String street;
    String town;
    String phone;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", sex=" + sex + ", street=" + street + ", town=" + town + ", phone=" + phone + '}';
    }

    public Person(String name, String surname, String sex, String street, String town, String phone) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.street = street;
        this.town = town;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
