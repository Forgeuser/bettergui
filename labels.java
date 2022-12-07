package gui;



import javax.swing.*;
import java.awt.*;

public class labels {


    public static void main(String[] args) {
try {
    ImageIcon imagine = new ImageIcon("ducks.png");

    JLabel j = new JLabel();
    j.setText("hello there u seem to not like my program well DIE");
    j.setForeground(Color.green);
    j.setFont(new Font("MV Boli",Font.BOLD,20));

    JFrame f = new JFrame();

    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.setTitle("duckcraft");
    f.setSize(700, 900);
    f.setVisible(true);
    //f.setResizable(false);
    f.add(j);
    f.setIconImage(imagine.getImage());
    j.setIcon(imagine);
    j.setHorizontalTextPosition(JLabel.CENTER);
    j.setVerticalTextPosition(1);
    f.getContentPane().setBackground(new Color(109299));
} catch(IllegalArgumentException e) {


}







    }

}
