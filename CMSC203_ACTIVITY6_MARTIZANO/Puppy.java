package CMSC203_ACTIVITY6_MARTIZANO;

import java.util.Scanner;

public class Puppy {
    String name;
    String breed;
    int age;
    String color;

    public Puppy(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String gerBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return ("Hi my name is: " + this.getName()
                + "\nMy breed is: " + this.gerBreed()
                + "\nMy age is: " + this.getAge()
                + "\nMy color is: " + this.getColor());
    }

    public static void main(String[] args) {
        Puppy hanzel = new Puppy("hanzel", "shihtzu", 2, "white");
        System.out.println(hanzel.toString());
    }
}