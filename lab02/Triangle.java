public class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {

        double area =
                a.x * (b.y - c.y) +
                b.x * (c.y - a.y) +
                c.x * (a.y - b.y);

        if (area == 0) {
            System.out.println("Triangle does not exist");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {

        double s =
                a.x * (b.y - c.y) +
                b.x * (c.y - a.y) +
                c.x * (a.y - b.y);

        return Math.abs(s / 2.0);
    }

    public Point centroid() {

        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;

        return new Point(x, y);
    }
}