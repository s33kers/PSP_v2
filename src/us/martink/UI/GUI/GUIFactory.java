package us.martink.UI.GUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.UI.UIAbstraction.*;

/**
 * Created by tadas.
 */
public class GUIFactory implements UIFactory {
    @Override
    public Controller createController() {
        return new GUIController();
    }

    @Override
    public INewsView createNewsView() {
        return new GUINewsView();
    }

    @Override
    public PresidentIdDialog createPresidentIdDialog() {
        return new GUIPresidentIdDialog();
    }

    @Override
    public IPresidentView createPresidentView() {
        return new GUIPresidentView();
    }
}
