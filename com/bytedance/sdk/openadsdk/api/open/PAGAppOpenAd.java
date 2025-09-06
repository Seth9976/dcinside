package com.bytedance.sdk.openadsdk.api.open;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.JQp;

public abstract class PAGAppOpenAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String s, @NonNull PAGAppOpenRequest pAGAppOpenRequest0, @NonNull PAGAppOpenAdLoadCallback pAGAppOpenAdLoadCallback0) {
        PAGAppOpenAd.loadAd(s, pAGAppOpenRequest0, new PAGAppOpenAdLoadListener() {
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd0) {
                pAGAppOpenAdLoadCallback0.onAdLoaded(pAGAppOpenAd0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.onAdLoaded(((PAGAppOpenAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                PAGErrorModel pAGErrorModel0 = new PAGErrorModel(v, s);
                pAGAppOpenAdLoadCallback0.onError(pAGErrorModel0);
            }
        });
    }

    public static void loadAd(@NonNull String s, @NonNull PAGAppOpenRequest pAGAppOpenRequest0, @NonNull PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = JQp.PjT(pAGAppOpenAdLoadListener0);
        if(iSDKTypeFactory0 != null) {
            iSDKTypeFactory0.createADTypeLoaderFactory(s).createOpenAdLoader().loadAd(s, pAGAppOpenRequest0, pAGAppOpenAdLoadListener0);
        }
    }

    public abstract void setAdInteractionCallback(PAGAppOpenAdInteractionCallback arg1);

    public abstract void setAdInteractionListener(PAGAppOpenAdInteractionListener arg1);

    @MainThread
    public abstract void show(@Nullable Activity arg1);
}

