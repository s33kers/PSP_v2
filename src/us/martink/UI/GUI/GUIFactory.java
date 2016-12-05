package us.martink.UI.GUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.UI.UIAbstraction.*;

/**
 * Created by tadas.
 */
public class GUIFactory implements UIFactory {
    @Override
    public Controller createController() {
        throw new NotImplementedException();
    }

    @Override
    public INewsView createNewsView() {
        throw new NotImplementedException();
    }

    @Override
    public PresidentIdDialog createPresidentIdDialog() {
        throw new NotImplementedException();
    }

    @Override
    public IPresidentView createPresidentView() {
        throw new NotImplementedException();
    }
}
