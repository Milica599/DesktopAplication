package com.desktopAplication.moduli.modul2.kontejneri.internalFrame;

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
        com.desktopAplication.moduli.modul2.kontejneri.split.MainForm f = new com.desktopAplication.moduli.modul2.kontejneri.split.MainForm();
        f.setSize(600, 300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        //kreiranje prozora u prozoru
        //internalFrame ne moze da stoji samostalno
        JInternalFrame jif = new JInternalFrame("My internal frame ");
        //dodavanje komponenti u podprozor
        jif.add(new JButton("click"));
        //podesavanje velicine podprozora
        jif.setPreferredSize(new Dimension(200, 100));
        //podprozor se dodaje u glavni prozor
        f.add(jif);
        //podesava se vidljivost podprozora
        jif.setVisible(true);

        f.setVisible(true);




    }
}

