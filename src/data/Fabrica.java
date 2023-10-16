package data;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;

public class Fabrica {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Fabrica(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal created(AnimalData data) {
        switch (data) {
            case cat:
                return new Cat(name, age, weight, color);

            case dog:
                return new Dog(name, age, weight, color);
            case duck:
                return new Duck(name, age, weight, color);
            default:System.out.println("Неверное животное");
        }
        return null;
    }
}

