package practice;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        Dog dog = new Dog("practice.Dog");
        Baby baby = new Baby("practice.Baby");
        Tiger tiger = new Tiger("practice.Tiger");
        Robot robot = new Robot("practice.Robot");

        ArrayList<Sounding> list = new ArrayList<>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        // 자바의 foreach 문을 사용하여 간편하게 구현
        for(Sounding item : list){
            item.sound();
        }
    }
}

interface Sounding{
    public void sound();
}

class Dog implements Sounding{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 멍멍!\n", name);
    }
}

class Baby implements Sounding{
    private String name;

    public Baby(String name){
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 응애!\n", name);
    }
}

class Tiger implements Sounding{
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 어흥!\n", name);
    }
}

class Robot implements Sounding{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.printf("%s: 삐빕!\n", name);
    }
}
