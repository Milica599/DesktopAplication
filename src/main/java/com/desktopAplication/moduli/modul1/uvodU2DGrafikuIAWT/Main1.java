package com.desktopAplication.moduli.modul1.uvodU2DGrafikuIAWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//drugi nacin je da nasa klasa direktno nasledi Frame
//Main i Main1 proizvode isti rezultat uz malo modifikovan kod
public class Main1 extends Frame {

    //konstruktor nase klase Main1
    //zadatak konstruktora je da postavi naslov prozora na title tj na frame container
    public Main1(String title){
        //naslov prozora
        this.setTitle(title);
        //dodavanje labele u prozor tj u kontejner tj u frame
        this.add(new Label(" label komponent"));
    }

    //throws je zbog izuzetaka u jednoj od varijanti isprobanih u demonstraciji
    //izuzetak se nije obradio u try catch
    static void main(String[] args) throws InterruptedException {
        //instanciramo klasu Main1 jer ona sada predstavlja nasu klasu koja igra ulogu kontejnera  tj Frame
        Main1 m = new Main1(" my frame container");
        m.setSize(500,300);
        m.setVisible(true);

        /* za petlju je vazno da prethodni setVisible bude zakomentarisan
        //zbog ove petlje i ispunjavanja/ne ispunjavanja uslova u setVisible mi smo u situaciju da nas prozor blinka
        //prikaze se kada je uslov dao reyultat true
        // ne prikaze se kada je uslov dao rezultat false
        //smena tacnosti uslova daje rezultat blinkanja
        for(int i = 0; i < 30; i++) {
            //sleep metoda pauzira izvrsavanje na zadati broj mili sekundi
            Thread.sleep(200);
            m.setVisible(i % 2 != 0);
        }*/

        /*
        //ovom petljom smo postigli to da prozor na svakih 10 mili sekundi promeni svoju lokaciju
        //izgleda kao da klizi po ekranu
        //promena pozicije se postize metodom setLocation
        for(int i = 0; i < 500; i++) {
            Thread.sleep(10);
            m.setLocation(i, i/2);
        }*/

        //addWindowListenes je metoda kojom dodajemo slusaca dogadjaja
        //dobio je anoniman objekat tipa WindowAdapter - koncept anonimne klase i objekta iz advance
        m.addWindowListener(new WindowAdapter() {
            //logika za zatvaranje prozora klikom na x
            public void windowClosing(WindowEvent we) {
                //system.exit je linija za prekid programa
                //efekta je zatvaranje prozora
                System.exit(0);
            }
        });


    }

}
