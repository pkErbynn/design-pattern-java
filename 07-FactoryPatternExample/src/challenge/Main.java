package challenge;

public class Main {
    public static void main(String[] args) throws Exception {
        IAnimalFactory animalFactory = new AnimalFactory();
        IAnimal cat = animalFactory.getAnimalType("Cat");
        cat.speak();
        IAnimal duck = animalFactory.getAnimalType("Duck");
        duck.speak();
    }
}
