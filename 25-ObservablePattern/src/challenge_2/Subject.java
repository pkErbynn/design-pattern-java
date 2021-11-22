package challenge_2;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);

    public void notifyObservers();
    public void dataChanged();
}

class CricketData implements Subject {
    private int runs;
    private int overs;
    private int wickets;

    private List<Observer> observers;

    public CricketData() {
        //data not set here, cus it will be posted by another api
//        this.runs = runs;
//        this.overs = overs;
//        this.wickets = wickets;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observers.indexOf(observer));
    }

    // notify observers by passing latest data to them
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.getUpdate(this.wickets, this.runs, this.overs);
        }
    }

    private int getLatestRuns(){
        return 40;
    }

    private int getLatestOvers(){
        return 60;
    }

    private int getLatestWickets(){
        return 70;
    }

    // this method updates LED displays when data changes
    // by re-setting data and notifying
    public void dataChanged(){
//        this data can come from other source
        this.runs = getLatestRuns();
        this.overs = getLatestOvers();
        this.wickets = getLatestWickets();

        notifyObservers();
    }
}
