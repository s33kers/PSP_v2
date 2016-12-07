package us.martink.UI.ConsoleUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentRepository;
import us.martink.UI.UIAbstraction.INewsView;

import java.util.StringJoiner;

/**
 * Created by tadas.
 */
public class ConsoleNewsView implements INewsView {
    @Override
    public void show(PresidentRepository repository) {
        StringJoiner joiner = new StringJoiner("\n");
        for (President president : repository.getPresidents()) {
            joiner.add(president.getID() + ". " + president.getFirstName() + " " + president.getLastName() + " DANGER_LEVEL: " + president.getDangerLevel() + " AGENTS: " + president.getObservers().stream().filter(o -> o instanceof Agent).count());
        }
        System.out.println("---\n" + joiner .toString() + "\n---");
    }
}
