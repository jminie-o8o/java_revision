public class ElvesTest {
    public static void main(String[] args) {
        Elf elf = new Elf("티란데", 100);
        HighElf highElf = new HighElf("말퓨리온", 160, 100);
        ElfLord elfLord = new ElfLord("마이에브", 230, 140, 100);

        System.out.println(elf.toString());
        System.out.println(highElf.toString());
        System.out.println(elfLord.toString());
    }
}

class Elf{
    protected String name;
    protected int hp;

    public Elf(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String toString(){
       return String.format("[엘프] Name: %s, HP: %d", this.name, this.hp);
    }
}

class HighElf extends Elf{
    protected int mp;

    public HighElf(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }

    public String toString(){
        return String.format("[하이엘프] Name: %s, HP: %d, MP: %d", super.name, super.hp, this.mp);
    }
}

class ElfLord extends HighElf{
    public int shield;

    public ElfLord(String name, int hp, int mp, int shield){
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString(){
        return String.format("[엘프로드] Name: %s, HP: %d, MP: %d, SH: %d", super.name, super.hp, super.mp, this.shield);
    }
}