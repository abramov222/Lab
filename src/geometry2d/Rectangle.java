package geometry2d;
import exceptions.InvalidDimensionException;

public class Rectangle implements Figure {
    public double width;
    public double height;
    
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionException("Стороны должны быть положительны");
        }
        this.width = width;
        this.height = height;
    }
    
    public double area() {
        return width * height;
    }
    
    public double perimeter() {
        return 2 * (width + height);
    }
    
    public String toString() {
        return "Прямоугольник " + width + "x" + height;
    }
}