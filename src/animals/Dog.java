package animals;


public class Dog extends Animal {
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Гав");

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