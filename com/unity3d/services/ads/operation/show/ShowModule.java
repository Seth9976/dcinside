package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.ads.operation.AdModule;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.reader.HdrInfoReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
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

public class ShowModule extends AdModule implements IShowModule {
    public static String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";
    private static IShowModule instance;

    static {
    }

    public ShowModule(SDKMetricsSender sDKMetricsSender0) {
        super(sDKMetricsSender0);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, ShowOperationState showOperationState0) {
        if(TextUtils.isEmpty(showOperationState0.placementId)) {
            this.sendOnUnityAdsFailedToShow(showOperationState0, "[UnityAds] Placement ID cannot be null", UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        ShowOperation showOperation0 = new ShowOperation(showOperationState0, new WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker0, new IWebViewBridgeInvocationCallback() {
            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onFailure(String s, CallbackStatus callbackStatus0) {
                Long long0 = showOperationState0.duration();
                Metric metric0 = AdOperationMetric.newAdShowFailure(AdOperationError.callback_error, long0);
                ShowModule.this.getMetricSender().sendMetricWithInitState(metric0);
                ShowModule.this.sendOnUnityAdsFailedToShow(showOperationState0, s, UnityAdsShowError.INTERNAL_ERROR, false);
                ShowModule.this.remove(showOperationState0.id);
            }

            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onSuccess() {
            }

            @Override  // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onTimeout() {
                Long long0 = showOperationState0.duration();
                Metric metric0 = AdOperationMetric.newAdShowFailure(AdOperationError.callback_timeout, long0);
                ShowModule.this.getMetricSender().sendMetricWithInitState(metric0);
                ShowModule.this.sendOnUnityAdsFailedToShow(showOperationState0, "[UnityAds] Show Invocation Timeout", UnityAdsShowError.INTERNAL_ERROR, false);
                ShowModule.this.remove(showOperationState0.id);
            }
        }));
        Activity activity0 = (Activity)showOperationState0.activity.get();
        ClientProperties.setActivity(activity0);
        Display display0 = ((WindowManager)activity0.getSystemService("window")).getDefaultDisplay();
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("requestedOrientation", activity0.getRequestedOrientation());
            jSONObject2.put("rotation", display0.getRotation());
            Point point0 = new Point();
            display0.getSize(point0);
            jSONObject2.put("width", point0.x);
            jSONObject2.put("height", point0.y);
            jSONObject1.put("display", jSONObject2);
            jSONObject1.put("headerBiddingOptions", showOperationState0.showOptions.getData());
            jSONObject0.put("options", jSONObject1);
            jSONObject0.put("listenerId", showOperation0.getId());
            jSONObject0.put("placementId", showOperationState0.placementId);
            jSONObject0.put("time", Device.getElapsedRealtime());
        }
        catch(JSONException unused_ex) {
            this.sendOnUnityAdsFailedToShow(showOperationState0, "[UnityAds] Error creating show options", UnityAdsShowError.INTERNAL_ERROR, true);
            return;
        }
        catch(NullPointerException unused_ex) {
            this.sendOnUnityAdsFailedToShow(showOperationState0, "[UnityAds] Error creating show options", UnityAdsShowError.INTERNAL_ERROR, true);
            return;
        }
        this.set(showOperation0);
        showOperation0.invoke(showOperationState0.configuration.getWebViewBridgeTimeout(), new Object[]{jSONObject0});
        HdrInfoReader.getInstance().captureHDRCapabilityMetrics(activity0, new ExperimentsReader());
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((ShowOperationState)object0));
    }

    public static IShowModule getInstance() {
        if(ShowModule.instance == null) {
            ShowModule.instance = new ShowModuleDecoratorTimeout(new ShowModule(((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class))), new ExperimentsReader());
        }
        return ShowModule.instance;
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowClick(String s) {
        IShowOperation iShowOperation0 = (IShowOperation)this.get(s);
        if(iShowOperation0 != null && iShowOperation0.getShowOperationState() != null) {
            iShowOperation0.onUnityAdsShowClick(iShowOperation0.getShowOperationState().placementId);
        }
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
        IShowOperation iShowOperation0 = (IShowOperation)this.get(s);
        if(iShowOperation0 != null && iShowOperation0.getShowOperationState() != null) {
            ShowOperationState showOperationState0 = iShowOperation0.getShowOperationState();
            this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowSuccess(showOperationState0.duration()));
            iShowOperation0.onUnityAdsShowComplete(showOperationState0.placementId, unityAds$UnityAdsShowCompletionState0);
            this.remove(s);
        }
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(String s) {
        IShowOperation iShowOperation0 = (IShowOperation)this.get(s);
        if(iShowOperation0 != null) {
            iShowOperation0.getShowOperationState();
        }
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
        IShowOperation iShowOperation0 = (IShowOperation)this.get(s);
        if(iShowOperation0 != null && iShowOperation0.getShowOperationState() != null) {
            ShowOperationState showOperationState0 = iShowOperation0.getShowOperationState();
            this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAds$UnityAdsShowError0, showOperationState0.duration()));
            iShowOperation0.onUnityAdsShowFailure(showOperationState0.placementId, unityAds$UnityAdsShowError0, s1);
            this.remove(s);
        }
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(String s) {
        IShowOperation iShowOperation0 = (IShowOperation)this.get(s);
        if(iShowOperation0 != null && iShowOperation0.getShowOperationState() != null) {
            iShowOperation0.onUnityAdsShowStart(iShowOperation0.getShowOperationState().placementId);
        }
    }

    private void sendOnUnityAdsFailedToShow(ShowOperationState showOperationState0, String s, UnityAdsShowError unityAds$UnityAdsShowError0, boolean z) {
        if(showOperationState0 != null && showOperationState0.listener != null) {
            if(z) {
                this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAds$UnityAdsShowError0, showOperationState0.duration()));
            }
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    showOperationState0.onUnityAdsShowFailure(unityAds$UnityAdsShowError0, s);
                }
            });
        }
    }
}

