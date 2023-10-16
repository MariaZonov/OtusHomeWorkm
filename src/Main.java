import animals.Animal;
import animals.*;
import data.ColorData;
import data.CommandsData;
import data.Fabrica;
import data.AnimalData;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.println("Введите команду ADD/LIST/EXIT");


            String commandInput = (s.next().trim().toUpperCase());
            boolean isCommandExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandInput)) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.printf("Команда %s не найдена", commandInput);
                continue;
            }
            CommandsData commandsData = CommandsData.valueOf(commandInput);

            switch (commandsData) {
                case ADD:
                    System.out.println("Введите животное cat/dog/duck");
                    String type = s.next().trim().toLowerCase();
                    if (!type.equals("cat") && !type.equals("dog") && !type.equals("duck")) {
                        System.out.println("Неверный тип животного!");
                        break;

                    }
                    System.out.println("Введите имя животного");
                    String name = s.next().trim();

                    System.out.println("Введите возраст животного");
                    int age = 0;
                    try {
                        age = Integer.parseInt(s.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Неверно указан возраст");
                        continue;
                    }
                    System.out.println("Введите вес животного");
                    int weight = 0;
                    try {
                        weight = Integer.parseInt(s.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Неверно указан вес");
                        continue;
                    }
                    System.out.println("Введите цвет животного");
                    String color = s.next().trim();

                    AnimalData data=AnimalData.valueOf(type);
                    Animal el = new Fabrica(name, age, weight, color).created(data);
                    animals.add(el);
                    el.say();

                    break;

                case LIST:
                    for (Animal animal : animals) {
                        System.out.println(animal.toString());
                    }

                    break;

                case EXIT:
                    s.close();
                    System.out.println("Выход из программы");
                    System.exit(0);

            }
        }
    }
}