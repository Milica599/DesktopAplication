package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.iscrtavanje;

import java.awt.*;

public class Main5 extends Frame {
    static int endCup;

    @Override
    public void paint(Graphics g) {
        g.drawArc(100, 100, 100, 100, 0, endCup);
    }

    static void main(String[] args) throws InterruptedException {
        Main5 f = new Main5();
        f.setSize(300,300);
        f.setVisible(true);

        for (int i = 0; i < 360; i++){
            endCup = i;
            //repaint metoda ne radi nista drugo osim sto ponovo poziva paint metodu
            f.repaint();
            //zaustavlja se program na 20 milisekundi
            Thread.sleep(20);
        }
    }
}
