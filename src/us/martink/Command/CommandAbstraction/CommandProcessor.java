package us.martink.Command.CommandAbstraction;

import java.util.Stack;

/**
 * Created by tadas.
 */
public class CommandProcessor {

    private Stack<Command> commands = new Stack<>();

    public void processCommand(Command command) {
        command.execute();
        if(!(command instanceof IUndoCommand)) {
            commands.push(command);
        }
    }

    public void undoLastCommand() {
        Command command = commands.pop();

        if (command instanceof IUndoableCommand) {
            IUndoableCommand undoableCommand = (IUndoableCommand) command;
            undoableCommand.unExecute();
        }
    }
}