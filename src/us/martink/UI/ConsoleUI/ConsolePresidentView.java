package us.martink.UI.ConsoleUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.Domain.DomainAbstraction.President.President;
import us.martink.UI.UIAbstraction.IPresidentView;

/**
 * Created by tadas.
 */
public class ConsolePresidentView implements IPresidentView {
    @Override
    public void notify(President subject) {
        throw new NotImplementedException();
    }

    @Override
    public void show() {
        throw new NotImplementedException();
    }
}
