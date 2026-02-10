package com.desktopAplication.moduli.modul1.java2DRukovanjeGeometrijom.drawLine;

import java.awt.*;
//nasledjujemo klasu Frame jer ona u sebi sadrzi metodu paint
public class Main extends Frame {

    //metoda paint kao argument  prima objekat tipa Graphics
    //koji eksponira panel za crtanje i sve metode koje omogucavaju crtanje
    //iako moze da primi kao argument graphics2d ipak se odlucujemo za graphics zbog kompatibilnosti
    //graphics klasa je specijalizovana klasom graphics
    //u klasi graphics se nalaze metode koje su potrebne za crtanje
    //u paint metodi pisemo logiku na osnovu koje obavljamo crtanje
    @Override
    public void paint(Graphics g) {
        //obavljamo konvertovanje u graphics2D tip
        //graphics2d sadrzi sve sto i Graphics ali ima i dodatne komponente
        //Graphics2d klasa je novija verzija klasa Graphics
        Graphics2D g2 = (Graphics2D) g;

        //podesavamo boju linije u zelenu
        //mora se pozvati pre drawline
        g2.setColor(Color.GREEN);
        //podesavamo debljinu linije
        //mora se pozvati pre drawLine
        g2.setStroke(new BasicStroke(3));
        //drawLine je metoda za crtanje linije
        //za argumente prima prvu i poslednju tacku u kordinatnom sistemu
        //prva tacka je x1,y1 a druga je x2,y2
        //kordinatni sistem pocinje u gornjem levom uglu
        //pre prvog drawLIne ide podesavanje linije
        //pa pre drugog podesavanje za prvu linijju
        g2.drawLine(20,40,100,100);

        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(40,40,120,100);


    }
    static void main(String[] args) {
        //Main klasa sada je zapravo nas frame
        //main f=new main() je <=> Frame f = new Frame()
        Main f = new Main();
        //podesavanje velicine frame
        f.setSize(300,300);
        //podesavanje vidljivosti
        f.setVisible(true);
    }


}
