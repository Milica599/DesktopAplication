package com.desktopAplication.moduli.modul1.javaAWTKontrole.choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main5 {
    static void main(String[] args){
        //kreiram kontejner
        Frame f = new Frame();
        //podesim velicinu prozora tj kontejnera
        f.setSize(600,400);
        //postavim layout
        f.setLayout(new FlowLayout());
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

        //unapredjena padajuca lista
        //list je unapredjen choice
        List l1 = new List(10,true);
        List l = new List();
        List l2 = new List(2);
        //dodajemo elemente u list
        //prihvata kao argument samo tekst

        l.add("Renault");
        l.add("BMW");
        l.add("Mercedes");

        l1.add("Renault");
        l1.add("BMW");
        l1.add("Mercedes");

        //pojavice se opcija sa strelicama jer nema zauzet dovoljan broj redova
        l2.add("Renault");
        l2.add("BMW");
        l2.add("Mercedes");

        //dodajemo komponentu list u kontejner tj frame
        //podrazumevao zauzima toliko koliko ima elemenata
        f.add(l);
        //prikazace prazan prostor ispod
        //prikazuje praznih redova koliko nedostaje do unetog broja u konstruktoru
        //mozemo selektovati vise elemenata padajuce liste u isto vreme
        f.add(l1);
        //pojavice se strelice jer nije zauzet dovoljan broj redova
        //pojava tih strelica je scroll bar
        f.add(l2);

        l1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //preuyima se izvor dogadjaja tj list komponenta
                List list = (List) e.getSource();
                //radi po istom principu kao getItem
                //getSelectedItem vraca 1 element liste
                //getISelectedtems vraca vise elemenata liste
                String[] array = list.getSelectedItems();
                //ispis jednog po jednog elementa liste
                for(int i = 0;i<array.length;i++){
                    System.out.println(array[i]);
                }
            }
        });
    }
}
