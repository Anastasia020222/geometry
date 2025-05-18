package geometry;

public class GeometryUtils {

    public static boolean areSameType(Shape s1, Shape s2) {
        return s1.getClass().equals(s2.getClass());
    }
}
