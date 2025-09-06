package com.vungle.ads.internal.network;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.vungle.ads.internal.util.p;
import j..util.Objects;
import java.io.IOException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Z;
import okio.n;
import okio.y;
import y4.l;
import y4.m;

public final class e implements a {
    public static final class com.vungle.ads.internal.network.e.a {
        private com.vungle.ads.internal.network.e.a() {
        }

        public com.vungle.ads.internal.network.e.a(w w0) {
        }

        private final void throwIfFatal(Throwable throwable0) {
            if(throwable0 instanceof VirtualMachineError || throwable0 instanceof ThreadDeath || throwable0 instanceof LinkageError) {
                throw throwable0;
            }
        }
    }

    public static final class b extends ResponseBody {
        @l
        private final ResponseBody delegate;
        @l
        private final n delegateSource;
        @m
        private IOException thrownException;

        public b(@l ResponseBody responseBody0) {
            public static final class com.vungle.ads.internal.network.e.b.a extends y {
                com.vungle.ads.internal.network.e.b.a(b e$b0, n n0) {
                    b.this = e$b0;
                    super(n0);
                }

                @Override  // okio.y
                public long read(@l okio.l l0, long v) throws IOException {
                    L.p(l0, "sink");
                    try {
                        return super.read(l0, v);
                    }
                    catch(IOException iOException0) {
                        b.this.setThrownException(iOException0);
                        throw iOException0;
                    }
                }
            }

            L.p(responseBody0, "delegate");
            super();
            this.delegate = responseBody0;
            this.delegateSource = Z.e(new com.vungle.ads.internal.network.e.b.a(this, responseBody0.source()));
        }

        @Override  // okhttp3.ResponseBody
        public void close() {
            this.delegate.close();
        }

        @Override  // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override  // okhttp3.ResponseBody
        @m
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @m
        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(@m IOException iOException0) {
            this.thrownException = iOException0;
        }

        @Override  // okhttp3.ResponseBody
        @l
        public n source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException0 = this.thrownException;
            if(iOException0 != null) {
                throw iOException0;
            }
        }
    }

    public static final class c extends ResponseBody {
        private final long contentLength;
        @m
        private final MediaType contentType;

        public c(@m MediaType mediaType0, long v) {
            this.contentType = mediaType0;
            this.contentLength = v;
        }

        @Override  // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override  // okhttp3.ResponseBody
        @m
        public MediaType contentType() {
            return this.contentType;
        }

        @Override  // okhttp3.ResponseBody
        @l
        public n source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    @l
    public static final com.vungle.ads.internal.network.e.a Companion = null;
    @l
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    @l
    private final Call rawCall;
    @l
    private final com.vungle.ads.internal.network.converters.a responseConverter;

    static {
        e.Companion = new com.vungle.ads.internal.network.e.a(null);
    }

    public e(@l Call call0, @l com.vungle.ads.internal.network.converters.a a0) {
        L.p(call0, "rawCall");
        L.p(a0, "responseConverter");
        super();
        this.rawCall = call0;
        this.responseConverter = a0;
    }

    private final ResponseBody buffer(ResponseBody responseBody0) throws IOException {
        okio.l l0 = new okio.l();
        responseBody0.source().R1(l0);
        MediaType mediaType0 = responseBody0.contentType();
        long v = responseBody0.contentLength();
        return ResponseBody.Companion.create(l0, mediaType0, v);
    }

    @Override  // com.vungle.ads.internal.network.a
    public void cancel() {
        this.canceled = true;
        synchronized(this) {
        }
        this.rawCall.cancel();
    }

    @Override  // com.vungle.ads.internal.network.a
    public void enqueue(@l com.vungle.ads.internal.network.b b0) {
        public static final class d implements Callback {
            final com.vungle.ads.internal.network.b $callback;

            d(e e0, com.vungle.ads.internal.network.b b0) {
                e.this = e0;
                this.$callback = b0;
                super();
            }

            private final void callFailure(Throwable throwable0) {
                try {
                    this.$callback.onFailure(e.this, throwable0);
                }
                catch(Throwable throwable1) {
                    e.Companion.throwIfFatal(throwable1);
                    p.Companion.e("OkHttpCall", "Cannot pass failure to callback", throwable1);
                }
            }

            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                this.callFailure(iOException0);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                f f0;
                L.p(call0, "call");
                L.p(response0, "response");
                try {
                    f0 = e.this.parseResponse(response0);
                }
                catch(Throwable throwable0) {
                    e.Companion.throwIfFatal(throwable0);
                    this.callFailure(throwable0);
                    return;
                }
                try {
                    this.$callback.onResponse(e.this, f0);
                }
                catch(Throwable throwable1) {
                    e.Companion.throwIfFatal(throwable1);
                    p.Companion.e("OkHttpCall", "Cannot pass response to callback", throwable1);
                }
            }
        }

        Call call0;
        L.p(b0, "callback");
        Objects.requireNonNull(b0, "callback == null");
        synchronized(this) {
            call0 = this.rawCall;
        }
        if(this.canceled) {
            call0.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call0, new d(this, b0));
    }

    @Override  // com.vungle.ads.internal.network.a
    @m
    public f execute() throws IOException {
        Call call0;
        synchronized(this) {
            call0 = this.rawCall;
        }
        if(this.canceled) {
            call0.cancel();
        }
        return this.parseResponse(FirebasePerfOkHttpClient.execute(call0));
    }

    @Override  // com.vungle.ads.internal.network.a
    public boolean isCanceled() {
        if(this.canceled) {
            return true;
        }
        synchronized(this) {
            return this.rawCall.isCanceled();
        }
    }

    @m
    public final f parseResponse(@l Response response0) throws IOException {
        f f0;
        L.p(response0, "rawResp");
        ResponseBody responseBody0 = response0.body();
        if(responseBody0 == null) {
            return null;
        }
        Response response1 = response0.newBuilder().body(new c(responseBody0.contentType(), responseBody0.contentLength())).build();
        int v = response1.code();
        if(v >= 200 && v < 300) {
            if(v != 204 && v != 205) {
                b e$b0 = new b(responseBody0);
                try {
                    Object object0 = this.responseConverter.convert(e$b0);
                    return f.Companion.success(object0, response1);
                }
                catch(RuntimeException runtimeException0) {
                    e$b0.throwIfCaught();
                    throw runtimeException0;
                }
            }
            responseBody0.close();
            return f.Companion.success(null, response1);
        }
        try {
            ResponseBody responseBody1 = this.buffer(responseBody0);
            f0 = f.Companion.error(responseBody1, response1);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(responseBody0, throwable0);
            throw throwable0;
        }
        kotlin.io.c.a(responseBody0, null);
        return f0;
    }
}

