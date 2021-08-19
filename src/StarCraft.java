public class StarCraft {
    String name;
    int hp;

    public StarCraft(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }

    void heal(StarCraft hero){
        System.out.printf("[%s]의 치유! => [%s] HP(%d -> ",this.name , name, hp );
        hero.hp += 10;
        System.out.printf("%d)",hp);
    }

    public static void main(String[] args) {
        // 객체 생성
        StarCraft marine = new StarCraft("레이너",80);
        StarCraft medic = new StarCraft("모랄레스",60);
        // 마린의 스팀팩!
        marine.stimpack();
        // 메딕의 힐!
        medic.heal(marine);
    }

}
