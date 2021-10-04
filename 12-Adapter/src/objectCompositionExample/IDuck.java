package objectCompositionExample;

// Duck interface that is going to be adopted by another class
// Meaning, another class is going to behave like a Duck
// Thus, this is the Adaptee class
public interface IDuck {
    public void quack();
    public void fly();
}

class GhanaianDuck implements IDuck {

    @Override
    public void quack() {
        System.out.println("Gh duck: quack quack");
    }

    @Override
    public void fly() {
        System.out.println("Gh duck: flying... ");
    }
}