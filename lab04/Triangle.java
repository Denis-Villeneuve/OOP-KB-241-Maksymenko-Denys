public class Triangle extends Figure {

    Point A;
    Point B;
    Point C;

    public Triangle(Point A, Point B, Point C) {

        double areaCheck =
                A.x * (B.y - C.y) +
                B.x * (C.y - A.y) +
                C.x * (A.y - B.y);

        if (areaCheck == 0) {
            System.out.println("Triangle is degenerate");
            System.exit(0);
        }

        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double area() {

        double s =
                Math.abs(
                        A.x * (B.y - C.y) +
                        B.x * (C.y - A.y) +
                        C.x * (A.y - B.y)
                ) / 2.0;

        return s;
    }

    @Override
    public Point centroid() {

        double x = (A.x + B.x + C.x) / 3;
        double y = (A.y + B.y + C.y) / 3;

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Triangle[A" + A +
                " B" + B +
                " C" + C + "]";
    }
}