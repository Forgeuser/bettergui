package gui;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;


public class guiswing {

    public static void main(String[] args) {

        JFrame j = new JFrame();
        j.setTitle("minecraft 2.0");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(420,420);

        j.setVisible(true);

        ImageIcon e = new ImageIcon("hehe.png");
        j.setIconImage(e.getImage());
 j.getContentPane().setBackground(new Color(201,106,123));

    }
}
