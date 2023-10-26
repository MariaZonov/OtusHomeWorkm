package animals;

public class Cat extends Animal {
    public Cat(String name, int age, int weight, String color) {

        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Мяу");

    }

    @Override
    public void go() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }
}