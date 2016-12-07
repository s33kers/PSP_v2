package us.martink.UI.UIAbstraction;

import us.martink.Domain.DomainAbstraction.President.PresidentRepository;

/**
 * Created by tadas.
 */
public interface INewsView {
    void show(PresidentRepository repository);
}
