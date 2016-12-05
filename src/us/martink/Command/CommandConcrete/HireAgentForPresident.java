package us.martink.Command.CommandConcrete;

import us.martink.Command.CommandAbstraction.Command;
import us.martink.Command.CommandAbstraction.IUndoableCommand;
import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.Agent.AgentRepository;
import us.martink.Domain.DomainAbstraction.IGovernmentFactory;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentRepository;
import us.martink.UI.UIAbstraction.PresidentIdDialog;

/**
 * Created by tadas.
 */
public class HireAgentForPresident extends Command implements IUndoableCommand {

    PresidentIdDialog dialog;
    PresidentRepository presidents;
    AgentRepository agents;
    IGovernmentFactory factory;
    int presidentID;
    int agentID;

    public HireAgentForPresident(PresidentIdDialog dialog, PresidentRepository repo,
                                 IGovernmentFactory factory, AgentRepository agentRepo) {
        this.dialog = dialog;
        presidents = repo;
        this.factory = factory;
        agents = agentRepo;
        setName("Hire agent for selected president");
    }

    @Override
    public void execute() {
        presidentID = dialog.show();

        President president = presidents.getElementByID(presidentID);

        if (president != null) {
            Agent agent = factory.createAgent();
            agents.addElement(agent);
            agentID = agent.getID();

            president.registerObserver(agent);
        }
    }

    @Override
    public void unExecute() {
        if (presidentID != 0) {
            President president = presidents.getElementByID(presidentID);
            Agent agent = agents.getElementByID(agentID);
            president.unRegisterObserver(agent);
        }
    }
}
