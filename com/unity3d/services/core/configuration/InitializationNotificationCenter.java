package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private HashMap _sdkListeners;
    private static InitializationNotificationCenter instance;

    static {
    }

    public InitializationNotificationCenter() {
        this._sdkListeners = new HashMap();
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener0) {
        synchronized(this._sdkListeners) {
            if(iInitializationListener0 != null) {
                this._sdkListeners.put(new Integer(iInitializationListener0.hashCode()), iInitializationListener0);
            }
        }
    }

    public static InitializationNotificationCenter getInstance() {
        if(InitializationNotificationCenter.instance == null) {
            InitializationNotificationCenter.instance = new InitializationNotificationCenter();
        }
        return InitializationNotificationCenter.instance;
    }

    private void removeListener(Integer integer0) {
        this._sdkListeners.remove(integer0);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener0) {
        synchronized(this._sdkListeners) {
            if(iInitializationListener0 != null) {
                this.removeListener(new Integer(iInitializationListener0.hashCode()));
            }
        }
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String s, ErrorState errorState0, int v) {
        synchronized(this._sdkListeners) {
            DeviceLog.error(("SDK Failed to Initialize due to " + s));
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this._sdkListeners.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() == null) {
                    arrayList0.add(((Integer)map$Entry0.getKey()));
                }
                else {
                    Utilities.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ((IInitializationListener)map$Entry0.getValue()).onSdkInitializationFailed("SDK Failed to Initialize due to " + s, errorState0, v);
                        }
                    });
                }
            }
            for(Object object1: arrayList0) {
                this._sdkListeners.remove(((Integer)object1));
            }
        }
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized(this._sdkListeners) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this._sdkListeners.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() == null) {
                    arrayList0.add(((Integer)map$Entry0.getKey()));
                }
                else {
                    Utilities.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ((IInitializationListener)map$Entry0.getValue()).onSdkInitialized();
                        }
                    });
                }
            }
            for(Object object1: arrayList0) {
                this._sdkListeners.remove(((Integer)object1));
            }
        }
    }
}

