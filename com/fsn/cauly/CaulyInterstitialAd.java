package com.fsn.cauly;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyInterstitialAd implements Application.ActivityLifecycleCallbacks, BDAdProxyListener {
    CaulyAdInfo a;
    CaulyInterstitialAdListener b;
    BDAdProxy c;
    boolean d;
    String e;
    long f;
    private Context g;
    private boolean h;
    static ArrayList i;

    static {
        CaulyInterstitialAd.i = new ArrayList();
    }

    public CaulyInterstitialAd() {
        this.d = true;
        this.f = 0L;
        this.h = false;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    public boolean canShow() {
        if(this.g != null) {
            long v = System.currentTimeMillis() - this.f;
            return v >= 0L && v < ((long)(BDPrefUtil.getIntValue(this.g, "INTER_EXPIRE_SEC", 86400) * 1000));
        }
        return false;
    }

    public void cancel() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Interstitial - cancel");
        this.c.e(null);
        this.c.r();
        this.c = null;
        CaulyInterstitialAd.i.remove(this);
    }

    public void disableBackKey() {
        this.d = false;
    }

    public String getExtraInfos() {
        return this.e;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        if(this.c != null && this.h) {
            this.cancel();
            activity0.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Interstitial - onClickAd");
        CaulyInterstitialAdListener caulyInterstitialAdListener0 = this.b;
        if(caulyInterstitialAdListener0 == null) {
            return;
        }
        this.h = true;
        caulyInterstitialAdListener0.onLeaveInterstitialAd(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Interstitial - onFailedToReceiveInterstitialAd(" + v + ")" + s);
        CaulyInterstitialAdListener caulyInterstitialAdListener0 = this.b;
        if(caulyInterstitialAdListener0 == null) {
            return;
        }
        caulyInterstitialAdListener0.onFailedToReceiveInterstitialAd(this, v, s);
        CaulyInterstitialAd.i.remove(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
        Logger.writeLog(LogLevel.Debug, "Interstitial - onClosedInterstitialAd");
        CaulyInterstitialAdListener caulyInterstitialAdListener0 = this.b;
        if(caulyInterstitialAdListener0 == null) {
            return;
        }
        caulyInterstitialAdListener0.onClosedInterstitialAd(this);
        CaulyInterstitialAd.i.remove(this);
        ((Activity)this.g).getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Interstitial - onReceiveInterstitialAd(" + v + ")" + s);
        CaulyInterstitialAdListener caulyInterstitialAdListener0 = this.b;
        if(caulyInterstitialAdListener0 == null) {
            return;
        }
        this.e = s;
        this.f = System.currentTimeMillis();
        caulyInterstitialAdListener0.onReceiveInterstitialAd(this, v == 0);
    }

    public void requestInterstitialAd(Activity activity0) {
        if(this.c != null) {
            this.cancel();
        }
        this.g = activity0;
        Logger.writeLog(LogLevel.Debug, "Interstitial - start");
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Interstitial.ordinal());
        hashMap0.put("sdk_viewtype", "all");
        if(!this.d) {
            hashMap0.put("closeOnBackKey", Boolean.FALSE);
        }
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, activity0, activity0);
        this.c = bDAdProxy0;
        bDAdProxy0.e(this);
        this.c.p();
        CaulyInterstitialAd.i.add(this);
        activity0.getApplication().registerActivityLifecycleCallbacks(this);
        this.h = false;
    }

    public void requestInterstitialAd(Activity activity0, ViewGroup viewGroup0) {
        if(this.c != null) {
            this.cancel();
        }
        this.g = activity0;
        Logger.writeLog(LogLevel.Debug, "Interstitial - start");
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Interstitial.ordinal());
        hashMap0.put("sdk_viewtype", "all");
        hashMap0.put("custom_instl", "y");
        if(!this.d) {
            hashMap0.put("closeOnBackKey", Boolean.FALSE);
        }
        hashMap0.put("viewgroup_id", viewGroup0);
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, activity0, activity0);
        this.c = bDAdProxy0;
        bDAdProxy0.e(this);
        this.c.p();
        CaulyInterstitialAd.i.add(this);
        activity0.getApplication().registerActivityLifecycleCallbacks(this);
        this.h = false;
    }

    public void requestInterstitialAd(Activity activity0, String s) {
        if(s.split("x").length == 2) {
            if(this.c != null) {
                this.cancel();
            }
            this.g = activity0;
            Logger.writeLog(LogLevel.Debug, "Interstitial - start");
            HashMap hashMap0 = (HashMap)this.a.b().clone();
            hashMap0.put("adType", AdType.Interstitial.ordinal());
            hashMap0.put("sdk_viewtype", "all");
            hashMap0.put("custom_instl", "y");
            if(!this.d) {
                hashMap0.put("closeOnBackKey", Boolean.FALSE);
            }
            hashMap0.put("ad_customSize", s);
            BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, activity0, activity0);
            this.c = bDAdProxy0;
            bDAdProxy0.e(this);
            this.c.p();
            CaulyInterstitialAd.i.add(this);
            return;
        }
        CaulyInterstitialAdListener caulyInterstitialAdListener0 = this.b;
        if(caulyInterstitialAdListener0 != null) {
            caulyInterstitialAdListener0.onFailedToReceiveInterstitialAd(this, 0, "screen_size not allow, Please check the screen_size type.");
        }
        CaulyInterstitialAd.i.remove(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setInterstialAdListener(CaulyInterstitialAdListener caulyInterstitialAdListener0) {
        this.b = caulyInterstitialAdListener0;
    }

    public void show() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Interstitial - show");
        this.c.a(7, null, null);
    }

    public void show(ViewGroup viewGroup0) {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Interstitial - show");
        this.c.a(7, viewGroup0, this.g);
    }
}

