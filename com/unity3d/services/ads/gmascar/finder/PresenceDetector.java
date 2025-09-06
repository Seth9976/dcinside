package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

public class PresenceDetector {
    private AdapterStatusBridge _adapterStatusBridge;
    private InitializeListenerBridge _initializationListenerBridge;
    private InitializationStatusBridge _initializationStatusBridge;
    private MobileAdsBridgeBase _mobileAdsBridge;

    public PresenceDetector(MobileAdsBridgeBase mobileAdsBridgeBase0, InitializeListenerBridge initializeListenerBridge0, InitializationStatusBridge initializationStatusBridge0, AdapterStatusBridge adapterStatusBridge0) {
        this._mobileAdsBridge = mobileAdsBridgeBase0;
        this._initializationListenerBridge = initializeListenerBridge0;
        this._initializationStatusBridge = initializationStatusBridge0;
        this._adapterStatusBridge = adapterStatusBridge0;
    }

    // 去混淆评级： 低(40)
    public boolean areGMAClassesPresent() {
        return this._mobileAdsBridge != null && this._initializationListenerBridge != null && this._initializationStatusBridge != null && this._adapterStatusBridge != null && this._mobileAdsBridge.exists() && this._initializationListenerBridge.exists() && this._initializationStatusBridge.exists() && this._adapterStatusBridge.exists();
    }
}

