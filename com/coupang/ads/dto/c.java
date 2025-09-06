package com.coupang.ads.dto;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.v;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import y4.l;
import y4.m;

public final class c {
    @l
    private final OkHttpClient a;
    @l
    private final Gson b;
    @l
    private final D c;

    public c(@l OkHttpClient okHttpClient0, @l Gson gson0) {
        static final class a extends N implements A3.a {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(0);
            }

            @m
            public final MediaType b() {
                return MediaType.parse("application/json; charset=utf-8");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(okHttpClient0, "okHttpClient");
        L.p(gson0, "gson");
        super();
        this.a = okHttpClient0;
        this.b = gson0;
        this.c = E.a(a.e);
    }

    @l
    public final Object a(@l String s, @l Class class0, @m Map map0, @m Map map1) {
        L.p(s, "url");
        L.p(class0, "clazz");
        try {
            StringBuilder stringBuilder0 = new StringBuilder(s);
            if(map1 != null) {
                if(v.v7(s) != 0x3F) {
                    stringBuilder0.append('?');
                }
                for(Object object0: map1.entrySet()) {
                    stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
                    stringBuilder0.append('=');
                    stringBuilder0.append(((String)((Map.Entry)object0).getValue()));
                    stringBuilder0.append('&');
                }
            }
            Gson gson0 = this.b;
            OkHttpClient okHttpClient0 = this.a;
            Builder request$Builder0 = new Builder().get();
            String s1 = stringBuilder0.toString();
            L.o(s1, "strBuilder.toString()");
            Builder request$Builder1 = request$Builder0.url(v.R5(s1, new char[]{'&'}));
            if(map0 != null) {
                for(Object object1: map0.entrySet()) {
                    request$Builder1.addHeader(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                }
            }
            ResponseBody responseBody0 = FirebasePerfOkHttpClient.execute(okHttpClient0.newCall(request$Builder1.build())).body();
            return e0.b(gson0.r((responseBody0 == null ? null : responseBody0.string()), class0));
        }
        catch(Throwable throwable0) {
            return e0.b(f0.a(throwable0));
        }
    }

    public static Object b(c c0, String s, Class class0, Map map0, Map map1, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        if((v & 8) != 0) {
            map1 = null;
        }
        return c0.a(s, class0, map0, map1);
    }

    private final MediaType c() {
        return (MediaType)this.c.getValue();
    }

    public final Object d(@l String s, @l Class class0, @m Map map0, @l String s1) {
        L.p(s, "url");
        L.p(class0, "clazz");
        L.p(s1, "jsonBody");
        RequestBody requestBody0 = RequestBody.create(this.c(), s1);
        L.o(requestBody0, "body");
        return this.e(s, class0, map0, requestBody0);
    }

    public final Object e(@l String s, @l Class class0, @m Map map0, @l RequestBody requestBody0) {
        L.p(s, "url");
        L.p(class0, "clazz");
        L.p(requestBody0, "jsonBody");
        Gson gson0 = this.b;
        OkHttpClient okHttpClient0 = this.a;
        Builder request$Builder0 = new Builder().url(s).post(requestBody0);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                request$Builder0.addHeader(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
        }
        ResponseBody responseBody0 = FirebasePerfOkHttpClient.execute(okHttpClient0.newCall(request$Builder0.build())).body();
        return responseBody0 == null ? gson0.r(null, class0) : gson0.r(responseBody0.string(), class0);
    }

    public static Object f(c c0, String s, Class class0, Map map0, String s1, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        return c0.d(s, class0, map0, s1);
    }

    public static Object g(c c0, String s, Class class0, Map map0, RequestBody requestBody0, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        return c0.e(s, class0, map0, requestBody0);
    }

    @l
    public final Object h(@l String s, @l Class class0, @m Map map0, @m Map map1) {
        L.p(s, "url");
        L.p(class0, "clazz");
        try {
            okhttp3.FormBody.Builder formBody$Builder0 = new okhttp3.FormBody.Builder();
            if(map1 != null) {
                Set set0 = map1.entrySet();
                if(set0 != null) {
                    for(Object object0: set0) {
                        formBody$Builder0.add(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                    }
                }
            }
            Gson gson0 = this.b;
            OkHttpClient okHttpClient0 = this.a;
            Builder request$Builder0 = new Builder().url(s).post(formBody$Builder0.build());
            if(map0 != null) {
                for(Object object1: map0.entrySet()) {
                    request$Builder0.addHeader(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                }
            }
            ResponseBody responseBody0 = FirebasePerfOkHttpClient.execute(okHttpClient0.newCall(request$Builder0.build())).body();
            return e0.b(gson0.r((responseBody0 == null ? null : responseBody0.string()), class0));
        }
        catch(Throwable throwable0) {
            return e0.b(f0.a(throwable0));
        }
    }

    public static Object i(c c0, String s, Class class0, Map map0, Map map1, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        if((v & 8) != 0) {
            map1 = null;
        }
        return c0.h(s, class0, map0, map1);
    }
}

