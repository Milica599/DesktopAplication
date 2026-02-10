package com.desktopAplication.moduli.modul1.javaAWTKontrole.labela;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    static void main(String[] args) throws InterruptedException {
        //kreiram kontejner
        Frame f = new Frame();
        //podesim velicinu prozora tj kontejnera
        f.setSize(600,400);
        //postavim layout
        f.setLayout(new FlowLayout());
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

        //labela je kontrola koja je namenjena statickom tekstu
        //najcesce stoji uz text field
        //moze da se navede tekst labele
        //labela je komponenta pa je moramo dodati kontejneru
        //primer upotrebe kada imas formular gde treba da uneses ime
        //onaj deo koji ti objasni sta da uneses je zapravo labela
        //ime: ___________ to ime: je labela
        //labela nema mogucnost dodavanja akcionih slusaca
        //ali moze low dogadjaje misa i tastature...
        Label l = new Label("click me");
        //metodom add dodajemo labelu ili bilo koju komponentu u kontejner
        f.add(l);


        //ovo je objasnjenje kako ce se menjati labela l zato posle for nije ponovo potrebno dodati labelu u frame
        //ona je vec dodata u frame(kontejner)
        for(int i = 0;i < 10; i++){
           Thread.sleep(300);
           //metoda set text je metoda za dinamicku promenu teksta labele
           l.setText(String.valueOf(i));
        }
        //slusac dogadjaja misa
        l.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("clicked");
            }
        });



    }
}
