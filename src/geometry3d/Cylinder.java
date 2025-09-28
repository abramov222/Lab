package geometry3d;
import geometry2d.Figure;
import exceptions.InvalidDimensionException;

public class Cylinder {
    public Figure base;
    public double height;
    
    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new InvalidDimensionException("Высота должна быть положительна");
        }
        this.base = base;
        this.height = height;
    }
    
    public double volume() {
        return base.area() * height;
    }
    
    public String toString() {
        return "Цилиндр с основанием: " + base.toString() + " и высотой " + height;
    }
}