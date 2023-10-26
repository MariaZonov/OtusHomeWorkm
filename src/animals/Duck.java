package animals;


public class Duck extends Animal implements Flying {
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Кря");

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

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}