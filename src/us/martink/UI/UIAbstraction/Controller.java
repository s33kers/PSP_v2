package us.martink.UI.UIAbstraction;

import us.martink.Command.CommandAbstraction.Command;
import us.martink.Command.CommandAbstraction.CommandProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tadas.
 */
public abstract class Controller {
    private List<Command> commands = new ArrayList<>();
    public CommandProcessor Processor = new CommandProcessor();

    public abstract void beginEventLoop();

    public abstract void showMenu();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }
}
