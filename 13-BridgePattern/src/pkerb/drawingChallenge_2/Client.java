package pkerb.drawingChallenge_2;

// Requirement: a drawing program allowing to draw different shapes filled with different colors and different border sizes

// problem: a 3 level deep class design
// level 1: has a super Shape class
// level 2: extended by two abstract classes, Triangle & Rectangle....and having a Color interface at this level
// level 3: Red colored(implementing Color) and Green colored triangle and Rectangle

// fix: decouple with Bridge pattern
// abstraction (Shape) and implementor (Colors)

public class Client {
    public static void main(String[] args) {
        System.out.println("===== Bridge Pattern ====");

        IColor green = new GreenColor();
        IColor red = new RedColor();

        // Coloring Rectangle with Green
        System.out.println("Drawing Rectangle:");
        Shape rectangle = new Rectangle(green);
        rectangle.drawShapes(5);
        rectangle.modifyBorders(5, 2);


        // Coloring Triangle with Red
        System.out.println("\n\nDrawing Triangle:");
        Shape triangle = new Triangle(red);
        triangle.drawShapes(10);
        triangle.modifyBorders(10,2);
    }
}
