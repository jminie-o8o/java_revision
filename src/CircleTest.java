public class CircleTest {
    public static void main(String[] args) {
        // 객체 생성
        Circle c1 = new Circle(0, 0, 3); // 중심(0,0) - 반지름3
        Circle c2 = new Circle(2, 3, 4); // 중심(2,3) - 반지름4

        /* 1. 클래스 메소드를 호출하여 원의 넓이를 구하세요. */
        double area1 = Circle.area(c1);
        double area2 = Circle.area(c2);


        // 결과 출력
        System.out.printf("%s => 넓이: %.2f\n", c1.toStr(), area1);
        System.out.printf("%s => 넓이: %.2f\n", c2.toStr(), area2);
    }
}

class Circle {
    // 필드
    int centerX; // 원의 중심 - X 좌표
    int centerY; // 원의 중심 - Y 좌표
    int radius; // 반지름

    // 생성자
    Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    // 인스턴스 메소드
    String toStr() {
        return String.format("Circle { 중심: (%d, %d), 반지름: %d }", centerX, centerY, radius);
    }

    // 클래스 메소드
    static double area(Circle c) {
        // 원의 넓이 = 원주율 x 반지름 x 반지름
        return Math.PI * c.radius * c.radius;
    }
}
