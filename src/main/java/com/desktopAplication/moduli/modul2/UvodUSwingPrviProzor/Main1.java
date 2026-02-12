package com.desktopAplication.moduli.modul2.UvodUSwingPrviProzor;

import javax.swing.*;
import java.awt.*;

//cesce cemo koristiti nase klase pa nasledjivati klasu JFrame
public class Main1  extends JFrame {
    //u okviru initComponents mi vrsimo podesavanje prozora
    //umesto sto smo u Main klasi radili f. + metoda ovde radimo to isto this. + metoda
    void initComponents() {
        this.setSize(300, 300);
        this.setVisible(true);
        this.setLocation(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //kreirali smo dugme i svo objasnjenje koje smo pisali  vazi samo je kod izmesten na drugo mesto
        //ovaj nacin je bolji
        JButton b = new JButton("CLICK");
        this.add(b);
        this.setLayout(new FlowLayout( ));
    }
    //zbog citljivosti i lakseg snalazenja logika podesavanja je premestena u drugu metodu
    public Main1() {
        initComponents();
    }
    static void main(String[] args) {
        //ovo je kao da smo uradili tamo jframe = new jframe()
        Main1 f = new Main1();
        f.setVisible(true);
    }
}
