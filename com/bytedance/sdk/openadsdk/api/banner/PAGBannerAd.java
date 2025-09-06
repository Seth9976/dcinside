package com.bytedance.sdk.openadsdk.api.banner;

import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.JQp;

public abstract class PAGBannerAd implements PAGClientBidding, PangleAd {
    public abstract void destroy();

    public abstract PAGBannerSize getBannerSize();

    public abstract View getBannerView();

    public static void loadAd(@NonNull String s, @NonNull PAGBannerRequest pAGBannerRequest0, @NonNull PAGBannerAdLoadCallback pAGBannerAdLoadCallback0) {
        PAGBannerAd.loadAd(s, pAGBannerRequest0, new PAGBannerAdLoadListener() {
            public void onAdLoaded(PAGBannerAd pAGBannerAd0) {
                pAGBannerAdLoadCallback0.onAdLoaded(pAGBannerAd0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(Object object0) {
                this.onAdLoaded(((PAGBannerAd)object0));
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onError(int v, String s) {
                PAGErrorModel pAGErrorModel0 = new PAGErrorModel(v, s);
                pAGBannerAdLoadCallback0.onError(pAGErrorModel0);
            }
        });
    }

    public static void loadAd(@NonNull String s, @NonNull PAGBannerRequest pAGBannerRequest0, @NonNull PAGBannerAdLoadListener pAGBannerAdLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = JQp.PjT(pAGBannerAdLoadListener0);
        if(iSDKTypeFactory0 != null) {
            iSDKTypeFactory0.createADTypeLoaderFactory(s).createBannerAdLoader().loadAd(s, pAGBannerRequest0, pAGBannerAdLoadListener0);
        }
    }

    public abstract void setAdInteractionCallback(PAGBannerAdInteractionCallback arg1);

    public abstract void setAdInteractionListener(PAGBannerAdInteractionListener arg1);
}

