package Observer;

import Observable.IphoneObservableImpl;
import Observable.ItemObservable;

public class EmailObserver implements ItemObserver{

    String email;
    ItemObservable itemObservable;

    public EmailObserver(ItemObservable itemObservable, String email){
        this.email = email;
        this.itemObservable = itemObservable;
    }

    @Override
    public void update() {
        System.out.println("Item stock update QTY: "+ itemObservable.getData().quantity + ", email: " + email);
    }
}
