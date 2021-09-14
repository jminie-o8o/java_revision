package practice;

// 함수형 인터페이스 - 단 하나의 추상메서드만 선언된 인터페이스
@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {

        // 방법 1) 익명 클래스를 통해 구현한 객체
        MyFunction mf = new MyFunction() {
            @Override
            public int max(int a, int b) { //오버라이딩 - 접근제어자는 좁게 못바꾼다!
                return a > b ? a : b;
            }
        };

        // 방법 2) 람다식(익명 객체)을 다루기 위한 참조변수 타입은 함수형 인테페이스의 타입과 일치해야함
        MyFunction mf2 = (a, b) -> a > b ? a : b;

        System.out.println(mf.max(2,3));
        System.out.println(mf2.max(2,3));
    }
}

