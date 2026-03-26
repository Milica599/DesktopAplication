package com.desktopAplication.moduli.modul2.kontejneri.tab;
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

        //instanciranje taba
        JTabbedPane jtp = new JTabbedPane();
        //panel za prvi tab
        JPanel red = new JPanel();
        red.setBackground(Color.red);
        red.setPreferredSize(new Dimension(300, 100));
        //u tab se dodaje panel koji odgovara tom tabu
        jtp.addTab("Red tab", red);

        JPanel yellow = new JPanel();
        yellow.setBackground(Color.yellow);
        yellow.setPreferredSize(new Dimension(300, 100));
        jtp.addTab("Yellow tab", yellow);

        JPanel white = new JPanel();
        white.setBackground(Color.white);
        white.setPreferredSize(new Dimension(300, 100));
        jtp.addTab("White tab",white);

        f.add(jtp);
        f.setVisible(true);
    }
}
