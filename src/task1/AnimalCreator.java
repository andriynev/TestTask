package task1;

public class AnimalCreator {

    public static Animal createAnimal(AnimalType type) {
        Animal animal = null;

        switch (type) {

            case DOG:
                animal = new Dog(type);
                break;

            case CAT:
                animal = new Cat(type);
                break;
        }

        return animal;
    }
}
