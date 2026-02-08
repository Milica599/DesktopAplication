package com.desktopAplication.moduli.modul1.javaAWTLayout.GridLayout;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        Frame f = new Frame();

        //Grid layout je tabelaran
        //sastoji se od redova i kolona
        //svaka celija tabele moze da zauzme samo jednu kontrolu
        //ista prica kao sa flow i grid je nepodrazumevani layout
        //zato ga kreiramo preko layout manager
        LayoutManager lm = new GridLayout(2,3);
        //postavka layouta
        f.setLayout(lm);
        //imacemo jednu praznu celiju jer je kreirana tabela dimenzija 2 reda puta 3 kolone
        for(int i = 1; i <= 5; i++) {
            f.add(new Button("Button " + i));
        }
        f.setSize(500,200);
        f.setVisible(true);
    }
}
