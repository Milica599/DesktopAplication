package com.desktopAplication.moduli.modul2.kontejneri.split;

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

        //instanciranje jsplit objekta
        //odluka o nacinu podele - hotizontal u ovom slucaju
        //split panel levi i desni/vrh i dno
        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.gray);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.pink);
        //podesavanje velicine panela
        p1.setPreferredSize(new Dimension(200, 200));
        p2.setPreferredSize(new Dimension(200, 200));
        //postavlamo panele u odgovarajuci split
        jsp.setLeftComponent(p1);
        jsp.setRightComponent(p2);

        f.add(jsp);
        f.setVisible(true);
    }
}
