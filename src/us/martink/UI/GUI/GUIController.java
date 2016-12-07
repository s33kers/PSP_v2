package us.martink.UI.GUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.Command.CommandAbstraction.Command;
import us.martink.UI.UIAbstraction.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by tadas.
 */
public class GUIController extends Controller{

    @Override
    public void showMenu() {
        JFrame frame = new JFrame("Presidents and Agents");
        frame.setSize(new Dimension(400,400));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 0, 10, 0));
        frame.add(panel);

        for (int i = 0; i < getCommands().size(); i++) {
            Command command = getCommands().get(i);
            JButton button = new JButton();
            button.setName("Button" + i);
            button.setText(command.getName());
            panel.add(button);

            button.addActionListener(e -> getProcessor().processCommand(command));
        }
        frame.setVisible(true);

    }
}
