package challenge_2;

abstract class Burger implements IItem {
    public IPacking packing(){
        return new Wrapper();
    }

    public abstract float price();
}