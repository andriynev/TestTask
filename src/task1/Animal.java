package task1;

public abstract class Animal {
    private AnimalType type;

    public Animal(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }

    public abstract void makeSound();
}
