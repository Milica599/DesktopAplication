package com.desktopAplication.moduli.modul1.rukovanjeTekstomISlikama.tekst;

import java.awt.*;

public class Main9  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //drawString metoda za iscrtavanje teksta
        //argumenti funkcije su tekst koji treba da iscrta i kordinate x,y gde pocinje crtanje teksta
        //ne sadrzi opcije za oybiljniju manipulaciju tekstom
        g2.drawString("Hello from java",20,50);
    }

    static void main(String[] args) {
        Main9 f = new Main9();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
