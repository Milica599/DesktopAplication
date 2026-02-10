package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawOval;

import com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawLine.Main;

import java.awt.*;

public class Main1  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //drawOval je metoda za crtanje kruznih oblika
        //rezultat je pravilan krug
        g2.drawOval(100,100,100,100);
        //rezultat je elipsa
        g2.drawOval(100,100,100,80);
    }

    static void main(String[] args) {
        Main1 f = new Main1();
        f.setSize(300,300);
        f.setVisible(true);

    }
}
