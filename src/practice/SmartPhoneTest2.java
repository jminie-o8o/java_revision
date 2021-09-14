package practice;

public class SmartPhoneTest2 {
    public static void main(String[] args) {
        // 객체 생성
        SmartPhone2 sp2 = new SmartPhone2("아이폰XS");
        // 비프음 내기
        sp2.beep();
        // 음악 재생하기
        sp2.playMusic("상어송");
    }
}

interface Alarm {
    public void beep();                  // 비프음
    public void playMusic(String title); // 음악 재생
}

class SmartPhone2 implements Alarm {
    private String name; // 모델명

    public SmartPhone2(String name) {
        this.name = name;
    }
    /* practice.Alarm 인터페이스의 추상 메소드를 재정의하시오. */
    public void beep(){
        System.out.println("삐빕! 삐비비빕~!");
    }

    public void playMusic(String title){
        System.out.printf("[%s]을 재생합니다..!", title);
    }

}
