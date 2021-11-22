package challenge_2;

interface Observer {
    public void getUpdate(int wickets, int runs, int overs);
}

class AverageScoreLEDDisplay implements Observer{
    private float runRate;
    private int PredictedScore;

    // incoming latest data from subject
    @Override
    public void getUpdate(int wickets, int runs, int overs) {
        this.runRate = (float) runs/overs;
        this.PredictedScore = (int) this.runRate * 50;
        display();
    }

    private void display() {
        System.out.println( "\nAverage Score Display\n" +
                "Run rate: " + this.runRate + "" +
                "\nPredicted score: " + this.PredictedScore);
    }
}

class CurrentScoreDisplay implements Observer {
    private int runs, overs, wickets;

    // incoming latest data from the subject
    @Override
    public void getUpdate(int wickets, int runs, int overs) {
        this.wickets = wickets;
        this.runs = runs;
        this.overs = overs;
        display();
    }

    public void display(){
        System.out.println("\nCurrent Score Display" +
                "\nWickets: " + this.wickets +
                "\nRuns: " + this.runs +
                "\nOvers: " + this.overs);
    }
}