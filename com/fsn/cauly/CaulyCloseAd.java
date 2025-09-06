package com.fsn.cauly;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyCloseAd implements BDAdProxyListener {
    CaulyAdInfo a;
    CaulyCloseAdListener b;
    BDAdProxy c;
    String d;
    String e;
    String f;
    ArrayList g;
    boolean h;
    boolean i;
    String j;
    static ArrayList k;

    static {
        CaulyCloseAd.k = new ArrayList();
    }

    public CaulyCloseAd() {
        ArrayList arrayList0 = new ArrayList();
        this.g = arrayList0;
        this.h = false;
        this.i = true;
        arrayList0.clear();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
        Logger.writeLog(LogLevel.Debug, "Close - OnAdItemReceived(" + v + ")" + object0);
        CaulyCloseAdListener caulyCloseAdListener0 = this.b;
        if(caulyCloseAdListener0 == null) {
            return;
        }
        if(object0 instanceof String) {
            this.j = (String)object0;
        }
        caulyCloseAdListener0.onReceiveCloseAd(this, v == 0);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    private HashMap a() {
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Close.ordinal());
        if(!TextUtils.isEmpty(this.d)) {
            hashMap0.put("leftText", this.d);
        }
        if(!TextUtils.isEmpty(this.e)) {
            hashMap0.put("rightText", this.e);
        }
        if(!TextUtils.isEmpty(this.f)) {
            hashMap0.put("descriptionText", this.f);
        }
        if(!this.i) {
            hashMap0.put("closeOnBackKey", Boolean.FALSE);
        }
        return hashMap0;
    }

    public void cancel() {
        if(this.c == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Close - cancel");
        this.c.e(null);
        this.c.r();
        this.c = null;
        CaulyCloseAd.k.remove(this);
    }

    public void disableBackKey() {
        this.i = false;
    }

    public String getExtraInfos() {
        return this.j;
    }

    public boolean isModuleLoaded() {
        return this.h;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Close - onClickAd");
        CaulyCloseAdListener caulyCloseAdListener0 = this.b;
        if(caulyCloseAdListener0 == null) {
            return;
        }
        caulyCloseAdListener0.onLeaveCloseAd(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
        Logger.writeLog(LogLevel.Debug, "Close - onClickAd");
        CaulyCloseAdListener caulyCloseAdListener0 = this.b;
        if(caulyCloseAdListener0 == null) {
            return;
        }
        if(z) {
            caulyCloseAdListener0.onLeftClicked(this);
            return;
        }
        caulyCloseAdListener0.onRightClicked(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Close - onFailedToReceiveCloseAd(" + v + ")" + s);
        if(v == 1 || v == 6) {
            this.g.clear();
        }
        if(v == 6) {
            this.h = false;
        }
        CaulyCloseAdListener caulyCloseAdListener0 = this.b;
        if(caulyCloseAdListener0 == null) {
            return;
        }
        caulyCloseAdListener0.onFailedToReceiveCloseAd(this, v, s);
        CaulyCloseAd.k.remove(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
        Logger.writeLog(LogLevel.Debug, "Close - onClosedCloseAd");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
        this.h = true;
        for(Object object0: this.g) {
            this.c.a(((int)(((Integer)object0))), null, null);
        }
        this.g.clear();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Close - onReceiveCloseAd(" + v + ")" + s);
        CaulyCloseAdListener caulyCloseAdListener0 = this.b;
        if(caulyCloseAdListener0 == null) {
            return;
        }
        caulyCloseAdListener0.onShowedCloseAd(this, v == 0);
    }

    public void request(Activity activity0) {
        Logger.writeLog(LogLevel.Debug, "Close - request");
        BDAdProxy bDAdProxy0 = this.c;
        if(bDAdProxy0 != null) {
            if(bDAdProxy0.m()) {
                this.c.a(13, null, null);
                return;
            }
            this.g.add(13);
            return;
        }
        BDAdProxy bDAdProxy1 = new BDAdProxy(this.a(), activity0, activity0);
        this.c = bDAdProxy1;
        bDAdProxy1.e(this);
        this.c.p();
        this.g.add(13);
        CaulyCloseAd.k.add(this);
    }

    public void resume(Activity activity0) {
        Logger.writeLog(LogLevel.Debug, "Close - resume");
        BDAdProxy bDAdProxy0 = this.c;
        if(bDAdProxy0 != null) {
            if(bDAdProxy0.m()) {
                this.c.a(12, null, null);
                return;
            }
            this.g.add(12);
            return;
        }
        BDAdProxy bDAdProxy1 = new BDAdProxy(this.a(), activity0, activity0);
        this.c = bDAdProxy1;
        bDAdProxy1.e(this);
        this.c.p();
        this.g.add(12);
        CaulyCloseAd.k.add(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setButtonText(String s, String s1) {
        this.d = s;
        this.e = s1;
    }

    public void setCloseAdListener(CaulyCloseAdListener caulyCloseAdListener0) {
        this.b = caulyCloseAdListener0;
    }

    public void setDescriptionText(String s) {
        this.f = s;
    }

    public void show(Activity activity0) {
        Logger.writeLog(LogLevel.Debug, "Close - start");
        BDAdProxy bDAdProxy0 = this.c;
        if(bDAdProxy0 != null) {
            if(bDAdProxy0.m()) {
                this.c.a(14, null, null);
                return;
            }
            this.g.add(14);
            return;
        }
        BDAdProxy bDAdProxy1 = new BDAdProxy(this.a(), activity0, activity0);
        this.c = bDAdProxy1;
        bDAdProxy1.e(this);
        this.c.p();
        this.g.add(14);
        CaulyCloseAd.k.add(this);
    }
}

