package Observable;

import Observer.ItemObserver;

public interface ItemObservable {
    public void addObserver(ItemObserver observer);
    public void removeObserver(ItemObserver observer);
    public void notifyObservers();
    public void setData(ItemObservableData data);
    public ItemObservableData getData();

}
