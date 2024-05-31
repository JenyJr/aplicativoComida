package Programa;

import javax.swing.*;

public class appYummy extends JFrame {
    public appYummy(){
        setTitle("Yummy App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new yummy();
    }
}
