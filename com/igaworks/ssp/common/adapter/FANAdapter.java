package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.AudienceNetworkAds.InitResult;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.E;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.g;
import com.igaworks.ssp.i;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import java.util.ArrayList;
import java.util.HashMap;

public class FANAdapter implements BaseMediationAdapter {
    private Handler A;
    private Runnable B;
    private Runnable C;
    private boolean D;
    private boolean E;
    private g F;
    private Handler G;
    private Runnable H;
    private int I;
    private AbstractAdListener J;
    RewardedVideoAdListener K;
    NativeAdListener L;
    private C a;
    private T b;
    private c0 c;
    private l0 d;
    private V e;
    private r0 f;
    private g0 g;
    private b0 h;
    private boolean i;
    private AdView j;
    private InterstitialAd k;
    private InterstitialAd l;
    private NativeAd m;
    private NativeBannerAd n;
    private NativeAdLayout o;
    private View p;
    private boolean q;
    private int r;
    private Context s;
    private AdPopcornSSPNativeAd t;
    private RewardedVideoAd u;
    private String v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public FANAdapter(boolean z) {
        this.i = true;
        this.w = 0;
        this.x = 0;
        this.y = true;
        this.z = true;
        this.A = new Handler(Looper.getMainLooper());
        this.D = false;
        this.E = false;
        this.G = new Handler(Looper.getMainLooper());
        this.K = new RewardedVideoAdListener() {
            final FANAdapter a;

            public void onAdClicked(Ad ad0) {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked");
                if(FANAdapter.this.d != null) {
                    FANAdapter.this.d.onClickAd();
                }
                try {
                    if(FANAdapter.this.F != null && FANAdapter.this.F.b() != null) {
                        for(int v = 0; v < FANAdapter.this.F.b().size(); ++v) {
                            String s = (String)FANAdapter.this.F.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked url : " + s);
                                E.g().d().a(FANAdapter.this.s, e.j, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onAdLoaded(Ad ad0) {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdLoaded");
                FANAdapter.this.a(true);
                if(FANAdapter.this.D && FANAdapter.this.d != null) {
                    FANAdapter.this.d.b(FANAdapter.this.x);
                }
            }

            public void onError(Ad ad0, AdError adError0) {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onError : " + adError0.getErrorMessage());
                FANAdapter.this.a(true);
                if(FANAdapter.this.D && FANAdapter.this.d != null) {
                    FANAdapter.this.d.d(FANAdapter.this.x);
                }
            }

            public void onLoggingImpression(Ad ad0) {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression");
                if(FANAdapter.this.D && FANAdapter.this.d != null) {
                    FANAdapter.this.d.a(FANAdapter.this.x);
                }
                try {
                    if(FANAdapter.this.F != null && FANAdapter.this.F.j() != null) {
                        for(int v = 0; v < FANAdapter.this.F.j().size(); ++v) {
                            String s = (String)FANAdapter.this.F.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression url : " + s);
                                E.g().d().a(FANAdapter.this.s, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onRewardedVideoClosed() {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onRewardedVideoClosed");
                if(FANAdapter.this.d != null) {
                    FANAdapter.this.d.a();
                }
            }

            public void onRewardedVideoCompleted() {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter onRewardedVideoCompleted");
                if(FANAdapter.this.d != null) {
                    FANAdapter.this.d.a(i.e.b(), true);
                }
                FANAdapter.this.D = false;
            }
        };
        this.L = new NativeAdListener() {
            final FANAdapter a;

            public void onAdClicked(Ad ad0) {
                b.c(Thread.currentThread(), "FAN Native ad clicked!");
                if(FANAdapter.this.c != null) {
                    FANAdapter.this.c.onClicked();
                }
                try {
                    if(FANAdapter.this.F != null && FANAdapter.this.F.b() != null) {
                        for(int v = 0; v < FANAdapter.this.F.b().size(); ++v) {
                            String s = (String)FANAdapter.this.F.b().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked url : " + s);
                                E.g().d().a(FANAdapter.this.s, e.j, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onAdLoaded(Ad ad0) {
                try {
                    b.c(Thread.currentThread(), "FAN Native ad is loaded and ready to be displayed!");
                    if(FANAdapter.this.q) {
                        if(FANAdapter.this.n != null && FANAdapter.this.n == ad0) {
                            FANAdapter.this.a(FANAdapter.this.s, FANAdapter.this.n, FANAdapter.this.t, FANAdapter.this.r);
                            goto label_14;
                        }
                        if(FANAdapter.this.c != null) {
                            FANAdapter.this.c.a(FANAdapter.this.r, 2);
                        }
                        return;
                    }
                    if(FANAdapter.this.m != null && FANAdapter.this.m == ad0) {
                        if(FANAdapter.this.m.isAdInvalidated()) {
                            if(FANAdapter.this.c != null) {
                                FANAdapter.this.c.a(FANAdapter.this.r, 2);
                            }
                            return;
                        }
                        FANAdapter.this.a(FANAdapter.this.s, FANAdapter.this.m, FANAdapter.this.t, FANAdapter.this.r);
                    label_14:
                        if(FANAdapter.this.c != null) {
                            FANAdapter.this.c.a(FANAdapter.this.r);
                        }
                        ((View)FANAdapter.this.o).setVisibility(0);
                        return;
                    }
                    if(FANAdapter.this.c != null) {
                        FANAdapter.this.c.a(FANAdapter.this.r, 2);
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
                if(FANAdapter.this.c != null) {
                    FANAdapter.this.c.a(FANAdapter.this.r, 1);
                }
            }

            public void onError(Ad ad0, AdError adError0) {
                b.c(Thread.currentThread(), "FAN Native ad failed to load: " + adError0.getErrorMessage());
                if(FANAdapter.this.o != null) {
                    ((View)FANAdapter.this.o).setVisibility(4);
                }
                if(FANAdapter.this.c != null) {
                    FANAdapter.this.c.a(FANAdapter.this.r, 2);
                }
            }

            public void onLoggingImpression(Ad ad0) {
                b.c(Thread.currentThread(), "FAN Native ad impression logged!");
                if(FANAdapter.this.c != null) {
                    FANAdapter.this.c.onImpression();
                }
                try {
                    if(FANAdapter.this.F != null && FANAdapter.this.F.j() != null) {
                        for(int v = 0; v < FANAdapter.this.F.j().size(); ++v) {
                            String s = (String)FANAdapter.this.F.j().get(v);
                            if(s0.a(s)) {
                                b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression url : " + s);
                                E.g().d().a(FANAdapter.this.s, e.i, s);
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }

            public void onMediaDownloaded(Ad ad0) {
                b.c(Thread.currentThread(), "FAN Native ad finished downloading all assets.");
            }
        };
        this.q = z;
    }

    private void a(Context context0) {
        if(!AudienceNetworkAds.isInitialized(context0)) {
            AudienceNetworkAds.initialize(context0);
        }
    }

    private void a(Context context0, NativeAd nativeAd0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0, int v) {
        TextView textView2;
        TextView textView1;
        MediaView mediaView1;
        TextView textView0;
        b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter inflateAd");
        nativeAd0.unregisterView();
        int v1 = 0;
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().adChoiceViewId != 0) {
            LinearLayout linearLayout0 = (LinearLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().adChoiceViewId);
            AdOptionsView adOptionsView0 = new AdOptionsView(context0, ((NativeAdBase)nativeAd0), this.o);
            linearLayout0.removeAllViews();
            linearLayout0.addView(((View)adOptionsView0), 0);
        }
        ArrayList arrayList0 = new ArrayList();
        Button button0 = null;
        MediaView mediaView0 = adPopcornSSPNativeAd0.getFacebookViewBinder().adIconViewId == 0 ? null : ((MediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().adIconViewId));
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().titleId == 0) {
            textView0 = null;
        }
        else {
            textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().titleId);
            arrayList0.add(textView0);
        }
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().mediaViewId == 0) {
            mediaView1 = null;
        }
        else {
            mediaView1 = (MediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().mediaViewId);
            arrayList0.add(mediaView1);
        }
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().socialContextViewId == 0) {
            textView1 = null;
        }
        else {
            textView1 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().socialContextViewId);
            arrayList0.add(textView1);
        }
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().bodyId == 0) {
            textView2 = null;
        }
        else {
            textView2 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().bodyId);
            arrayList0.add(textView2);
        }
        TextView textView3 = adPopcornSSPNativeAd0.getFacebookViewBinder().sponsoredViewId == 0 ? null : ((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().sponsoredViewId));
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().callToActionId != 0) {
            button0 = (Button)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().callToActionId);
            arrayList0.add(button0);
        }
        if(textView0 != null) {
            textView0.setText(nativeAd0.getAdvertiserName());
        }
        if(textView2 != null) {
            textView2.setText(nativeAd0.getAdBodyText());
        }
        if(textView1 != null) {
            textView1.setText(nativeAd0.getAdSocialContext());
        }
        if(button0 != null) {
            if(!nativeAd0.hasCallToAction()) {
                v1 = 4;
            }
            button0.setVisibility(v1);
            button0.setText(nativeAd0.getAdCallToAction());
        }
        if(textView3 != null) {
            textView3.setText(nativeAd0.getSponsoredTranslation());
        }
        nativeAd0.registerViewForInteraction(this.p, mediaView1, mediaView0, arrayList0);
    }

    private void a(Context context0, NativeBannerAd nativeBannerAd0, AdPopcornSSPNativeAd adPopcornSSPNativeAd0, int v) {
        TextView textView1;
        TextView textView0;
        b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter inflateNativeBannerAd");
        nativeBannerAd0.unregisterView();
        int v1 = 0;
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().adChoiceViewId != 0) {
            LinearLayout linearLayout0 = (LinearLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().adChoiceViewId);
            AdOptionsView adOptionsView0 = new AdOptionsView(context0, ((NativeAdBase)nativeBannerAd0), this.o);
            linearLayout0.removeAllViews();
            linearLayout0.addView(((View)adOptionsView0), 0);
        }
        ArrayList arrayList0 = new ArrayList();
        Button button0 = null;
        MediaView mediaView0 = adPopcornSSPNativeAd0.getFacebookViewBinder().adIconViewId == 0 ? null : ((MediaView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().adIconViewId));
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().titleId == 0) {
            textView0 = null;
        }
        else {
            textView0 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().titleId);
            arrayList0.add(textView0);
        }
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().socialContextViewId == 0) {
            textView1 = null;
        }
        else {
            textView1 = (TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().socialContextViewId);
            arrayList0.add(textView1);
        }
        TextView textView2 = adPopcornSSPNativeAd0.getFacebookViewBinder().sponsoredViewId == 0 ? null : ((TextView)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().sponsoredViewId));
        if(adPopcornSSPNativeAd0.getFacebookViewBinder().callToActionId != 0) {
            button0 = (Button)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().callToActionId);
            arrayList0.add(button0);
        }
        if(textView0 != null) {
            textView0.setText(nativeBannerAd0.getAdvertiserName());
        }
        if(textView1 != null) {
            textView1.setText(nativeBannerAd0.getAdSocialContext());
        }
        if(button0 != null) {
            if(!nativeBannerAd0.hasCallToAction()) {
                v1 = 4;
            }
            button0.setVisibility(v1);
            button0.setText(nativeBannerAd0.getAdCallToAction());
        }
        if(textView2 != null) {
            textView2.setText(nativeBannerAd0.getSponsoredTranslation());
        }
        nativeBannerAd0.registerViewForInteraction(this.p, mediaView0, arrayList0);
    }

    private void a(boolean z) {
        try {
            if(z) {
                this.y = false;
                Handler handler0 = this.A;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.B);
                }
            }
            else {
                this.z = false;
                Handler handler1 = this.A;
                if(handler1 != null) {
                    handler1.removeCallbacks(this.C);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.J = new AbstractAdListener() {
            final FANAdapter a;

            public void onAdLoaded(Ad ad0) {
                super.onAdLoaded(ad0);
            }
        };
        b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter.destroyBannerAd");
            AdView adView0 = this.j;
            if(adView0 != null) {
                ((ViewGroup)adView0).removeAllViews();
                this.j.destroy();
                this.j = null;
                this.stopBannerTimer();
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitial() {
        InterstitialAd interstitialAd0 = this.k;
        if(interstitialAd0 != null) {
            interstitialAd0.destroy();
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
        try {
            b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter destroyInterstitialVideoAd() : " + this.l);
            InterstitialAd interstitialAd0 = this.l;
            if(interstitialAd0 != null) {
                interstitialAd0.destroy();
            }
            this.E = false;
            this.a(false);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
        NativeBannerAd nativeBannerAd0 = this.n;
        if(nativeBannerAd0 != null) {
            nativeBannerAd0.unregisterView();
            this.n.destroy();
            this.n = null;
        }
        NativeAd nativeAd0 = this.m;
        if(nativeAd0 != null) {
            nativeAd0.unregisterView();
            this.m.destroy();
            this.m = null;
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
        try {
            RewardedVideoAd rewardedVideoAd0 = this.u;
            if(rewardedVideoAd0 != null) {
                rewardedVideoAd0.destroy();
                this.u = null;
            }
            this.D = false;
            this.a(true);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        this.a(context0);
        return BidderTokenProvider.getBidderToken(context0);
    }

    // 去混淆评级： 中等(60)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() {
        return this.q ? "FAN_NATIVE_BANNER" : "FAN";
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter initializeSDK");
            if(!AudienceNetworkAds.isInitialized(context0)) {
                AudienceNetworkAds.buildInitSettings(context0).withInitListener(new AudienceNetworkAds.InitListener() {
                    final FANAdapter b;

                    public void onInitialized(AudienceNetworkAds.InitResult audienceNetworkAds$InitResult0) {
                        SdkInitListener sdkInitListener0 = sdkInitListener0;
                        if(sdkInitListener0 != null) {
                            sdkInitListener0.onInitializationFinished();
                        }
                    }
                }).initialize();
            }
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            }
            return;
        }
        catch(NoClassDefFoundError unused_ex) {
        }
        catch(NoSuchMethodError unused_ex) {
            goto label_11;
        }
        catch(Exception unused_ex) {
            goto label_14;
        }
        if(sdkInitListener0 != null) {
            sdkInitListener0.onInitializationFinished();
            return;
        label_11:
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
                return;
            label_14:
                if(sdkInitListener0 != null) {
                    sdkInitListener0.onInitializationFinished();
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter.internalStopBannerAd");
            AdView adView0 = this.j;
            if(adView0 != null) {
                adView0.destroy();
                this.j = null;
            }
            this.a = null;
            this.stopBannerTimer();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitial(Context context0, AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0, d0 d00, boolean z, int v) {
        String s1;
        try {
            this.s = context0;
            this.a(context0);
            String s = "";
            if(z) {
                if(d00 == null || d00.b() == null || d00.b().get(0) == null) {
                    s1 = null;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.F = g0;
                    s1 = g0.k();
                }
                if(s1 != null && s1.length() > 0) {
                    s = p.a(s1, "fb_placement_id");
                }
            }
            this.k = new InterstitialAd(context0, s);
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter loadInterstitial");
            this.k.loadAd(this.k.buildLoadAdConfig().withBid(this.F.y()).withAdListener(new InterstitialAdListener() {
                final FANAdapter c;

                public void onAdClicked(Ad ad0) {
                    b.b(Thread.currentThread(), "FacebookAudienceNetworkAdapter interstitial onAdClicked");
                    if(FANAdapter.this.b != null) {
                        FANAdapter.this.b.a();
                    }
                    try {
                        if(FANAdapter.this.F != null && FANAdapter.this.F.b() != null) {
                            for(int v = 0; v < FANAdapter.this.F.b().size(); ++v) {
                                String s = (String)FANAdapter.this.F.b().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked url : " + s);
                                    E.g().d().a(context0, e.j, s);
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }

                public void onAdLoaded(Ad ad0) {
                    b.a(Thread.currentThread(), "InterstitialAd : Success to load in " + FANAdapter.this.getNetworkName());
                    if(FANAdapter.this.b != null) {
                        FANAdapter.this.b.b(v);
                    }
                }

                public void onError(Ad ad0, AdError adError0) {
                    b.b(Thread.currentThread(), "failed to load in " + FANAdapter.this.getNetworkName() + ", error code : " + adError0.getErrorCode() + ", error message : " + adError0.getErrorMessage());
                    if(FANAdapter.this.b != null) {
                        FANAdapter.this.b.d(v);
                    }
                }

                public void onInterstitialDismissed(Ad ad0) {
                    if(FANAdapter.this.b != null) {
                        FANAdapter.this.b.e(0);
                    }
                }

                public void onInterstitialDisplayed(Ad ad0) {
                    if(FANAdapter.this.b != null) {
                        FANAdapter.this.b.a(v);
                    }
                }

                public void onLoggingImpression(Ad ad0) {
                    b.b(Thread.currentThread(), "FacebookAudienceNetworkAdapter interstitial onLoggingImpression");
                    try {
                        if(FANAdapter.this.F != null && FANAdapter.this.F.j() != null) {
                            for(int v = 0; v < FANAdapter.this.F.j().size(); ++v) {
                                String s = (String)FANAdapter.this.F.j().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression url : " + s);
                                    E.g().d().a(context0, e.i, s);
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            }).build());
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t0 = this.b;
        if(t0 != null) {
            t0.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
        String s1;
        try {
            this.E = true;
            this.a(context0);
            this.z = true;
            this.w = v;
            if(adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.A == null) {
                    this.A = new Handler();
                }
                if(this.C == null) {
                    this.C = new Runnable() {
                        final FANAdapter a;

                        @Override
                        public void run() {
                            if(FANAdapter.this.z) {
                                b.b(Thread.currentThread(), String.format("Time out in : %s", FANAdapter.this.getNetworkName()));
                                FANAdapter.this.a(false);
                                if(FANAdapter.this.E && FANAdapter.this.e != null) {
                                    FANAdapter.this.e.d(FANAdapter.this.w);
                                }
                            }
                        }
                    };
                }
                this.A.postDelayed(this.C, adPopcornSSPInterstitialVideoAd0.getNetworkScheduleTimeout());
            }
            String s = "";
            if(z) {
                if(d00 == null || d00.b() == null || d00.b().get(0) == null) {
                    s1 = null;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.F = g0;
                    s1 = g0.k();
                }
                if(s1 != null) {
                    s = p.a(s1, "fb_placement_id");
                }
            }
            this.l = new InterstitialAd(context0, s);
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter loadInterstitialVideoAd");
            this.l.loadAd(this.l.buildLoadAdConfig().withBid(this.F.y()).withAdListener(new InterstitialAdListener() {
                final FANAdapter b;

                public void onAdClicked(Ad ad0) {
                    b.b(Thread.currentThread(), "FacebookAudienceNetworkAdapter loadInterstitialVideoAd onAdClicked");
                    try {
                        if(FANAdapter.this.F != null && FANAdapter.this.F.b() != null) {
                            for(int v = 0; v < FANAdapter.this.F.b().size(); ++v) {
                                String s = (String)FANAdapter.this.F.b().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked url : " + s);
                                    E.g().d().a(context0, e.j, s);
                                }
                            }
                        }
                        if(FANAdapter.this.e != null) {
                            FANAdapter.this.e.onClickAd();
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }

                public void onAdLoaded(Ad ad0) {
                    b.a(Thread.currentThread(), "loadInterstitialVideoAd : Success to load in " + FANAdapter.this.getNetworkName());
                    FANAdapter.this.a(false);
                    if(FANAdapter.this.E && FANAdapter.this.e != null) {
                        FANAdapter.this.e.b(FANAdapter.this.w);
                    }
                }

                public void onError(Ad ad0, AdError adError0) {
                    b.b(Thread.currentThread(), "loadInterstitialVideoAd failed to load in " + FANAdapter.this.getNetworkName() + ", error code : " + adError0.getErrorCode() + ", error message : " + adError0.getErrorMessage());
                    FANAdapter.this.a(false);
                    if(FANAdapter.this.E && FANAdapter.this.e != null) {
                        FANAdapter.this.e.d(FANAdapter.this.w);
                    }
                }

                public void onInterstitialDismissed(Ad ad0) {
                    if(FANAdapter.this.e != null) {
                        FANAdapter.this.e.a();
                    }
                    FANAdapter.this.E = false;
                }

                public void onInterstitialDisplayed(Ad ad0) {
                    if(FANAdapter.this.E && FANAdapter.this.e != null) {
                        FANAdapter.this.e.a(FANAdapter.this.w);
                    }
                }

                public void onLoggingImpression(Ad ad0) {
                    try {
                        if(FANAdapter.this.F != null && FANAdapter.this.F.j() != null) {
                            for(int v = 0; v < FANAdapter.this.F.j().size(); ++v) {
                                String s = (String)FANAdapter.this.F.j().get(v);
                                if(s0.a(s)) {
                                    b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression url : " + s);
                                    E.g().d().a(context0, e.i, s);
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            }).build());
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.a(false);
        V v1 = this.e;
        if(v1 != null) {
            v1.d(this.w);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.h;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
        String s1;
        try {
            String s = "";
            this.s = context0;
            this.t = adPopcornSSPNativeAd0;
            this.r = v;
            if(adPopcornSSPNativeAd0.getFacebookViewBinder() != null && adPopcornSSPNativeAd0.getFacebookViewBinder().nativeAdViewId != 0) {
                if(z) {
                    if(d00 == null || d00.b() == null || d00.b().get(0) == null) {
                        s1 = null;
                    }
                    else {
                        g g0 = (g)d00.b().get(0);
                        this.F = g0;
                        s1 = g0.k();
                    }
                    if(s1 != null && s1.length() > 0) {
                        s = p.a(s1, "fb_placement_id");
                    }
                }
                else {
                    s = this.q ? ((a0)d00.e().a().get(v)).a("FAN_NATIVE_BANNER") : ((a0)d00.e().a().get(v)).a("FAN");
                    s1 = null;
                }
                b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter loadNativeAd : " + this.q + ", placementID : " + s);
                NativeAd nativeAd0 = this.m;
                if(nativeAd0 != null) {
                    nativeAd0.unregisterView();
                    this.m.destroy();
                    this.m = null;
                }
                this.a(context0);
                if(this.q) {
                    this.n = new NativeBannerAd(context0, s);
                    this.o = (NativeAdLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().nativeAdViewId);
                    this.p = LayoutInflater.from(context0).inflate(adPopcornSSPNativeAd0.getFacebookViewBinder().nativeAdUnitLayoutId, ((ViewGroup)this.o), false);
                    if(s1 != null) {
                        this.n.loadAd(this.n.buildLoadAdConfig().withBid(this.F.y()).withAdListener(this.L).build());
                        return;
                    }
                    this.n.loadAd(this.n.buildLoadAdConfig().withAdListener(this.L).build());
                    return;
                }
                this.m = new NativeAd(context0, s);
                this.o = (NativeAdLayout)adPopcornSSPNativeAd0.findViewById(adPopcornSSPNativeAd0.getFacebookViewBinder().nativeAdViewId);
                this.p = LayoutInflater.from(context0).inflate(adPopcornSSPNativeAd0.getFacebookViewBinder().nativeAdUnitLayoutId, ((ViewGroup)this.o), false);
                if(s1 != null) {
                    this.m.loadAd(this.m.buildLoadAdConfig().withBid(this.F.y()).withAdListener(this.L).build());
                    return;
                }
                this.m.loadAd(this.m.buildLoadAdConfig().withAdListener(this.L).build());
                return;
            }
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter viewBinder is null");
            c0 c00 = this.c;
            if(c00 != null) {
                c00.a(v, 3);
            }
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        c0 c01 = this.c;
        if(c01 != null) {
            c01.a(v, 0);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.g;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
        String s;
        try {
            this.x = v;
            this.s = context0;
            this.D = true;
            this.y = true;
            if(adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.A == null) {
                    this.A = new Handler();
                }
                if(this.B == null) {
                    this.B = new Runnable() {
                        final FANAdapter a;

                        @Override
                        public void run() {
                            if(FANAdapter.this.y) {
                                b.b(Thread.currentThread(), String.format("Time out in : %s", FANAdapter.this.getNetworkName()));
                                FANAdapter.this.a(true);
                                if(FANAdapter.this.D && FANAdapter.this.d != null) {
                                    FANAdapter.this.d.d(FANAdapter.this.x);
                                }
                            }
                        }
                    };
                }
                this.A.postDelayed(this.B, adPopcornSSPRewardVideoAd0.getNetworkScheduleTimeout());
            }
            if(!AudienceNetworkAds.isInitialized(context0)) {
                b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter isInitialized false");
                this.a(context0);
            }
            this.v = "";
            if(z) {
                if(d00 == null || d00.b() == null || d00.b().get(0) == null) {
                    s = null;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.F = g0;
                    s = g0.k();
                }
                if(s != null && s.length() > 0) {
                    this.v = p.a(s, "fb_placement_id");
                }
            }
            this.u = new RewardedVideoAd(context0, this.v);
            b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter loadRewardVideoAd()");
            this.u.loadAd(this.u.buildLoadAdConfig().withBid(this.F.y()).withAdListener(this.K).build());
            return;
        }
        catch(Exception exception0) {
        }
        this.a(true);
        b.a(Thread.currentThread(), exception0);
        l0 l00 = this.d;
        if(l00 != null) {
            l00.d(this.x);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.f;
        if(r00 != null) {
            r00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onPauseBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void pauseRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void resumeRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setBannerMediationAdapterEventListener(C c0) {
        this.a = c0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setCustomExtras(HashMap hashMap0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialMediationAdapterEventListener(T t0) {
        this.b = t0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setInterstitialVideoMediationAdapterEventListener(V v0) {
        this.e = v0;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.h = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
        this.c = c00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.g = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
        this.d = l00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.f = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter showInterstitial");
            if(this.k == null || !this.k.isAdLoaded()) {
                T t1 = this.b;
                if(t1 != null) {
                    t1.c(v);
                    return;
                }
            }
            else {
                if(!this.k.isAdInvalidated()) {
                    this.k.show();
                    return;
                }
                T t0 = this.b;
                if(t0 != null) {
                    t0.c(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        T t2 = this.b;
        if(t2 != null) {
            t2.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter showInterstitialVideoAd");
            if(this.l != null && this.l.isAdLoaded()) {
                if(!this.l.isAdInvalidated()) {
                    this.l.show();
                    return;
                }
                if(this.E) {
                    V v1 = this.e;
                    if(v1 != null) {
                        v1.c(v);
                        return;
                    }
                }
            }
            else if(this.E) {
                V v2 = this.e;
                if(v2 != null) {
                    v2.c(v);
                    return;
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        if(this.E) {
            V v3 = this.e;
            if(v3 != null) {
                v3.c(v);
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
        try {
            b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter showRewardVideoAd()");
            if(this.u != null && this.u.isAdLoaded()) {
                if(this.u.isAdInvalidated()) {
                    if(this.D) {
                        l0 l00 = this.d;
                        if(l00 != null) {
                            l00.c(v);
                            return;
                        }
                    }
                    return;
                }
                this.u.show();
                return;
            }
            if(this.D) {
                l0 l01 = this.d;
                if(l01 != null) {
                    l01.c(v);
                }
            }
        }
        catch(Exception unused_ex) {
            if(this.D) {
                l0 l02 = this.d;
                if(l02 != null) {
                    l02.c(v);
                }
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        String s1;
        try {
            if(adSize0 == AdSize.BANNER_320x100) {
                b.a(Thread.currentThread(), "FAN can not load 320x100");
                C c0 = this.a;
                if(c0 != null) {
                    c0.a(v);
                    return;
                }
                return;
            }
            this.i = true;
            this.I = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.G == null) {
                    this.G = new Handler();
                }
                if(this.H == null) {
                    this.H = new Runnable() {
                        final FANAdapter a;

                        @Override
                        public void run() {
                            if(FANAdapter.this.i) {
                                b.b(Thread.currentThread(), String.format("Time out in : %s", FANAdapter.this.getNetworkName()));
                                if(FANAdapter.this.a != null) {
                                    FANAdapter.this.a.a(FANAdapter.this.I);
                                }
                            }
                        }
                    };
                }
                this.G.postDelayed(this.H, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            this.a(context0);
            b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter.startBannerAd()");
            String s = "";
            if(z) {
                if(d00 == null || d00.b() == null || d00.b().get(0) == null) {
                    s1 = null;
                }
                else {
                    g g0 = (g)d00.b().get(0);
                    this.F = g0;
                    s1 = g0.k();
                }
                if(s1 != null && s1.length() > 0) {
                    s = p.a(s1, "fb_placement_id");
                }
            }
            else {
                s = ((a0)d00.e().a().get(v)).a("FAN");
                s1 = null;
            }
            AdView adView0 = this.j;
            if(adView0 != null) {
                adView0.destroy();
                this.j = null;
            }
            this.j = adSize0 == AdSize.BANNER_320x50 ? new AdView(context0, s, com.facebook.ads.AdSize.BANNER_HEIGHT_50) : new AdView(context0, s, com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250);
            if(s1 != null) {
                this.j.loadAd(this.j.buildLoadAdConfig().withBid(this.F.y()).withAdListener(new AdListener() {
                    final FANAdapter c;

                    public void onAdClicked(Ad ad0) {
                        b.a(Thread.currentThread(), "FacebookAudienceNetworkAdapter banner onAdClicked");
                        if(FANAdapter.this.a != null) {
                            FANAdapter.this.a.a();
                        }
                        try {
                            if(FANAdapter.this.F != null && FANAdapter.this.F.b() != null) {
                                for(int v = 0; v < FANAdapter.this.F.b().size(); ++v) {
                                    String s = (String)FANAdapter.this.F.b().get(v);
                                    if(s0.a(s)) {
                                        b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onAdClicked url : " + s);
                                        E.g().d().a(context0, e.j, s);
                                    }
                                }
                            }
                        }
                        catch(Exception exception0) {
                            exception0.printStackTrace();
                        }
                    }

                    public void onAdLoaded(Ad ad0) {
                        try {
                            adPopcornSSPBannerAd0.removeAllViewsInLayout();
                            adPopcornSSPBannerAd0.removeAllViews();
                            adPopcornSSPBannerAd0.addView(((View)FANAdapter.this.j));
                            FANAdapter.this.stopBannerTimer();
                            if(FANAdapter.this.a != null) {
                                FANAdapter.this.a.b(FANAdapter.this.I);
                            }
                            if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                                adPopcornSSPBannerAd0.setVisibility(4);
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    final com.igaworks.ssp.common.adapter.FANAdapter.3 a;

                                    @Override
                                    public void run() {
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                        try {
                                            try {
                                                ((View)FANAdapter.this.j).buildDrawingCache();
                                                Bitmap bitmap0 = ((View)FANAdapter.this.j).getDrawingCache();
                                                if(bitmap0 != null) {
                                                    int v = bitmap0.getPixel(1, 1);
                                                    com.igaworks.ssp.common.adapter.FANAdapter.3.this.b.setBackgroundColor(v);
                                                }
                                                goto label_17;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            b.a(Thread.currentThread(), exception0);
                                            adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.FANAdapter.3.this.b;
                                            if(adPopcornSSPBannerAd0 != null) {
                                                goto label_10;
                                            }
                                            return;
                                        }
                                        catch(Throwable throwable0) {
                                            goto label_13;
                                        }
                                    label_10:
                                        adPopcornSSPBannerAd0.setVisibility(0);
                                        return;
                                    label_13:
                                        AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.FANAdapter.3.this.b;
                                        if(adPopcornSSPBannerAd1 != null) {
                                            adPopcornSSPBannerAd1.setVisibility(0);
                                        }
                                        throw throwable0;
                                    label_17:
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.FANAdapter.3.this.b;
                                        if(adPopcornSSPBannerAd0 != null) {
                                            adPopcornSSPBannerAd0.setVisibility(0);
                                        }
                                    }
                                }, 350L);
                                return;
                            }
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        b.a(Thread.currentThread(), exception0);
                        FANAdapter.this.stopBannerTimer();
                        if(FANAdapter.this.a != null) {
                            FANAdapter.this.a.a(FANAdapter.this.I);
                        }
                    }

                    public void onError(Ad ad0, AdError adError0) {
                        try {
                            b.b(Thread.currentThread(), "failed to load in " + FANAdapter.this.getNetworkName() + ", error code : " + adError0.getErrorCode() + ", error message : " + adError0.getErrorMessage());
                            FANAdapter.this.stopBannerTimer();
                            if(FANAdapter.this.a != null) {
                                FANAdapter.this.a.a(FANAdapter.this.I);
                            }
                        }
                        catch(Exception exception0) {
                            b.a(Thread.currentThread(), exception0);
                        }
                    }

                    public void onLoggingImpression(Ad ad0) {
                        try {
                            if(FANAdapter.this.F != null && FANAdapter.this.F.j() != null) {
                                for(int v = 0; v < FANAdapter.this.F.j().size(); ++v) {
                                    String s = (String)FANAdapter.this.F.j().get(v);
                                    if(s0.a(s)) {
                                        b.c(Thread.currentThread(), "FacebookAudienceNetworkAdapter onLoggingImpression url : " + s);
                                        E.g().d().a(context0, e.i, s);
                                    }
                                }
                            }
                        }
                        catch(Exception exception0) {
                            exception0.printStackTrace();
                        }
                    }
                }).build());
                return;
            }
            this.j.loadAd(this.j.buildLoadAdConfig().withAdListener(new AdListener() {
                final FANAdapter b;

                public void onAdClicked(Ad ad0) {
                    b.b(Thread.currentThread(), "FacebookAudienceNetworkAdapter banner onAdClicked");
                    if(FANAdapter.this.a != null) {
                        FANAdapter.this.a.a();
                    }
                }

                public void onAdLoaded(Ad ad0) {
                    try {
                        adPopcornSSPBannerAd0.removeAllViewsInLayout();
                        adPopcornSSPBannerAd0.removeAllViews();
                        adPopcornSSPBannerAd0.addView(((View)FANAdapter.this.j));
                        FANAdapter.this.stopBannerTimer();
                        if(FANAdapter.this.a != null) {
                            FANAdapter.this.a.b(FANAdapter.this.I);
                        }
                        if(adPopcornSSPBannerAd0 != null && adPopcornSSPBannerAd0.getAutoBgColor()) {
                            adPopcornSSPBannerAd0.setVisibility(4);
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                final com.igaworks.ssp.common.adapter.FANAdapter.4 a;

                                @Override
                                public void run() {
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0;
                                    try {
                                        try {
                                            ((View)FANAdapter.this.j).buildDrawingCache();
                                            Bitmap bitmap0 = ((View)FANAdapter.this.j).getDrawingCache();
                                            if(bitmap0 != null) {
                                                int v = bitmap0.getPixel(1, 1);
                                                com.igaworks.ssp.common.adapter.FANAdapter.4.this.a.setBackgroundColor(v);
                                            }
                                            goto label_17;
                                        }
                                        catch(Exception exception0) {
                                        }
                                        b.a(Thread.currentThread(), exception0);
                                        adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.FANAdapter.4.this.a;
                                        if(adPopcornSSPBannerAd0 != null) {
                                            goto label_10;
                                        }
                                        return;
                                    }
                                    catch(Throwable throwable0) {
                                        goto label_13;
                                    }
                                label_10:
                                    adPopcornSSPBannerAd0.setVisibility(0);
                                    return;
                                label_13:
                                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = com.igaworks.ssp.common.adapter.FANAdapter.4.this.a;
                                    if(adPopcornSSPBannerAd1 != null) {
                                        adPopcornSSPBannerAd1.setVisibility(0);
                                    }
                                    throw throwable0;
                                label_17:
                                    adPopcornSSPBannerAd0 = com.igaworks.ssp.common.adapter.FANAdapter.4.this.a;
                                    if(adPopcornSSPBannerAd0 != null) {
                                        adPopcornSSPBannerAd0.setVisibility(0);
                                    }
                                }
                            }, 350L);
                            return;
                        }
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    b.a(Thread.currentThread(), exception0);
                    FANAdapter.this.stopBannerTimer();
                    if(FANAdapter.this.a != null) {
                        FANAdapter.this.a.a(FANAdapter.this.I);
                    }
                }

                public void onError(Ad ad0, AdError adError0) {
                    try {
                        b.b(Thread.currentThread(), "failed to load in " + FANAdapter.this.getNetworkName() + ", error code : " + adError0.getErrorCode() + ", error message : " + adError0.getErrorMessage());
                        FANAdapter.this.stopBannerTimer();
                        if(FANAdapter.this.a != null) {
                            FANAdapter.this.a.a(FANAdapter.this.I);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }

                public void onLoggingImpression(Ad ad0) {
                    b.b(Thread.currentThread(), "FacebookAudienceNetworkAdapter banner onLoggingImpression");
                }
            }).build());
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        C c1 = this.a;
        if(c1 != null) {
            c1.a(this.I);
        }
    }

    public void stopBannerTimer() {
        try {
            this.i = false;
            Handler handler0 = this.G;
            if(handler0 != null) {
                handler0.removeCallbacks(this.H);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

