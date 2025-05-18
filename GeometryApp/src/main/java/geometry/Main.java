package geometry;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.square();
        circle.perimeter();

        Shape rectangle = new Rectangle(4,2);
        rectangle.square();
        rectangle.perimeter();

        Shape triangle = new Triangle(6, 8, 10);
        triangle.square();
        triangle.perimeter();

        if (!GeometryUtils.areSameType(circle, rectangle)) {
            System.out.println("Переданные фигуры не одинакового типа.");
        } else {
            System.out.println("Переданные фигуры одинакового типа.");
        }

        Cube cube = new Cube(3);
        cube.square();
        cube.volume();
    }
}