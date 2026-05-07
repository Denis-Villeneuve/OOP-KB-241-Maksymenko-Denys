public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);
        Point p4 = new Point(4, 3);

        Triangle triangle = new Triangle(p1, p2, p3);

        Quadrilateral quadrilateral =
                new Quadrilateral(p1, p2, p4, p3);

        Circle circle = new Circle(new Point(2, 2), 5);

        System.out.println(triangle);
        System.out.println("Triangle area = " + triangle.area());
        System.out.println("Triangle centroid = " + triangle.centroid());

        System.out.println();

        System.out.println(quadrilateral);
        System.out.println("Quadrilateral area = " + quadrilateral.area());
        System.out.println("Quadrilateral centroid = " + quadrilateral.centroid());

        System.out.println();

        System.out.println(circle);
        System.out.println("Circle area = " + circle.area());
        System.out.println("Circle centroid = " + circle.centroid());
    }
}