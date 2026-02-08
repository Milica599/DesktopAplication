package com.desktopAplication.moduli.modul1.javaAWTLayout.GridLayout;

import java.awt.*;

public class Main1 {
    static void main(String[] args) {
        Frame f = new Frame();
        //gridlayout nije pretersno fleksibilan
        //1 celija jedna kontrola
        //resenje gridbagLayout

        //ako hocemo da se prosiruje po redu
        //onda umsto prve 2 stavimo 0
        //u slucaju da ima vise buttona nego sto je inicijalna dimenzija
        // prosirivace se po redu ako zadovoljimo prethodni red
        LayoutManager lm = new GridLayout(2,2);
        f.setLayout(lm);
        //u pozadini ce se prepraviti na layout 2x3
        for(int i = 1; i <= 5; i++) {
            f.add(new Button("Button " + i));
        }
        f.setSize(500,200);
        f.setVisible(true);
    }
}
