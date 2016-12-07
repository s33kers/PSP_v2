package us.martink.Command.CommandConcrete;

import us.martink.Command.CommandAbstraction.Command;
import us.martink.Command.CommandAbstraction.IUndoableCommand;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.Domain.DomainAbstraction.President.PresidentMemento;
import us.martink.Domain.DomainAbstraction.President.PresidentRepository;
import us.martink.UI.UIAbstraction.PresidentIdDialog;

import java.util.Stack;

/**
 * Created by tadas.
 */
public class EndangerPresident extends Command implements IUndoableCommand {

    private PresidentIdDialog dialog;
    private PresidentRepository presidents;
    private Stack<PresidentMemento> mementoes = new Stack<PresidentMemento>();
    private Stack<Integer> presidentIDs = new Stack<>();

    public EndangerPresident(PresidentIdDialog dialog, PresidentRepository repo) {
        this.dialog = dialog;
        this.presidents = repo;
        setName("Endanger selected president");
    }

    @Override
    public void execute() {
        int presidentID = dialog.show();

        President president = presidents.getElementByID(presidentID);

        if (president != null) {
            mementoes.push(president.createMemento());
            presidentIDs.push(presidentID);
            president.endangerMySelf();
        }
    }

    @Override
    public void unExecute() {
        if (mementoes != null) {
            President president = presidents.getElementByID(presidentIDs.pop());
            president.restoreFromMemento(mementoes.pop());
        }

    }
}
