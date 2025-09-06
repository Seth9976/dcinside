package com.fsn.cauly;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyNativeAdView extends RelativeLayout implements BDAdProxyListener {
    CaulyAdInfo a;
    HashMap b;
    CaulyNativeAdViewListener c;
    boolean d;
    boolean e;
    boolean f;
    BDAdProxy g;
    BDCommand h;
    boolean i;
    CaulyNativeAdView j;
    String k;
    boolean l;
    boolean m;
    Handler n;
    ViewGroup o;
    boolean p;
    String q;
    static ArrayList r;

    static {
        CaulyNativeAdView.r = new ArrayList();
    }

    public CaulyNativeAdView(Context context0) {
        super(context0);
        this.i = true;
        this.l = false;
        this.m = false;
        this.n = new Handler();
        this.p = false;
    }

    public CaulyNativeAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = true;
        this.l = false;
        this.m = false;
        this.n = new Handler();
        this.p = false;
        this.a = new CaulyAdInfoBuilder(context0, attributeSet0).build();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    private void a() {
        this.n.post(new Runnable() {
            final CaulyNativeAdView a;

            @Override
            public void run() {
                BDAdProxy bDAdProxy0 = CaulyNativeAdView.this.g;
                if(bDAdProxy0 != null) {
                    bDAdProxy0.a(11, "", null);
                }
                CaulyNativeAdView.this.p = true;
            }
        });
    }

    protected void a(AdType bDAdProxy$AdType0) {
        if(this.e) {
            return;
        }
        this.e = true;
        this.f = false;
        this.b.put("adType", bDAdProxy$AdType0.ordinal());
        this.b.put("keyword", this.k);
        BDAdProxy bDAdProxy0 = new BDAdProxy(this.b, this.getContext(), this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.j = this;
        CaulyNativeAdView.r.add(this);
    }

    public void attachToView(ViewGroup viewGroup0) {
        if(this.g == null) {
            return;
        }
        if(this.o != null) {
            return;
        }
        this.o = viewGroup0;
        viewGroup0.addView(this);
    }

    public void destroy() {
        if(this.e) {
            BDAdProxy bDAdProxy0 = this.g;
            if(bDAdProxy0 != null) {
                this.e = false;
                bDAdProxy0.r();
                this.g = null;
                BDCommand bDCommand0 = this.h;
                if(bDCommand0 != null) {
                    bDCommand0.cancel();
                    this.h = null;
                }
                CaulyNativeAdView caulyNativeAdView0 = this.j;
                if(caulyNativeAdView0 != null) {
                    CaulyNativeAdView.r.remove(caulyNativeAdView0);
                    this.j = null;
                }
                Logger.writeLog(LogLevel.Debug, "Native - Destroyed");
            }
        }
    }

    public CaulyAdInfo getAdInfo() {
        return this.a;
    }

    public String getExtraInfos() {
        return this.q;
    }

    public boolean isAttachedtoView() {
        return this.d;
    }

    public boolean isChargable() {
        return this.m;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Native - onCloseClick");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Native - onCloseLandingScreen");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Native - onFailedToReceiveAd (" + v + ") " + s);
        CaulyNativeAdViewListener caulyNativeAdViewListener0 = this.c;
        if(caulyNativeAdViewListener0 == null) {
            return;
        }
        caulyNativeAdViewListener0.onFailedToReceiveNativeAd(this, v, s);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Native - onShowLandingScreen");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Native - onReceiveAd (" + v + ") " + s);
        CaulyNativeAdViewListener caulyNativeAdViewListener0 = this.c;
        if(caulyNativeAdViewListener0 == null) {
            return;
        }
        boolean z = true;
        this.l = true;
        if(v != 0) {
            z = false;
        }
        this.m = z;
        this.q = s;
        caulyNativeAdViewListener0.onReceiveNativeAd(this, z);
        if(this.d) {
            this.a();
        }
    }

    public void request() {
        Logger.writeLog(LogLevel.Debug, "Native - request");
        this.e = true;
        this.f = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Native.ordinal());
        hashMap0.put("keyword", this.k);
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.getContext(), this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.j = this;
        CaulyNativeAdView.r.add(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setAdViewListener(CaulyNativeAdViewListener caulyNativeAdViewListener0) {
        this.c = caulyNativeAdViewListener0;
    }

    protected void setDataObject(HashMap hashMap0) {
        this.b = hashMap0;
    }

    public void setKeyword(String s) {
        this.k = s;
    }
}

