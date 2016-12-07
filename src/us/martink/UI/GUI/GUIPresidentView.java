package us.martink.UI.GUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.UI.UIAbstraction.IPresidentView;

import javax.swing.*;

/**
 * Created by tadas.
 */
public class GUIPresidentView implements IPresidentView{
    @Override
    public void notify(President subject) {
        JOptionPane.showMessageDialog(null ,"President's danger level\n" +
                "ID: " + subject.getID() +
                "\nName : " + subject.getFirstName() + " " + subject.getLastName() +
                "\nDanger level: " + subject.getDangerLevel());
    }

    @Override
    public void show() {
        throw new NotImplementedException();
    }
}
