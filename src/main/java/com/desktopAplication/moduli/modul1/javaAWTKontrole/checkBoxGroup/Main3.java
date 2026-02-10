package com.desktopAplication.moduli.modul1.javaAWTKontrole.checkBoxGroup;

import java.awt.*;

public class Main3 {
   public static void main(String[] args) throws InterruptedException {
       //kreiram kontejner
        Frame f = new Frame();
        //podesim velicinu prozora tj kontejnera
        f.setSize(600,400);
        //postavim layout
        f.setLayout(new FlowLayout());
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

        //kreiranje checkbox grupe
       //checkbox grupa se sastoji od vise chekbox-ova
       CheckboxGroup cbg = new CheckboxGroup();

       //kreiranje vise checkbox-ova koji ce pripadati checbox grupi
       //samo jedna moze biti cekirana u jednom trenutku
       //samo jedna moze biti ukljucena u jednom trenutku
       //ostale budu iskljucene
       //jedancheckbox je ukljucen ostali su iskljuceni
       //ukljucen je onaj koji ima true
       //iskljuceni su oni koji imaju false
       Checkbox cb1 = new Checkbox("c1",cbg,true);
       f.add(cb1);
        Checkbox cb2 = new Checkbox("c2",cbg,false);
       f.add(cb2);
       Checkbox cb3 = new Checkbox("c3 ",cbg,false);
       f.add(cb3);


   }
}
