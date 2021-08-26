// 자바 API를 불러옴
import java.lang.Math;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // 변수 생성 및 주사위 던지기
        int[] array = new int[13];

        for(int i = 0; i < 100; i++){
            int a = DieA.roll();
            int b = DieB.roll();

            if(a + b == 2){
                array[2]++;
            }
            if(a + b == 3){
                array[3]++;
            }
            if(a + b == 4){
                array[4]++;
            }
            if(a + b == 5){
                array[5]++;
            }
            if(a + b == 6){
                array[6]++;
            }
            if(a + b == 7){
                array[7]++;
            }
            if(a + b == 8){
                array[8]++;
            }
            if(a + b == 9){
                array[9]++;
            }
            if(a + b == 10){
                array[10]++;
            }
            if(a + b == 11){
                array[11]++;
            }
            if(a + b == 12){
                array[12]++;
            }

        }
        for (int i = 2; i < array.length; i++) {
            System.out.printf("%d => ", i);
            for (int j = 0; j < array[i]; j++) {
                System.out.print("#");
            }
            System.out.println(); //한 줄씩 띄어서 표현하기 위해 붙여준다.
        }
    }
}

class DieA {
    // 1 부터 6사이 정수를 반환
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
