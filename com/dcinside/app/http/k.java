package com.dcinside.app.http;

import com.dcinside.app.util.jl;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import y4.l;

public final class k implements Interceptor {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final float a;
    @l
    public static final a b = null;
    @l
    public static final String c = "User-Agent";
    @l
    public static final String d = "dcinside.app";
    @l
    public static final String e = "Referer";
    @l
    public static final String f = "http://www.dcinside.com";

    static {
        k.b = new a(null);
    }

    public k() {
        this.a = 1000000.0f;
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        long v2;
        long v1;
        L.p(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        RequestBody requestBody0 = request0.body();
        String s = request0.method();
        HttpUrl httpUrl0 = request0.url();
        String s1 = httpUrl0.host();
        String s2 = httpUrl0.encodedPath();
        jl jl0 = jl.a;
        long v = jl0.H();
        if(L.g(s1, "upload.dcinside.com")) {
            v1 = jl0.J();
            v2 = jl0.I();
        }
        else if(L.g(s1, "m4up4.dcinside.com")) {
            long v3 = jl0.K();
            v1 = jl0.J() + v3;
            v2 = v3 + jl0.I();
        }
        else if(L.g(s2, "/voice/download")) {
            v1 = jl0.J();
            v2 = jl0.I();
        }
        else {
            v1 = jl0.G();
            v2 = v1;
        }
        int v4 = (int)(((float)(requestBody0 == null ? 0L : requestBody0.contentLength())) / this.a);
        Request request1 = request0.newBuilder().header("User-Agent", "dcinside.app").header("Referer", "http://www.dcinside.com").method(s, requestBody0).build();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        return interceptor$Chain0.withConnectTimeout(Math.max(Math.min(((int)v), 600), 1), timeUnit0).withReadTimeout(Math.max(Math.min(((int)(v2 + ((long)(v4 / 2)))), 600), 1), timeUnit0).withWriteTimeout(Math.max(Math.min(((int)(v1 + ((long)v4))), 600), 1), timeUnit0).proceed(request1);
    }
}

