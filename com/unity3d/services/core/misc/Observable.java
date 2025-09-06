package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private final List _observers;

    public Observable() {
        this._observers = new ArrayList();
    }

    protected void notifyObservers(Object object0) {
        synchronized(this) {
            for(Object object1: this._observers) {
                ((IObserver)object1).updated(object0);
            }
        }
    }

    public void registerObserver(IObserver iObserver0) {
        synchronized(this) {
            if(this._observers.contains(iObserver0)) {
                return;
            }
            this._observers.add(iObserver0);
        }
    }

    public void unregisterObserver(IObserver iObserver0) {
        synchronized(this) {
            if(this._observers.contains(iObserver0)) {
                this._observers.remove(iObserver0);
            }
        }
    }
}

