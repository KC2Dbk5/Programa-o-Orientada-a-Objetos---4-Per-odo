package geometry;

public abstract class GeometricObject implements GeometryInterface {

    protected double area;
    protected double perimeter;
    protected String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
