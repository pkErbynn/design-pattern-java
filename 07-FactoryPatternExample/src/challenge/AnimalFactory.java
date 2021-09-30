package challenge;

interface IAnimalFactory {  // factory defines an interface for creating objects
    public IAnimal getAnimalType(String animalType) throws Exception;
}

public class AnimalFactory implements IAnimalFactory {
    @Override
    public IAnimal getAnimalType(String animalType) throws Exception {
        switch (animalType){
            case "Duck":
                return new Duck();
            case "Cat":
                return new Cat();
            default:
                throw new Exception("Can't instantiate animal type " + animalType);
        }
    }
}
