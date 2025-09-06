package com.unity3d.services.ads.gmascar;

import P2.d;
import P2.e;
import android.content.Context;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import y4.m;

public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private f _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(@m MobileAdsBridgeBase mobileAdsBridgeBase0, InitializeListenerBridge initializeListenerBridge0, InitializationStatusBridge initializationStatusBridge0, AdapterStatusBridge adapterStatusBridge0, WebViewErrorHandler webViewErrorHandler0, ScarAdapterFactory scarAdapterFactory0, GMAEventSender gMAEventSender0) {
        this._initializationStatusBridge = initializationStatusBridge0;
        this._initializationListenerBridge = initializeListenerBridge0;
        this._adapterStatusBridge = adapterStatusBridge0;
        this._webViewErrorHandler = webViewErrorHandler0;
        this._scarAdapterFactory = scarAdapterFactory0;
        this._mobileAdsBridge = mobileAdsBridgeBase0;
        this._gmaEventSender = gMAEventSender0;
        PresenceDetector presenceDetector0 = new PresenceDetector(mobileAdsBridgeBase0, initializeListenerBridge0, initializationStatusBridge0, adapterStatusBridge0);
        this._presenceDetector = presenceDetector0;
        GMAInitializer gMAInitializer0 = new GMAInitializer(mobileAdsBridgeBase0, initializeListenerBridge0, initializationStatusBridge0, adapterStatusBridge0, gMAEventSender0);
        this._gmaInitializer = gMAInitializer0;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase0, presenceDetector0, gMAInitializer0, gMAEventSender0);
    }

    public void getSCARBiddingSignals(List list0, BiddingSignalsHandler biddingSignalsHandler0) {
        if(this._mobileAdsBridge != null && this._mobileAdsBridge.hasSCARBiddingSupport()) {
            f f0 = this.getScarAdapterObject();
            this._scarAdapter = f0;
            if(f0 != null) {
                f0.c(ClientProperties.getApplicationContext(), list0, biddingSignalsHandler0);
                return;
            }
            biddingSignalsHandler0.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler0.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }

    public void getSCARBiddingSignals(boolean z, BiddingSignalsHandler biddingSignalsHandler0) {
        if(this._mobileAdsBridge != null && this._mobileAdsBridge.hasSCARBiddingSupport()) {
            f f0 = this.getScarAdapterObject();
            this._scarAdapter = f0;
            if(f0 != null) {
                f0.b(ClientProperties.getApplicationContext(), z, biddingSignalsHandler0);
                return;
            }
            biddingSignalsHandler0.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler0.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }

    public void getSCARSignal(String s, e e0) {
        this._scarAdapter = this.getScarAdapterObject();
        SignalsHandler signalsHandler0 = new SignalsHandler(this._gmaEventSender);
        f f0 = this._scarAdapter;
        if(f0 != null) {
            f0.a(ClientProperties.getApplicationContext(), s, e0, signalsHandler0);
            return;
        }
        b b0 = b.e("Could not create SCAR adapter object");
        this._webViewErrorHandler.handleError(b0);
    }

    private f getScarAdapterObject() {
        if(this._scarAdapter == null) {
            MobileAdsBridgeBase mobileAdsBridgeBase0 = this._mobileAdsBridge;
            if(mobileAdsBridgeBase0 != null) {
                ScarAdapterVersion scarAdapterVersion0 = mobileAdsBridgeBase0.getAdapterVersion(this._scarVersionFinder.getVersionCode());
                this._scarAdapter = this._scarAdapterFactory.createScarAdapter(scarAdapterVersion0, this._webViewErrorHandler);
            }
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer integer0) {
        return new EventSubject(new ArrayDeque(Arrays.asList(new c[]{c.w, c.x, c.y, c.z})), integer0, new DefaultIntervalTimerFactory());
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        if(this._mobileAdsBridge != null && this._mobileAdsBridge.hasSCARBiddingSupport()) {
            f f0 = this.getScarAdapterObject();
            this._scarAdapter = f0;
            return f0 != null;
        }
        return false;
    }

    public void initializeScar() {
        if(this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(c.a, new Object[0]);
            this._gmaInitializer.initializeGMA();
            return;
        }
        b b0 = new b(c.b, new Object[0]);
        this._webViewErrorHandler.handleError(b0);
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String s, String s1, String s2, String s3, int v) {
        d d0 = new d(s, s1, s3, s2, v);
        f f0 = this.getScarAdapterObject();
        this._scarAdapter = f0;
        if(f0 != null) {
            if(z) {
                this.loadInterstitialAd(d0);
                return;
            }
            this.loadRewardedAd(d0);
            return;
        }
        b b0 = b.c(d0, "Scar Adapter object is null");
        this._webViewErrorHandler.handleError(b0);
    }

    public void loadBanner(Context context0, BannerView bannerView0, String s, d d0, UnityBannerSize unityBannerSize0) {
        this._scarAdapter = this.getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler0 = new ScarBannerAdHandler(this._gmaEventSender, s);
        f f0 = this._scarAdapter;
        if(f0 != null) {
            f0.e(context0, bannerView0, d0, unityBannerSize0.getWidth(), unityBannerSize0.getHeight(), scarBannerAdHandler0);
            return;
        }
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_LOAD_FAILED, new Object[]{s});
    }

    private void loadInterstitialAd(d d0) {
        ScarInterstitialAdHandler scarInterstitialAdHandler0 = new ScarInterstitialAdHandler(d0, this.getScarEventSubject(d0.e()), this._gmaEventSender);
        this._scarAdapter.f(ClientProperties.getApplicationContext(), d0, scarInterstitialAdHandler0);
    }

    private void loadRewardedAd(d d0) {
        ScarRewardedAdHandler scarRewardedAdHandler0 = new ScarRewardedAdHandler(d0, this.getScarEventSubject(d0.e()), this._gmaEventSender);
        this._scarAdapter.g(ClientProperties.getApplicationContext(), d0, scarRewardedAdHandler0);
    }

    public void show(String s, String s1) {
        d d0 = new d(s, s1);
        f f0 = this.getScarAdapterObject();
        this._scarAdapter = f0;
        if(f0 != null) {
            f0.d(ClientProperties.getActivity(), s1, s);
            return;
        }
        b b0 = b.d(d0, "Scar Adapter object is null");
        this._webViewErrorHandler.handleError(b0);
    }
}

