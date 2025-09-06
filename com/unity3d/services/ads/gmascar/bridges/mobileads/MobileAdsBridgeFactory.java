package com.unity3d.services.ads.gmascar.bridges.mobileads;

public class MobileAdsBridgeFactory {
    public MobileAdsBridgeBase createMobileAdsBridge() {
        MobileAdsBridgeBase mobileAdsBridgeBase0 = new MobileAdsBridge();
        return mobileAdsBridgeBase0.exists() ? mobileAdsBridgeBase0 : null;
    }
}

