package Week3.Day9.IShape;

public class Rectangle implements IShape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return this.length * this.breadth;
    }

    public String toString() {
        return "Color of Rectangle is :: " + color + "" +
                "\nArea of Rectangle is :: " + this.getArea();
    }
}
