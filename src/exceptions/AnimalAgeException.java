package exceptions;

public class AnimalAgeException extends Exception{
    public AnimalAgeException(int age) {

        super(String.format("Возраст животного не может быть больше %d", age));
    }
}
