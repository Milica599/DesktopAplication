
package com.desktopAplication.moduli.modul2.kontejneri.panel;
import javax.swing.*;
import java.awt.*;

//kontejneri su kontrole koje u sebi mogu da sadrze druge graficke komponente/kontrole
//vrste kontejnera top level kontejneri i oni koji nisu top level
//top level kontejneri imaju mogucnost da stoje samostalno predstavljaju prozor aplikacije
//oni koji nisu top level kontejneri ne maju tu mogucnost
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

        JPanel myPanel = new JPanel();
        //dodajemo komponente u panel
        myPanel.add(new JButton("Button1"));
        myPanel.add(new JButton("Button2"));
        myPanel.add(new JButton("Button3"));
        //podesena velicina panela
        myPanel.setSize(100, 100);
        //podesavanje pozadine panela
        myPanel.setBackground(Color.gray);

        //dodali smo panel u frame
        //panel nije top level kontejner
        f.add(myPanel);
        f.setVisible(true);
    }
}