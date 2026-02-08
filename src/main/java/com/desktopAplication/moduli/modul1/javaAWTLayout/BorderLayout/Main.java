package com.desktopAplication.moduli.modul1.javaAWTLayout.BorderLayout;

import java.awt.*;

public class Main {
   public static void main(String[] args) {
       //kreiranje kontejnera
       Frame f = new Frame();
       //kreiranje dugmeta u kontejneru
       //navodjenjem celina omogucavamo da se sve komponente vide
       Button b1 = new Button("b1");
       //dodajemo komponentu u kontejner tj dugme tj button
       f.add(b1,BorderLayout.PAGE_START);
       Button b2 = new Button("b2");
       //dodajemo komponentu u kontejner tj dugme tj button
       f.add(b2,BorderLayout.CENTER);
       //metoda setSize moze da primi width,height
       //metoda setSize moze da primi i instancu klase Dimension
       //Dimension sadrzi objedinjeno u sebi sirinu i visinu
       f.setSize(300,100);
       //podesimo vidljivost
       f.setVisible(true);
       //rezultat celo dugme je ispunilo prozor sa dugmetom b1 ako postoji samo 1 dugme;
       //ako postoji vise buttona vidi se samo poslednji koji je kreiran i on zauzme ceo ekran
       //borderLazout je podrazumevani lazout i on deli frame na 5 celina
       //celine: page_start,line_start,page_end,line_end,center
       //ne navodjenjem ovih celina podrazumevano se smesta u center
       //ako nema drugih komponenti centar ce yauzeti sav proster jer center tezi da se rasiri maksimalno moguce
       //ostale celine zauzimaju prostor koji im je preko potreban tj neophodan
       //u svakoj celini moze da se nadje samo po jedna kontrola
       //resenje navodi se koja komponenta pripada kom layoutu


    }
}
