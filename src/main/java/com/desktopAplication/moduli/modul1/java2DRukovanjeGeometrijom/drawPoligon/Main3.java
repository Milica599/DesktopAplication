package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawPoligon;

import java.awt.*;

public class Main3  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //objekat tipa poligon se kreira pomocu dva niza
        //1.niz ima u sebi sve x kordinate od svih tacaka poligona
        //2.niz ima u sebi sve y kordinate od svih tacaka
        //npoints je broj tacaka u poligonu
        //poligon je geometrijski oblik
        Polygon p = new Polygon(new int[]{150,200,150,100},
                                new int[]{50,100,150,100},4);
        //metoda za iscrtavanje poligona
        g2.drawPolygon(p);
    }

    static void main(String[] args) {
        Main3 f = new Main3();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
