package challenge_2;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        IMealBuilder vegMealBuilder = new VegMealBuilder();
        IMealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("\nTotal Cost: " + vegMeal.getCost());

        // making non veg meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("\n \nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("\nTotal Cost: " + nonVegMeal.getCost());
    }
}
