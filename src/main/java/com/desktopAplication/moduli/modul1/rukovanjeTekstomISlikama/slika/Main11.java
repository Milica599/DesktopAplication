package com.desktopAplication.moduli.modul1.rukovanjeTekstomISlikama.slika;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Main11 extends Frame{
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //Toolkit je klasa za rukovanje slikama
        //metodom getDefaultToolkit preuzimamo sliku sa sistema
        Toolkit tk = Toolkit.getDefaultToolkit();
        //klasom Image predstavljamo sliku
        //argument putanja do slike
        Image i = tk.getImage("src/link_group-logo.png");
        //pomocu AffineTransformklase i njenih metoda izmenicemo sliku
        AffineTransform at = new AffineTransform();
        //smanjimo sliku za 40% scale metodom
        at.scale(0.4,0.4);
        //rotiramo sliku metodom rotate
        at.rotate(0.4);
        //promenimo poziciju slike tj transliramo je metod translate
        at.translate(50,50);
        //aktiviramo transformaciju tj aktiviramo izmenu
        g2.setTransform(at);

        //drawImage sa tom metodom crtamo sliku i na poyiciji 50,50,imageobserver je klasa u kojoj se crta
        g2.drawImage(i,50,50,this);
    }

    static void main(String[] args) {
        Main11 f = new Main11();
        f.setSize(300,300);
        f.setResizable(true);
        f.setVisible(true);
    }
}
