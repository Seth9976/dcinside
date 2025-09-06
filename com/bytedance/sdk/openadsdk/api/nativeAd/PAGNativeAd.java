package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.JQp;
import java.util.List;

public abstract class PAGNativeAd implements PAGClientBidding, PangleAd {
    public abstract PAGNativeAdData getNativeAdData();

    public static void loadAd(@NonNull String s, @NonNull PAGNativeRequest pAGNativeRequest0, @NonNull PAGNativeAdLoadCallback pAGNativeAdLoadCallback0) {
        PAGNativeAd.loadAd(s, pAGNativeRequest0, new PAGNativeAdLoadListener() {
            public void onAdLoaded(PAGNativeAd pAGNativeAd0) {
                pAGNativeAdLoadCallback0.onAdLoaded(pAGNativeAd0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.onAdLoaded(((PAGNativeAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                PAGErrorModel pAGErrorModel0 = new PAGErrorModel(v, s);
                pAGNativeAdLoadCallback0.onError(pAGErrorModel0);
            }
        });
    }

    public static void loadAd(@NonNull String s, @NonNull PAGNativeRequest pAGNativeRequest0, @NonNull PAGNativeAdLoadListener pAGNativeAdLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = JQp.PjT(pAGNativeAdLoadListener0);
        if(iSDKTypeFactory0 != null) {
            iSDKTypeFactory0.createADTypeLoaderFactory(s).createNativeAdLoader().loadAd(s, pAGNativeRequest0, pAGNativeAdLoadListener0);
        }
    }

    public abstract void registerViewForInteraction(@NonNull ViewGroup arg1, @NonNull List arg2, @Nullable List arg3, @Nullable View arg4, PAGNativeAdInteractionCallback arg5);

    public abstract void registerViewForInteraction(@NonNull ViewGroup arg1, @NonNull List arg2, @Nullable List arg3, @Nullable View arg4, PAGNativeAdInteractionListener arg5);

    public abstract void showPrivacyActivity();
}

