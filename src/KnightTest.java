public class KnightTest {
    public static void main(String[] args) {

        Knight knight = new Knight("돈키호테", 30);

        System.out.println("[객체 생성]");
        System.out.printf("\tKnight { name: %s, hp: %d }\n", knight.getName(), knight.getHp());

        knight.setHp(30);

        System.out.println("[체력 증가 + 30]");
        System.out.printf("\tKnight { name: %s, hp: %d }\n", knight.getName(), knight.getHp());

    }
}

class Knight {
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName(){
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int plushp){
        this.hp += plushp;
    }
}
