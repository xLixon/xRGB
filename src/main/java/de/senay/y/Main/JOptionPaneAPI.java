package de.senay.y.Main;

import javax.swing.*;

public class JOptionPaneAPI {

    public static void optionPane(String title, String content) {
        JOptionPane.showMessageDialog(null, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
