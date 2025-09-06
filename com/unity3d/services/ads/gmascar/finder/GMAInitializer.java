package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;

public class GMAInitializer {
    private AdapterStatusBridge _adapterStatusBridge;
    private GMAEventSender _gmaEventSender;
    private InitializeListenerBridge _initializationListenerBridge;
    private InitializationStatusBridge _initializationStatusBridge;
    private MobileAdsBridgeBase _mobileAdsBridge;

    public GMAInitializer(MobileAdsBridgeBase mobileAdsBridgeBase0, InitializeListenerBridge initializeListenerBridge0, InitializationStatusBridge initializationStatusBridge0, AdapterStatusBridge adapterStatusBridge0, GMAEventSender gMAEventSender0) {
        this._mobileAdsBridge = mobileAdsBridgeBase0;
        this._initializationListenerBridge = initializeListenerBridge0;
        this._initializationStatusBridge = initializationStatusBridge0;
        this._adapterStatusBridge = adapterStatusBridge0;
        this._gmaEventSender = gMAEventSender0;
    }

    public InitializeListenerBridge getInitializeListenerBridge() {
        return this._initializationListenerBridge;
    }

    public boolean initSuccessful(Object object0) {
        Object object1 = this._initializationStatusBridge.getAdapterStatusMap(object0).get("com.google.android.gms.ads.MobileAds");
        if(object1 != null) {
            if(this._adapterStatusBridge.isGMAInitialized(object1)) {
                this._gmaEventSender.send(c.d, new Object[0]);
                return true;
            }
            this._gmaEventSender.send(c.e, new Object[0]);
        }
        return false;
    }

    public void initializeGMA() {
        if(this.shouldInitialize()) {
            this._mobileAdsBridge.initialize(ClientProperties.getApplicationContext(), this._initializationListenerBridge.createInitializeListenerProxy());
        }
    }

    public boolean isInitialized() {
        try {
            return this.initSuccessful(this._mobileAdsBridge.getInitializationStatus());
        }
        catch(Exception exception0) {
            DeviceLog.debug("ERROR: Could not get initialization status of GMA SDK - %s", new Object[]{exception0.getLocalizedMessage()});
            return false;
        }
    }

    public boolean shouldInitialize() {
        if(this.isInitialized()) {
            this._gmaEventSender.send(c.c, new Object[0]);
            return false;
        }
        return this._mobileAdsBridge.shouldInitialize();
    }
}

