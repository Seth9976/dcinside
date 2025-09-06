package com.fsn.cauly;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresPermission;
import com.fsn.cauly.Y.a0;
import com.fsn.cauly.blackdragoncore.utils.d;
import java.util.ArrayList;
import java.util.HashMap;

public class CaulyAdBannerView extends RelativeLayout implements BDAdProxyListener {
    CaulyAdInfo a;
    CaulyAdBannerViewListener b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    BDAdProxy g;
    BDCommand h;
    boolean i;
    CaulyAdBannerView j;
    String k;
    long l;
    private Context m;
    private ViewGroup n;
    int o;
    static ArrayList p;

    static {
        CaulyAdBannerView.p = new ArrayList();
    }

    public CaulyAdBannerView(Context context0) {
        super(context0);
        this.i = true;
        this.l = 0L;
        this.o = 1;
        this.m = context0;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnAdItemReceived(int v, Object object0) {
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void OnCusomMessageReceived(int v, Object object0) {
    }

    private void a() {
        if(!this.c) {
            return;
        }
        if(!this.d) {
            return;
        }
        this.g.a(18, null, null);
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
        CaulyAdBannerView caulyAdBannerView0 = this.j;
        if(caulyAdBannerView0 != null) {
            CaulyAdBannerView.p.remove(caulyAdBannerView0);
            this.j = null;
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Destroyed");
    }

    public String getExtraInfos() {
        return this.k;
    }

    @RequiresPermission("android.permission.INTERNET")
    public void load(Context context0, ViewGroup viewGroup0) {
        if(context0 == null) {
            return;
        }
        if(viewGroup0 == null) {
            return;
        }
        this.l = System.currentTimeMillis();
        this.c = true;
        this.m = context0;
        this.n = viewGroup0;
        CaulyAdBannerView caulyAdBannerView0 = this.j;
        if(caulyAdBannerView0 != null) {
            viewGroup0.removeView(caulyAdBannerView0);
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Started");
        this.e = true;
        this.f = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Banner.ordinal());
        hashMap0.put("bannerViewClass", this.getClass().getSimpleName());
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, this.getContext(), this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.j = this;
        CaulyAdBannerView.p.add(this);
        Logger.writeLog(LogLevel.Debug, "Banner - Load");
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.writeLog(LogLevel.Debug, "Banner - Attatch");
        this.c = true;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd() {
        Logger.writeLog(LogLevel.Debug, "Banner - onClickAd");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onClickAd(boolean z) {
        Logger.writeLog(LogLevel.Debug, "Banner - onClickAd isLeftClick");
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onCloseLandingScreen() {
        Logger.writeLog(LogLevel.Debug, "Banner - onCloseLandingScreen");
        CaulyAdBannerViewListener caulyAdBannerViewListener0 = this.b;
        if(caulyAdBannerViewListener0 == null) {
            return;
        }
        caulyAdBannerViewListener0.onCloseLandingScreen(this);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Logger.writeLog(LogLevel.Debug, "Banner - Detached");
        this.c = false;
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onFailedToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Banner - onFailedToReceiveAd (" + v + ") " + s);
        CaulyAdBannerViewListener caulyAdBannerViewListener0 = this.b;
        if(caulyAdBannerViewListener0 == null) {
            return;
        }
        caulyAdBannerViewListener0.onFailedToReceiveAd(this, v, s);
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
        CaulyAdBannerViewListener caulyAdBannerViewListener0 = this.b;
        if(caulyAdBannerViewListener0 == null) {
            return;
        }
        caulyAdBannerViewListener0.onShowLandingScreen(this);
    }

    @Override  // com.fsn.cauly.BDAdProxy$BDAdProxyListener
    public void onSucceededToLoad(int v, String s) {
        Logger.writeLog(LogLevel.Debug, "Banner - onReceiveAd (" + v + ") " + s);
        CaulyAdBannerViewListener caulyAdBannerViewListener0 = this.b;
        if(caulyAdBannerViewListener0 == null) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s.replace("}", ""));
        stringBuilder0.append(",\"width\":");
        stringBuilder0.append(a0.a);
        stringBuilder0.append(",\"banner_proportional_action\":");
        stringBuilder0.append(d.a);
        stringBuilder0.append("}");
        this.k = s;
        caulyAdBannerViewListener0.onReceiveAd(this, v == 0);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        if(v == 0) {
            Logger.writeLog(LogLevel.Debug, "Banner - Visible");
            this.d = true;
            this.a();
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Banner - Invisible");
        this.d = false;
    }

    @RequiresPermission("android.permission.INTERNET")
    public void pause(Context context0) {
        this.c = true;
        this.m = context0;
        Logger.writeLog(LogLevel.Debug, "Banner - pause");
        this.e = true;
        this.f = false;
        HashMap hashMap0 = (HashMap)this.a.b().clone();
        hashMap0.put("adType", AdType.Banner.ordinal());
        BDAdProxy bDAdProxy0 = new BDAdProxy(hashMap0, context0, this);
        this.g = bDAdProxy0;
        bDAdProxy0.e(this);
        this.g.p();
        this.j = this;
        CaulyAdBannerView.p.add(this);
    }

    public void setAdInfo(CaulyAdInfo caulyAdInfo0) {
        this.a = caulyAdInfo0;
    }

    public void setAdViewListener(CaulyAdBannerViewListener caulyAdBannerViewListener0) {
        this.b = caulyAdBannerViewListener0;
    }

    public void setShowPreExpandableAd(boolean z) {
        if(z == this.i) {
            return;
        }
        this.i = z;
        BDAdProxy bDAdProxy0 = this.g;
        if(bDAdProxy0 == null) {
            return;
        }
        bDAdProxy0.a(8, Boolean.valueOf(z), null);
    }

    public void show() {
        try {
            long v = System.currentTimeMillis() - this.l;
            int v1 = BDPrefUtil.getIntValue(this.m, "BANNER_EXPIRE_SEC", 10800);
            if(v >= 0L && v < ((long)(v1 * 1000))) {
                CaulyAdBannerView caulyAdBannerView0 = this.j;
                if(caulyAdBannerView0 != null) {
                    this.n.addView(caulyAdBannerView0);
                }
                Logger.writeLog(LogLevel.Debug, "Banner - Show");
                return;
            }
            CaulyAdBannerViewListener caulyAdBannerViewListener0 = this.b;
            if(caulyAdBannerViewListener0 != null) {
                this.o = v1;
                caulyAdBannerViewListener0.onTimeout(this, "Unfortunately banner interval time has expired");
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

