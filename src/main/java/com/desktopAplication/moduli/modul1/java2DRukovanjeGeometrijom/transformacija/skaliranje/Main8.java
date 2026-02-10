package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.transformacija.skaliranje;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Main8  extends Frame {
    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.lightGray);
        g2.fillRect(50, 50, 80, 50);
        AffineTransform at = new AffineTransform();
        at.translate(240, 200);
        at.scale(0.5, 0.5);
        g2.setTransform(at);
        g2.setColor(Color.gray);
        g2.fillRect(50,50,80,50);


    }

    public static void main(String[] args) {
        Main8 f = new Main8();
        f.setSize(300,300);
        f.setVisible(true);
    }
}

