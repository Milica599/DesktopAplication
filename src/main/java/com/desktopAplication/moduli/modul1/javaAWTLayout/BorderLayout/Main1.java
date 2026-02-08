package com.desktopAplication.moduli.modul1.javaAWTLayout.BorderLayout;

import java.awt.*;

public class Main1 {
   public static void main(String[] args) {
       //potpuno popunjen borderlayout
       Frame f = new Frame();

       Button b = new Button("TOP_BUTTON");
       Button b1 = new Button("CENTER_BUTTON");
       Button b2 = new Button("BOTTOM_BUTTON");
       Button b3 = new Button("LEFT_BUTTON");
       Button b4 = new Button("RIGHT_BUTTON");

       f.add(b, BorderLayout.PAGE_START);
       f.add(b1, BorderLayout.CENTER);
       f.add(b2, BorderLayout.PAGE_END);
       f.add(b3, BorderLayout.LINE_START);
       f.add(b4, BorderLayout.LINE_END);

       f.setSize(600, 400);
       f.setVisible(true);

   }
}
