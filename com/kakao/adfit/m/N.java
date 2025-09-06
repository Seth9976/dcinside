package com.kakao.adfit.m;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kakao.adfit.a.h;
import java.io.IOException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {
    private final Context a;

    public n(Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
    }

    public final void a(String s, String s1, Function1 function10, Function1 function11) {
        static final class a extends o implements A3.o {
            int a;
            private Object b;
            final n c;
            final Request d;
            final Function1 e;
            final Function1 f;

            a(n n0, Request request0, Function1 function10, Function1 function11, d d0) {
                this.c = n0;
                this.d = request0;
                this.e = function10;
                this.f = function11;
                super(2, d0);
            }

            public final Object a(O o0, d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new a(this.c, this.d, this.e, this.f, d0);
                d1.b = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.m.n.a.a extends o implements A3.o {
                    int a;
                    final Function1 b;
                    final String c;

                    com.kakao.adfit.m.n.a.a(Function1 function10, String s, d d0) {
                        this.b = function10;
                        this.c = s;
                        super(2, d0);
                    }

                    public final Object a(O o0, d d0) {
                        return ((com.kakao.adfit.m.n.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        return new com.kakao.adfit.m.n.a.a(this.b, this.c, d0);
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
                        com.kakao.adfit.m.o o0 = new com.kakao.adfit.m.o(this.c);
                        this.b.invoke(o0);
                        return S0.a;
                    }
                }

                JSONObject jSONObject0;
                Function1 function11;
                Function1 function10;
                Response response0;
                if(this.a != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.b;
                try {
                    response0 = FirebasePerfOkHttpClient.execute(h.c.a(this.c.a).b().newCall(this.d));
                    function10 = this.e;
                    function11 = this.f;
                }
                catch(IOException iOException0) {
                    this.e.invoke((iOException0.getMessage() == null ? "Unknown Error" : iOException0.getMessage()));
                    return S0.a;
                }
                try {
                    if(response0.isSuccessful()) {
                        ResponseBody responseBody0 = response0.body();
                        if(responseBody0 == null) {
                        label_13:
                            jSONObject0 = null;
                        }
                        else {
                            String s = responseBody0.string();
                            if(s != null) {
                                try {
                                    jSONObject0 = new JSONObject(s);
                                    goto label_14;
                                }
                                catch(JSONException unused_ex) {
                                }
                            }
                            goto label_13;
                        }
                    label_14:
                        if(jSONObject0 != null && jSONObject0.length() != 0) {
                            String s1 = q.e(jSONObject0, "eacid");
                            if(s1 != null && !v.x3(s1)) {
                                k.f(o0, h0.e(), null, new com.kakao.adfit.m.n.a.a(function11, s1, null), 2, null);
                                goto label_18;
                            }
                            goto label_20;
                        }
                        goto label_23;
                    }
                    goto label_26;
                }
                catch(Throwable throwable0) {
                    goto label_29;
                }
                try {
                label_18:
                    c.a(response0, null);
                }
                catch(IOException iOException0) {
                    this.e.invoke((iOException0.getMessage() == null ? "Unknown Error" : iOException0.getMessage()));
                }
                return S0.a;
                try {
                label_20:
                    function10.invoke("No eacid [errorCode = " + q.e(jSONObject0, "errorCode") + ']');
                }
                catch(Throwable throwable0) {
                    goto label_29;
                }
                try {
                    c.a(response0, null);
                }
                catch(IOException iOException0) {
                    this.e.invoke((iOException0.getMessage() == null ? "Unknown Error" : iOException0.getMessage()));
                }
                return S0.a;
                try {
                label_23:
                    function10.invoke("Invalid response [response = " + response0 + ']');
                }
                catch(Throwable throwable0) {
                    goto label_29;
                }
                try {
                    c.a(response0, null);
                }
                catch(IOException iOException0) {
                    this.e.invoke((iOException0.getMessage() == null ? "Unknown Error" : iOException0.getMessage()));
                }
                return S0.a;
                try {
                label_26:
                    function10.invoke("Unexpected code [response = " + response0 + ']');
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    try {
                    label_29:
                        c.a(response0, throwable0);
                        throw throwable0;
                    label_31:
                        c.a(response0, null);
                        return S0.a;
                    }
                    catch(IOException iOException0) {
                    }
                }
                this.e.invoke((iOException0.getMessage() == null ? "Unknown Error" : iOException0.getMessage()));
                return S0.a;
            }
        }

        L.p(s, "appKey");
        L.p(s1, "appUserId");
        L.p(function10, "onResponse");
        L.p(function11, "onError");
        try {
            String s2 = Uri.parse("https://acid-api.ds.kakao.com/acid").buildUpon().appendPath("appKey").appendPath(s).appendQueryParameter("appUserId", s1).build().toString();
            L.o(s2, "parse(baseUrl).buildUpon…              .toString()");
            Request request0 = new Builder().url(s2).build();
            k.f(P.a(j1.c(null, 1, null).plus(h0.c())), null, null, new a(this, request0, function11, function10, null), 3, null);
        }
        catch(Exception exception0) {
            com.kakao.adfit.common.matrix.c.a.a(exception0);
        }
    }
}

