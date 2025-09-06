package com.igaworks.ssp.common.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.C;
import com.igaworks.ssp.SdkInitListener;
import com.igaworks.ssp.T;
import com.igaworks.ssp.V;
import com.igaworks.ssp.a0;
import com.igaworks.ssp.b0;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c0;
import com.igaworks.ssp.d0;
import com.igaworks.ssp.g0;
import com.igaworks.ssp.l0;
import com.igaworks.ssp.p0;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.modalad.AdPopcornSSPModalAd;
import com.igaworks.ssp.part.nativead.AdPopcornSSPNativeAd;
import com.igaworks.ssp.part.splash.AdPopcornSSPSplashAd;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.r0;
import com.mmc.man.AdListener;
import com.mmc.man.data.AdData;
import com.mmc.man.view.AdManView;
import java.util.HashMap;

public class MezzoMediaAdapter implements BaseMediationAdapter {
    private C a;
    private T b;
    private r0 c;
    private g0 d;
    private b0 e;
    private boolean f;
    private AdManView g;
    private boolean h;
    private AdListener i;
    private Handler j;
    private Runnable k;
    private int l;

    public MezzoMediaAdapter() {
        this.f = true;
        this.h = false;
        this.j = new Handler(Looper.getMainLooper());
    }

    private String a(Context context0) {
        try {
            PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0);
            return applicationInfo0 == null ? "appname" : packageManager0.getApplicationLabel(applicationInfo0);
        }
        catch(Exception unused_ex) {
            return "appname";
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkAdPopcornSSPNativeImpression() {
    }

    public void checkAdPopcornSSPReactNativeImpression() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void checkValidMediation() {
        this.i = new AdListener() {
            final MezzoMediaAdapter a;

            public void onAdErrorCode(Object object0, String s, String s1, String s2, String s3) {
            }

            public void onAdEvent(Object object0, String s, String s1, String s2, String s3) {
            }

            public void onAdFailCode(Object object0, String s, String s1, String s2, String s3) {
            }

            public void onAdSuccessCode(Object object0, String s, String s1, String s2, String s3) {
            }

            public void onPermissionSetting(Object object0, String s) {
            }
        };
        b.a(Thread.currentThread(), "MezzoMediaAdapter SDK imported");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyBannerAd() {
        try {
            b.a(Thread.currentThread(), "MezzoMediaAdapter.destroyBannerAd");
            AdManView adManView0 = this.g;
            if(adManView0 != null) {
                adManView0.onDestroy();
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
    public void destroyInterstitial() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyInterstitialVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyModalAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyReactNativeAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroyRewardVideoAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void destroySplashAd() {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getBiddingToken(Context context0) {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public String getNetworkName() [...] // 潜在的解密器

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void initializeSDK(Context context0, p0 p00, SdkInitListener sdkInitListener0) {
        try {
            b.a(Thread.currentThread(), "MezzoMediaAdapter initializeSDK");
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
        catch(NoClassDefFoundError unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
        catch(NoSuchMethodError unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
        catch(Exception unused_ex) {
            if(sdkInitListener0 != null) {
                sdkInitListener0.onInitializationFinished();
            }
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void internalStopBannerAd() {
        try {
            b.a(Thread.currentThread(), "MezzoMediaAdapter.internalStopBannerAd");
            AdManView adManView0 = this.g;
            if(adManView0 != null) {
                adManView0.onDestroy();
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
        T t0 = this.b;
        if(t0 != null) {
            t0.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadInterstitialVideoAd(Context context0, AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
        b0 b00 = this.e;
        if(b00 != null) {
            b00.d(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPNativeAd adPopcornSSPNativeAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadReactNativeAd(Context context0, d0 d00, boolean z, int v, AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
        g0 g00 = this.d;
        if(g00 != null) {
            g00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadRewardVideoAd(Context context0, AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void loadSplashAd(Context context0, d0 d00, int v, AdPopcornSSPSplashAd adPopcornSSPSplashAd0) {
        r0 r00 = this.c;
        if(r00 != null) {
            r00.a(v, 2);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onPauseBanner() {
        b.a(Thread.currentThread(), "MezzoMediaAdapter.onPauseBanner");
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void onResumeBanner() {
        b.a(Thread.currentThread(), "MezzoMediaAdapter.onResumeBanner");
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
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setModalAdMediationAdapterEventListener(b0 b00) {
        this.e = b00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setNativeMediationAdapterEventListener(c0 c00) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setReactNativeMediationAdapterEventListener(g0 g00) {
        this.d = g00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setRewardVideoMediationAdapterEventListener(l0 l00) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void setSplashMediationAdapterEventListener(r0 r00) {
        this.c = r00;
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitial(Context context0, d0 d00, boolean z, int v) {
        T t0 = this.b;
        if(t0 != null) {
            t0.c(v);
        }
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showInterstitialVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showModalAd(Context context0, d0 d00, int v, AdPopcornSSPModalAd adPopcornSSPModalAd0) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void showRewardVideoAd(Context context0, d0 d00, boolean z, int v) {
    }

    @Override  // com.igaworks.ssp.common.adapter.BaseMediationAdapter
    public void startBannerAd(Context context0, AdSize adSize0, AdPopcornSSPBannerAd adPopcornSSPBannerAd0, d0 d00, boolean z, int v) {
        int v4;
        int v3;
        int v2;
        String s6;
        boolean z1;
        int v1;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        try {
            b.a(Thread.currentThread(), "MezzoMediaAdapter.startBannerAd()");
            this.f = true;
            this.l = v;
            if(adPopcornSSPBannerAd0.getNetworkScheduleTimeout() > 0L) {
                if(this.j == null) {
                    this.j = new Handler();
                }
                if(this.k == null) {
                    this.k = new Runnable() {
                        final MezzoMediaAdapter a;

                        @Override
                        public void run() {
                            if(MezzoMediaAdapter.this.f) {
                                b.b(Thread.currentThread(), "Time out in : MezzoMedia");
                                if(MezzoMediaAdapter.this.a != null) {
                                    MezzoMediaAdapter.this.a.a(MezzoMediaAdapter.this.l);
                                }
                            }
                        }
                    };
                }
                this.j.postDelayed(this.k, adPopcornSSPBannerAd0.getNetworkScheduleTimeout());
            }
            s = ((a0)d00.e().a().get(v)).a("MezzoMedia_Publisher");
            s1 = ((a0)d00.e().a().get(v)).a("MezzoMedia_Media");
            s2 = ((a0)d00.e().a().get(v)).a("MezzoMedia_Section");
            s3 = "http://www.storeurl.com";
            s4 = this.a(context0);
            v1 = -1;
        }
        catch(Exception exception0) {
            goto label_64;
        }
        try {
            if(adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_STORE_URL") != null) {
                String s5 = (String)adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_STORE_URL");
                s3 = s5;
                b.a(Thread.currentThread(), "MEZZO_STORE_URL : " + s5);
                s3 = s5;
            }
            if(adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_IS_USED_BACKGROUND_CHECK") == null) {
                goto label_27;
            }
            else {
                z1 = ((Boolean)adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_IS_USED_BACKGROUND_CHECK")).booleanValue();
                goto label_25;
            }
            goto label_28;
        }
        catch(Exception unused_ex) {
            z1 = true;
            goto label_35;
        }
        try {
        label_25:
            b.a(Thread.currentThread(), "MEZZO_IS_USED_BACKGROUND_CHECK : " + z1);
            goto label_28;
        label_27:
            z1 = true;
        label_28:
            if(adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_AGE_LEVEL") == null) {
                s6 = s3;
                v2 = -1;
            }
            else {
                v1 = (int)(((Integer)adPopcornSSPBannerAd0.getMediationExtraData("MEZZO_AGE_LEVEL")));
                b.a(Thread.currentThread(), "MEZZO_AGE_LEVEL : " + v1);
                goto label_35;
            }
        }
        catch(Exception unused_ex) {
        label_35:
            s6 = s3;
            v2 = v1;
        }
        try {
            if(this.g == null) {
                this.g = new AdManView(context0);
                this.h = true;
            }
            else {
                b.a(Thread.currentThread(), "already exist Mezzo AdView");
                this.h = false;
            }
            if(adSize0 == AdSize.BANNER_300x250 || adSize0 == AdSize.BANNER_ADAPTIVE_SIZE) {
                v3 = 300;
                v4 = 0xFA;
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                v3 = 320;
                v4 = 100;
            }
            else {
                v3 = 320;
                v4 = 50;
            }
            AdData adData0 = new AdData();
            adData0.major(adPopcornSSPBannerAd0.getPlacementId(), "1", Integer.parseInt(s), Integer.parseInt(s1), Integer.parseInt(s2), s6, "com.dcinside.app.android", s4, v3, v4);
            adData0.setUserAgeLevel(v2);
            adData0.isPermission("0");
            adData0.setApiModule("0", "0");
            if(!z1) {
                this.g.isUsedBackgroundCheck("0");
            }
            this.g.setData(adData0, new AdListener() {
                final MezzoMediaAdapter b;

                public void onAdErrorCode(Object object0, String s, String s1, String s2, String s3) {
                    b.b(Thread.currentThread(), "MezzoAdapter onAdErrorCode : " + s2);
                    MezzoMediaAdapter.this.stopBannerTimer();
                    if(MezzoMediaAdapter.this.a != null) {
                        MezzoMediaAdapter.this.a.a(MezzoMediaAdapter.this.l);
                    }
                }

                public void onAdEvent(Object object0, String s, String s1, String s2, String s3) {
                    if("close".equals(s1)) {
                        MezzoMediaAdapter.this.internalStopBannerAd();
                        return;
                    }
                    if("adclick".equals(s1)) {
                        b.a(Thread.currentThread(), "MezzoAdapter banner onAdEvent click");
                        if(MezzoMediaAdapter.this.a != null) {
                            MezzoMediaAdapter.this.a.a();
                        }
                    }
                }

                public void onAdFailCode(Object object0, String s, String s1, String s2, String s3) {
                    b.b(Thread.currentThread(), "MezzoAdapter onAdFailCode : " + s2);
                    MezzoMediaAdapter.this.stopBannerTimer();
                    if(MezzoMediaAdapter.this.a != null) {
                        MezzoMediaAdapter.this.a.a(MezzoMediaAdapter.this.l);
                    }
                }

                public void onAdSuccessCode(Object object0, String s, String s1, String s2, String s3) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        final com.igaworks.ssp.common.adapter.MezzoMediaAdapter.3 b;

                        @Override
                        public void run() {
                            try {
                                if("200".equals(s2)) {
                                    MezzoMediaAdapter.this.stopBannerTimer();
                                    b.a(Thread.currentThread(), "MezzoAdapter onAdSuccessCode : " + MezzoMediaAdapter.this.h);
                                    if(MezzoMediaAdapter.this.h) {
                                        com.igaworks.ssp.common.adapter.MezzoMediaAdapter.3.this.a.removeAllViewsInLayout();
                                        com.igaworks.ssp.common.adapter.MezzoMediaAdapter.3.this.a.removeAllViews();
                                        MezzoMediaAdapter.this.g.addBannerView(com.igaworks.ssp.common.adapter.MezzoMediaAdapter.3.this.a);
                                        MezzoMediaAdapter.this.h = false;
                                    }
                                    com.igaworks.ssp.common.adapter.MezzoMediaAdapter.3.this.a.setVisibility(0);
                                    if(MezzoMediaAdapter.this.a != null) {
                                        MezzoMediaAdapter.this.a.b(MezzoMediaAdapter.this.l);
                                        return;
                                    }
                                }
                                return;
                            }
                            catch(Exception exception0) {
                            }
                            b.a(Thread.currentThread(), exception0);
                            MezzoMediaAdapter.this.stopBannerTimer();
                            if(MezzoMediaAdapter.this.a != null) {
                                MezzoMediaAdapter.this.a.a(MezzoMediaAdapter.this.l);
                            }
                        }
                    });
                }

                public void onPermissionSetting(Object object0, String s) {
                }
            });
            this.g.request(new Handler());
            return;
        }
        catch(Exception exception0) {
        }
    label_64:
        b.a(Thread.currentThread(), exception0);
        this.stopBannerTimer();
        C c0 = this.a;
        if(c0 != null) {
            c0.a(v);
        }
    }

    public void stopBannerTimer() {
        try {
            this.f = false;
            Handler handler0 = this.j;
            if(handler0 != null) {
                handler0.removeCallbacks(this.k);
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

