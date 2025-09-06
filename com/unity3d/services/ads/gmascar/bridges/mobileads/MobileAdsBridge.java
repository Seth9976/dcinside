package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;

public class MobileAdsBridge extends MobileAdsBridgeBase {
    public static final int CODE_21 = 21;
    private ConfigurationReader _configurationReader;
    public static final String versionMethodName = "getVersion";

    public MobileAdsBridge() {
        super(new com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.1());
        this._configurationReader = new ConfigurationReader();

        class com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.1 extends HashMap {
            com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.1() throws RuntimeException, Error {
                try {
                    this.put("initialize", new Class[]{Context.class, OnInitializationCompleteListener.class});
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", new Object[]{classNotFoundException0.getLocalizedMessage()});
                }
                this.put("getInitializationStatus", new Class[0]);
                this.put("getVersion", new Class[0]);
            }
        }

    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public ScarAdapterVersion getAdapterVersion(int v) {
        if(v == -1) {
            return ScarAdapterVersion.NA;
        }
        return v >= 23 ? ScarAdapterVersion.V23 : ScarAdapterVersion.V21;
    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public int getVersionCodeIndex() {
        return 0;
    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public String getVersionMethodName() {
        return "getVersion";
    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase
    public boolean hasSCARBiddingSupport() {
        return true;
    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public boolean shouldInitialize() {
        return this._configurationReader.getCurrentConfiguration().getExperiments().isScarInitEnabled();
    }
}

