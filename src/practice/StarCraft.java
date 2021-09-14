package practice;

public class StarCraft {

    public static void main(String[] args) {
        // 객체 생성
        marine marine = new marine("레이너",100);
        medic medic = new medic("모랄레스",50);
        // 마린의 스팀팩!
        marine.stimpack();
        // 메딕의 힐!
        medic.heal(marine);
    }
}
class marine{
    String name;
    int hp;

    public marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", this.name, this.hp);
        hp -= 10;
        System.out.printf("%d\n", this.hp);
    }

}

class medic{
    String name;
    int hp;

    public medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void heal(marine hero){
        System.out.printf("[%s]의 치유! => [%s] HP(%d -> ",this.name , hero.name, hero.hp );
        hero.hp += 10;
        System.out.printf("%d)",hero.hp);
    }

}
