package com.desktopAplication.moduli.modul2.swingLayout.spring;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel mainPanel = new JPanel();

    public Main() {
        //komponente koje dodajemo u kontejner nije direktno deo kontejnera
        //postaje deo preko postavljanja sadrzaja u content pane
        this.setContentPane(mainPanel);
    }

    static void main(String[] args) {
        com.desktopAplication.moduli.modul2.swingLayout.group.Main frame = new com.desktopAplication.moduli.modul2.swingLayout.group.Main();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Button1");
        frame.add(button);
        //instanciranje i postavka Spring layout
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);
        //definisanje ogranicavaca
        //u odnosu na gornju ivicu i levu ivicu
        //ako menjamo velicinu prozora postoji mogucnost da iygubimo vidljivost
        //jer komponenta ima uvek isto rastojanje ,ono koje je navedeno
        //nas slucaj 100 i 150 tacaka tj piksela
        layout.putConstraint(SpringLayout.WEST, button, 100, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button, 150, SpringLayout.NORTH, frame);

        frame.setVisible(true);


    }
}