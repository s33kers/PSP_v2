package us.martink.Command.CommandAbstraction;

/**
 * Created by tadas.
 */
public abstract class Command {

    private String name;

    public abstract void execute();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
