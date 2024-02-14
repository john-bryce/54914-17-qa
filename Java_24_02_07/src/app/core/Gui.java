package app.core;

import javax.swing.*;

// this class represents the Graphical User Interface
// in a Desktop application
public class Gui {

    public static void main(String[] args) {
        // create the main window
        JFrame fr = new JFrame("Eldar App");
        fr.setBounds(100, 100, 800, 600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

}
