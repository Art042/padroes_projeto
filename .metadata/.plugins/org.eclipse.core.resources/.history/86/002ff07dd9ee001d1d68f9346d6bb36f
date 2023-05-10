package atividade_3.q_7;

import java.util.ArrayList;
import java.util.List;

public class BingoObservable {
	private List<BingoObserver> observers = new ArrayList<BingoObserver>();

    public void register(BingoObserver observer) {
        observers.add(observer);
    }

    public void unregister(BingoObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BingoObserver observer : observers) {
            observer.update(this);
        }
    }
}
