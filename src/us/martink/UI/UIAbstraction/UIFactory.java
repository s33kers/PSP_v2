package us.martink.UI.UIAbstraction;

/**
 * Created by tadas.
 */
public interface UIFactory {

    Controller createController();

    INewsView createNewsView();

    PresidentIdDialog createPresidentIdDialog();

    IPresidentView createPresidentView();
}
