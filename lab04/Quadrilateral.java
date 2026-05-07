public class Quadrilateral extends Figure {

    Point A;
    Point B;
    Point C;
    Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {

        double area1 =
                Math.abs(
                        A.x * (B.y - C.y) +
                        B.x * (C.y - A.y) +
                        C.x * (A.y - B.y)
                ) / 2.0;

        double area2 =
                Math.abs(
                        A.x * (C.y - D.y) +
                        C.x * (D.y - A.y) +
                        D.x * (A.y - C.y)
                ) / 2.0;

        if (area1 + area2 == 0) {
            System.out.println("Quadrilateral is degenerate");
            System.exit(0);
        }

        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    public double area() {

        double area1 =
                Math.abs(
                        A.x * (B.y - C.y) +
                        B.x * (C.y - A.y) +
                        C.x * (A.y - B.y)
                ) / 2.0;

        double area2 =
                Math.abs(
                        A.x * (C.y - D.y) +
                        C.x * (D.y - A.y) +
                        D.x * (A.y - C.y)
                ) / 2.0;

        return area1 + area2;
    }

    @Override
    public Point centroid() {

        double x = (A.x + B.x + C.x + D.x) / 4;
        double y = (A.y + B.y + C.y + D.y) / 4;

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + A +
                " B" + B +
                " C" + C +
                " D" + D + "]";
    }
}