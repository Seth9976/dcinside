package com.fsn.cauly;

import android.content.Context;
import com.fsn.cauly.blackdragoncore.AdHandler;
import java.util.HashMap;

class BDAdProxy implements BDAdMessageReceiverListener {
    static enum AdType {
        Banner,
        Interstitial,
        Native,
        Close,
        Icon,
        Custom,
        Multi,
        Video;

    }

    interface BDAdProxyListener {
        void OnAdItemReceived(int arg1, Object arg2);

        void OnCusomMessageReceived(int arg1, Object arg2);

        void onClickAd();

        void onClickAd(boolean arg1);

        void onCloseLandingScreen();

        void onFailedToLoad(int arg1, String arg2);

        void onInterstitialAdClosed();

        void onModuleLoaded();

        void onShowLandingScreen();

        void onSucceededToLoad(int arg1, String arg2);
    }

    final int a;
    AdHandler b;
    BDAdProxyListener c;
    Object d;
    HashMap e;
    Context f;
    BDAdMessageReceiver g;

    BDAdProxy(HashMap hashMap0, Context context0, Object object0) {
        this.a = 1;
        this.e = hashMap0;
        this.f = context0;
        this.d = object0;
    }

    Object a(int v, Object object0, Object object1) {
        AdHandler adHandler0 = this.b;
        if(adHandler0 == null) {
            return null;
        }
        try {
            return adHandler0.processMessage(v, object0, object1);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return null;
        }
    }

    private void b() {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onClickAd();
    }

    private void c(int v, Object object0) {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.OnAdItemReceived(v, object0);
    }

    void d(int v, String s) {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onFailedToLoad(v, s);
    }

    void e(BDAdProxyListener bDAdProxy$BDAdProxyListener0) {
        this.c = bDAdProxy$BDAdProxyListener0;
    }

    private void f(boolean z) {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onClickAd(z);
    }

    void g() {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onCloseLandingScreen();
    }

    private void h(int v, Object object0) {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.OnCusomMessageReceived(v, object0);
    }

    void i(int v, String s) {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onSucceededToLoad(v, s);
    }

    void j() {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onInterstitialAdClosed();
    }

    private void k() {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onModuleLoaded();
    }

    void l() {
        BDAdProxyListener bDAdProxy$BDAdProxyListener0 = this.c;
        if(bDAdProxy$BDAdProxyListener0 == null) {
            return;
        }
        bDAdProxy$BDAdProxyListener0.onShowLandingScreen();
    }

    boolean m() {
        return this.b != null;
    }

    void n() {
        if(this.b == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Proxy - pause");
        this.a(6, null, null);
    }

    void o() {
        if(this.b == null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Proxy - resume");
        this.a(5, null, null);
    }

    @Override  // com.fsn.cauly.BDAdMessageReceiver$BDAdMessageReceiverListener
    public void onReceiveAdMessage(int v, Object object0, Object object1) {
        switch(v) {
            case 99: {
                this.b();
                return;
            }
            case 100: {
                this.i(((int)(((Integer)object0))), ((String)object1));
                return;
            }
            case 101: {
                this.d(((int)(((Integer)object0))), ((String)object1));
                return;
            }
            case 102: {
                this.j();
                return;
            }
            case 103: {
                this.l();
                return;
            }
            case 104: {
                this.g();
                return;
            }
            case 110: {
                this.f(true);
                return;
            }
            case 0x6F: {
                this.f(false);
                return;
            }
            case 0x70: {
                this.c(((int)(((Integer)object0))), object1);
                return;
            }
            case 0x71: {
                this.h(((int)(((Integer)object0))), object1);
            }
        }
    }

    void p() {
        if(this.b != null) {
            return;
        }
        Logger.writeLog(LogLevel.Debug, "Proxy - start");
        this.g = new BDAdMessageReceiver(this);
        this.b = new AdHandler();
        this.q();
    }

    void q() {
        this.a(1, this.e, this.f);
        Object object0 = this.d;
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(CaulyAdView.class.equals(class0)) {
                this.a(8, Boolean.valueOf(((CaulyAdView)object0).j), null);
            }
        }
        this.a(2, this.g, this.d);
        this.k();
    }

    void r() {
        Logger.writeLog(LogLevel.Debug, "Proxy - stop");
        this.s();
        this.b = null;
        this.f = null;
        this.g = null;
    }

    void s() {
        this.a(3, null, null);
    }
}

