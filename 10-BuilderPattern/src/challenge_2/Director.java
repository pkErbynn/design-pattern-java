package challenge_2;

public class Director {
    IMealBuilder myBuilder;

    public void construct(IMealBuilder builder){
        this.myBuilder = builder;
        this.myBuilder.buildBurger();
        this.myBuilder.buildDrink();
    }
}
