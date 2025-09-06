package com.coupang.ads.network.interceptor;

import com.coupang.ads.a;
import com.coupang.ads.clog.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.l;

public final class d implements Interceptor {
    private final String a(RequestBody requestBody0) {
        String s2;
        String s1;
        String s = null;
        try {
            l l0 = new l();
            if(requestBody0 == null) {
                s1 = null;
            }
            else {
                requestBody0.writeTo(l0);
                s1 = "";
            }
            s2 = s1;
        }
        catch(Throwable throwable0) {
            s2 = e0.b(f0.a(throwable0));
        }
        if(!e0.i(s2)) {
            s = s2;
        }
        return s == null ? "" : s;
    }

    private final void b(String s, String s1) {
        if(a.o.b().g()) {
            b.a.g(s, s1);
        }
    }

    @Override  // okhttp3.Interceptor
    @y4.l
    public Response intercept(@y4.l Chain interceptor$Chain0) {
        Response response0;
        L.p(interceptor$Chain0, "chain");
        if(a.o.b().g()) {
            if(interceptor$Chain0.request().body() instanceof MultipartBody) {
                this.b("Http", "[HTTP Request]" + interceptor$Chain0.request().url() + "  ");
            }
            else {
                this.b("Http", "[HTTP Request]" + interceptor$Chain0.request().url() + ' ' + this.a(interceptor$Chain0.request().body()) + ' ');
            }
            response0 = interceptor$Chain0.proceed(interceptor$Chain0.request());
            this.b("Http", "[HTTP Response]" + response0.request().url() + ' ' + response0.peekBody(0x100000L).string());
            L.o(response0, "{\n            if (chain.…)\n            }\n        }");
            return response0;
        }
        response0 = interceptor$Chain0.proceed(interceptor$Chain0.request());
        L.o(response0, "{\n            chain.proc…hain.request())\n        }");
        return response0;
    }
}

