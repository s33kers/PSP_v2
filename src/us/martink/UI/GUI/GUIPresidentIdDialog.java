package us.martink.UI.GUI;

import us.martink.UI.UIAbstraction.PresidentIdDialog;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowEvent;

/**
 * Created by tadas.
 */
public class GUIPresidentIdDialog implements PresidentIdDialog {
    private String outputText;

    @Override
    public int show() {
        String outputText = (String)JOptionPane.showInputDialog(
                null,
                "Enter president ID",
                JOptionPane.PLAIN_MESSAGE);

        if (outputText != null) {
            return Integer.parseInt(outputText);
        } else {
            return 0;
        }
    }
}
