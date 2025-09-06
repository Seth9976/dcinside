package com.kakao.adfit.a;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kakao.adfit.ads.AdError;
import com.kakao.adfit.ads.AdException;
import com.kakao.adfit.common.matrix.c;
import com.kakao.adfit.e.h;
import com.kakao.adfit.m.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j1;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private OkHttpClient a;
    public static final a b;

    static {
        l.b = new a(null);
    }

    public static Object a(l l0, String s, b b0, int v, d d0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if((v1 & 4) != 0) {
            v = 1;
        }
        return l0.a(s, b0, v, d0);
    }

    public abstract com.kakao.adfit.a.a a(JSONObject arg1);

    public final k a(String s, int v, boolean z) {
        JSONObject jSONObject0 = null;
        if(s != null) {
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        if(jSONObject0 == null || jSONObject0.length() == 0) {
            return new j(AdError.INVALID_AD, "Invalid response", null, 4, null);
        }
        String s1 = jSONObject0.optString("status");
        if(!L.g(s1, "OK")) {
            if(L.g(s1, "NO_AD")) {
                t t0 = u.a(jSONObject0, "options");
                return new j(AdError.NO_AD, "No AD", t0);
            }
            return new j(AdError.INVALID_AD, "Invalid status [status = " + s1 + ']', null, 4, null);
        }
        String s2 = jSONObject0.optString("id");
        if(s2 == null || v.x3(s2)) {
            return new j(AdError.INVALID_AD, "No id", null, 4, null);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("ads");
        if(jSONArray0 == null) {
            return new j(AdError.INVALID_AD, "No ads", null, 4, null);
        }
        int v1 = jSONArray0.length();
        if(v1 <= 0) {
            return new j(AdError.INVALID_AD, "Empty ads", null, 4, null);
        }
        ArrayList arrayList0 = new ArrayList(Math.min(v, v1));
        for(int v2 = 0; v2 < v1; ++v2) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v2);
            if(jSONObject1 != null) {
                com.kakao.adfit.a.a a0 = this.a(jSONObject1);
                if(a0 != null) {
                    arrayList0.add(a0);
                }
            }
        }
        if(arrayList0.isEmpty()) {
            return new j(AdError.INVALID_AD, "Invalid ads: [ads = " + jSONArray0 + ']', null, 4, null);
        }
        t t1 = u.a(jSONObject0, "options");
        L.o(s2, "id");
        return new m(s, s2, arrayList0, t1, z);
    }

    public final Object a(String s, b b0, int v, d d0) {
        static final class com.kakao.adfit.a.l.b extends o implements A3.o {
            int a;
            final b b;
            final l c;
            final String d;
            final int e;

            com.kakao.adfit.a.l.b(b b0, l l0, String s, int v, d d0) {
                this.b = b0;
                this.c = l0;
                this.d = s;
                this.e = v;
                super(2, d0);
            }

            public final Object a(O o0, d d0) {
                return ((com.kakao.adfit.a.l.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new com.kakao.adfit.a.l.b(this.b, this.c, this.d, this.e, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.a.l.b.a extends o implements A3.o {
                    int a;
                    final Exception b;

                    com.kakao.adfit.a.l.b.a(Exception exception0, d d0) {
                        this.b = exception0;
                        super(2, d0);
                    }

                    public final Object a(O o0, d d0) {
                        return ((com.kakao.adfit.a.l.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        return new com.kakao.adfit.a.l.b.a(this.b, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((O)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        if(this.a != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        c.a.a(this.b);
                        return S0.a;
                    }
                }


                static final class com.kakao.adfit.a.l.b.b extends o implements A3.o {
                    int a;
                    final Exception b;

                    com.kakao.adfit.a.l.b.b(Exception exception0, d d0) {
                        this.b = exception0;
                        super(2, d0);
                    }

                    public final Object a(O o0, d d0) {
                        return ((com.kakao.adfit.a.l.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        return new com.kakao.adfit.a.l.b.b(this.b, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((O)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        if(this.a != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        c.a.a(this.b);
                        return S0.a;
                    }
                }

                k k0;
                int v1;
                l l0;
                Response response0;
                Call call0;
                String s;
                if(this.a != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                try {
                    n n0 = new n(this.b);
                    n0.a(this.e);
                    s = n0.a();
                }
                catch(Exception exception0) {
                    AdError adError0 = exception0 instanceof AdException ? ((AdException)exception0).a() : AdError.SDK_EXCEPTION;
                    if(adError0 == AdError.SDK_EXCEPTION) {
                        kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.c())), null, null, new com.kakao.adfit.a.l.b.b(exception0, null), 3, null);
                    }
                    L.o(adError0, "error");
                    return new j(adError0, "request error[" + adError0.getErrorCode() + ']', null, 4, null);
                }
                try {
                    Builder request$Builder0 = new Builder().url(s);
                    b b0 = this.b;
                    if(b0 instanceof h && !((h)b0).k().isEmpty()) {
                        Map map0 = ((h)b0).k();
                        request$Builder0.headers(Headers.Companion.of(map0));
                    }
                    Request request0 = request$Builder0.cacheControl(CacheControl.FORCE_NETWORK).build();
                    OkHttpClient okHttpClient0 = this.c.a;
                    int v = this.b instanceof com.kakao.adfit.b.a ? ((com.kakao.adfit.b.a)this.b).l() : 3000;
                    if(okHttpClient0 == null || okHttpClient0.connectTimeoutMillis() == v) {
                        Context context0 = this.b.getContext();
                        okhttp3.OkHttpClient.Builder okHttpClient$Builder0 = com.kakao.adfit.a.h.c.a(context0).b().newBuilder();
                        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                        okHttpClient0 = okHttpClient$Builder0.connectTimeout(((long)v), timeUnit0).readTimeout(((long)v), timeUnit0).writeTimeout(((long)v), timeUnit0).callTimeout(((long)v), timeUnit0).build();
                        this.c.a = okHttpClient0;
                    }
                    call0 = okHttpClient0.newCall(request0);
                }
                catch(Exception exception1) {
                    kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.c())), null, null, new com.kakao.adfit.a.l.b.a(exception1, null), 3, null);
                    return new j(AdError.SDK_EXCEPTION, "request error[" + AdError.SDK_EXCEPTION.getErrorCode() + ']', null, 4, null);
                }
                f.d((this.d + " request native ads. [url = " + s + ']'));
                try {
                    response0 = FirebasePerfOkHttpClient.execute(call0);
                    l0 = this.c;
                    v1 = this.e;
                }
                catch(Exception exception2) {
                    return new j(AdError.HTTP_FAILED, (exception2.getMessage() == null ? "Unknown Error" : exception2.getMessage()), null, 4, null);
                }
                try {
                    if(!response0.isSuccessful()) {
                        throw new IOException("Unexpected code [response = " + response0 + ']');
                    }
                    ResponseBody responseBody0 = response0.body();
                    k0 = l0.a((responseBody0 == null ? null : responseBody0.string()), v1, L.g(response0.headers().get("X-Kakao-Ad-Inspection"), "true"));
                    goto label_43;
                }
                catch(Throwable throwable0) {
                    try {
                        kotlin.io.c.a(response0, throwable0);
                        throw throwable0;
                    label_43:
                        kotlin.io.c.a(response0, null);
                        return k0;
                    }
                    catch(Exception exception2) {
                    }
                }
                return new j(AdError.HTTP_FAILED, (exception2.getMessage() == null ? "Unknown Error" : exception2.getMessage()), null, 4, null);
            }
        }

        return i.h(h0.c(), new com.kakao.adfit.a.l.b(b0, this, s, v, null), d0);
    }
}

