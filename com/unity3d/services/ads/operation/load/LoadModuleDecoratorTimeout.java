package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.Executors;

public class LoadModuleDecoratorTimeout extends LoadModuleDecorator {
    private final ExperimentsReader _experimentsReader;
    private static final String errorMsgTimeoutLoading = "[UnityAds] Timeout while loading ";

    public LoadModuleDecoratorTimeout(ILoadModule iLoadModule0, ExperimentsReader experimentsReader0) {
        super(iLoadModule0);
        this._experimentsReader = experimentsReader0;
    }

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, LoadOperationState loadOperationState0) {
        this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadStart(false, loadOperationState0.isHeaderBidding()));
        loadOperationState0.start();
        if(!this._experimentsReader.getCurrentlyActiveExperiments().isNativeLoadTimeoutDisabled()) {
            this.startLoadTimeout(loadOperationState0);
        }
        super.executeAdOperation(iWebViewBridgeInvoker0, loadOperationState0);
    }

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((LoadOperationState)object0));
    }

    // 检测为 Lambda 实现
    private static void lambda$onOperationTimeout$0(LoadOperationState loadOperationState0) [...]

    // 检测为 Lambda 实现
    private void onOperationTimeout(LoadOperationState loadOperationState0) [...]

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void onUnityAdsAdLoaded(String s) {
        this.releaseOperationTimeoutLock(s);
        super.onUnityAdsAdLoaded(s);
    }

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
        this.releaseOperationTimeoutLock(s);
        super.onUnityAdsFailedToLoad(s, unityAds$UnityAdsLoadError0, s1);
    }

    private void releaseOperationTimeoutLock(String s) {
        ILoadOperation iLoadOperation0 = this.get(s);
        if(iLoadOperation0 == null) {
            return;
        }
        LoadOperationState loadOperationState0 = iLoadOperation0.getLoadOperationState();
        if(loadOperationState0 == null) {
            return;
        }
        BaseTimer baseTimer0 = loadOperationState0.timeoutTimer;
        if(baseTimer0 == null) {
            return;
        }
        baseTimer0.kill();
    }

    private void startLoadTimeout(LoadOperationState loadOperationState0) {
        if(loadOperationState0 == null) {
            return;
        }
        BaseTimer baseTimer0 = new BaseTimer(loadOperationState0.configuration.getLoadTimeout(), () -> if(this.val$loadOperationState != null) {
            SDKMetricsSender sDKMetricsSender0 = LoadModuleDecoratorTimeout.this.getMetricSender();
            Long long0 = this.val$loadOperationState.duration();
            boolean z = this.val$loadOperationState.isHeaderBidding();
            sDKMetricsSender0.sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.timeout, long0, false, z));
            LoadModuleDecoratorTimeout.this.remove(this.val$loadOperationState.id);
            Utilities.runOnUiThread(() -> loadOperationState0.onUnityAdsFailedToLoad(UnityAdsLoadError.TIMEOUT, "[UnityAds] Timeout while loading " + loadOperationState0.placementId));
        });
        loadOperationState0.timeoutTimer = baseTimer0;
        baseTimer0.start(Executors.newSingleThreadScheduledExecutor());

        class com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.1 implements ITimerListener {
            com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.1(LoadOperationState loadOperationState0) {
            }

            @Override  // com.unity3d.services.core.timer.ITimerListener
            public void onTimerFinished() {
                LoadModuleDecoratorTimeout.this.onOperationTimeout(this.val$loadOperationState);
            }
        }

    }
}

