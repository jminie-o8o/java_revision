package practice;

public class SuperTest {
    public static void main(String[] args) {

        Orc orc = new Orc("오크", 80);
        System.out.println(orc.toString());

        OrcWarrior orcWarrior = new OrcWarrior("오크전사", 120, 3);
        System.out.println(orcWarrior.toString());

    }
}

class Orc {
    protected String name;
    protected int hp;

    //생성자
    public Orc(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("practice.Orc { name: %s, hp: %d }", this.name, this.hp);
    }
}

class OrcWarrior extends Orc {
    protected int amor;

    public OrcWarrior(String name, int hp, int amor) {
        super(name, hp);
        this.amor = amor;
    }

    //오버라이딩
    public String toString() {
        return String.format("practice.OrcWarrior { name: %s, hp: %d, amor: %d }", super.name, super.hp, this.amor);
    }
}
