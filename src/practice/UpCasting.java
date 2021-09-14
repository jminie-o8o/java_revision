package practice;

public class UpCasting {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.name = "아서스";
        knight.hp = 180;
        knight.strength = 50;

        Thief thief = new Thief();
        thief.name = "발리라";
        thief.hp = 120;
        thief.agility = 40;

        Adventurer adv0 = knight;
        Adventurer adv1 = thief;

        Adventurer[] advs = { adv0, adv1 };

        for (int i = 0; i < advs.length; i++) {
            System.out.println(advs[i].toString());
        }
    }
}

class Adventurer {
    String name;
    int hp;

    public void punch() {
        System.out.printf("[%s]의 펀치!!\n", name);
    }

    public String toString() {
        return String.format("[%s] HP: %d", name, hp);
    }
}

class Knight extends Adventurer{
    int strength;

    public void berserker() {
        System.out.println("체력과 공격력이 증가합니다.");
    }
}

class Thief extends Adventurer{
    int agility;

    public void sharpen() {
        System.out.println("크리티컬 확률이 증가합니다.");
    }
}