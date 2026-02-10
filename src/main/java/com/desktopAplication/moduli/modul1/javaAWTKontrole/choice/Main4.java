package com.desktopAplication.moduli.modul1.javaAWTKontrole.choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Main4 {
    static void main(String[] args) {
        //kreiram kontejner
        Frame f = new Frame();
        //podesim velicinu prozora tj kontejnera
        f.setSize(600,400);
        //postavim layout
        f.setLayout(new FlowLayout());
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

        //kreiramo padajucu listu - choice
        //mana od choice komponente je ta sto jedan dodati element je unapred izabran
        //mi kasnije vrsimo ponovni izbor
        //resenje uvodjenje List komponente
        Choice c = new Choice();
        //dodajemo elemente u padajucu listu
        //ad metoda prihvata samo string tj tekst
        c.add("Audi");
        c.add("BMV");
        c.add("Mercedes");

        //dodajemo komponentu u kontejner tj u frame
        //dodajemo choice u frame
        f.add(c);

        //kreirali smo listu tj dinamicki niz
        //niz koji je prosiriv
        ArrayList<Car> cars = new ArrayList<Car>();
        //dodajemo elemente tj car u listu cars metodom add
        //za argument prima anonimni objekat tipa car
        //new car(5,Audi) je kreiranje objekta tipa car
        //kad se kreira doda se u listu cars
        cars.add(new Car(5, "Audi"));
        cars.add(new Car(6, "BMW"));
        cars.add(new Car(7, "Mercedes"));

        //kreiramo padajucu listu
        Choice c1 = new Choice();
        //dodajemo u padajucu listu elemente iz arraylist
        //dodajemo elemente iz liste cars(lista je dinamicki niz) u padajucu listu choice
        for(Car car : cars){
            c1.add(car.make);
        }
        //dodajemo padajucu listu u kontejner tj u frame
        f.add(c1);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //preuzima se objekat dogadjaja c1
                //preuzima se padajuca lista tj choice
                //preuzimanje dogadjaja se radi metodom getSource
                //ako treba da izvadimo vrednost iz liste ovo jos uvek nije  komponenta list
                Choice c1 = (Choice) e.getSource();
                //oslanjamo se na to da je redosled isti u list cars i u padajucoj list c1
                //sc je element liste cars koji citamo metodom get
                //element u listi pronadjemo tako sto posaljemo poziciju(index) iz c1 tj iz choice
                //metodom getselectedindex dobijamo index iz choice i onda trazimo taj element u listi
                //kad ga pronadjemo procitamo ga
                Car sc = cars.get(c1.getSelectedIndex());
                System.out.println(sc.id);
            }
        });
    }
}
