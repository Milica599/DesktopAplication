package com.desktopAplication.moduli.modul2.swingLayout;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    //moramo ga inicijalizovati jer u suprotnom bude null
    private  JPanel mainPanel = new JPanel();
    public Main() {
        this.setContentPane(mainPanel);
    }
    public  static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //za frame je podrazumevan border layout
        //raspodela na identican nacin kao u awt
        frame.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
    }
}
