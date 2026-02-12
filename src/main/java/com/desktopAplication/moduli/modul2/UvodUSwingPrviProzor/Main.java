package com.desktopAplication.moduli.modul2.UvodUSwingPrviProzor;

import javax.swing.*;
import java.awt.*;

// Swing se ne oslanja na sistemske kontrole vec ima svoje
//AWT se oslanja
//Swing je do verzije 1.2 bio zaseban a od verzije Jave 1.2 je deo AWT framework-a
public class Main {
    static void main(String[] args) {
        //instanciranje pomocu podrazumevanog konstruktora tj konstrukora bez parametara
        //pored podrazumevanog konstruktora posteje jos 3 konstruktora
        //podrazumevani konstruktor je bez parametara
        // kreiranje objekta JFrame f = new JFrame();

        //kreiranje objekta frame(prozora) sa naslovom my first..frame
        JFrame f = new JFrame("My first swing frame");

        //metoda setVisible nam omogucava da vidimo na ekranu kreirani prozor(frame,kontejner)
        f.setVisible(true);

        //metoda setSize nam sluzi za podesavanje velicine (sada prozora tj frame f)
        //moze da primi kao argument sirinu i visinu ( sada prozora)
        //moze da primi i Dimension objekat koji u sebi ima sirinu i visinu
        // ovo je nacin kad prima DIMENSION f.setSize(new Dimension(600,400));
        f.setSize(600,400);

        //metodom setDefaultOperation smo postigli to da kad stisnemo iksic nestane prozor i program prekine sa radom
        //prekine sa radom zbog argumenta EXIT ON CLOSE
        //ako nema setD..Operstion metode prozor ce se pritiskom na x zatvoriti ali program jos uvek radi u pozadini
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //metodom setLocation postavljamo lokaciju gde ce se prikazati prozor
        //za argument prima x i y kordinatu
        // moze za argument da primi i objekat tipa Point koji u sebi ima x i y
        // x i y cine kordinatu gde ce se prikazati gornji levi ugao prozora
        // ovo je nacin kako kad prima Point f.setLocation(new Point(200,200));
        //f.setLocation(200,200);

        // setLocationRelative sluzi za centriranje prozora
        //kad je null argument bice na centru ekrana
        //pre ove metode mara biti upotrebljena setSize
        f.setLocationRelativeTo(null);
        //zauzme ceo prozor zato sto je podrazumevani layout borderlayout
        //da se to ne bi desavalo potrebno je da se rucno promeni layout prozora
        // jer ce ako se to ne uradi zauzeti ceo prozor
        //jbutton je dugme
        f.add(new JButton("Click"));
        //metodom setLayout rucno menjamo layout prozora npr u flow
        //layout je nacin na koji se slazu komponente u prozor
        //iskoristili smo anonimni objekat kao argument tip je LayoutMnager
        //LayoutManager su svi nacini na koje se mogu slagati komponente
        f.setLayout(new FlowLayout());

    }
}
