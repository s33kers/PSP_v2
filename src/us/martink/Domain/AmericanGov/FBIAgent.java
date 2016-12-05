package us.martink.Domain.AmericanGov;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
//TODO: extends or impl?
public class FBIAgent extends Agent {

    private final int AMERICAN_REMOVE_DANGER_CAPACITY = 30;

    public FBIAgent() {
        super();
        setRemoveDangerCapacity(AMERICAN_REMOVE_DANGER_CAPACITY);
    }

    @Override
    public void saveThePresident(President president) {
        if(president.getDangerLevel() > 12) {
            saveThePresident(president);
        }
    }

    @Override
    public void notify(President president) {
        president.reduceDangerLevel(getRemoveDangerCapacity());
    }
}
