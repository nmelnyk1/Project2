package JavaRushGenerics;

public class Main {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>();
        Cat murzik = new Cat();
        catBox.getSlots().add(murzik);

        Box<Dog> dogBox = new Box<>();
        Dog barsik = new Dog();
        dogBox.getSlots().add(barsik);
    }
}
