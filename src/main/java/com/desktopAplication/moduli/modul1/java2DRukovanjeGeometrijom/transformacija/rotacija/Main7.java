package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.transformacija.rotacija;

import java.awt.*;

public class Main7  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.CYAN);
        g2.fillRect(50,50,80,50);
        //metoda rotate je metoda koja je zaduzena za rotaciju obrtanje
        //prima kao argument ugao u radijanima
        //2 pi radijana je pun krug
        //rotate moze da primi i samo ugao ali onda postoji opasnost da ne prikaze u prozoru rotaciju
        //preporuka ponovo pozicionirati izmenjeni objekat
        //pozicioniranje ovde je 120,120
        g2.rotate(Math.PI/2,120,120);
        //podeseno da bi se bolje uocila promena,promena boje
        //rotacija se vidi i da je rotirani druge boje
        g2.setColor(Color.BLACK);
        g2.fillRect(50,50,80,50);
    }

    static void main(String[] args) {
        Main7 f = new Main7();
        f.setSize(300,300);
        f.setVisible(true);
    }
}

