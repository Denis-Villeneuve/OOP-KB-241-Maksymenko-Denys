public class Main {

    public static void main(String[] args) {

        // 1 task

        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        System.out.println("Line intersection:");
        System.out.println(line1.intersection(line2));


        // 2 task

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);

        Point p3 = new Point(0, 4);
        Point p4 = new Point(4, 0);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p3, p4);

        System.out.println("Segment length:");
        System.out.println(s1.length());

        System.out.println("Segment middle:");
        System.out.println(s1.middle());

        System.out.println("Segment intersection:");
        System.out.println(s1.intersection(s2));


        // 3 task

        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 6);

        Triangle t = new Triangle(a, b, c);

        System.out.println("Triangle area:");
        System.out.println(t.area());

        System.out.println("Triangle centroid:");
        System.out.println(t.centroid());
    }
}