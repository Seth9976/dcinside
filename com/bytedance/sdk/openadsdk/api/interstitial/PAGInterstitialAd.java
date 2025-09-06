package com.bytedance.sdk.openadsdk.api.interstitial;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.JQp;

public abstract class PAGInterstitialAd implements PAGClientBidding, PangleAd {
    public static void loadAd(@NonNull String s, @NonNull PAGInterstitialRequest pAGInterstitialRequest0, @NonNull PAGInterstitialAdLoadCallback pAGInterstitialAdLoadCallback0) {
        PAGInterstitialAd.loadAd(s, pAGInterstitialRequest0, new PAGInterstitialAdLoadListener() {
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd0) {
                pAGInterstitialAdLoadCallback0.onAdLoaded(pAGInterstitialAd0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.onAdLoaded(((PAGInterstitialAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                PAGErrorModel pAGErrorModel0 = new PAGErrorModel(v, s);
                pAGInterstitialAdLoadCallback0.onError(pAGErrorModel0);
            }
        });
    }

    public static void loadAd(@NonNull String s, @NonNull PAGInterstitialRequest pAGInterstitialRequest0, @NonNull PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = JQp.PjT(pAGInterstitialAdLoadListener0);
        if(iSDKTypeFactory0 != null) {
            iSDKTypeFactory0.createADTypeLoaderFactory(s).createInterstitialAdLoader().loadAd(s, pAGInterstitialRequest0, pAGInterstitialAdLoadListener0);
        }
    }

    public abstract void setAdInteractionCallback(PAGInterstitialAdInteractionCallback arg1);

    public abstract void setAdInteractionListener(PAGInterstitialAdInteractionListener arg1);

    @MainThread
    public abstract void show(@Nullable Activity arg1);
}

