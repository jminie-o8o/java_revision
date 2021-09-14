package practice;

public class SquareTestReview {
    public static void main(String[] args) {
        /* 객체 생성 */
        Squre squre = new Squre();
        /* 필드 초기화(값 변경) */
        squre.length = 4;
        /* 결과 출력 */
        System.out.printf("한변의 길이가 %d 인 정사각형의 넓이 %d", squre.length, squre.area());
    }
}

/* 정사각형 클래스 구현 */
class Squre{
    int length;

    int area(){
        return length * length;
    }
}
