package com.igaworks.ssp.plugin.unity;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.BannerAnimType;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import java.util.HashMap;

public class AdPopcornSSPUnityBanner {
    private final int a;
    private final int b;
    private AdPopcornSSPBannerAd c;
    private Activity d;
    private AdSize e;
    private BannerAnimType f;

    public AdPopcornSSPUnityBanner(Activity activity0) {
        this.a = 0;
        this.b = 1;
        this.d = activity0;
        this.c = new AdPopcornSSPBannerAd(activity0);
    }

    private int a(Context context0, int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
    }

    public void create(int v, int v1) {
        if(this.c != null) {
            AdSize adSize0 = AdSize.BANNER_300x250;
            if(v == adSize0.getValue()) {
                this.e = adSize0;
            }
            else {
                AdSize adSize1 = AdSize.BANNER_320x100;
                this.e = v == adSize1.getValue() ? adSize1 : AdSize.BANNER_320x50;
            }
            this.c.setAdSize(this.e);
            this.d.runOnUiThread(new Runnable() {
                private int a;
                final AdPopcornSSPUnityBanner b;

                @Override
                public void run() {
                    LinearLayout linearLayout0 = new LinearLayout(AdPopcornSSPUnityBanner.this.d);
                    linearLayout0.setOrientation(1);
                    int v = this.a;
                    if(v == 0) {
                        linearLayout0.setGravity(49);
                    }
                    else {
                        if(v != 1) {
                        }
                        linearLayout0.setGravity(81);
                    }
                    AdPopcornSSPUnityBanner.this.d.addContentView(linearLayout0, new LinearLayout.LayoutParams(-1, -1));
                    if(AdPopcornSSPUnityBanner.this.e == AdSize.BANNER_320x50) {
                        AdPopcornSSPUnityBanner.this.c.setLayoutParams(new LinearLayout.LayoutParams(AdPopcornSSPUnityBanner.this.a(AdPopcornSSPUnityBanner.this.d, 320), -2));
                    }
                    else if(AdPopcornSSPUnityBanner.this.e == AdSize.BANNER_320x100) {
                        AdPopcornSSPUnityBanner.this.c.setLayoutParams(new LinearLayout.LayoutParams(AdPopcornSSPUnityBanner.this.a(AdPopcornSSPUnityBanner.this.d, 320), -2));
                    }
                    else if(AdPopcornSSPUnityBanner.this.e == AdSize.BANNER_ADAPTIVE_SIZE) {
                        AdPopcornSSPUnityBanner.this.c.setLayoutParams(new LinearLayout.LayoutParams(AdPopcornSSPUnityBanner.this.a(AdPopcornSSPUnityBanner.this.d, 360), -2));
                    }
                    else {
                        AdPopcornSSPUnityBanner.this.c.setLayoutParams(new LinearLayout.LayoutParams(AdPopcornSSPUnityBanner.this.a(AdPopcornSSPUnityBanner.this.d, 300), -2));
                    }
                    linearLayout0.addView(AdPopcornSSPUnityBanner.this.c);
                }

                public Runnable start(int v) {
                    this.a = v;
                    return this;
                }
            }.start(v1));
        }
    }

