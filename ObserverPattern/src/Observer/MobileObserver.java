package Observer;

import Observable.ItemObservable;

public class MobileObserver implements ItemObserver{
    String mobileNumber;
    ItemObservable itemObservable;
    public MobileObserver(ItemObservable itemObservable, String mobileNumber){
        this.mobileNumber = mobileNumber;
        this.itemObservable = itemObservable;
    }
    @Override
    public void update() {
        System.out.println("Item stock update QTY: "+ itemObservable.getData().quantity + ", mobile: " + mobileNumber);
    }
}
