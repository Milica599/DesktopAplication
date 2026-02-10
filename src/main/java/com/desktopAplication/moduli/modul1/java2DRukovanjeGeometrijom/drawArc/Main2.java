package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawArc;

import java.awt.*;

public class Main2 extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //pravilan poluluk jer je pocetak luka na 0 a kraj na 180 stepeni
        //x,y tacke gde se pocinje u korsinatnom sistemu,sirina ,visina,ugao
        g2.drawArc(100,100,100,100,0,270);

    }

    static void main(String[] args) {
        Main2 f = new Main2();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
