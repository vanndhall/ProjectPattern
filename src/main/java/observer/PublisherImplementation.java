package observer;

import java.util.HashSet;
import java.util.Set;

public class PublisherImplementation implements Publisher {

	private final Set<Observer> observers = new HashSet<>();
    @Override
    public void register(Observer observer1) {
		observers.add(observer1);
    }

    @Override
    public void notifyObservers() {
	observers.forEach((ob -> ob.informed("Test")));
    }

//    @Override
//	public void unregister(Observer observer1){
//    	observers.remove(observer1);
//	}
}
