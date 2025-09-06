package com.coupang.ads.network;

import com.coupang.ads.dto.c;
import com.coupang.ads.network.interceptor.d;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import y4.l;

public final class a {
    @l
    private final D a;
    @l
    private final D b;
    @l
    private final D c;

    public a(@l Gson gson0) {
        static final class com.coupang.ads.network.a.a extends N implements A3.a {
            final a e;

            com.coupang.ads.network.a.a(a a0) {
                this.e = a0;
                super(0);
            }

            @l
            public final com.coupang.ads.network.api.a b() {
                return new com.coupang.ads.network.api.a(this.e.b());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class b extends N implements A3.a {
            final a e;
            final Gson f;

            b(a a0, Gson gson0) {
                this.e = a0;
                this.f = gson0;
                super(0);
            }

            @l
            public final c b() {
                return new c(this.e.c(), this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.network.a.c extends N implements A3.a {
            public static final com.coupang.ads.network.a.c e;

            static {
                com.coupang.ads.network.a.c.e = new com.coupang.ads.network.a.c();
            }

            com.coupang.ads.network.a.c() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            public final OkHttpClient invoke() {
                Builder okHttpClient$Builder0 = new Builder();
                okHttpClient$Builder0.addInterceptor(new d());
                okHttpClient$Builder0.addInterceptor(new com.coupang.ads.network.interceptor.c());
                okHttpClient$Builder0.addInterceptor(com.coupang.ads.a.o.b().h()).connectionPool(new ConnectionPool(1, 20L, TimeUnit.SECONDS)).retryOnConnectionFailure(true);
                return okHttpClient$Builder0.build();
            }
        }

        L.p(gson0, "gson");
        super();
        this.a = E.a(com.coupang.ads.network.a.c.e);
        this.b = E.a(new b(this, gson0));
        this.c = E.a(new com.coupang.ads.network.a.a(this));
    }

    @l
    public final com.coupang.ads.network.api.a a() {
        return (com.coupang.ads.network.api.a)this.c.getValue();
    }

    @l
    public final c b() {
        return (c)this.b.getValue();
    }

    @l
    public final OkHttpClient c() {
        Object object0 = this.a.getValue();
        L.o(object0, "<get-okHttpClient>(...)");
        return (OkHttpClient)object0;
    }
}

