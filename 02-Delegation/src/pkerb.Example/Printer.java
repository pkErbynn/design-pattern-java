package pkerb.Example;

//Printer domain modeling

// the delegate
class RealPrinter {
    void print() {
        System.out.println("delegate printing..");
    }
}

//the delegator
public class Printer {
    RealPrinter realPrinter = new RealPrinter();

    // create the delegate...behaves as if it's the one printing
    void print() {
        realPrinter.print();    // delegation
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

//nb
//Composition used