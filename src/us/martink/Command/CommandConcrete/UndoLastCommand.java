package us.martink.Command.CommandConcrete;

import us.martink.Command.CommandAbstraction.Command;
import us.martink.Command.CommandAbstraction.CommandProcessor;
import us.martink.Command.CommandAbstraction.IUndoCommand;
import us.martink.Command.CommandAbstraction.IUndoableCommand;

/**
 * Created by tadas.
 */
public class UndoLastCommand extends Command implements IUndoCommand{

    CommandProcessor processor;

    public UndoLastCommand(CommandProcessor processor)
    {
        this.processor = processor;
        setName("Undo");
    }
    @Override
    public void execute() {
        processor.undoLastCommand();
    }
}
