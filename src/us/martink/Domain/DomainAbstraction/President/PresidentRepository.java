package us.martink.Domain.DomainAbstraction.President;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tadas.
 */
public class PresidentRepository {
    private List<President> presidents = new ArrayList<>();

    public void addElement(President president) {
        presidents.add(president);
    }

    public President getElementByID(int ID) {
        return presidents.stream().filter(a -> a.getID() == ID).findFirst().orElse(null);
    }

    public List<President> getPresidents() {
        return presidents;
    }
}
