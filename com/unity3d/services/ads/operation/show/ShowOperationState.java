package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;

public class ShowOperationState extends OperationState {
    public WeakReference activity;
    public IUnityAdsShowListener listener;
    public UnityAdsShowOptions showOptions;

    public ShowOperationState(String s, IUnityAdsShowListener iUnityAdsShowListener0, Activity activity0, UnityAdsShowOptions unityAdsShowOptions0, Configuration configuration0) {
        super(s, configuration0);
        this.listener = iUnityAdsShowListener0;
        this.activity = new WeakReference(activity0);
        this.showOptions = unityAdsShowOptions0;
    }

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsShowClick$1() [...]

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsShowComplete$3(UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) [...]

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsShowFailure$0(UnityAdsShowError unityAds$UnityAdsShowError0, String s) [...]

    // 检测为 Lambda 实现
    private void lambda$onUnityAdsShowStart$2(String s) [...]

    public void onUnityAdsShowClick() {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsShowClick(this.placementId));
        }
    }

    public void onUnityAdsShowComplete(UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsShowComplete(this.placementId, unityAds$UnityAdsShowCompletionState0));
        }
    }

    public void onUnityAdsShowFailure(UnityAdsShowError unityAds$UnityAdsShowError0, String s) {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsShowFailure(this.placementId, unityAds$UnityAdsShowError0, s));
        }
    }

    public void onUnityAdsShowStart(String s) {
        if(this.listener != null) {
            Utilities.wrapCustomerListener(() -> this.listener.onUnityAdsShowStart(s));
        }
    }
}

