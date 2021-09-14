package practice;

public class RandomRest2 {
    public static void main(String[] args) {
        int[] array = new int[13]; //index 0 ~ 13

        for(int i = 0; i < 100; i++){
            int a = DieA.roll();
            int b = DieB.roll();
            array[a + b]++;
        }

        for(int i = 2; i < array.length; i++){
            System.out.printf("%d => ", i);
            for(int j = 0; j < array[i]; j++){
                System.out.printf("%c", '#');
            }
            System.out.println();
        }
    }
}
