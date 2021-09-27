package challenge;

public interface IAnimal {
    void speak();
}

class Duck implements IAnimal {
    @Override
    public void speak(){
        System.out.println("Duck says quark quark...");
    }
}

class Cat implements IAnimal {
    @Override
    public void speak(){
        System.out.println("Cat says meow meow...");
    }
}