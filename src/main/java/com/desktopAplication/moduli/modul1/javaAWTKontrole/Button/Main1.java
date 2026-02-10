package com.desktopAplication.moduli.modul1.javaAWTKontrole.Button;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main1 {
    static void main(String[] args) {
        //kreiram kontejner
        Frame f = new Frame();
        //podesim velicinu prozora tj kontejnera
        f.setSize(600,400);
        //postavim layout
        f.setLayout(new FlowLayout());
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

        //kreiranje dugmeta tj button-a
        Button b = new Button("clicked me");
        //podesavamo velicinu dugmeta tj buttona
        b.setPreferredSize(new Dimension(110,20));
        //dodali smo button u kontejner
        f.add(b);

        //slusac dogadjaja misa ali je povezan sa button
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //postavljanje teksta u dugme
                b.setLabel("clicked");
                //promena boje dugmeta
                b.setBackground(Color.MAGENTA);
            }
        });



    }
}
