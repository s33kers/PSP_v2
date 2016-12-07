package us.martink.Domain.RussianGov;

import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentMemento;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tadas.
 */
public class RussianPresident extends President{

    private Map<String, Object> state = new HashMap<>();

    @Override
    public int getDangerLevel() {
        return Integer.parseInt(state.get("DangerLevel").toString());
    }

    @Override
    public String getFirstName() {
        return state.get("FirstName").toString();
    }

    @Override
    public String getLastName() {
        return state.get("LastName").toString();
    }

    public RussianPresident (String firstName, String lastName) {
        state.put("CorruptionLevel", 0);
        state.put("DangerLevel", 0);
        state.put("EndangermentCapability", 2);
        state.put("FirstName", firstName);
        state.put("LastName", lastName);
    }

    @Override
    public void endangerMySelf() {
        increaseDangerLevel((int)state.get("EndangermentCapability"));
    }

    @Override
    protected void increaseDangerLevel(int increaseBy) {
        int currDanger = (int)state.get("DangerLevel");
        currDanger += increaseBy;
        state.replace("DangerLevel", currDanger);

        notifyObservers();
    }

    @Override
    public void reduceDangerLevel(int reduceBy) {
        int currDanger = (int)state.get("DangerLevel");
        currDanger += reduceBy;
        state.replace("DangerLevel", currDanger);

    }

    @Override
    public void restoreFromMemento(PresidentMemento memento) {
        state.replace("FirstName", memento.firstName);
        state.replace("LastName", memento.lastName);
        state.replace("DangerLevel", memento.dangerLevel);
    }
}
