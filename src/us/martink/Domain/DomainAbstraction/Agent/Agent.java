package us.martink.Domain.DomainAbstraction.Agent;

import us.martink.Domain.DomainAbstraction.IObserver;
import us.martink.Domain.DomainAbstraction.President.President;

/**
 * Created by tadas.
 */
public abstract class Agent implements IObserver<President> {

    private static int COUNT_ID = 1;
    private static Object LOCK = new Object();
    private int ID;
    private int removeDangerCapacity = 0;

    public Agent() {
        synchronized (LOCK) {
            ID = COUNT_ID;
            COUNT_ID++;
        }

    }

    public abstract void saveThePresident(President president);
    public abstract void notify(President president);

    public static int getCountId() {
        return COUNT_ID;
    }

    public static void setCountId(int countId) {
        COUNT_ID = countId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRemoveDangerCapacity() {
        return removeDangerCapacity;
    }

    public void setRemoveDangerCapacity(int removeDangerCapacity) {
        this.removeDangerCapacity = removeDangerCapacity;
    }
}
