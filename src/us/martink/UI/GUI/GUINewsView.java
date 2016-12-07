package us.martink.UI.GUI;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentRepository;
import us.martink.UI.UIAbstraction.INewsView;

import javax.swing.*;
import java.util.StringJoiner;

/**
 * Created by tadas.
 */
public class GUINewsView implements INewsView {
    @Override
    public void show(PresidentRepository repository) {
        StringJoiner joiner = new StringJoiner("\n");
        for (President president : repository.getPresidents()) {
            joiner.add(president.getID() + ". " + president.getFirstName() + " " + president.getLastName() + " DANGER_LEVEL: " + president.getDangerLevel() + " AGENTS: " + president.getObservers().stream().filter(o -> o instanceof Agent).count());
        }
        JOptionPane.showMessageDialog(null, joiner.toString());
    }
}
