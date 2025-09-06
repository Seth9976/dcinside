package com.fsn.cauly;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyIconAd implements BDAdProxyListener {
    CaulyAdInfo a;
    CaulyIconAdListener b;
    BDAdProxy c;
    static ArrayList d;

    static {
        CaulyIconAd.d = new ArrayList();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    public void cancel() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "IconAd - cancel");
        this.c.e(null);
        this.c.r();
        this.c = null;
        CaulyIconAd.d.remove(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "IconAd - onClickAd");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "IconAd - onFailedToReceiveIconAd(" + v + ")" + s);
        CaulyIconAdListener caulyIconAdListener0 = this.b;
        if(caulyIconAdListener0 == null) {
            return;
        }
        caulyIconAdListener0.onFailedToReceiveIconAd(this, v, s);
        CaulyIconAd.d.remove(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
        Logger.writeLog(LogLevel.Debug, "IconAd - onClosedIconAd");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "IconAd - onReceiveIconAd(" + v + ")" + s);
        CaulyIconAdListener caulyIconAdListener0 = this.b;
        if(caulyIconAdListener0 == null) {
            return;
        }
        caulyIconAdListener0.onReceiveIconAd(this, v == 0);
    }

    public void requestIconAd(Activity activity0) {
        if(this.c != null) {
            this.cancel();
        }
        Logger.writeLog(LogLevel.Debug, "IconAd - start");
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Icon.ordinal());
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, activity0, activity0);
        this.c = bDAdProxy0;
        bDAdProxy0.e(this);
        this.c.p();
        CaulyIconAd.d.add(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setIconAdListener(CaulyIconAdListener caulyIconAdListener0) {
        this.b = caulyIconAdListener0;
    }

    public void show() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "IconAd - show");
        this.c.a(15, null, null);
    }
}

