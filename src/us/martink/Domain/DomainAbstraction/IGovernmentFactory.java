package us.martink.Domain.DomainAbstraction;

import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public interface IGovernmentFactory {

    Agent createAgent();

    President createPresident(String name, String lastName);
}
