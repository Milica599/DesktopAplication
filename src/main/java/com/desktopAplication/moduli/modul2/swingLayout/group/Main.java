package com.desktopAplication.moduli.modul2.swingLayout.group;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel mainPanel = new JPanel();

    public Main(){
        //komponente koje dodajemo u kontejner nije direktno deo kontejnera
        //postaje deo preko postavljanja sadrzaja u content pane
        this.setContentPane(mainPanel);
    }

    static void main(String[] args) {
        Main frame =  new Main();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //kontejner je izdeljen u grupe
        //tezak za rucno koriscenje
        //podrazumeva dva pravca horizontalni i vertikalni
        GroupLayout gl = new GroupLayout(frame.mainPanel);

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");

        //automatsko postavljanje razmaka izmedju kontrola
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        //kontrola mora biti definisana za horizontlnu i vertikalnu grupu
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(b3)
                        .addComponent(b4)));

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b1)
                        .addComponent(b2)
                        .addComponent(b3))
                .addComponent(b4));
        frame.setLayout(gl);
        frame.setVisible(true);


    }
}
