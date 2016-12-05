package us.martink.Domain.RussianGov;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.IGovernmentFactory;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public class RussianGovernment implements IGovernmentFactory {

    @Override
    public Agent createAgent() {
        return new KGBAgent();
    }

    @Override
    public President createPresident(String name, String lastName) {
        return new RussianPresident(name, lastName);
    }
}
