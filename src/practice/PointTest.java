package practice;

public class PointTest {
    public static void main(String[] args) {
        // 객체 생성
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        // 거리 계산
        double dist = Point.distance(p1, p2);

        // 결과 출력
        System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
    }
}

class Point {
    int a;
    int b;

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static double distance(Point p1, Point p2){
        double dis = 0;
        dis = Math.sqrt(((p1.a - p2.a) * (p1.a - p2.a)) + ((p1.b - p2.b) * (p1.b - p2.b)));

        return dis;
    }

    String toStr(){
        return String.format("(%d, %d)", a, b);
    }

}
