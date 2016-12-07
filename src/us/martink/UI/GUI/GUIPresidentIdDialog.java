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
       /* JFrame frame = new JFrame("Enter president ID");
        frame.setSize(new Dimension(400, 200));
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 0, 10, 0));
        frame.add(panel);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        JButton button = new JButton("OK");
        button.setPreferredSize(new Dimension(400, 50));


        button.addActionListener(e -> {
            outputText = textField.getText();
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });

        panel.add(textField);
        panel.add(button);
        frame.setVisible(true);

        if (outputText != null) {
            return Integer.parseInt(outputText);
        } else {
            return 0;
        }*/
    }
}
