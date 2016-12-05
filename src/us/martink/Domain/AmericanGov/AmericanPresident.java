package us.martink.Domain.AmericanGov;

import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentMemento;

/**
 * Created by tadas.
 */
public class AmericanPresident extends President{

    private final int ENDANGERMENT_CAPABILITY = 7;
    private final int CORRUPTION_CAPABILITY = 1;

    private int ID;
    private int corruptionLevel;
    private int dangerLevel;
    private String firstName;
    private String lastName;

    public AmericanPresident(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dangerLevel = 0;
        this.corruptionLevel = 0;
    }

    @Override
    public void endangerMySelf() {
        increaseDangerLevel(ENDANGERMENT_CAPABILITY);
    }

    @Override
    public void actCorrupt() {
        increaseCorruptionLevel(CORRUPTION_CAPABILITY);
    }

    @Override
    protected void increaseDangerLevel(int increaseBy) {
        dangerLevel += increaseBy;
        notifyObservers();
    }

    @Override
    public void reduceDangerLevel(int reduceBy) {
        dangerLevel -= reduceBy;
    }

    @Override
    protected void increaseCorruptionLevel(int increaseBy) {
        corruptionLevel += increaseBy;
        notifyObservers();
    }

    @Override
    public void restoreFromMemento(PresidentMemento memento) {
        //TODO: make private fields, set values
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int getCorruptionLevel() {
        return corruptionLevel;
    }

    @Override
    public void setCorruptionLevel(int corruptionLevel) {
        this.corruptionLevel = corruptionLevel;
    }

    @Override
    public int getDangerLevel() {
        return dangerLevel;
    }

    @Override
    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
