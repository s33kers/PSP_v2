package us.martink.Domain.DomainAbstraction.President;

import us.martink.Domain.DomainAbstraction.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tadas.
 */
public abstract class President {

    private static int COUNT_ID = 1;
    private static Object LOCK = new Object();

    protected int ID;
    protected int dangerLevel;
    protected String firstName;
    protected String lastName;

    private List<IObserver<President>> observers = new ArrayList<>();

    public President() {
        synchronized (LOCK) {
            ID = COUNT_ID;
            COUNT_ID++;
        }
    }

    public abstract void endangerMySelf();


    protected abstract void increaseDangerLevel(int increaseBy);

    public abstract void reduceDangerLevel(int reduceBy);

    public void registerObserver(IObserver<President> observer) {
        observers.add(observer);
    }

    public void unRegisterObserver(IObserver<President> observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (IObserver<President> observer : observers) {
            observer.notify(this);
        }
    }

    public PresidentMemento createMemento() {
        return new PresidentMemento(firstName, lastName, dangerLevel, ID);
    }

    public abstract void restoreFromMemento(PresidentMemento memento);

    public static int getCountId() {
        return COUNT_ID;
    }

    public static void setCountId(int countId) {
        COUNT_ID = countId;
    }

    public static Object getLOCK() {
        return LOCK;
    }

    public static void setLOCK(Object LOCK) {
        President.LOCK = LOCK;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<IObserver<President>> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver<President>> observers) {
        this.observers = observers;
    }
}
