package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.D;
import com.facebook.imagepipeline.producers.d;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.n;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import okhttp3.CacheControl.Builder;
import okhttp3.CacheControl;
import okhttp3.Call.Factory;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpNetworkFetcher.kt\ncom/facebook/imagepipeline/backends/okhttp3/OkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public class b extends d {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final class com.facebook.imagepipeline.backends.okhttp3.b.b extends D {
        @f
        public long f;
        @f
        public long g;
        @f
        public long h;

        public com.facebook.imagepipeline.backends.okhttp3.b.b(@l n n0, @l j0 j00) {
            L.p(n0, "consumer");
            L.p(j00, "producerContext");
            super(n0, j00);
        }
    }

    @l
    private final Factory a;
    @l
    private final Executor b;
    @m
    private final CacheControl c;
    @l
    private static final a d = null;
    @l
    private static final String e = "queue_time";
    @l
    private static final String f = "fetch_time";
    @l
    private static final String g = "total_time";
    @l
    private static final String h = "image_size";

    static {
        b.d = new a(null);
    }

    @j
    public b(@l Factory call$Factory0, @l Executor executor0) {
        L.p(call$Factory0, "callFactory");
        L.p(executor0, "cancellationExecutor");
        this(call$Factory0, executor0, false, 4, null);
    }

    @j
    public b(@l Factory call$Factory0, @l Executor executor0, boolean z) {
        L.p(call$Factory0, "callFactory");
        L.p(executor0, "cancellationExecutor");
        super();
        this.a = call$Factory0;
        this.b = executor0;
        this.c = z ? new Builder().noStore().build() : null;
    }

    public b(Factory call$Factory0, Executor executor0, boolean z, int v, w w0) {
        if((v & 4) != 0) {
            z = true;
        }
        this(call$Factory0, executor0, z);
    }

    public b(@l OkHttpClient okHttpClient0) {
        L.p(okHttpClient0, "okHttpClient");
        ExecutorService executorService0 = okHttpClient0.dispatcher().executorService();
        L.o(executorService0, "executorService(...)");
        this(okHttpClient0, executorService0, false, 4, null);
    }

    @Override  // com.facebook.imagepipeline.producers.d
    public void a(D d0, int v) {
        this.o(((com.facebook.imagepipeline.backends.okhttp3.b.b)d0), v);
    }

    @Override  // com.facebook.imagepipeline.producers.Z
    public D b(n n0, j0 j00) {
        return this.i(n0, j00);
    }

    @Override  // com.facebook.imagepipeline.producers.Z
    public void c(D d0, com.facebook.imagepipeline.producers.Z.a z$a0) {
        this.j(((com.facebook.imagepipeline.backends.okhttp3.b.b)d0), z$a0);
    }

    @Override  // com.facebook.imagepipeline.producers.d
    public Map e(D d0, int v) {
        return this.l(((com.facebook.imagepipeline.backends.okhttp3.b.b)d0), v);
    }

    @l
    public com.facebook.imagepipeline.backends.okhttp3.b.b i(@l n n0, @l j0 j00) {
        L.p(n0, "consumer");
        L.p(j00, "context");
        return new com.facebook.imagepipeline.backends.okhttp3.b.b(n0, j00);
    }

    public void j(@l com.facebook.imagepipeline.backends.okhttp3.b.b b$b0, @l com.facebook.imagepipeline.producers.Z.a z$a0) {
        L.p(b$b0, "fetchState");
        L.p(z$a0, "callback");
        b$b0.f = SystemClock.elapsedRealtime();
        Uri uri0 = b$b0.h();
        L.o(uri0, "getUri(...)");
        try {
            okhttp3.Request.Builder request$Builder0 = new okhttp3.Request.Builder().url(uri0.toString()).get();
            CacheControl cacheControl0 = this.c;
            if(cacheControl0 != null) {
                request$Builder0.cacheControl(cacheControl0);
            }
            com.facebook.imagepipeline.common.b b0 = b$b0.b().b().e();
            if(b0 != null) {
                request$Builder0.addHeader("Range", b0.k());
            }
            Request request0 = request$Builder0.build();
            L.o(request0, "build(...)");
            this.k(b$b0, z$a0, request0);
            return;
        }
        catch(Exception exception0) {
        }
        z$a0.onFailure(exception0);
    }

    protected void k(@l com.facebook.imagepipeline.backends.okhttp3.b.b b$b0, @l com.facebook.imagepipeline.producers.Z.a z$a0, @l Request request0) {
        public static final class c extends com.facebook.imagepipeline.producers.f {
            final Call a;
            final b b;

            c(Call call0, b b0) {
                this.a = call0;
                this.b = b0;
                super();
            }

            @Override  // com.facebook.imagepipeline.producers.f
            public void b() {
                if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
                    this.a.cancel();
                    return;
                }
                this.b.b.execute(() -> this.a.cancel());
            }

            // 检测为 Lambda 实现
            private static final void f(Call call0) [...]
        }


        public static final class com.facebook.imagepipeline.backends.okhttp3.b.d implements Callback {
            final com.facebook.imagepipeline.backends.okhttp3.b.b a;
            final b b;
            final com.facebook.imagepipeline.producers.Z.a c;

            com.facebook.imagepipeline.backends.okhttp3.b.d(com.facebook.imagepipeline.backends.okhttp3.b.b b$b0, b b0, com.facebook.imagepipeline.producers.Z.a z$a0) {
                this.a = b$b0;
                this.b = b0;
                this.c = z$a0;
                super();
            }

            @Override  // okhttp3.Callback
            public void onFailure(Call call0, IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                this.b.m(call0, iOException0, this.c);
            }

            @Override  // okhttp3.Callback
            public void onResponse(Call call0, Response response0) throws IOException {
                com.facebook.imagepipeline.producers.Z.a z$a0;
                b b0;
                L.p(call0, "call");
                L.p(response0, "response");
                this.a.g = SystemClock.elapsedRealtime();
                ResponseBody responseBody0 = response0.body();
                if(responseBody0 != null) {
                    try {
                        try {
                            b0 = this.b;
                            z$a0 = this.c;
                            com.facebook.imagepipeline.backends.okhttp3.b.b b$b0 = this.a;
                            if(response0.isSuccessful()) {
                                String s = response0.header("Content-Range");
                                com.facebook.imagepipeline.common.b b1 = com.facebook.imagepipeline.common.b.c.c(s);
                                if(b1 != null && (b1.a != 0 || b1.b != 0x7FFFFFFF)) {
                                    b$b0.k(b1);
                                    b$b0.j(8);
                                }
                                int v = responseBody0.contentLength() >= 0L ? ((int)responseBody0.contentLength()) : 0;
                                z$a0.b(responseBody0.byteStream(), v);
                            }
                            else {
                                b0.m(call0, b0.n("Unexpected HTTP code " + response0, response0), z$a0);
                            }
                            goto label_28;
                        }
                        catch(Exception exception0) {
                        }
                        b0.m(call0, exception0, z$a0);
                        goto label_28;
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        kotlin.io.c.a(responseBody0, throwable0);
                        throw throwable1;
                    }
                label_28:
                    kotlin.io.c.a(responseBody0, null);
                    return;
                }
                IOException iOException0 = this.b.n("Response body null: " + response0, response0);
                this.b.m(call0, iOException0, this.c);
            }
        }

        L.p(b$b0, "fetchState");
        L.p(z$a0, "callback");
        L.p(request0, "request");
        Call call0 = this.a.newCall(request0);
        b$b0.b().n(new c(call0, this));
        FirebasePerfOkHttpClient.enqueue(call0, new com.facebook.imagepipeline.backends.okhttp3.b.d(b$b0, this, z$a0));
    }

    @m
    public Map l(@l com.facebook.imagepipeline.backends.okhttp3.b.b b$b0, int v) {
        L.p(b$b0, "fetchState");
        return Y.W(new V[]{r0.a("queue_time", String.valueOf(b$b0.g - b$b0.f)), r0.a("fetch_time", String.valueOf(b$b0.h - b$b0.g)), r0.a("total_time", String.valueOf(b$b0.h - b$b0.f)), r0.a("image_size", String.valueOf(v))});
    }

    private final void m(Call call0, Exception exception0, com.facebook.imagepipeline.producers.Z.a z$a0) {
        if(call0.isCanceled()) {
            z$a0.a();
            return;
        }
        z$a0.onFailure(exception0);
    }

    private final IOException n(String s, Response response0) {
        return new IOException(s, com.facebook.imagepipeline.backends.okhttp3.d.c.a(response0));
    }

    public void o(@l com.facebook.imagepipeline.backends.okhttp3.b.b b$b0, int v) {
        L.p(b$b0, "fetchState");
        b$b0.h = SystemClock.elapsedRealtime();
    }
}

