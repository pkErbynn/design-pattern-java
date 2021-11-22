package challenge_2;

public class Client {
    public static void main(String[] args) {

        // create topic subject
        Subject cricket = new CricketData();

        // create display observers
        Observer averageScore = new AverageScoreLEDDisplay();
        Observer currentScore = new CurrentScoreDisplay();

        //register to displays to cricket topic
        cricket.register(averageScore);
        cricket.register(currentScore);

        // post latest data
        cricket.dataChanged();

        // unregister average score LED display
        cricket.unregister(averageScore);
        System.out.println("\n=================");

        // trigger latest data
        cricket.dataChanged();
    }
}
