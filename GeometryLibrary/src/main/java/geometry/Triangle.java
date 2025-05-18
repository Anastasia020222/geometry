package geometry;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void square() {
        double s = (a + b + c) / 2.0;
        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Площадь треугольника: " + result);
    }

    @Override
    public void perimeter() {
        double result = a + b + c;
        System.out.println("Периметр треугольника: " + result);
    }
}
