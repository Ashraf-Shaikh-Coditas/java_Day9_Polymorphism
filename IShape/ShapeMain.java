package Week3.Day9.IShape;

public class ShapeMain {
    public static void main(String[] args) {
        IShape shape = new Rectangle(10, 12);
        System.out.println(shape);

        System.out.println();

        shape = new Triangle(10, 8);
        System.out.println(shape);
    }
}

/*

Color of Rectangle is :: Blue
Area of Rectangle is :: 120.0

Color of Triangle is :: Blue
Area of Triangle is :: 40.0


* */