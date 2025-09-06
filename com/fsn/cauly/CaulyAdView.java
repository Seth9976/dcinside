package com.fsn.cauly;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.fsn.cauly.Y.a0;
import com.fsn.cauly.blackdragoncore.utils.d;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyAdView extends RelativeLayout implements BDAdProxyListener {
    CaulyAdInfo a;
    CaulyAdViewListener b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    BDAdProxy g;
    BDCommand h;
    boolean i;
    boolean j;
    CaulyAdView k;
    String l;
    static ArrayList m;

    static {
        CaulyAdView.m = new ArrayList();
    }

    public CaulyAdView(Context context0) {
        super(context0);
        this.j = true;
    }

    public CaulyAdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = true;
        this.a = new CaulyAdInfoBuilder(context0, attributeSet0).build();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    void a() {
        if(!this.e) {
            return;
        }
        if(this.f) {
            return;
        }
        this.f = true;
        Logger.writeLog(LogLevel.Debug, "Banner - Paused");
        this.g.n();
    }

    void b() {
        if(this.i) {
            return;
        }
        if(!this.e) {
            return;
        }
        if(!this.f) {
            return;
        }
        this.f = false;
        Logger.writeLog(LogLevel.Debug, "Banner - Resumed");
        this.g.o();
    }

    void c() {
        if(this.e) {
            this.b();
            return;
        }
        if(!this.c) {
            return;
        }
        if(!this.d) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Started");
        this.e = true;
        this.f = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Banner.ordinal());
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.getContext(), this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.k = this;
        CaulyAdView.m.add(this);
    }

    public void destroy() {
        if(!this.e) {
            return;
        }
        this.e = false;
        this.g.r();
        this.g = null;
        BDCommand bDCommand0 = this.h;
        if(bDCommand0 != null) {
            bDCommand0.cancel();
            this.h = null;
        }
        CaulyAdView caulyAdView0 = this.k;
        if(caulyAdView0 != null) {
            CaulyAdView.m.remove(caulyAdView0);
            this.k = null;
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Destroyed");
    }

    public String getExtraInfos() {
        return this.l;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.writeLog(LogLevel.Debug, "Banner - Attatch");
        this.c = true;
        this.c();
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Banner - onClickAd");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Banner - onCloseLandingScreen");
        CaulyAdViewListener caulyAdViewListener0 = this.b;
        if(caulyAdViewListener0 == null) {
            return;
        }
        caulyAdViewListener0.onCloseLandingScreen(this);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Logger.writeLog(LogLevel.Debug, "Banner - Detached");
        this.c = false;
        if(this.e) {
            this.a();
        }
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Banner - onFailedToReceiveAd (" + v + ") " + s);
        CaulyAdViewListener caulyAdViewListener0 = this.b;
        if(caulyAdViewListener0 == null) {
            return;
        }
        caulyAdViewListener0.onFailedToReceiveAd(this, v, s);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onInterstitialAdClosed() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onModuleLoaded() {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onShowLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Banner - onShowLandingScreen");
        CaulyAdViewListener caulyAdViewListener0 = this.b;
        if(caulyAdViewListener0 == null) {
            return;
        }
        caulyAdViewListener0.onShowLandingScreen(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Banner - onReceiveAd (" + v + ") " + s);
        CaulyAdViewListener caulyAdViewListener0 = this.b;
        if(caulyAdViewListener0 == null) {
            return;
        }
        this.l = s.replace("}", "") + ",\"width\":" + a0.a + ",\"banner_proportional_action\":" + d.a + "}";
        caulyAdViewListener0.onReceiveAd(this, v == 0);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        if(v == 0) {
            Logger.writeLog(LogLevel.Debug, "Banner - Visible");
            this.d = true;
            this.c();
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Invisible");
        this.d = false;
        this.a();
    }

    public void pause() {
        if(this.i) {
            return;
        }
        this.i = true;
        this.a();
    }

    public void reload() {
        this.a();
        this.b();
    }

    public void resume() {
        if(!this.i) {
            return;
        }
        this.i = false;
        this.b();
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setAdViewListener(CaulyAdViewListener caulyAdViewListener0) {
        this.b = caulyAdViewListener0;
    }

    public void setShowPreExpandableAd(boolean z) {
        if(z == this.j) {
            return;
        }
        this.j = z;
        BDAdProxy bDAdProxy0 = this.g;
        if(bDAdProxy0 == null) {
            return;
        }
        bDAdProxy0.a(8, Boolean.valueOf(z), null);
    }
}