    public boolean isDisplayed() {
        try {
            return this.c.isDisplayed();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public void loadAd() {
        this.d.runOnUiThread(new Runnable() {
            final AdPopcornSSPUnityBanner a;

            @Override
            public void run() {
                if(AdPopcornSSPUnityBanner.this.c != null) {
                    AdPopcornSSPUnityBanner.this.c.loadAd();
                }
            }

            public Runnable start() {
                return this;
            }
        }.start());
    }

    public void onPause() {
        this.d.runOnUiThread(new Runnable() {
            final AdPopcornSSPUnityBanner a;

            @Override
            public void run() {
                if(AdPopcornSSPUnityBanner.this.c != null) {
                    AdPopcornSSPUnityBanner.this.c.onPause();
                }
            }

            public Runnable start() {
                return this;
            }
        }.start());
    }

    public void onResume() {
        this.d.runOnUiThread(new Runnable() {
            final AdPopcornSSPUnityBanner a;

            @Override
            public void run() {
                if(AdPopcornSSPUnityBanner.this.c != null) {
                    AdPopcornSSPUnityBanner.this.c.onResume();
                }
            }

            public Runnable start() {
                return this;
            }
        }.start());
    }

    public void setAdSize(int v) {
        if(this.c != null) {
            AdSize adSize0 = AdSize.BANNER_300x250;
            if(v == adSize0.getValue()) {
                this.e = adSize0;
            }
            else {
                AdSize adSize1 = AdSize.BANNER_320x100;
                this.e = v == adSize1.getValue() ? adSize1 : AdSize.BANNER_320x50;
            }
            this.c.setAdSize(this.e);
            AdSize adSize2 = this.e;
            if(adSize2 == AdSize.BANNER_320x50) {
                this.c.setLayoutParams(new LinearLayout.LayoutParams(this.a(this.d, 320), -2));
                return;
            }
            if(adSize2 == AdSize.BANNER_320x100) {
                this.c.setLayoutParams(new LinearLayout.LayoutParams(this.a(this.d, 320), -2));
                return;
            }
            if(adSize2 == AdSize.BANNER_ADAPTIVE_SIZE) {
                this.c.setLayoutParams(new LinearLayout.LayoutParams(this.a(this.d, 360), -2));
                return;
            }
            this.c.setLayoutParams(new LinearLayout.LayoutParams(this.a(this.d, 300), -2));
        }
    }

    public void setAutoBgColor(boolean z) {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.c;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.setAutoBgColor(z);
        }
    }

    public void setBannerAnimType(int v) {
        try {
            if(this.c != null) {
                BannerAnimType bannerAnimType0 = BannerAnimType.FADE_IN;
                if(v == bannerAnimType0.getValue()) {
                    this.f = bannerAnimType0;
                }
                else {
                    BannerAnimType bannerAnimType1 = BannerAnimType.SLIDE_LEFT;
                    if(v == bannerAnimType1.getValue()) {
                        this.f = bannerAnimType1;
                    }
                    else {
                        BannerAnimType bannerAnimType2 = BannerAnimType.SLIDE_RIGHT;
                        if(v == bannerAnimType2.getValue()) {
                            this.f = bannerAnimType2;
                        }
                        else {
                            BannerAnimType bannerAnimType3 = BannerAnimType.TOP_SLIDE;
                            if(v == bannerAnimType3.getValue()) {
                                this.f = bannerAnimType3;
                            }
                            else {
                                BannerAnimType bannerAnimType4 = BannerAnimType.BOTTOM_SLIDE;
                                if(v == bannerAnimType4.getValue()) {
                                    this.f = bannerAnimType4;
                                }
                                else {
                                    BannerAnimType bannerAnimType5 = BannerAnimType.CIRCLE;
                                    this.f = v == bannerAnimType5.getValue() ? bannerAnimType5 : BannerAnimType.NONE;
                                }
                            }
                        }
                    }
                }
                this.c.setBannerAnimType(this.f);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setBannerEventCallbackListener(AdPopcornSSPUnityBannerListener adPopcornSSPUnityBannerListener0) {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.c;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.setBannerEventCallbackListener(new IBannerEventCallbackListener() {
                final AdPopcornSSPUnityBanner b;

                @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                public void OnBannerAdClicked() {
                    AdPopcornSSPUnityBannerListener adPopcornSSPUnityBannerListener0 = adPopcornSSPUnityBannerListener0;
                    if(adPopcornSSPUnityBannerListener0 != null) {
                        adPopcornSSPUnityBannerListener0.OnBannerAdClicked();
                    }
                }

                @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                public void OnBannerAdReceiveFailed(SSPErrorCode sSPErrorCode0) {
                    AdPopcornSSPUnityBannerListener adPopcornSSPUnityBannerListener0 = adPopcornSSPUnityBannerListener0;
                    if(adPopcornSSPUnityBannerListener0 != null) {
                        adPopcornSSPUnityBannerListener0.OnBannerAdReceiveFailed(sSPErrorCode0.getErrorCode(), sSPErrorCode0.getErrorMessage());
                    }
                }

                @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                public void OnBannerAdReceiveSuccess() {
                    AdPopcornSSPUnityBannerListener adPopcornSSPUnityBannerListener0 = adPopcornSSPUnityBannerListener0;
                    if(adPopcornSSPUnityBannerListener0 != null) {
                        adPopcornSSPUnityBannerListener0.OnBannerAdReceiveSuccess();
                    }
                }
            });
        }
    }

    public void setMediationBooleanExtras(String s, boolean z) {
        try {
            b.c(Thread.currentThread(), "setMediationBooleanExtras : " + s + ", value : " + z);
            if(this.c != null) {
                HashMap hashMap0 = new HashMap();
                if(s != null && s.contentEquals("CAULY_DYNAMIC_RELOAD_INTERVAL")) {
                    hashMap0.put("CAULY_DYNAMIC_RELOAD_INTERVAL", Boolean.valueOf(z));
                }
                if(s != null && s.contentEquals("CAULY_ENABLE_LOCK")) {
                    hashMap0.put("CAULY_ENABLE_LOCK", Boolean.valueOf(z));
                }
                if(s != null && s.contentEquals("MEZZO_IS_USED_BACKGROUND_CHECK")) {
                    hashMap0.put("MEZZO_IS_USED_BACKGROUND_CHECK", Boolean.valueOf(z));
                }
                this.c.setMediationExtras(hashMap0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setMediationIntExtras(String s, int v) {
        try {
            b.c(Thread.currentThread(), "setMediationIntExtras : " + s + ", value : " + v);
            if(this.c != null) {
                HashMap hashMap0 = new HashMap();
                if(s != null && s.contentEquals("CAULY_RELOAD_INTERVAL")) {
                    hashMap0.put("CAULY_RELOAD_INTERVAL", v);
                }
                if(s != null && s.contentEquals("CAULY_THREAD_PRIORITY")) {
                    hashMap0.put("CAULY_THREAD_PRIORITY", v);
                }
                if(s != null && s.contentEquals("MEZZO_STORE_URL")) {
                    hashMap0.put("MEZZO_STORE_URL", v);
                }
                if(s != null && s.contentEquals("MEZZO_AGE_LEVEL")) {
                    hashMap0.put("MEZZO_AGE_LEVEL", v);
                }
                this.c.setMediationExtras(hashMap0);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void setPlacementId(String s) {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.c;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.setPlacementId(s);
        }
    }

    public void setRefreshTime(int v) {
        AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = this.c;
        if(adPopcornSSPBannerAd0 != null) {
            adPopcornSSPBannerAd0.setRefreshTime(v);
        }
    }

    public void stopAd() {
        this.d.runOnUiThread(new Runnable() {
            final AdPopcornSSPUnityBanner a;

            @Override
            public void run() {
                if(AdPopcornSSPUnityBanner.this.c != null) {
                    AdPopcornSSPUnityBanner.this.c.stopAd();
                }
            }

            public Runnable start() {
                return this;
            }
        }.start());
    }
}

