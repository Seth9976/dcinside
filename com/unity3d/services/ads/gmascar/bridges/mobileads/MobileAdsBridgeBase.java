package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Map;

public abstract class MobileAdsBridgeBase extends GenericBridge implements IMobileAdsBridge {
    public static final String initializationStatusMethodName = "getInitializationStatus";
    public static final String initializeMethodName = "initialize";

    public MobileAdsBridgeBase(Map map0) {
        super(map0);
    }

    @Override  // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() [...] // Inlined contents

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public Object getInitializationStatus() {
        return this.callNonVoidMethod("getInitializationStatus", null, new Object[0]);
    }

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public String getVersionString() {
        Object object0 = this.callNonVoidMethod(this.getVersionMethodName(), null, new Object[0]);
        return object0 == null ? "0.0.0" : object0.toString();
    }

    public abstract boolean hasSCARBiddingSupport();

    @Override  // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public void initialize(Context context0, Object object0) {
        this.callVoidMethod("initialize", null, new Object[]{context0, object0});
    }
}

