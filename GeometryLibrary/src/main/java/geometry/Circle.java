package geometry;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        double result = Math.PI * radius * radius;
        System.out.println("Радиус круга: " + result);
    }

    @Override
    public void perimeter() {
        double result = 2 * Math.PI * radius;
        System.out.println("Периметр круга: " + result);
    }
}
