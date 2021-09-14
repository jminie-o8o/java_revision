package practice;

import java.awt.*;
import java.awt.event.*;

public class AWT {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() { // 클래스의 정의과 객체 생성을 동시에
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });

        b.addActionListener(new ActionListener() { // 클래스의 정의과 객체 생성을 동시에
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}


