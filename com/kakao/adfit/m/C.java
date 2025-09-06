package com.kakao.adfit.m;

import android.util.AndroidRuntimeException;
import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class c {
    public static final c a;

    static {
        c.a = new c();
    }

    private final boolean a(Throwable throwable0) {
        if(throwable0 instanceof IllegalArgumentException) {
            String s = throwable0.getMessage();
            return s != null && v.W2(s, "Unsupported ABI", false, 2, null);
        }
        if(throwable0 instanceof IllegalStateException) {
            String s1 = throwable0.getMessage();
            return s1 != null && v.W2(s1, "WebView is disabled", false, 2, null);
        }
        return throwable0 instanceof AndroidRuntimeException || throwable0 instanceof ClassNotFoundException || throwable0 instanceof UnsatisfiedLinkError;
    }

    public final String a(String s) {
        L.p(s, "url");
        try {
            return CookieManager.getInstance().getCookie(s);
        }
        catch(Throwable throwable0) {
            if(!this.a(throwable0)) {
                com.kakao.adfit.common.matrix.c.a.a(throwable0);
            }
            return null;
        }
    }

    public final void a() {
        try {
            CookieManager.getInstance().flush();
        }
        catch(Throwable throwable0) {
            if(!this.a(throwable0)) {
                com.kakao.adfit.common.matrix.c.a.a(throwable0);
            }
        }
    }

    public final void a(WebView webView0) {
        L.p(webView0, "webView");
        try {
            CookieManager.getInstance().setAcceptCookie(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView0, true);
        }
        catch(Throwable throwable0) {
            if(!this.a(throwable0)) {
                com.kakao.adfit.common.matrix.c.a.a(throwable0);
            }
        }
    }

    public final void a(String s, String s1) {
        L.p(s, "url");
        if(s1 != null && !v.x3(s1) == 1) {
            try {
                CookieManager.getInstance().setCookie(s, s1);
                c.a.a();
            }
            catch(Throwable throwable0) {
                if(!this.a(throwable0)) {
                    com.kakao.adfit.common.matrix.c.a.a(throwable0);
                }
            }
        }
    }
}

