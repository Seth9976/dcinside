package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.AdModule;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback;
import com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocation;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseLoadModule extends AdModule implements ILoadModule {
    static final String errorMsgFailedToCreateLoadRequest = "[UnityAds] Failed to create load request";
    static final String errorMsgInternalCommunicationFailure = "[UnityAds] Internal communication failure";
    static final String errorMsgInternalCommunicationTimeout = "[UnityAds] Internal communication timeout";
    static final String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";

    public BaseLoadModule(SDKMetricsSender sDKMetricsSender0) {
        super(sDKMetricsSender0);
    }

    abstract void addOptionalParameters(LoadOperationState arg1, JSONObject arg2) throws JSONException;

    JSONObject buildBaseOptions(LoadOperationState loadOperationState0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("headerBiddingOptions", loadOperationState0.loadOptions.getData());
        return jSONObject0;
    }

    JSONObject buildBaseParameters(LoadOperationState loadOperationState0, LoadOperation loadOperation0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = this.buildBaseOptions(loadOperationState0);
        jSONObject1.put("headerBiddingOptions", loadOperationState0.loadOptions.getData());
        jSONObject0.put("options", jSONObject1);
        jSONObject0.put("listenerId", loadOperation0.getId());
        jSONObject0.put("placementId", loadOperationState0.placementId);
        jSONObject0.put("time", Device.getElapsedRealtime());
        this.addOptionalParameters(loadOperationState0, jSONObject0);
        return jSONObject0;
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, LoadOperationState loadOperationState0) {
        JSONObject jSONObject0;
        if(TextUtils.isEmpty(loadOperationState0.placementId)) {
            this.sendOnUnityAdsFailedToLoad(loadOperationState0, UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        LoadOperation loadOperation0 = new LoadOperation(loadOperationState0, new WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker0, new IWebViewBridgeInvocationCallback() {
            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onFailure(String s, CallbackStatus callbackStatus0) {
                Long long0 = loadOperationState0.duration();
                boolean z = loadOperationState0.isHeaderBidding();
                Metric metric0 = AdOperationMetric.newAdLoadFailure(AdOperationError.callback_error, long0, false, z);
                BaseLoadModule.this.getMetricSender().sendMetricWithInitState(metric0);
                BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState0, UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
                BaseLoadModule.this.remove(loadOperationState0.getId());
            }

            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onSuccess() {
            }

            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onTimeout() {
                Long long0 = loadOperationState0.duration();
                boolean z = loadOperationState0.isHeaderBidding();
                Metric metric0 = AdOperationMetric.newAdLoadFailure(AdOperationError.callback_timeout, long0, false, z);
                BaseLoadModule.this.getMetricSender().sendMetricWithInitState(metric0);
                BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState0, UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
                BaseLoadModule.this.remove(loadOperationState0.getId());
            }
        }));
        try {
            jSONObject0 = this.buildBaseParameters(loadOperationState0, loadOperation0);
        }
        catch(JSONException | NullPointerException unused_ex) {
            this.sendOnUnityAdsFailedToLoad(loadOperationState0, UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
            return;
        }
        this.set(loadOperation0);
        loadOperation0.invoke(loadOperationState0.configuration.getWebViewBridgeTimeout(), new Object[]{jSONObject0});
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((LoadOperationState)object0));
    }

    @Override  // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(String s) {
        ILoadOperation iLoadOperation0 = (ILoadOperation)this.get(s);
        if(iLoadOperation0 != null && iLoadOperation0.getLoadOperationState() != null) {
            LoadOperationState loadOperationState0 = iLoadOperation0.getLoadOperationState();
            this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadSuccess(loadOperationState0.duration(), false, loadOperationState0.isHeaderBidding()));
            iLoadOperation0.onUnityAdsAdLoaded(loadOperationState0.placementId);
            this.remove(s);
        }
    }

    @Override  // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
        ILoadOperation iLoadOperation0 = (ILoadOperation)this.get(s);
        if(iLoadOperation0 != null && iLoadOperation0.getLoadOperationState() != null) {
            LoadOperationState loadOperationState0 = iLoadOperation0.getLoadOperationState();
            this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAds$UnityAdsLoadError0, loadOperationState0.duration(), false, loadOperationState0.isHeaderBidding()));
            iLoadOperation0.onUnityAdsFailedToLoad(loadOperationState0.placementId, unityAds$UnityAdsLoadError0, s1);
            this.remove(s);
        }
    }

    private void sendOnUnityAdsFailedToLoad(LoadOperationState loadOperationState0, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s, boolean z) {
        if(loadOperationState0 != null && loadOperationState0.listener != null) {
            if(z) {
                this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAds$UnityAdsLoadError0, loadOperationState0.duration(), false, loadOperationState0.isHeaderBidding()));
            }
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    loadOperationState0.onUnityAdsFailedToLoad(unityAds$UnityAdsLoadError0, s);
                }
            });
        }
    }
}

