package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.bojenjeKruga;

import com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawArc.Main2;

import java.awt.*;

public class Main4  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //postavljamo boju
        //primenljivo na sve geometrijske oblike
        g2.setColor(Color.GREEN);
        //postavljamo krug koji ce biti ispunjen bojom
        //primenljivo sa adekvatnim sufiksom na sve oblike
        g2.fillOval(100,100,100,100);
        //debljina linije
        g2.setStroke(new BasicStroke(5));
        //postavljanje boje ivice kruga
        g2.setColor(Color.BLACK);
        //crtamo liniju kruga
        g2.drawOval(100,100,100,100);


    }

    static void main(String[] args) {
        Main4 f = new Main4();
        f.setSize(300,300);
        f.setVisible(true);

    }
}
