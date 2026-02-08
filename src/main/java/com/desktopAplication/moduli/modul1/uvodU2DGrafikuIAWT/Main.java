package com.desktopAplication.moduli.modul1.uvodU2DGrafikuIAWT;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        //frame je top level kontejner u koji se mogu smestati druge AWTkomponente
        //frame predstavlja prozor graficko korisnickog okruzenja
        //argument je string - naslov prozora
        //prozor se ne moze zatvoriti klikom mora se "ubiti program"
        Frame f = new Frame("frame container");
        //labela sa tekstom
        //labela najcesce ide uz polje
        //labela je osnovna komponenta za prikaz statickog teksta
        //labela je komponenta kontejnera
        Label lbl = new Label("label component");
        //dodajemo pomocu metode add labelu u kontejner tj u frame
        f.add(lbl);
        //odlucujemo i postavljamo velicinu prozora
        f.setSize(500,300);
        //postavljamo vidljivost prozora
        //ako je argument true prozor ce se videti
        //ako je argument false prozor ce ostati sakriven
        f.setVisible(true);


    }
}
