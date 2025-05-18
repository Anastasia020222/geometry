package geometry;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void square() {
        double result = width * height;
        System.out.println("Площадь прямоугольника: " + result);
    }

    @Override
    public void perimeter() {
        double result = 2 * (width + height);
        System.out.println("Периметр прямоугольника: " + result);
    }
}
