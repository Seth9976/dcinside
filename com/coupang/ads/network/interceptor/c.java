package com.coupang.ads.network.interceptor;

import android.webkit.WebSettings;
import kotlin.D;
import kotlin.E;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request.Builder;
import okhttp3.Response;
import y4.l;
import y4.m;

public final class c implements Interceptor {
    @l
    private final D a;

    public c() {
        static final class a extends N implements A3.a {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(0);
            }

            @m
            public final String b() {
                Object object0;
                try {
                    object0 = e0.b(WebSettings.getDefaultUserAgent(com.coupang.ads.a.o.b().m()));
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                String s = (String)com.coupang.ads.tools.l.a(object0, "WebSettings UA");
                return s == null ? "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)" : s;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.a = E.a(a.e);
    }

    private final String a() {
        return (String)this.a.getValue();
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) {
        L.p(interceptor$Chain0, "chain");
        Builder request$Builder0 = interceptor$Chain0.request().newBuilder().addHeader("content-type", "application/json");
        String s = this.a();
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                request$Builder0.removeHeader("User-Agent");
                request$Builder0.addHeader("User-Agent", s);
            }
        }
        Response response0 = interceptor$Chain0.proceed(request$Builder0.build());
        L.o(response0, "chain.proceed(request)");
        return response0;
    }
}

