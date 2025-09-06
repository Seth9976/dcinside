package com.dcinside.app.auth;

import android.webkit.CookieManager;
import kotlin.jvm.internal.w;
import y4.l;

public final class k {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a() {
            CookieManager cookieManager0 = CookieManager.getInstance();
            cookieManager0.removeAllCookies(null);
            cookieManager0.removeSessionCookies(null);
            cookieManager0.flush();
        }
    }

    @l
    public static final a a;

    static {
        k.a = new a(null);
    }
}

