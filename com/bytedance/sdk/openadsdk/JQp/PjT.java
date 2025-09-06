package com.bytedance.sdk.openadsdk.JQp;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.Yo;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.PjT.JQp.Zh;
import com.bytedance.sdk.openadsdk.PjT.Zh.JQp;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.common.cz;
import com.bytedance.sdk.openadsdk.core.Au.XX;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.reflect.Method;

public class PjT implements IADTypeLoaderFactory {
    @Override  // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader createBannerAdLoader() {
        return new IADLoader() {
            final PjT PjT;

            public void PjT(String s, PAGBannerRequest pAGBannerRequest0, PAGBannerAdLoadListener pAGBannerAdLoadListener0) {
                if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(s, pAGBannerRequest0, pAGBannerAdLoadListener0)) {
                    return;
                }
                Builder adSlot$Builder0 = new Builder().setCodeId(s);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(adSlot$Builder0, pAGBannerRequest0);
                if(!TextUtils.isEmpty(pAGBannerRequest0.getAdString())) {
                    adSlot$Builder0.withBid(pAGBannerRequest0.getAdString());
                }
                PAGBannerSize pAGBannerSize0 = pAGBannerRequest0.getAdSize();
                if(pAGBannerSize0 != null) {
                    if(pAGBannerSize0.getType() == 3) {
                        adSlot$Builder0.setExpressViewAcceptedSize(((float)pAGBannerSize0.getWidth()), ((float)pAGBannerSize0.getMaxHeight()));
                    }
                    else {
                        adSlot$Builder0.setExpressViewAcceptedSize(((float)pAGBannerSize0.getWidth()), ((float)pAGBannerSize0.getHeight()));
                    }
                    adSlot$Builder0.setBannerType(pAGBannerSize0.getType());
                }
                AdSlot adSlot0 = adSlot$Builder0.setRequestExtraMap(pAGBannerRequest0.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.PjT.PjT.PjT(pAGBannerAdLoadListener0);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(new Au("loadBannerExpressAd") {
                    final com.bytedance.sdk.openadsdk.JQp.PjT.2 JQp;

                    @Override
                    public void run() {
                        if(!ub.cr().qla() && wN.RD()) {
                            pjT0.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(pjT0)) {
                            return;
                        }
                        if(pAGBannerSize0 != null && (pAGBannerSize0.getType() == 2 || pAGBannerSize0.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest0.getAdString())) {
                            int v = qZS.cr(ub.PjT());
                            int v1 = qZS.cz(ub.PjT());
                            int v2 = pAGBannerSize0.getType() == 2 ? pAGBannerSize0.getHeight() : pAGBannerSize0.getMaxHeight();
                            if(pAGBannerSize0.getWidth() > v || pAGBannerSize0.getWidth() <= 0 || v2 > v1 || v2 < 0) {
                                pjT0.onError(-19, "The banner size invalid width=" + pAGBannerSize0.getWidth() + ",height=" + v2);
                                return;
                            }
                        }
                        AdSlot adSlot0 = adSlot0;
                        if(adSlot0 == null) {
                            pjT0.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot0.setNativeAdType(1);
                        adSlot0.setDurationSlotType(1);
                        XX.PjT(ub.PjT()).PjT(adSlot0, 1, pjT0, 5000);
                    }
                }, pjT0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public void loadAd(String s, PAGRequest pAGRequest0, cz cz0) {
                this.PjT(s, ((PAGBannerRequest)pAGRequest0), ((PAGBannerAdLoadListener)cz0));
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader createInterstitialAdLoader() {
        return new IADLoader() {
            final PjT PjT;

            public void PjT(String s, PAGInterstitialRequest pAGInterstitialRequest0, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener0) {
                if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(s, pAGInterstitialRequest0, pAGInterstitialAdLoadListener0)) {
                    return;
                }
                Builder adSlot$Builder0 = new Builder().setRequestExtraMap(pAGInterstitialRequest0.getExtraInfo()).setCodeId(s);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(adSlot$Builder0, pAGInterstitialRequest0);
                if(!TextUtils.isEmpty(pAGInterstitialRequest0.getAdString())) {
                    adSlot$Builder0.withBid(pAGInterstitialRequest0.getAdString());
                }
                AdSlot adSlot0 = adSlot$Builder0.build();
                com.bytedance.sdk.openadsdk.PjT.ReZ.PjT pjT0 = new com.bytedance.sdk.openadsdk.PjT.ReZ.PjT(pAGInterstitialAdLoadListener0);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(new Au("loadInterstitialAd") {
                    final com.bytedance.sdk.openadsdk.JQp.PjT.5 ReZ;

                    @Override
                    public void run() {
                        if(!ub.cr().qla() && wN.RD()) {
                            pjT0.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(pjT0)) {
                            return;
                        }
                        if(adSlot0 == null) {
                            pjT0.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method method0 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", new Class[]{Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class});
                            if(method0 != null) {
                                method0.invoke(null, ub.PjT(), adSlot0, pjT0);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }, pjT0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public void loadAd(String s, PAGRequest pAGRequest0, cz cz0) {
                this.PjT(s, ((PAGInterstitialRequest)pAGRequest0), ((PAGInterstitialAdLoadListener)cz0));
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader createNativeAdLoader() {
        return new IADLoader() {
            final PjT PjT;

            public void PjT(String s, PAGNativeRequest pAGNativeRequest0, PAGNativeAdLoadListener pAGNativeAdLoadListener0) {
                if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(s, pAGNativeRequest0, pAGNativeAdLoadListener0)) {
                    return;
                }
                JQp jQp0 = new JQp(pAGNativeAdLoadListener0);
                Builder adSlot$Builder0 = new Builder().setCodeId(s).withBid((pAGNativeRequest0 == null ? null : pAGNativeRequest0.getAdString()));
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(adSlot$Builder0, pAGNativeRequest0);
                AdSlot adSlot0 = adSlot$Builder0.setRequestExtraMap(pAGNativeRequest0.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(new Au("loadFeedAd") {
                    final com.bytedance.sdk.openadsdk.JQp.PjT.3 ReZ;

                    @Override
                    public void run() {
                        if(!ub.cr().qla() && wN.RD()) {
                            jQp0.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(jQp0)) {
                            return;
                        }
                        if(adSlot0 == null) {
                            jQp0.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method method0 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", new Class[]{Context.class, AdSlot.class, PAGNativeAdLoadListener.class});
                            if(method0 != null) {
                                method0.invoke(null, ub.PjT(), adSlot0, jQp0);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }, jQp0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public void loadAd(String s, PAGRequest pAGRequest0, cz cz0) {
                this.PjT(s, ((PAGNativeRequest)pAGRequest0), ((PAGNativeAdLoadListener)cz0));
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader createOpenAdLoader() {
        return new IADLoader() {
            final PjT PjT;
            private int Zh;

            public void PjT(String s, PAGAppOpenRequest pAGAppOpenRequest0, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener0) {
                if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(s, pAGAppOpenRequest0, pAGAppOpenAdLoadListener0)) {
                    return;
                }
                Builder adSlot$Builder0 = new Builder();
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(adSlot$Builder0, pAGAppOpenRequest0);
                if(!TextUtils.isEmpty(pAGAppOpenRequest0.getAdString())) {
                    adSlot$Builder0.withBid(pAGAppOpenRequest0.getAdString());
                }
                AdSlot adSlot0 = adSlot$Builder0.setCodeId(s).setRequestExtraMap(pAGAppOpenRequest0.getExtraInfo()).build();
                this.Zh = pAGAppOpenRequest0.getTimeout();
                com.bytedance.sdk.openadsdk.PjT.cr.PjT pjT0 = new com.bytedance.sdk.openadsdk.PjT.cr.PjT(pAGAppOpenAdLoadListener0);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(new Au("loadSplashAd") {
                    final com.bytedance.sdk.openadsdk.JQp.PjT.1 ReZ;

                    @Override
                    public void run() {
                        try {
                            if(!ub.cr().qla() && wN.RD()) {
                                pjT0.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(pjT0)) {
                                return;
                            }
                            if(adSlot0 == null) {
                                pjT0.onError(-4, "adslot is null");
                                return;
                            }
                            Method method0 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", new Class[]{Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE});
                            if(method0 != null) {
                                method0.invoke(null, ub.PjT(), adSlot0, pjT0, com.bytedance.sdk.openadsdk.JQp.PjT.1.this.Zh);
                            }
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                        RD.PjT("ADNFactory", "open component maybe not exist, please check", throwable0);
                    }
                }, pjT0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public void loadAd(String s, PAGRequest pAGRequest0, cz cz0) {
                this.PjT(s, ((PAGAppOpenRequest)pAGRequest0), ((PAGAppOpenAdLoadListener)cz0));
            }
        };
    }

    @Override  // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader createRewardAdLoader() {
        return new IADLoader() {
            final PjT PjT;

            public void PjT(String s, PAGRewardedRequest pAGRewardedRequest0, PAGRewardedAdLoadListener pAGRewardedAdLoadListener0) {
                if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(s, pAGRewardedRequest0, pAGRewardedAdLoadListener0)) {
                    return;
                }
                Builder adSlot$Builder0 = new Builder().setCodeId(s);
                if(!TextUtils.isEmpty(pAGRewardedRequest0.getAdString())) {
                    adSlot$Builder0.withBid(pAGRewardedRequest0.getAdString());
                }
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(adSlot$Builder0, pAGRewardedRequest0);
                AdSlot adSlot0 = adSlot$Builder0.setRequestExtraMap(pAGRewardedRequest0.getExtraInfo()).build();
                Zh zh0 = new Zh(pAGRewardedAdLoadListener0);
                com.bytedance.sdk.openadsdk.PjT.PjT.PjT(new Au("loadRewardVideoAd") {
                    final com.bytedance.sdk.openadsdk.JQp.PjT.4 ReZ;

                    @Override
                    public void run() {
                        if(!ub.cr().qla() && wN.RD()) {
                            zh0.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if(com.bytedance.sdk.openadsdk.PjT.PjT.PjT(zh0)) {
                            return;
                        }
                        if(adSlot0 == null) {
                            zh0.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method method0 = Yo.PjT("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", new Class[]{Context.class, AdSlot.class, PAGRewardedAdLoadListener.class});
                            if(method0 != null) {
                                method0.invoke(null, ub.PjT(), adSlot0, zh0);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }, zh0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            public void loadAd(String s, PAGRequest pAGRequest0, cz cz0) {
                this.PjT(s, ((PAGRewardedRequest)pAGRequest0), ((PAGRewardedAdLoadListener)cz0));
            }
        };
    }
}

