package challenge_2;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}
