package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final boolean _isBannerEnabled;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final AtomicReference signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    public BiddingBaseManager(boolean z, IUnityAdsTokenListener iUnityAdsTokenListener0) {
        this(z, iUnityAdsTokenListener0, new ScarRequestHandler());
    }

    public BiddingBaseManager(boolean z, IUnityAdsTokenListener iUnityAdsTokenListener0, ScarRequestHandler scarRequestHandler0) {
        boolean z1 = false;
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference();
        this.tokenIdentifier = "9d0b01d0-9a92-4ba0-a246-4da9e4be5f3d";
        this._isBannerEnabled = z;
        this.unityAdsTokenListener = iUnityAdsTokenListener0;
        if(iUnityAdsTokenListener0 != null) {
            z1 = true;
        }
        this._isAsyncTokenCall = z1;
        this._scarRequestHandler = scarRequestHandler0;
    }

    private void attemptUpload() {
        synchronized(this) {
            if(this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
                this.uploadSignals();
            }
        }
    }

    public void fetchSignals() {
        this.getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(() -> {
            GMA gMA0 = GMA.getInstance();
            com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1 biddingBaseManager$10 = new com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1(this);
            gMA0.getSCARBiddingSignals(this._isBannerEnabled, biddingBaseManager$10);
        }).start();

        class com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1 implements IBiddingSignalsListener {
            @Override  // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(String s) {
                BiddingBaseManager.this.sendFetchResult(s);
            }

            @Override  // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(BiddingSignals biddingSignals0) {
                BiddingBaseManager.this.onSignalsReady(biddingSignals0);
                BiddingBaseManager.this.sendFetchResult("");
            }
        }

    }

    @Override  // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getFormattedToken(String s) {
        if(s != null && !s.isEmpty()) {
            String s1 = this.getTokenIdentifier();
            return s1 == null || s1.isEmpty() ? s : String.format("%s:%s", s1, s);
        }
        return null;
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
    }

    @Override  // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    // 检测为 Lambda 实现
    private void lambda$fetchSignals$1() [...]

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsTokenReady$0(String s) [...]

    // 检测为 Lambda 实现
    private void lambda$uploadSignals$2(BiddingSignals biddingSignals0) [...]

    public void onSignalsReady(BiddingSignals biddingSignals0) {
        this.signals.set(biddingSignals0);
        this.attemptUpload();
    }

    @Override  // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(String s) {
        if(this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(() -> this.unityAdsTokenListener.onUnityAdsTokenReady(s));
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        this.attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String s) {
        if(s != "") {
            this.getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, s));
            return;
        }
        this.getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
    }

    public abstract void start();

    public void uploadSignals() {
        this.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        BiddingSignals biddingSignals0 = (BiddingSignals)this.signals.get();
        if(biddingSignals0 != null && !biddingSignals0.isEmpty()) {
            new Thread(() -> try {
                this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals0, "https://scar.unityads.unity3d.com/v1/capture-scar-signals");
                this.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
            }
            catch(Exception exception0) {
                this.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, exception0.getLocalizedMessage()));
            }).start();
            return;
        }
        this.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
    }
}

