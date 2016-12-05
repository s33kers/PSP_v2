package us.martink.Domain.DomainAbstraction.President;

/**
 * Created by tadas.
 */
public class PresidentMemento {

    public int ID;
    public String firstName;
    public String lastName;
    public int dangerLevel;
    public int corruptionLevel;

    public PresidentMemento(String firstName, String lastName, int dangerLevel, int corruptionLevel, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dangerLevel = dangerLevel;
        this.corruptionLevel = corruptionLevel;
        ID = id;
    }
}
