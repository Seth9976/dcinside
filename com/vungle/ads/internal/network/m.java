package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.model.h;
import java.util.List;
import java.util.Map;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import okhttp3.Call.Factory;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody.Companion;
import okhttp3.RequestBody;
import y4.l;

public final class m implements VungleApi {
    static final class a extends N implements Function1 {
        public static final a INSTANCE;

        static {
            a.INSTANCE = new a();
        }

        a() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((f)object0));
            return S0.a;
        }

        public final void invoke(@l f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
            f0.r(true);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public final class c {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[d.values().length];
            arr_v[d.GET.ordinal()] = 1;
            arr_v[d.POST.ordinal()] = 2;
            c.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    public static final b Companion = null;
    @l
    private static final String VUNGLE_VERSION = "7.1.0";
    @y4.m
    private String appId;
    @l
    private final com.vungle.ads.internal.network.converters.b emptyResponseConverter;
    @l
    private static final kotlinx.serialization.json.b json;
    @l
    private final Factory okHttpClient;

    static {
        m.Companion = new b(null);
        m.json = s.b(null, a.INSTANCE, 1, null);
    }

    public m(@l Factory call$Factory0) {
        L.p(call$Factory0, "okHttpClient");
        super();
        this.okHttpClient = call$Factory0;
        this.emptyResponseConverter = new com.vungle.ads.internal.network.converters.b();
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @y4.m
    public com.vungle.ads.internal.network.a ads(@l String s, @l String s1, @l com.vungle.ads.internal.model.f f0) {
        String s3;
        L.p(s, "ua");
        L.p(s1, "path");
        L.p(f0, "body");
        try {
            i i0 = z.k(m.json.a(), m0.A(com.vungle.ads.internal.model.f.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s2 = m.json.c(i0, f0);
            com.vungle.ads.internal.model.f.i f$i0 = f0.getRequest();
            if(f$i0 == null) {
                s3 = null;
            }
            else {
                List list0 = f$i0.getPlacements();
                s3 = list0 == null ? null : ((String)u.G2(list0));
            }
            Request request0 = m.defaultBuilder$default(this, s, s1, s3, null, 8, null).post(RequestBody.Companion.create(s2, null)).build();
            return new e(this.okHttpClient.newCall(request0), new com.vungle.ads.internal.network.converters.c(m0.A(com.vungle.ads.internal.model.b.class)));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @y4.m
    public com.vungle.ads.internal.network.a config(@l String s, @l String s1, @l com.vungle.ads.internal.model.f f0) {
        L.p(s, "ua");
        L.p(s1, "path");
        L.p(f0, "body");
        try {
            i i0 = z.k(m.json.a(), m0.A(com.vungle.ads.internal.model.f.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s2 = m.json.c(i0, f0);
            Request request0 = m.defaultBuilder$default(this, s, s1, null, null, 12, null).post(RequestBody.Companion.create(s2, null)).build();
            return new e(this.okHttpClient.newCall(request0), new com.vungle.ads.internal.network.converters.c(m0.A(h.class)));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private final Builder defaultBuilder(String s, String s1, String s2, Map map0) {
        Builder request$Builder0 = new Builder().url(s1).addHeader("User-Agent", s).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", "application/json");
        String s3 = this.appId;
        if(s3 != null) {
            request$Builder0.addHeader("X-Vungle-App-Id", s3);
        }
        if(map0 != null) {
            request$Builder0.headers(Headers.Companion.of(map0));
        }
        if(s2 != null) {
            request$Builder0.addHeader("X-Vungle-Placement-Ref-Id", s2);
        }
        return request$Builder0;
    }

    static Builder defaultBuilder$default(m m0, String s, String s1, String s2, Map map0, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            map0 = null;
        }
        return m0.defaultBuilder(s, s1, s2, map0);
    }

    private final Builder defaultProtoBufBuilder(String s, String s1) {
        Builder request$Builder0 = new Builder().url(s1).addHeader("User-Agent", s).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", "application/x-protobuf");
        String s2 = this.appId;
        if(s2 != null) {
            request$Builder0.addHeader("X-Vungle-App-Id", s2);
        }
        return request$Builder0;
    }

    @VisibleForTesting
    @l
    public final Factory getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @l
    public com.vungle.ads.internal.network.a pingTPAT(@l String s, @l String s1, @l d d0, @y4.m Map map0, @y4.m RequestBody requestBody0) {
        Request request0;
        L.p(s, "ua");
        L.p(s1, "url");
        L.p(d0, "requestType");
        Builder request$Builder0 = m.defaultBuilder$default(this, s, HttpUrl.Companion.get(s1).newBuilder().build().toString(), null, map0, 4, null);
        switch(d0) {
            case 1: {
                request0 = request$Builder0.get().build();
                return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
            }
            case 2: {
                if(requestBody0 == null) {
                    requestBody0 = Companion.create$default(RequestBody.Companion, new byte[0], null, 0, 0, 6, null);
                }
                request0 = request$Builder0.post(requestBody0).build();
                return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @y4.m
    public com.vungle.ads.internal.network.a ri(@l String s, @l String s1, @l com.vungle.ads.internal.model.f f0) {
        L.p(s, "ua");
        L.p(s1, "path");
        L.p(f0, "body");
        try {
            i i0 = z.k(m.json.a(), m0.A(com.vungle.ads.internal.model.f.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s2 = m.json.c(i0, f0);
            Request request0 = m.defaultBuilder$default(this, s, s1, null, null, 12, null).post(RequestBody.Companion.create(s2, null)).build();
            return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @l
    public com.vungle.ads.internal.network.a sendAdMarkup(@l String s, @l RequestBody requestBody0) {
        L.p(s, "path");
        L.p(requestBody0, "requestBody");
        Request request0 = m.defaultBuilder$default(this, "debug", HttpUrl.Companion.get(s).newBuilder().build().toString(), null, null, 12, null).post(requestBody0).build();
        return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @l
    public com.vungle.ads.internal.network.a sendErrors(@l String s, @l String s1, @l RequestBody requestBody0) {
        L.p(s, "ua");
        L.p(s1, "path");
        L.p(requestBody0, "requestBody");
        Request request0 = this.defaultProtoBufBuilder(s, HttpUrl.Companion.get(s1).newBuilder().build().toString()).post(requestBody0).build();
        return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    @l
    public com.vungle.ads.internal.network.a sendMetrics(@l String s, @l String s1, @l RequestBody requestBody0) {
        L.p(s, "ua");
        L.p(s1, "path");
        L.p(requestBody0, "requestBody");
        Request request0 = this.defaultProtoBufBuilder(s, HttpUrl.Companion.get(s1).newBuilder().build().toString()).post(requestBody0).build();
        return new e(this.okHttpClient.newCall(request0), this.emptyResponseConverter);
    }

    @Override  // com.vungle.ads.internal.network.VungleApi
    public void setAppId(@l String s) {
        L.p(s, "appId");
        this.appId = s;
    }
}

