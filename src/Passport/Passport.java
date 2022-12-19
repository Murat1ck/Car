package Passport;

import java.time.LocalDate;

public class Passport {
    private String number;
    private String name;
    private String surName;
    private String patrName;
    private LocalDate birthday;

    public Passport(String number, String name, String surName, String patrName, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.patrName = patrName;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatrName() {
        return patrName;
    }

    public void setPatrName(String patrName) {
        this.patrName = patrName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patrName='" + patrName + '\'' +
                ", birthday=" + birthday +
                '}';
    }


}
