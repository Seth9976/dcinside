package com.bytedance.sdk.openadsdk.api.reward;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.JQp;

public abstract class PAGRewardedAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String s, @NonNull PAGRewardedRequest pAGRewardedRequest0, @NonNull PAGRewardedAdLoadCallback pAGRewardedAdLoadCallback0) {
        PAGRewardedAd.loadAd(s, pAGRewardedRequest0, new PAGRewardedAdLoadListener() {
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd0) {
                pAGRewardedAdLoadCallback0.onAdLoaded(pAGRewardedAd0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.onAdLoaded(((PAGRewardedAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                PAGErrorModel pAGErrorModel0 = new PAGErrorModel(v, s);
                pAGRewardedAdLoadCallback0.onError(pAGErrorModel0);
            }
        });
    }

    public static void loadAd(@NonNull String s, @NonNull PAGRewardedRequest pAGRewardedRequest0, @NonNull PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = JQp.PjT(pAGRewardedAdLoadListener0);
        if(iSDKTypeFactory0 != null) {
            iSDKTypeFactory0.createADTypeLoaderFactory(s).createRewardAdLoader().loadAd(s, pAGRewardedRequest0, pAGRewardedAdLoadListener0);
        }
    }

    public abstract void setAdInteractionCallback(PAGRewardedAdInteractionCallback arg1);

    public abstract void setAdInteractionListener(PAGRewardedAdInteractionListener arg1);

    @MainThread
    public abstract void show(@Nullable Activity arg1);
}

