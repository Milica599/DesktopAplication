package com.desktopAplication.moduli.modul2.kontejneri.jscroll;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
    private JPanel mainpanel;

    public MainForm(){
        //mora inicijalizacija
        mainpanel = new JPanel();
        this.setContentPane(mainpanel);
    }

    public static void main(String[] args){
        //mainform je top level kontejner i on predstavlja prozor aplikacije
        MainForm f = new MainForm();
        f.setSize(600, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        //namenjeno za unos teksta
        //problem ako premasimo broj redova ona ce se sama inicijalno prosirivati
        //bolje je zbog toga je smestiti u jscrroll
        JTextArea ta = new JTextArea(10, 10);
        //naglasavanje da zelimo da predjemo u novi red kad se ispuni dostupan prostor linije
        ta.setLineWrap(true);
        //f.add(ta);
        JScrollPane sp = new JScrollPane(ta);
        //uvek vidljiv vertikalni scrol
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //uvek vidljiv horizontalni
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        //podesavanje velicine scrolpanea
        sp.setPreferredSize(new Dimension(200, 200));

        f.add(sp);
        f.setVisible(true);
    }
}
