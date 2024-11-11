package com.epam.training.oop.zoo.animals;

import com.epam.training.oop.zoo.Consumption;

public class Hippo extends Animal {
    public Hippo(String name) {
        super(name, Consumption.HERBIVORES);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the " + getType() + " barks");
    }
}
