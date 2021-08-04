package pkerb.Example;

//programming to an interface

interface DisplayModule {
    public void display();
}

class MyMonitor implements DisplayModule {
    public void display(){
        System.out.println("Displaying from monitor...");
    }
}

class MyProjector implements DisplayModule {
    public void display(){
        System.out.println("Displaying from projector...");
    }
}

public class MyComputer {
    DisplayModule displayModule;

    // polymorphism
    public void setDisplayModule(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display() {
        if (this.displayModule != null) {
            this.displayModule.display();
        }
    }

    public static void main(String[] args) {
        MyComputer myComputer = new MyComputer();
        DisplayModule display = new MyMonitor();
        DisplayModule display2 = new MyProjector();

        myComputer.setDisplayModule(display);
        myComputer.display();
        myComputer.setDisplayModule(display2);
        myComputer.display();
    }
}
