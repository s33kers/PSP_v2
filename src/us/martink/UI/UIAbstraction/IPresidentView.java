package us.martink.UI.UIAbstraction;

import us.martink.Domain.DomainAbstraction.IObserver;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public interface IPresidentView extends IObserver<President> {
    void show();
}
