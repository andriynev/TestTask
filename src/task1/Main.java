package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Animal Name: ");
        Scanner in = new Scanner(System.in);
        String inputType = in.nextLine();

        AnimalType type;
        try {
            type = AnimalType.getTypeByStr(inputType);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Please, provide one of values: " + AnimalType.DOG.toString() + " " + AnimalType.CAT.toString());
            return;
        }

        Animal animal = AnimalCreator.createAnimal(type);
        animal.makeSound();

    }
}
