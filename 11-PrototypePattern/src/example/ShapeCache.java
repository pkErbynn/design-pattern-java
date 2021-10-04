package example;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    // get concrete object from cache and returning a copy
    public static Shape getShape(String id){
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone(); // cloned object
    }

    // populating cache
    public static void loadShapeHelper(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
