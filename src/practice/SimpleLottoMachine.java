package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        // 45개의 공을 만든다
        ArrayList<Integer> balllist = new ArrayList<>();
        for(int i = 1; i < 46; i++){
            balllist.add(i);
        }
        // 섞는다
        Collections.shuffle(balllist);
        // 뽑는다
        int[] lotto = new int[6];
        for(int i = 0; i < 6; i++){
            lotto[i] = balllist.get(i);
        }
        Arrays.sort(lotto); // 배열 정렬
        String result = Arrays.toString(lotto);
        // 결과 출력
        System.out.printf("자동 생성 번호: %s", result);
    }
}
