package us.martink.Domain.RussianGov;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public class KGBAgent extends Agent {

    private final int RUSSIAN_REMOVE_DANGER_CAPACITY = 1;

    public KGBAgent() {
        super();
        setRemoveDangerCapacity(RUSSIAN_REMOVE_DANGER_CAPACITY);
    }

    @Override
    public void saveThePresident(President president) {
        if(president.getDangerLevel() > 5) {
            saveThePresident(president);
        }
    }

    @Override
    public void notify(President president) {
        president.reduceDangerLevel(getRemoveDangerCapacity());
    }
}
