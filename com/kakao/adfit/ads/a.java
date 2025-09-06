package com.kakao.adfit.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.kakao.adfit.a.n;
import com.kakao.adfit.common.inappbrowser.activity.IABActivity;
import com.kakao.adfit.common.matrix.MatrixLevel;
import com.kakao.adfit.common.matrix.c;
import com.kakao.adfit.common.matrix.e;
import com.kakao.adfit.m.I;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.j;
import com.kakao.adfit.m.k;
import com.kakao.adfit.m.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class a {
    public static final class com.kakao.adfit.ads.a.a {
        private com.kakao.adfit.ads.a.a() {
        }

        public com.kakao.adfit.ads.a.a(w w0) {
        }

        public final boolean a(WebView webView0) {
            L.p(webView0, "webView");
            if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
                throw new RuntimeException("Must be called from the main thread.");
            }
            WebSettings webSettings0 = webView0.getSettings();
            L.o(webSettings0, "webView.settings");
            String s = "[javaScriptEnabled = " + webSettings0.getJavaScriptEnabled() + "] [domStorageEnabled = " + webSettings0.getDomStorageEnabled() + "] [mediaPlaybackRequiresUserGesture = " + webSettings0.getMediaPlaybackRequiresUserGesture() + "] [acceptThirdPartyCookies = " + CookieManager.getInstance().acceptThirdPartyCookies(webView0) + ']';
            Object object0 = webView0.getTag(id.adfit_webview_interface);
            if(object0 instanceof a) {
                f.e(("WebView@" + webView0.hashCode() + " has already been registered. [interface = " + ((a)object0).b + "] " + s));
                return false;
            }
            a a0 = new a(webView0, null);
            webView0.setTag(0x7F0B008F, a0);  // id:adfit_webview_interface
            webView0.addJavascriptInterface(a0, "kakaoAdFitWebView");
            f.c(("WebView@" + webView0.hashCode() + " is registered. [interface = " + a0.b + "] " + s));
            return true;
        }
    }

    public abstract class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.kakao.adfit.c.a.values().length];
            try {
                arr_v[com.kakao.adfit.c.a.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.kakao.adfit.c.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private final WebView a;
    private final String b;
    private final n c;
    private final j d;
    private final j e;
    public static final com.kakao.adfit.ads.a.a f;

    static {
        a.f = new com.kakao.adfit.ads.a.a(null);
    }

    private a(WebView webView0) {
        this.a = webView0;
        this.b = "AdFitWebView@" + this.hashCode();
        Context context0 = webView0.getContext();
        L.o(context0, "webView.context");
        this.c = new n(context0);
        this.d = new j();
        this.e = new j();
    }

    public a(WebView webView0, w w0) {
        this(webView0);
    }

    private final float a(View view0, int v, int v1, int v2, int v3) {
        Context context0 = view0.getContext();
        L.o(context0, "context");
        if(!k.i(context0)) {
            Context context1 = view0.getContext();
            L.o(context1, "v.context");
            if(k.h(context1)) {
                return 0.0f;
            }
        }
        if(!view0.hasWindowFocus()) {
            return 0.0f;
        }
        float f = context0.getResources().getDisplayMetrics().density;
        Rect rect0 = new Rect(((int)(((float)v) * f + 0.5f)), ((int)(((float)v1) * f + 0.5f)), ((int)(((float)(v + v2)) * f + 0.5f)), ((int)(((float)(v1 + v3)) * f + 0.5f)));
        if(rect0.isEmpty()) {
            return 0.0f;
        }
        int v4 = view0.getMeasuredWidth();
        int v5 = view0.getMeasuredHeight();
        if(v4 > 0 && v5 > 0) {
            if(rect0.right > v4 && ((float)(rect0.right - v4)) <= f) {
                rect0.right = v4;
            }
            if(rect0.bottom > v5 && ((float)(rect0.bottom - v5)) <= f) {
                rect0.bottom = v5;
            }
            return I.a(view0, rect0);
        }
        return 0.0f;
    }

    // 检测为 Lambda 实现
    private static final void a(a a0, String s) [...]

    // 检测为 Lambda 实现
    private static final void a(a a0, String s, String s1) [...]

    @JavascriptInterface
    @l
    public final String getParams() {
        String s = (String)this.d.a();
        if(s == null) {
            s = this.c.b().toString();
            this.d.a(s);
        }
        return s;
    }

    @JavascriptInterface
    public final float getViewableRate(int v, int v1, int v2, int v3) {
        try {
            return this.a(this.a, v, v1, v2, v3);
        }
        catch(Exception exception0) {
            com.kakao.adfit.i.j j0 = com.kakao.adfit.i.j.b.a("Failed to get viewable ratio.");
            e e0 = e.t.a(j0, exception0, MatrixLevel.WARNING);
            c.a.a(e0);
            return 0.0f;
        }
    }

    @JavascriptInterface
    public final boolean isMediaAutoPlayEnabled() {
        switch(com.kakao.adfit.a.w.a.a()) {
            case 1: {
                return true;
            }
            case 2: {
                Boolean boolean0 = (Boolean)this.e.a();
                if(boolean0 == null) {
                    Context context0 = this.a.getContext();
                    L.o(context0, "webView.context");
                    boolean0 = Boolean.valueOf(u.d(context0));
                    this.e.a(boolean0);
                }
                return boolean0.booleanValue();
            }
            default: {
                return false;
            }
        }
    }

    @JavascriptInterface
    public final void openLink(@l String s) {
        L.p(s, "url");
        if(v.x3(s)) {
            return;
        }
        D2.b b0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$url");
            try {
                Context context0 = this.a.getContext();
                L.o(context0, "context");
                context0.startActivity(com.kakao.adfit.common.inappbrowser.activity.IABActivity.a.a(IABActivity.e, context0, s, null, 4, null));
            }
            catch(Exception exception0) {
                com.kakao.adfit.i.j j0 = com.kakao.adfit.i.j.b.a("Failed to start IABActivity.");
                e e0 = e.t.a(j0, exception0, MatrixLevel.ERROR);
                c.a.a(e0);
            }
        };
        this.a.post(b0);
    }

    @JavascriptInterface
    public final void openLink(@l String s, @m String s1) {
        L.p(s, "url");
        if(v.x3(s)) {
            return;
        }
        D2.a a0 = () -> {
            L.p(this, "this$0");
            L.p(s, "$url");
            try {
                Context context0 = this.a.getContext();
                L.o(context0, "context");
                context0.startActivity(IABActivity.e.a(context0, s, s1));
            }
            catch(Exception exception0) {
                com.kakao.adfit.i.j j0 = com.kakao.adfit.i.j.b.a("Failed to start IABActivity.");
                e e0 = e.t.a(j0, exception0, MatrixLevel.ERROR);
                c.a.a(e0);
            }
        };
        this.a.post(a0);
    }
}

