package com.unity3d.services.ads.gmascar;

import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;

public class GMA {
    private final GMAScarAdapterBridge _gmaScarAdapterBridge;
    private static GMA instance;

    private GMA(GMAEventSender gMAEventSender0) {
        this._gmaScarAdapterBridge = new GMAScarAdapterBridge(new MobileAdsBridgeFactory().createMobileAdsBridge(), new InitializeListenerBridge(), new InitializationStatusBridge(), new AdapterStatusBridge(), new WebViewErrorHandler(gMAEventSender0), new ScarAdapterFactory(), gMAEventSender0);
    }

    public GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public static GMA getInstance() {
        return GMA.getInstance(new GMAEventSender());
    }

    public static GMA getInstance(GMAEventSender gMAEventSender0) {
        if(GMA.instance == null) {
            GMA.instance = new GMA(gMAEventSender0);
        }
        return GMA.instance;
    }

    public void getSCARBiddingSignals(boolean z, IBiddingSignalsListener iBiddingSignalsListener0) {
        BiddingSignalsHandler biddingSignalsHandler0 = new BiddingSignalsHandler(z, iBiddingSignalsListener0);
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z, biddingSignalsHandler0);
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }
}

