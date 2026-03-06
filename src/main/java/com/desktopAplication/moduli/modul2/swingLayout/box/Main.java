package com.desktopAplication.moduli.modul2.swingLayout.box;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel mainPanel = new JPanel();

    public Main(){
        //komponente koje dodajemo u kontejner nije direktno deo kontejnera
        //postaje deo preko postavljanja sadrzaja u content pane
        this.setContentPane(mainPanel);
    }

    static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //postavljamo box layout
        //zbog line axis jedan pored druge
        //page axis jedna ispod druge
        frame.setLayout(new BoxLayout(frame.mainPanel,BoxLayout.LINE_AXIS));
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);


    }
}
