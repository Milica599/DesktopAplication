package com.desktopAplication.moduli.modul1.javaAWTKontrole.checkBox;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main2 {
    static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(600,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        //kreiranje checkbox-a
        //tretiramo kao prekidac
        //moze imati status ukljuceno/iskljuceno
        Checkbox cb = new Checkbox("c1");
        f.add(cb);

        //postavljanje velicine se radi kao kod button
        cb.setPreferredSize(new Dimension(100,20));

        //slusac dogadjaja za checkbox

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox checkbox = (Checkbox)e.getSource();
                //provera statusa
                //ako je uklicen onda je checked u suprotnom unchecked
                if(cb.getState())     {
                    cb.setLabel("checked");
                }
                else {
                    cb.setLabel("unchecked");
                }
            }
        });
    }


}
