package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.misc.Observable;

public class PrivacyConfigStorage extends Observable {
    private static PrivacyConfigStorage _instance;
    private PrivacyConfig _privacyConfig;

    private PrivacyConfigStorage() {
        this._privacyConfig = new PrivacyConfig();
    }

    public static PrivacyConfigStorage getInstance() {
        if(PrivacyConfigStorage._instance == null) {
            PrivacyConfigStorage._instance = new PrivacyConfigStorage();
        }
        return PrivacyConfigStorage._instance;
    }

    public PrivacyConfig getPrivacyConfig() {
        synchronized(this) {
        }
        return this._privacyConfig;
    }

    @Override  // com.unity3d.services.core.misc.Observable
    public void registerObserver(IObserver iObserver0) {
        synchronized(this) {
            super.registerObserver(iObserver0);
            if(this._privacyConfig.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
                iObserver0.updated(this._privacyConfig);
            }
        }
    }

    public void setPrivacyConfig(PrivacyConfig privacyConfig0) {
        synchronized(this) {
            this._privacyConfig = privacyConfig0;
            this.notifyObservers(privacyConfig0);
        }
    }
}

