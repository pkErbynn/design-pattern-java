package example;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type; // for subclass to have access

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public Object clone() {     // product interface provides the clone mechanism, not concrete products
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

class Square extends Shape {
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Draw square");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}