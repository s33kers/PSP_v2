package us.martink.Domain.DomainAbstraction.President;

/**
 * Created by tadas.
 */
public class PresidentMemento {

    public int ID;
    public String firstName;
    public String lastName;
    public int dangerLevel;

    public PresidentMemento(String firstName, String lastName, int dangerLevel, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dangerLevel = dangerLevel;
        ID = id;
    }
}
