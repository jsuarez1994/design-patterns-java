public interface Shape {
    void draw();
}

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujando un rectángulo");
    }
}

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo");
    }
}

public class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}

// Uso:
public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        Shape circle = ShapeFactory.createShape("circle");

        rectangle.draw();
        circle.draw();
    }
}
