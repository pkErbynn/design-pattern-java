package pkerb.Example;

// Context domain modeling :
// Computer with monitor display that can be extended to be displayed on a projector in future

class Monitor {
    public void display(){
        System.out.println("Display from monitor...");
    }
}
public class Computer {
    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor(){
        return this.monitor;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        computer.setMonitor(monitor);
        computer.getMonitor().display();
    }

}
//NB
// this design instantiates on concrete classes thus is highly coupled
// difficult to expand to support projector display
// see module correction in MyComputer class

