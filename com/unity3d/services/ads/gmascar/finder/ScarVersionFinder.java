package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.log.DeviceLog;

public class ScarVersionFinder implements IInitializationStatusListener {
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private int _gmaSdkVersionCode;
    private static IMobileAdsBridge _mobileAdsBridge;
    private PresenceDetector _presenceDetector;

    public ScarVersionFinder(IMobileAdsBridge iMobileAdsBridge0, PresenceDetector presenceDetector0, GMAInitializer gMAInitializer0, GMAEventSender gMAEventSender0) {
        this._gmaSdkVersionCode = -1;
        ScarVersionFinder._mobileAdsBridge = iMobileAdsBridge0;
        this._presenceDetector = presenceDetector0;
        this._gmaInitializer = gMAInitializer0;
        this._gmaEventSender = gMAEventSender0;
        gMAInitializer0.getInitializeListenerBridge().setStatusListener(this);
    }

    public void findAndSendVersion(boolean z) {
        String s = z ? ScarVersionFinder._mobileAdsBridge.getVersionString() : "0.0.0";
        this._gmaEventSender.sendVersion(s);
    }

    public void getVersion() {
        try {
            if(!this._presenceDetector.areGMAClassesPresent()) {
                this._gmaEventSender.sendVersion("0.0.0");
                return;
            }
            if(this._gmaInitializer.shouldInitialize()) {
                this._gmaInitializer.initializeGMA();
                return;
            }
            this.findAndSendVersion(true);
            return;
        }
        catch(Exception exception0) {
        }
        DeviceLog.debug("Got exception finding GMA SDK: %s", new Object[]{exception0.getLocalizedMessage()});
    }

    public int getVersionCode() {
        if(this._gmaSdkVersionCode == -1) {
            String s = ScarVersionFinder._mobileAdsBridge.getVersionString();
            if(s != null) {
                String[] arr_s = s.split("\\.");
                int v = ScarVersionFinder._mobileAdsBridge.getVersionCodeIndex();
                if(arr_s.length > v) {
                    try {
                        this._gmaSdkVersionCode = Integer.parseInt(arr_s[ScarVersionFinder._mobileAdsBridge.getVersionCodeIndex()]);
                        return this._gmaSdkVersionCode;
                    }
                    catch(NumberFormatException numberFormatException0) {
                        DeviceLog.debug("Could not parse %s to an Integer: %s", new Object[]{arr_s[ScarVersionFinder._mobileAdsBridge.getVersionCodeIndex()], numberFormatException0.getLocalizedMessage()});
                    }
                }
            }
        }
        return this._gmaSdkVersionCode;
    }

    @Override  // com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener
    public void onInitializationComplete(Object object0) {
        this.findAndSendVersion(this._gmaInitializer.initSuccessful(object0));
    }
}

