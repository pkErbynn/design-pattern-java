package example;

import java.util.LinkedList;

// a complex generic product having many parts to be built on

public class Product {
    private LinkedList<String> parts;

    Product(){
        this.parts = new LinkedList<>();
    }

    void add(String part){
        parts.add(part);
    }

    void showItsParts(){
        for (String part: this.parts) {
            System.out.println(part);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "parts=" + parts +
                '}';
    }
}
