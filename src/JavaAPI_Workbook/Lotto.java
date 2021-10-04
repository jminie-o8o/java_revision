package JavaAPI_Workbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        RandomNumGenerate randomNum = new RandomNumGenerate();
        makeString makeString = new makeString();

        List<Integer> lotto = randomNum.randomMake();
        System.out.println(makeString.toString(lotto));

    }
}

class RandomNumGenerate{
    Random random = new Random();
    public List<Integer> randomMake(){
        List<Integer> lottoNum = new ArrayList<>();

        while (lottoNum.size() != 6){
            int number = random.nextInt(45) + 1;
            if(!lottoNum.contains(number)){
                lottoNum.add(number);
            }
        }
        Collections.sort(lottoNum);
        return lottoNum;
    }
}

class makeString{
    public String toString(List<Integer> lottoNum) {
        String result = "";
        String a = "";
        for (int i = 0; i < 6; i++) {
            a += String.format("%d ", lottoNum.get(i));
        }
        result = "생성 번호: " + a;
        return result;
    }
}

