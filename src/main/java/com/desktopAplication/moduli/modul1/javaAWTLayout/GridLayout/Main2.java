package com.desktopAplication.moduli.modul1.javaAWTLayout.GridLayout;

import java.awt.*;

public class Main2 {
    static void main(String[] args) {
        Frame f = new Frame();
        //gridbaglayout je najfleksibilniji
        //postoji mogucnost podesavanja svake komponente posebno
        //npr komponenta stane u vise celija

        LayoutManager lm = new GridBagLayout();
        f.setLayout(lm);

        //dodajemo 5 button-a
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        Button b5 = new Button("Button5");

        //omogucava podesavanje svake komponente pojedinacno GridBagConstraint
        //gridx je za kolone,gridy je za redove
        //kolone se broje od 0
        GridBagConstraints gdbc = new GridBagConstraints();
        gdbc.gridx = 0;
        gdbc.gridy = 0;
        f.add(b1,gdbc);

        gdbc = new GridBagConstraints();
        gdbc.gridx = 1;
        gdbc.gridy = 0;
        f.add(b2,gdbc);

        gdbc = new GridBagConstraints();
        gdbc.gridx = 2;
        gdbc.gridy = 0;
        f.add(b3,gdbc);

        gdbc = new GridBagConstraints();
        gdbc.gridx = 0;
        gdbc.gridy = 1;
        //da bi zauzela 3 kolone
        //ako hocemo vise redova height
        gdbc.gridwidth = 3;
        //prosirenje na kompletan dostupan prostor
        gdbc.fill = GridBagConstraints.BOTH;
        f.add(b4,gdbc);

        gdbc = new GridBagConstraints();
        gdbc.gridx = 1;
        gdbc.gridy = 2;
        //zauzima 3 kolone
        gdbc.gridheight = 3;
        f.add(b5,gdbc);

        f.setSize(700,300);
        f.setVisible(true);

    }

}
