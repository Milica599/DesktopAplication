package com.desktopAplication.moduli.modul1.javaAWTLayout.FlowLaout;

import java.awt.*;
import java.lang.classfile.Label;

public class Main {
    static void main(String[] args) {
        Frame f = new Frame();
        //flowlayout redja kontrole redom dok ne dojde do kraja reda
        // a kad popuni jedan red onda predje u drugi
        //LayoutManager je interfejs koji predstavlja sve ne podrazumevane layout
        //specifikacijom lyoutmanagera mi biramo odgovarajuci border
        //arguement konstruktora je konstanta koja opisuje poravnanje unutar flowlayout-a
        LayoutManager lm = new FlowLayout(FlowLayout.LEFT);
        //postavljamo odredjeni layout

        //kreirace se 10 button i ici ce jedna za drugom unutar jednog reda
        // sve dok ga ne popune pa ce preci u drugi
        //promenom velicine prozora kontrole se prilagodjavaju rasporedom
        // ali uvek zadovoljavaju pravilo popuni red maksimalno pa predji u sledeci
        for(int i = 1; i < 10; i++) {
            Button b = new Button("Button" + i);
            f.add(b);
        }

        f.setLayout(lm);
        f.setSize(500,200);
        f.setVisible(true);
    }
}
