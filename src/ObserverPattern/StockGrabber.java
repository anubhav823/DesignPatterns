package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer obs : observers) {
			obs.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
