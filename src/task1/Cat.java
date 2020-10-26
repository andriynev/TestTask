package task1;

public class Cat extends Animal {

    public Cat(AnimalType type) {
        super(type);
    }

    @Override
    public void makeSound() {
        System.out.println("Animal Sound: Meow");
    }
}
