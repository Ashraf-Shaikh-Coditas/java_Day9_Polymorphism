package Week3.Day9.IShape;

public class Triangle implements IShape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return "Color of Triangle is :: " + color + "" +
                "\nArea of Triangle is :: " + this.getArea();
    }
}
