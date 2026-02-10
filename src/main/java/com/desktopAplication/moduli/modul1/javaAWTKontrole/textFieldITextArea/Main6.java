package com.desktopAplication.moduli.modul1.javaAWTKontrole.textFieldITextArea;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Main6 {
    static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(600,400);
        f.setLayout(new FlowLayout());

        //textField je textualno polje
        TextField tf = new TextField("Hello from TextField");
        //tekstualno podrucje
        TextArea ta = new TextArea("Hello from TextArea box", 5, 25);
        f.add(tf);
        f.add(ta);

        //drugi nacin da postavimo tekst u polje
        TextField tf1 = new TextField();
        tf1.setText("text field");
        //drugi nacin da postavimo teks u text area
        TextArea ta1 = new TextArea(5,25);
        ta1.setText("text area");

        //dodavanje komponenti u kontejner
        f.add(tf1);
        f.add(ta1);

        //dodajemo slusac dogadjaja
        tf.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                //preuzimamo izvor dogadjaja tj textField
                TextField textField = (TextField) e.getSource();
                //ispisujemo tekst u konzolu
                //ukonzoli se prikazuje svaka promena u tekstfield
                //promena je unos karaktera ili brisanje karaktera
                System.out.println(textField.getText());
            }
        });
        //kazem da ce prozor da se vidi na ekranu
        f.setVisible(true);

    }
}
