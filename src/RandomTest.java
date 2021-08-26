// 자바 API를 불러옴
import java.lang.Math;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // 변수 생성 및 주사위 던지기
        int a = DieA.roll();
        int b = DieB.roll();

        // 결과 출력
        System.out.printf("A: %d\n", a);
        System.out.printf("B: %d\n", b);
    }
}

class DieA {
    // 1 부터 6사이 정수를 반환 [참고] https://cloudstudying.kr/challenges/348
    public static int roll() {
        double r = Math.random() * 6; // 0.0 <= r < 6.0
        int randInt = (int) r;        // 0, 1, 2, ..., 5
        return randInt + 1;           // 1, 2, 3, ..., 6
    }
}

class DieB {
    public static int roll() {
        /* Random 클래스를 활용하여 주사위의 눈값(1 ~ 6)을 반환하시오.*/
        Random rand = new Random();
        int ni = rand.nextInt(6); // 0 ~ 5 중 하나 반환
        return ni + 1;

    }
}
