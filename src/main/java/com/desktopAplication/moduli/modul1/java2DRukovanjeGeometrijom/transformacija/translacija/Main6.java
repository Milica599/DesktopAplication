package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.transformacija.translacija;

import java.awt.*;

public class Main6  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.CYAN);
        g2.fillRect(50,50,80,50);
        //pomocu translate metode vrsimo promenu pozicije geometrijskog tela
        g2.translate(80,50);
        //podeseno da bi se bolje uocila promena,promena boje
        g2.setColor(Color.BLACK);
        g2.fillRect(50,50,80,50);
    }

    static void main(String[] args) {
        Main6 f = new Main6();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
