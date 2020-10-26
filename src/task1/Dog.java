package task1;

public class Dog extends Animal {

    public Dog(AnimalType type) {
        super(type);
    }

    @Override
    public void makeSound() {
        System.out.println("Animal Sound: Woof");
    }
}
