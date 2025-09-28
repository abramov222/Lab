package geometry2d;
import exceptions.InvalidDimensionException;

public class Circle implements Figure {
    public double radius;
    
    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidDimensionException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "Круг с радиусом " + radius;
    }
}