package com.kakao.adfit.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.O;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class i implements r {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final LruCache a;
    private final HashMap b;
    private final D c;
    public static final a d;

    static {
        i.d = new a(null);
    }

    public i(A3.a a0) {
        static final class d extends N implements A3.a {
            final A3.a a;

            d(A3.a a0) {
                this.a = a0;
                super(0);
            }

            public final OkHttpClient a() {
                return (OkHttpClient)this.a.invoke();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(a0, "createHttpClient");
        super();
        this.a = new LruCache(20);
        this.b = new HashMap();
        this.c = E.a(new d(a0));
    }

    static Object a(i i0, Request request0, int v, kotlin.coroutines.d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return i0.a(request0, v, d0);
    }

    private final Object a(Request request0, int v, kotlin.coroutines.d d0) {
        static final class c extends kotlin.coroutines.jvm.internal.d {
            Object a;
            Object b;
            int c;
            Object d;
            final i e;
            int f;

            c(i i0, kotlin.coroutines.d d0) {
                this.e = i0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                this.d = object0;
                this.f |= 0x80000000;
                return this.e.a(null, 0, this);
            }
        }

        i i0;
        Bitmap bitmap0;
        Response response0;
        c i$c0;
        if(d0 instanceof c) {
            i$c0 = (c)d0;
            int v1 = i$c0.f;
            if((v1 & 0x80000000) == 0) {
                i$c0 = new c(this, d0);
            }
            else {
                i$c0.f = v1 ^ 0x80000000;
            }
        }
        else {
            i$c0 = new c(this, d0);
        }
        Object object0 = i$c0.d;
        Object object1 = b.l();
        switch(i$c0.f) {
            case 0: {
                f0.n(object0);
                OkHttpClient okHttpClient0 = this.a();
                if(v > 0) {
                    long v2 = (long)(okHttpClient0.connectTimeoutMillis() * (v * 2));
                    Builder okHttpClient$Builder0 = okHttpClient0.newBuilder();
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    okHttpClient0 = okHttpClient$Builder0.connectTimeout(v2, timeUnit0).readTimeout(v2, timeUnit0).writeTimeout(v2, timeUnit0).callTimeout(v2, timeUnit0).build();
                }
                try {
                    response0 = FirebasePerfOkHttpClient.execute(okHttpClient0.newCall(request0));
                }
                catch(Exception exception0) {
                    goto label_37;
                }
                try {
                    if(!response0.isSuccessful()) {
                        throw new IOException("Unexpected code [code = " + response0.code() + ']');
                    }
                    ResponseBody responseBody0 = response0.body();
                    if(responseBody0 == null) {
                        throw new IOException("Empty body.");
                    }
                    bitmap0 = BitmapFactory.decodeStream(responseBody0.byteStream());
                    if(bitmap0 == null) {
                        throw new IOException("Failed to decode the image data.");
                    }
                    goto label_34;
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
                    label_34:
                        kotlin.io.c.a(response0, null);
                        return bitmap0;
                    }
                    catch(Exception exception0) {
                    }
                }
            label_37:
                if(v > 2) {
                    throw exception0;
                }
                i$c0.a = this;
                i$c0.b = request0;
                i$c0.c = v;
                i$c0.f = 1;
                if(a0.b(100L, i$c0) == object1) {
                    return object1;
                }
                i0 = this;
                goto label_53;
            }
            case 1: {
                v = i$c0.c;
                request0 = (Request)i$c0.b;
                i0 = (i)i$c0.a;
                f0.n(object0);
            label_53:
                i$c0.a = null;
                i$c0.b = null;
                i$c0.f = 2;
                object0 = i0.a(request0, v + 1, i$c0);
                return object0 == object1 ? object1 : object0;
            }
            case 2: {
                f0.n(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final OkHttpClient a() {
        return (OkHttpClient)this.c.getValue();
    }

    @Override  // com.kakao.adfit.a.r
    public Bitmap a(String s) {
        L.p(s, "url");
        return (Bitmap)this.a.get(s);
    }

    @Override  // com.kakao.adfit.a.r
    public kotlinx.coroutines.flow.i b(String s) {
        kotlinx.coroutines.flow.i i1;
        Bitmap bitmap0;
        L.p(s, "url");
        HashMap hashMap0 = this.b;
        __monitor_enter(hashMap0);
        try {
            bitmap0 = (Bitmap)this.a.get(s);
            if(bitmap0 == null) {
                I i0 = (I)this.b.get(s);
                if(i0 == null) {
                    i0 = this.c(s);
                    this.b.put(s, i0);
                }
                i1 = k.T1(i0, 1);
                goto label_14;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(hashMap0);
        throw throwable0;
    label_14:
        __monitor_exit(hashMap0);
        return i1;
    label_16:
        __monitor_exit(hashMap0);
        return k.T1(W.a(v.a.a(bitmap0)), 1);
    }

    private final I c(String s) {
        static final class com.kakao.adfit.a.i.b extends o implements A3.o {
            long a;
            int b;
            private Object c;
            final String d;
            final i e;

            com.kakao.adfit.a.i.b(String s, i i0, kotlin.coroutines.d d0) {
                this.d = s;
                this.e = i0;
                super(2, d0);
            }

            public final Object a(j j0, kotlin.coroutines.d d0) {
                return ((com.kakao.adfit.a.i.b)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.kakao.adfit.a.i.b(this.d, this.e, d0);
                d1.c = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((j)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Bitmap bitmap0;
                j j0;
                Object object1 = b.l();
                switch(this.b) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.c;
                        Request request0 = new okhttp3.Request.Builder().url(this.d).build();
                        try {
                            this.c = j0;
                            this.a = 0L;
                            this.b = 1;
                            object0 = i.a(this.e, request0, 0, this, 2, null);
                            if(object0 == object1) {
                                return object1;
                            }
                            bitmap0 = (Bitmap)object0;
                            goto label_34;
                        }
                        catch(Exception exception0) {
                            break;
                        }
                    }
                    case 1: {
                        j0 = (j)this.c;
                        try {
                            f0.n(object0);
                            bitmap0 = (Bitmap)object0;
                            goto label_34;
                        }
                        catch(Exception exception0) {
                        }
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                synchronized(this.e.b) {
                    I i0 = (I)this.e.b.remove(this.d);
                }
                com.kakao.adfit.a.v.b v$b0 = v.a.a(exception0);
                this.c = null;
                this.b = 2;
                return j0.emit(v$b0, this) == object1 ? object1 : S0.a;
            label_34:
                synchronized(this.e.b) {
                    this.e.a.put(this.d, bitmap0);
                    I i1 = (I)this.e.b.remove(this.d);
                }
                com.kakao.adfit.a.v.c v$c0 = v.a.a(bitmap0);
                this.c = null;
                this.b = 3;
                return j0.emit(v$c0, this) == object1 ? object1 : S0.a;
            }
        }

        return k.F1(k.I0(new com.kakao.adfit.a.i.b(s, this, null)), P.a(j1.c(null, 1, null).plus(h0.c())), O.a.c(), 1);
    }
}

