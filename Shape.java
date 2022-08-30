package Week3.Day9;

public class Shape {
    public void calculateArea(int side) {
        System.out.println("Area of Square is :: " + side * side);
    }

    public void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle is :: " + length * breadth);
    }

    public void calculateArea(float length, float height) {
        System.out.println("Area of Triangle is :: " + 0.5 * length * height);
    }

    public void calculateArea(float radius) {
        System.out.println("Area of Circle is :: " + Math.PI * radius * radius);
    }

}

class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.calculateArea(4);
        shape.calculateArea(10, 20);
        shape.calculateArea(11f, 12f);
        shape.calculateArea(12f);

    }
}


/*

Area of Square is :: 16
Area of Rectangle is :: 200
Area of Triangle is :: 66.0
Area of Circle is :: 452.3893421169302


 */
