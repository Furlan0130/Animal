package model;

import enums.Habitat;

public abstract class Animal{
    private String name;
    private int age;
    private int speed;
    private double weight;
    private Habitat habitat;
    private boolean iswild;
    

    public Animal(String name, int age, int speed, double weight, Habitat habitat, boolean iswild) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.habitat = habitat;
        this.iswild = iswild;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public abstract void makeSound();
}