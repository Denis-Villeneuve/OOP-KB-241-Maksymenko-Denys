public class Segment {

    Point start;
    Point end;

    public Segment(Point start, Point end) {

        // перевірка що точки не однакові
        if (start.x == end.x && start.y == end.y) {
            System.out.println("Segment does not exist");
        }

        this.start = start;
        this.end = end;
    }

    public double length() {

        double dx = end.x - start.x;
        double dy = end.y - start.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() {

        double mx = (start.x + end.x) / 2;
        double my = (start.y + end.y) / 2;

        return new Point(mx, my);
    }

    public Point intersection(Segment another) {

        double x1 = start.x;
        double y1 = start.y;

        double x2 = end.x;
        double y2 = end.y;

        double x3 = another.start.x;
        double y3 = another.start.y;

        double x4 = another.end.x;
        double y4 = another.end.y;

        double denominator =
                (x1 - x2) * (y3 - y4) -
                (y1 - y2) * (x3 - x4);

        if (denominator == 0) {
            return null;
        }

        double px =
                ((x1 * y2 - y1 * x2) * (x3 - x4) -
                (x1 - x2) * (x3 * y4 - y3 * x4))
                / denominator;

        double py =
                ((x1 * y2 - y1 * x2) * (y3 - y4) -
                (y1 - y2) * (x3 * y4 - y3 * x4))
                / denominator;

        return new Point(px, py);
    }
}