package us.martink.UI.ConsoleUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.UI.UIAbstraction.*;

/**
 * Created by tadas.
 */
public class ConsoleFactory implements UIFactory {
    @Override
    public Controller createController() {
        return new ConsoleController();
    }

    @Override
    public INewsView createNewsView() {
        return new ConsoleNewsView();
    }

    @Override
    public PresidentIdDialog createPresidentIdDialog() {
        return new ConsolePresidentIdDialog();
    }

    @Override
    public IPresidentView createPresidentView() {
        return new ConsolePresidentView();
    }
}
