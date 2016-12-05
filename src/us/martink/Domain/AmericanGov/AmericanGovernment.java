package us.martink.Domain.AmericanGov;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.IGovernmentFactory;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public class AmericanGovernment implements IGovernmentFactory {

    @Override
    public Agent createAgent() {
        return new FBIAgent();
    }

    @Override
    public President createPresident(String name, String lastName) {
        return new AmericanPresident(name, lastName);
    }
}
