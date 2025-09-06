package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.Executors;

public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    private final ExperimentsReader _experimentsReader;
    private static final String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";

    public ShowModuleDecoratorTimeout(IShowModule iShowModule0, ExperimentsReader experimentsReader0) {
        super(iShowModule0);
        this._experimentsReader = experimentsReader0;
    }

    @Override  // com.unity3d.services.ads.operation.show.ShowModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, ShowOperationState showOperationState0) {
        this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowStart());
        showOperationState0.start();
        if(!this._experimentsReader.getCurrentlyActiveExperiments().isNativeShowTimeoutDisabled()) {
            this.startShowTimeout(showOperationState0);
        }
        super.executeAdOperation(iWebViewBridgeInvoker0, showOperationState0);
    }

    @Override  // com.unity3d.services.ads.operation.show.ShowModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((ShowOperationState)object0));
    }

    // 检测为 Lambda 实现
    private void onOperationTimeout(ShowOperationState showOperationState0, UnityAdsShowError unityAds$UnityAdsShowError0, String s) [...]

    @Override  // com.unity3d.services.ads.operation.show.ShowModuleDecorator
    public void onUnityAdsShowConsent(String s) {
        this.releaseOperationTimeoutLock(s);
        super.onUnityAdsShowConsent(s);
    }

    @Override  // com.unity3d.services.ads.operation.show.ShowModuleDecorator
    public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
        this.releaseOperationTimeoutLock(s);
        super.onUnityAdsShowFailure(s, unityAds$UnityAdsShowError0, s1);
    }

    @Override  // com.unity3d.services.ads.operation.show.ShowModuleDecorator
    public void onUnityAdsShowStart(String s) {
        this.releaseOperationTimeoutLock(s);
        super.onUnityAdsShowStart(s);
    }

    private void releaseOperationTimeoutLock(String s) {
        IShowOperation iShowOperation0 = this.get(s);
        if(iShowOperation0 == null) {
            return;
        }
        ShowOperationState showOperationState0 = iShowOperation0.getShowOperationState();
        if(showOperationState0 == null) {
            return;
        }
        BaseTimer baseTimer0 = showOperationState0.timeoutTimer;
        if(baseTimer0 == null) {
            return;
        }
        baseTimer0.kill();
    }

    private void startShowTimeout(ShowOperationState showOperationState0) {
        if(showOperationState0 == null) {
            return;
        }
        BaseTimer baseTimer0 = new BaseTimer(showOperationState0.configuration.getShowTimeout(), () -> if(this.val$showOperationState != null) {
            SDKMetricsSender sDKMetricsSender0 = ShowModuleDecoratorTimeout.this.getMetricSender();
            Long long0 = this.val$showOperationState.duration();
            sDKMetricsSender0.sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.timeout, long0));
            ShowModuleDecoratorTimeout.this.remove(this.val$showOperationState.id);
            Utilities.runOnUiThread(new a(this.val$showOperationState, UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.val$showOperationState.placementId));
        });
        showOperationState0.timeoutTimer = baseTimer0;
        baseTimer0.start(Executors.newSingleThreadScheduledExecutor());

        class com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.1 implements ITimerListener {
            com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.1(ShowOperationState showOperationState0) {
            }

            @Override  // com.unity3d.services.core.timer.ITimerListener
            public void onTimerFinished() {
                ShowModuleDecoratorTimeout.this.onOperationTimeout(this.val$showOperationState, UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.val$showOperationState.placementId);
            }
        }

    }
}

