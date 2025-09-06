package com.kakao.adfit.a;

import android.content.Context;
import android.net.TrafficStats;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kakao.adfit.m.k;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final h a(Context context0) {
            L.p(context0, "context");
            h h0 = h.d;
            if(h0 == null) {
                synchronized(this) {
                    h0 = h.d;
                    if(h0 == null) {
                        Context context1 = context0.getApplicationContext();
                        L.o(context1, "context.applicationContext");
                        h0 = new h(context1, null);
                        h.d = h0;
                    }
                }
            }
            return h0;
        }
    }

    private final i a;
    private final D b;
    public static final a c;
    private static h d;

    static {
        h.c = new a(null);
    }

    private h(Context context0) {
        static final class b extends N implements A3.a {
            final h a;
            final Context b;

            b(h h0, Context context0) {
                this.a = h0;
                this.b = context0;
                super(0);
            }

            public final OkHttpClient a() {
                return this.a.a(this.b);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }


        final class c extends H implements A3.a {
            c(Object object0) {
                super(0, object0, h.class, "createImageLoaderHttpClient", "createImageLoaderHttpClient()Lokhttp3/OkHttpClient;", 0);
            }

            public final OkHttpClient a() {
                return ((h)this.receiver).c();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        this.a = new i(new c(this));
        this.b = E.a(new b(this, context0));
    }

    public h(Context context0, w w0) {
        this(context0);
    }

    private final OkHttpClient a(Context context0) {
        Builder okHttpClient$Builder0 = new Builder();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        return okHttpClient$Builder0.connectTimeout(10000L, timeUnit0).readTimeout(10000L, timeUnit0).writeTimeout(10000L, timeUnit0).callTimeout(10000L, timeUnit0).retryOnConnectionFailure(false).cache(new Cache(new File(context0.getCacheDir(), "com.kakao.adfit.cache"), 0x500000L)).addInterceptor((Chain interceptor$Chain0) -> {
            L.p(context0, "$context");
            L.p(interceptor$Chain0, "chain");
            Request request0 = interceptor$Chain0.request();
            String s = request0.url().toString();
            TrafficStats.setThreadStatsTag(s.hashCode());
            okhttp3.Request.Builder request$Builder0 = request0.newBuilder().header("User-Agent", k.f(context0));
            String s1 = com.kakao.adfit.m.c.a.a(s);
            if(s1 != null && !v.x3(s1) == 1) {
                request$Builder0.header("Cookie", s1);
            }
            Response response0 = interceptor$Chain0.proceed(request$Builder0.build());
            for(Object object0: response0.headers()) {
                String s2 = (String)((V)object0).b();
                if(L.g(((String)((V)object0).a()), "Set-Cookie")) {
                    com.kakao.adfit.m.c.a.a(s, s2);
                }
            }
            return response0;
        }).build();
    }

    // 检测为 Lambda 实现
    private static final Response a(Context context0, Chain interceptor$Chain0) [...]

    public final void a(String s) {
        static final class d extends o implements A3.o {
            int a;
            final h b;
            final Request c;

            d(h h0, Request request0, kotlin.coroutines.d d0) {
                this.b = h0;
                this.c = request0;
                super(2, d0);
            }

            public final Object a(O o0, kotlin.coroutines.d d0) {
                return ((d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                return new d(this.b, this.c, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                if(this.a != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                try {
                    kotlin.io.c.a(FirebasePerfOkHttpClient.execute(this.b.b().newCall(this.c)), null);
                }
                catch(IOException unused_ex) {
                }
                return S0.a;
            }
        }

        L.p(s, "url");
        Request request0 = new okhttp3.Request.Builder().url(s).cacheControl(CacheControl.FORCE_NETWORK).build();
        kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.c())), null, null, new d(this, request0, null), 3, null);
    }

    public final void a(List list0, com.kakao.adfit.a.d.c d$c0, e e0) {
        static final class com.kakao.adfit.a.h.e extends o implements A3.o {
            int a;
            final h b;
            final Request c;
            final e d;
            final String e;

            com.kakao.adfit.a.h.e(h h0, Request request0, e e0, String s, kotlin.coroutines.d d0) {
                this.b = h0;
                this.c = request0;
                this.d = e0;
                this.e = s;
                super(2, d0);
            }

            public final Object a(O o0, kotlin.coroutines.d d0) {
                return ((com.kakao.adfit.a.h.e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                return new com.kakao.adfit.a.h.e(this.b, this.c, this.d, this.e, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                String s;
                e e0;
                Response response0;
                if(this.a != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                try {
                    response0 = FirebasePerfOkHttpClient.execute(this.b.b().newCall(this.c));
                    e0 = this.d;
                    s = this.e;
                    if(e0 != null) {
                        goto label_6;
                    }
                    goto label_16;
                }
                catch(IOException iOException0) {
                    goto label_19;
                }
                try {
                label_6:
                    if(!response0.isSuccessful()) {
                        com.kakao.adfit.a.e.a e$a0 = e0.a(s);
                        if(e$a0 != null) {
                            e$a0.a(response0);
                        }
                    }
                    goto label_16;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    try {
                        kotlin.io.c.a(response0, throwable0);
                        throw throwable1;
                    label_16:
                        kotlin.io.c.a(response0, null);
                        return S0.a;
                    }
                    catch(IOException iOException0) {
                    }
                }
            label_19:
                e e1 = this.d;
                if(e1 != null) {
                    com.kakao.adfit.a.e.a e$a1 = e1.a(this.e);
                    if(e$a1 != null) {
                        e$a1.a(iOException0);
                    }
                }
                return S0.a;
            }
        }

        L.p(list0, "urls");
        com.kakao.adfit.a.d d0 = d$c0 == null ? null : d$c0.a();
        okhttp3.Request.Builder request$Builder0 = new okhttp3.Request.Builder().cacheControl(CacheControl.FORCE_NETWORK);
        for(Object object0: list0) {
            String s = (String)object0;
            if(d0 != null) {
                com.kakao.adfit.a.d.b d$b0 = com.kakao.adfit.a.d.b;
                if(d$b0.a(s)) {
                    s = d$b0.a(s, d0);
                }
            }
            Request request0 = request$Builder0.url(s).build();
            kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.c())), null, null, new com.kakao.adfit.a.h.e(this, request0, e0, s, null), 3, null);
        }
    }

    public final OkHttpClient b() {
        return this.d();
    }

    private final OkHttpClient c() {
        Builder okHttpClient$Builder0 = this.d().newBuilder();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        return okHttpClient$Builder0.connectTimeout(1000L, timeUnit0).readTimeout(1000L, timeUnit0).writeTimeout(1000L, timeUnit0).callTimeout(1000L, timeUnit0).retryOnConnectionFailure(true).build();
    }

    private final OkHttpClient d() {
        return (OkHttpClient)this.b.getValue();
    }

    public final i e() {
        return this.a;
    }
}

