package com.desktopAplication.moduli.modul1.javaAWTLayout.CardLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Main {
    static void main(String[] args) {
        Frame f = new Frame();
        LayoutManager lm = new CardLayout();
        f.setLayout(lm);

        //panel je takodje kontejner kao i frame
        Panel hp = new Panel();
        hp.setBackground(Color.yellow);
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        //dodajemo dugmad u panel
        hp.add(b1);
        hp.add(b2);

        //panel dodajemo u frame
        //borderlayout je u frame jer je on podrazumevani
        f.add(hp,BorderLayout.PAGE_START);

        //sadpocinje cardLayout
        Panel mp = new Panel();
        CardLayout cl = new CardLayout();
        mp.setLayout(cl);
        //ovi p1,p2 paneli su zapravo kartice koje se prikazuju jedna po jedna
        Panel p1 = new Panel();
        Panel p2 = new Panel();

        p1.setBackground(Color.PINK);
        p2.setBackground(Color.RED);


        //dodajemo sve u mp panel
        //(komponenta p1,naziv komponente je p1)
        mp.add(p1,"p1");
        mp.add(p2,"p2");

        //dodajemo slusaca dogadjaja
        //prikaz prvog panela
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mp,"p1");
            }
        });

        //prikaz drugog panela
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(mp,"p2");
            }
        });

        f.add(mp,BorderLayout.CENTER);
        f.setSize(500,200);
        f.setVisible(true);
    }
}
