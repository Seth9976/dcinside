package com.igaworks.ssp.part.hybrid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.igaworks.ssp.AdPopcornSSP;
import com.igaworks.ssp.CustomAdType;
import com.igaworks.ssp.E.j;
import com.igaworks.ssp.E;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.part.custom.AdPopcornSSPCustomAd;
import com.igaworks.ssp.part.custom.listener.ICustomAdListener;
import com.igaworks.ssp.z;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public class AdPopcornSSPJsBridge {
    public static final String INTERFACE_NAME = "apssp";
    private final String a;
    private WeakReference b;
    private WebView c;

    public AdPopcornSSPJsBridge(Context context0, WebView webView0) {
        this.a = "apssp_adid";
        this.b = new WeakReference(context0);
        this.c = webView0;
    }

    @JavascriptInterface
    public void callBid(String s, boolean z) {
        class d implements ICustomAdListener {
            final AdPopcornSSPCustomAd a;
            final AdPopcornSSPJsBridge b;

            d(AdPopcornSSPCustomAd adPopcornSSPCustomAd0) {
                this.a = adPopcornSSPCustomAd0;
                super();
            }

            @Override  // com.igaworks.ssp.part.custom.listener.ICustomAdListener
            public void OnCustomAdReceiveFailed(String s, SSPErrorCode sSPErrorCode0) {
                b.a(Thread.currentThread(), "AdPopcornSSPJsBridge load failed, placementId : " + s + ", sspErrorCode : " + sSPErrorCode0.getErrorCode());
                AdPopcornSSPJsBridge.this.callJavascript("apsspads.renderAd(\'" + s + "\'," + null + "," + null + "," + null + ")");
            }

            @Override  // com.igaworks.ssp.part.custom.listener.ICustomAdListener
            public void OnCustomAdReceiveSuccess(String s, String s1) {
                String s6;
                Exception exception2;
                String s5;
                b.a(Thread.currentThread(), "AdPopcornSSPJsBridge load success, placementId : " + s + ", adData : " + s1);
                String s2 = null;
                try {
                    if(this.a == null || this.a.getImpTrackersList() == null || this.a.getImpTrackersList().size() <= 0) {
                        s5 = null;
                    }
                    else {
                        String s3 = null;
                        Iterator iterator0 = this.a.getImpTrackersList().iterator();
                        try {
                            while(iterator0.hasNext()) {
                                Object object0 = iterator0.next();
                                String s4 = (String)object0;
                                s3 = s3 == null ? '\'' + s4 + '\'' : s3 + "," + '\'' + s4 + '\'';
                            }
                            s5 = '[' + s3 + ']';
                        }
                        catch(Exception exception1) {
                            exception2 = exception1;
                            s6 = null;
                            s2 = s3;
                            goto label_41;
                        }
                    }
                }
                catch(Exception exception0) {
                    exception2 = exception0;
                    s6 = null;
                    goto label_41;
                }
                try {
                    if(this.a != null && this.a.getClickTrackersList() != null && this.a.getClickTrackersList().size() > 0) {
                        for(Object object1: this.a.getClickTrackersList()) {
                            String s7 = (String)object1;
                            s2 = s2 == null ? '\'' + s7 + '\'' : s2 + "," + '\'' + s7 + '\'';
                        }
                        s2 = '[' + s2 + ']';
                    }
                    goto label_44;
                }
                catch(Exception exception2) {
                    s6 = s2;
                    s2 = s5;
                }
            label_41:
                exception2.printStackTrace();
                s5 = s2;
                s2 = s6;
            label_44:
                if(s5 == null && s2 == null) {
                    AdPopcornSSPJsBridge.this.callJavascript("apsspads.renderAd(\'" + s + "\',`" + s1 + "`," + this.a.getImpTrackersList() + "," + this.a.getClickTrackersList() + ")");
                    return;
                }
                if(s5 == null) {
                    AdPopcornSSPJsBridge.this.callJavascript("apsspads.renderAd(\'" + s + "\',`" + s1 + "`," + this.a.getImpTrackersList() + "," + s2 + ")");
                    return;
                }
                AdPopcornSSPJsBridge.this.callJavascript("apsspads.renderAd(\'" + s + "\',`" + s1 + "`," + s5 + "," + s2 + ")");
            }
        }

        try {
            b.a(Thread.currentThread(), "AdPopcornSSPJsBridge callBid : " + s + ", isNative : " + z);
            AdPopcornSSPCustomAd adPopcornSSPCustomAd0 = new AdPopcornSSPCustomAd(((Context)this.b.get()));
            adPopcornSSPCustomAd0.setPlacementId(s);
            if(z) {
                adPopcornSSPCustomAd0.setAdType(CustomAdType.NATIVE_AD);
            }
            else {
                adPopcornSSPCustomAd0.setAdType(CustomAdType.BANNER_300x250);
            }
            adPopcornSSPCustomAd0.setCustomAdEventCallbackListener(new d(this, adPopcornSSPCustomAd0));
            adPopcornSSPCustomAd0.loadAd();
        }
        catch(Exception unused_ex) {
        }
    }

    public void callJavascript(String s) {
        class com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.b implements Runnable {
            final String a;
            final AdPopcornSSPJsBridge b;

            com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.b(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPJsBridge.this.c.loadUrl("javascript:" + this.a);
            }
        }

        try {
            b.a(Thread.currentThread(), "callJavascript : " + s);
            WebView webView0 = this.c;
            if(webView0 != null) {
                webView0.post(new com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.b(this, s));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void destroy() {
        try {
            b.a(Thread.currentThread(), "AdPopcornSSPJsBridge destroy");
            AdPopcornSSP.destroy();
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void init() {
        class c extends z {
            final AdPopcornSSPJsBridge a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                class a implements Runnable {
                    final c a;

                    // 去混淆评级： 低(20)
                    @Override
                    public void run() {
                        AdPopcornSSPJsBridge.this.setLocalStorage("apssp_adid", "");
                    }
                }

                new Handler(Looper.getMainLooper()).post(new a(this));
            }
        }

        try {
            b.a(Thread.currentThread(), "AdPopcornSSPJsBridge init");
            AdPopcornSSP.init(((Context)this.b.get()));
            if(!E.g().m()) {
                E.g().a(new c(this));
                E e0 = E.g();
                Objects.requireNonNull(e0);
                new j(e0, ((Context)this.b.get()).getApplicationContext()).start();
                return;
            }
            this.setLocalStorage("apssp_adid", "");
        }
        catch(Exception unused_ex) {
        }
    }

    public void setLocalStorage(String s, String s1) {
        class com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.a implements Runnable {
            final String a;
            final String b;
            final AdPopcornSSPJsBridge c;

            com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.a(String s, String s1) {
                this.a = s;
                this.b = s1;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPJsBridge.this.c.evaluateJavascript("window.localStorage.setItem(\'" + this.a + "\',\'" + this.b + "\');", null);
            }
        }

        try {
            b.a(Thread.currentThread(), "AdPopcornSSPJsBridge setLocalStorage");
            this.c.post(new com.igaworks.ssp.part.hybrid.AdPopcornSSPJsBridge.a(this, s, s1));
        }
        catch(Exception unused_ex) {
        }
    }
}

