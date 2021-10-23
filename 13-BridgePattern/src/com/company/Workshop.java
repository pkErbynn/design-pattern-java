package com.company;

// implementation hierarchy

public interface Workshop {
    public void work();
}

// many implementations
class Produce implements Workshop {
    public void work() {
        System.out.println("Produce");
    }
}

class Assemble implements Workshop {
    public void work() {
        System.out.println("...and assemble");
    }
}