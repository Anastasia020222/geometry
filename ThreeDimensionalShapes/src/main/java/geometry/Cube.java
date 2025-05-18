package geometry;

public class Cube implements IThreeDimensionalShapes {

    double surfaceArea = 6;
    double ribLength;

    public Cube(int ribLength) {
        this.ribLength = ribLength;
    }

    @Override
    public void square() {
        double result = 6 * Math.pow(ribLength, 2);
        System.out.println("Площадь куба: " + result);
    }

    @Override
    public void volume() {
        double result = Math.pow(ribLength, 3);
        System.out.println("Объем куба: " + result);
    }
}
