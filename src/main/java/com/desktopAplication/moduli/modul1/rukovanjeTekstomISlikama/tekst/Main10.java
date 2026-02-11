package com.desktopAplication.moduli.modul1.rukovanjeTekstomISlikama.tekst;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.Font;

public class Main10  extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //fontovi su vektorski objekti
        //fontovise dimenzioniraju na drugaciji nacin nego ostali graficki elementi
        //fontovi traze poseban mod da bi se sa njima moglo raditi
        //FontRenderContex je klasa koja nam omogucava manipulaciju fontovima (aktivira mod)
        FontRenderContext frc = g2.getFontRenderContext();
        //RenderingHints su parovi kljuceva(key) i vrednosti(value)
        //rendiranje da slova nemaju krzave ivice - setRendering
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        //klasa Font je font kojim pisemo
        //argumenti konstruktora ime fonata,stil,velicina u pikselima
        //piksel je jedna mala tackica na ekranu
        Font font = new Font("Arial",Font.PLAIN,36);

        //sluzi za podesavanje crtanja teksta
        //podesava se razmak,font,boja...
        //font klasa i fontrederContex klasa su pomocne klase koje su kreirane zbog textlayout
        //argumenti konstruktora tekst koji zelimo da iscrtamo,font
        TextLayout tl = new TextLayout("Hello from java",font,frc);
        tl.draw(g2,20,80);


    }

    static void main(String[] args) {
        Main10 f = new Main10();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
