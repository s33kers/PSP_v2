package us.martink;

import us.martink.Command.CommandAbstraction.Command;
import us.martink.Command.CommandConcrete.CreateNewPresident;
import us.martink.Command.CommandConcrete.EndangerPresident;
import us.martink.Command.CommandConcrete.HireAgentForPresident;
import us.martink.Command.CommandConcrete.UndoLastCommand;
import us.martink.Domain.AmericanGov.AmericanGovernment;
import us.martink.Domain.DomainAbstraction.Agent.Agent;
import us.martink.Domain.DomainAbstraction.Agent.AgentRepository;
import us.martink.Domain.DomainAbstraction.IGovernmentFactory;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentRepository;
import us.martink.Domain.RussianGov.RussianGovernment;
import us.martink.UI.GUI.GUIFactory;
import us.martink.UI.UIAbstraction.Controller;
import us.martink.UI.UIAbstraction.IPresidentView;
import us.martink.UI.UIAbstraction.UIFactory;

import java.io.Console;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //1. sukuriame UIFactory pagal norimą UI šeimą
        UIFactory uiFactory = new GUIFactory();

        //2. sukuriame DomainFactory pagal norimą domeno šeimą
        IGovernmentFactory domainFactory = new AmericanGovernment();

        //firstPartDemo(domainFactory, "Joseph", "Stalin");

        //3. sukuriame domeno repozitorius A ir B
        PresidentRepository presidents = new PresidentRepository();
        AgentRepository agents = new AgentRepository();

        //4. sukuriame kontrolerį (naudojame UIFactory) ir komandų procesorių
        Controller controller = uiFactory.createController();

        IPresidentView presidentsObserver = uiFactory.createPresidentView();

        //5. sukuriame komandas(jas inicializuojame reikiamomis priklausomybėmis)
        //  ir užpildome komandomis kontrolerio meniu
        Command createNewPresident = new CreateNewPresident(domainFactory, presidents,
                "Joseph", "Stalin", presidentsObserver);
        Command endangerPresident = new EndangerPresident(uiFactory.createPresidentIdDialog(), presidents);

        Command hireAgent = new HireAgentForPresident(uiFactory.createPresidentIdDialog(),
                presidents, domainFactory, agents);

        Command undo = new UndoLastCommand(controller.getProcessor());

        controller.addCommand(createNewPresident);
        controller.addCommand(endangerPresident);
        controller.addCommand(hireAgent);
        controller.addCommand(undo);

        //6. paleidžiame kontrolerio įvykių ciklą
        controller.showMenu();
    }
    private static void firstPartDemo(IGovernmentFactory factory, String presidentFirstName, String presidentLastName)
    {
        President president = factory.createPresident(presidentFirstName, presidentLastName);

        Agent agent1 = factory.createAgent();
        Agent agent2 = factory.createAgent();
        Agent agent3 = factory.createAgent();

        president.registerObserver(agent1);
        president.registerObserver(agent2);
        president.registerObserver(agent3);

        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
        System.out.println("President endangers. Danger level: " + president.getDangerLevel());
        president.endangerMySelf();
    }

}
