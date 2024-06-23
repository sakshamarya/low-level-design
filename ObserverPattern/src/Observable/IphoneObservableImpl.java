package Observable;

import Observer.ItemObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements ItemObservable{
    List<ItemObserver> observerList = new ArrayList<>();
    ItemObservableData data = new ItemObservableData("Iphone", 0);

    @Override
    public void addObserver(ItemObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(ItemObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ItemObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setData(ItemObservableData data) {
        this.data.quantity += data.quantity;
        notifyObservers();
    }

    @Override
    public ItemObservableData getData() {
        return data;
    }
}
