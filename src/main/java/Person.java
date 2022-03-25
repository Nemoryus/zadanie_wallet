package main.java;

/**
 * Created by Nemoryus 22.3.2022
x */

public class Person {
    private String name;
    private Integer largestBanknote;
    private Integer smallestBanknote;

    public Person() {
    }

    public Person(String name,  Integer smallestBanknote, Integer largestBanknote) {
        this.name = name;
        this.smallestBanknote = smallestBanknote;
        this.largestBanknote = largestBanknote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLargestBanknote() {
        return largestBanknote;
    }

    public void setLargestBanknote(Integer largestBanknote) {
        this.largestBanknote = largestBanknote;
    }

    public Integer getSmallestBanknote() {
        return smallestBanknote;
    }

    public void setSmallestBanknote(Integer smallestBanknote) {
        this.smallestBanknote = smallestBanknote;
    }



}
