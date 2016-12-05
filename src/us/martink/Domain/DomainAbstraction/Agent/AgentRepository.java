package us.martink.Domain.DomainAbstraction.Agent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tadas.
 */
public class AgentRepository {
    private List<Agent> agents = new ArrayList<>();

    public void addElement(Agent agent) {
        agents.add(agent);
    }

    public Agent getElementByID(int ID) {
        return agents.stream().filter(a -> a.getID() == ID).findFirst().orElse(null);
    }
}
