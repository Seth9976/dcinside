package com.unity3d.services.core.network.core;

import A3.a;
import A3.o;
import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Z;
import okio.n;
import y4.l;
import y4.m;

@s0({"SMAP\nOkHttp3Client.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/services/core/network/core/OkHttp3Client\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,228:1\n1#2:229\n314#3,11:230\n*S KotlinDebug\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/services/core/network/core/OkHttp3Client\n*L\n142#1:230,11\n*E\n"})
public final class OkHttp3Client implements HttpClient {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    static final class RequestComplete {
        @m
        private final Object body;
        @l
        private final Response response;

        public RequestComplete(@l Response response0, @m Object object0) {
            L.p(response0, "response");
            super();
            this.response = response0;
            this.body = object0;
        }

        public RequestComplete(Response response0, Object object0, int v, w w0) {
            if((v & 2) != 0) {
                object0 = null;
            }
            this(response0, object0);
        }

        @l
        public final Response component1() {
            return this.response;
        }

        @m
        public final Object component2() {
            return this.body;
        }

        @l
        public final RequestComplete copy(@l Response response0, @m Object object0) {
            L.p(response0, "response");
            return new RequestComplete(response0, object0);
        }

        public static RequestComplete copy$default(RequestComplete okHttp3Client$RequestComplete0, Response response0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                response0 = okHttp3Client$RequestComplete0.response;
            }
            if((v & 2) != 0) {
                object0 = okHttp3Client$RequestComplete0.body;
            }
            return okHttp3Client$RequestComplete0.copy(response0, object0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RequestComplete)) {
                return false;
            }
            return L.g(this.response, ((RequestComplete)object0).response) ? L.g(this.body, ((RequestComplete)object0).body) : false;
        }

        @m
        public final Object getBody() {
            return this.body;
        }

        @l
        public final Response getResponse() {
            return this.response;
        }

        @Override
        public int hashCode() {
            int v = this.response.hashCode();
            return this.body == null ? v * 0x1F : v * 0x1F + this.body.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "RequestComplete(response=" + this.response + ", body=" + this.body + ')';
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    @l
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    @l
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    @l
    private final CleanupDirectory cleanupDirectory;
    @l
    private final OkHttpClient client;
    @l
    private final Context context;
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final AlternativeFlowReader isAlternativeFlowReader;
    @l
    private final File okHttpCache;
    @l
    private final SessionRepository sessionRepository;

    static {
        OkHttp3Client.Companion = new Companion(null);
    }

    public OkHttp3Client(@l ISDKDispatchers iSDKDispatchers0, @l OkHttpClient okHttpClient0, @l Context context0, @l SessionRepository sessionRepository0, @l CleanupDirectory cleanupDirectory0, @l AlternativeFlowReader alternativeFlowReader0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(okHttpClient0, "client");
        L.p(context0, "context");
        L.p(sessionRepository0, "sessionRepository");
        L.p(cleanupDirectory0, "cleanupDirectory");
        L.p(alternativeFlowReader0, "isAlternativeFlowReader");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.client = okHttpClient0;
        this.context = context0;
        this.sessionRepository = sessionRepository0;
        this.cleanupDirectory = cleanupDirectory0;
        this.isAlternativeFlowReader = alternativeFlowReader0;
        this.okHttpCache = this.getOkHttpCache();
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @m
    public Object execute(@l HttpRequest httpRequest0, @l d d0) {
        return i.h(this.dispatchers.getIo(), new o(httpRequest0, null) {
            final HttpRequest $request;
            int label;

            {
                OkHttp3Client.this = okHttp3Client0;
                this.$request = httpRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.OkHttp3Client.execute.2(OkHttp3Client.this, this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.OkHttp3Client.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.label = 1;
                            Object object2 = OkHttp3Client.this.makeRequest(this.$request, ((long)this.$request.getConnectTimeout()), ((long)this.$request.getReadTimeout()), ((long)this.$request.getWriteTimeout()), this);
                            if(object2 == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                                object2 = object0;
                            }
                            Response response0 = ((RequestComplete)object2).component1();
                            String s = ((RequestComplete)object2).component2();
                            if(!OkHttp3Client.this.isAlternativeFlowReader.invoke()) {
                                if(s instanceof File) {
                                    s = kotlin.io.m.B(((File)s), null, 1, null);
                                }
                                else {
                                    s = s instanceof byte[] ? new String(((byte[])s), f.b) : "";
                                }
                            }
                            Map map0 = response0.headers().toMultimap();
                            String s1 = response0.request().url().toString();
                            String s2 = response0.protocol().toString();
                            L.o(map0, "toMultimap()");
                            L.o(s1, "toString()");
                            L.o(s2, "toString()");
                            return new HttpResponse((s == null ? "" : s), response0.code(), map0, s1, s2, "okhttp", 0L, 0x40, null);
                        }
                        catch(SocketTimeoutException unused_ex) {
                            break;
                        }
                        catch(IOException unused_ex) {
                            throw new UnityAdsNetworkException("Network request failed", null, null, this.$request.getBaseURL(), null, null, "okhttp", 54, null);
                        }
                    }
                    case 1: {
                        goto label_8;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                throw new NetworkTimeoutException("Network request timeout", null, null, this.$request.getBaseURL(), null, null, "okhttp", 54, null);
            }
        }, d0);
    }

    @Override  // com.unity3d.services.core.network.core.HttpClient
    @l
    public HttpResponse executeBlocking(@l HttpRequest httpRequest0) {
        L.p(httpRequest0, "request");
        return (HttpResponse)i.f(this.dispatchers.getIo(), new o(httpRequest0, null) {
            final HttpRequest $request;
            int label;

            {
                OkHttp3Client.this = okHttp3Client0;
                this.$request = httpRequest0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.services.core.network.core.OkHttp3Client.executeBlocking.1(OkHttp3Client.this, this.$request, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.services.core.network.core.OkHttp3Client.executeBlocking.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = OkHttp3Client.this.execute(this.$request, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
    }

    private final File getOkHttpCache() {
        File file0 = this.context.getFilesDir();
        L.o(file0, "context.filesDir");
        File file1 = kotlin.io.m.l0(file0, "UnityAdsHttpCache");
        file1.mkdirs();
        if(this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
            CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0 = this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            this.cleanupDirectory.invoke(file1, nativeConfigurationOuterClass$CachedAssetsConfiguration0.getMaxCachedAssetSizeMb(), nativeConfigurationOuterClass$CachedAssetsConfiguration0.getMaxCachedAssetAgeMs());
        }
        return file1;
    }

    private final Object makeRequest(HttpRequest httpRequest0, long v, long v1, long v2, d d0) {
        Request request0 = httpRequest0.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest0) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest0);
        Builder okHttpClient$Builder0 = this.client.newBuilder();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClient0 = okHttpClient$Builder0.connectTimeout(v, timeUnit0).readTimeout(v1, timeUnit0).writeTimeout(v2, timeUnit0).build();
        String s = StringExtensionsKt.getSHA256Hash(httpRequest0.getBaseURL());
        File file0 = new File(this.okHttpCache, s);
        Long long0 = kotlin.coroutines.jvm.internal.b.g((!file0.exists() || !file0.isFile() ? 0L : file0.length()));
        Request request1 = null;
        if(long0.longValue() <= 0L) {
            long0 = null;
        }
        if(long0 != null) {
            DeviceLog.debug(("Resuming download for " + httpRequest0.getBaseURL()));
            request1 = request0.newBuilder().addHeader("Range", "bytes=" + long0.longValue() + '-').build();
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        if(request1 != null) {
            request0 = request1;
        }
        FirebasePerfOkHttpClient.enqueue(okHttpClient0.newCall(request0), new Callback() {
            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                Object object0 = e0.b(f0.a(iOException0));
                this.resumeWith(object0);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                okio.l l1;
                I0 i00;
                okio.m m0;
                L.p(call0, "call");
                L.p(response0, "response");
                if(!response0.isSuccessful()) {
                    Object object0 = e0.b(f0.a(new IOException("Network request failed with code " + response0.code())));
                    this.resumeWith(object0);
                    return;
                }
                try {
                    ResponseBody responseBody0 = response0.body();
                    if(responseBody0 == null) {
                        Object object1 = e0.b(new RequestComplete(response0, null, 2, null));
                        this.resumeWith(object1);
                        return;
                    }
                    long v = responseBody0.contentLength();
                    okio.l l0 = new okio.l();
                    String s = response0.header("Cache-Control");
                    if((s == null || v.W2(s, "no-cache", false, 2, null) ? null : this) == null) {
                        m0 = null;
                    }
                    else {
                        File file0 = httpRequest0;
                        if(!file0.exists()) {
                            file0.createNewFile();
                        }
                        m0 = Z.d(Z.a(file0));
                    }
                    long v1 = 0L;
                    E e0 = m0 == null ? null : W.a(0L);
                    if(e0 == null) {
                        i00 = null;
                    }
                    else {
                        kotlinx.coroutines.flow.i i0 = k.a0(e0, 1000L);
                        if(i0 == null) {
                            i00 = null;
                        }
                        else {
                            kotlinx.coroutines.flow.i i1 = k.e1(new kotlinx.coroutines.flow.i() {
                                @Override  // kotlinx.coroutines.flow.i
                                @m
                                public Object collect(@l j j0, @l d d0) {
                                    com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.map.1.2 okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$20 = new j() {
                                        @Override  // kotlinx.coroutines.flow.j
                                        @m
                                        public final Object emit(Object object0, @l d d0) {
                                            com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.map.1.2.1 okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10;
                                            if(d0 instanceof com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.map.1.2.1) {
                                                okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10 = (com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.map.1.2.1)d0;
                                                int v = okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10.label;
                                                if((v & 0x80000000) == 0) {
                                                    okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                        Object L$0;
                                                        int label;
                                                        Object result;

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            this.result = object0;
                                                            this.label |= 0x80000000;
                                                            return d0.emit(null, this);
                                                        }
                                                    };
                                                }
                                                else {
                                                    okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10.label = v ^ 0x80000000;
                                                }
                                            }
                                            else {
                                                okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                    Object L$0;
                                                    int label;
                                                    Object result;

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        this.result = object0;
                                                        this.label |= 0x80000000;
                                                        return d0.emit(null, this);
                                                    }
                                                };
                                            }
                                            Object object1 = okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10.result;
                                            Object object2 = b.l();
                                            switch(okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10.label) {
                                                case 0: {
                                                    f0.n(object1);
                                                    Integer integer0 = kotlin.coroutines.jvm.internal.b.f(kotlin.math.b.L0(((float)((Number)object0).longValue()) / ((float)this.$contentLength$inlined) * 100.0f));
                                                    okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10.label = 1;
                                                    return this.$contentLength$inlined.emit(integer0, okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
                                                }
                                                case 1: {
                                                    f0.n(object1);
                                                    return S0.a;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    };
                                    Object object0 = v.collect(okHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$20, d0);
                                    return object0 == b.l() ? object0 : S0.a;
                                }
                            }, new o(null) {
                                final HttpRequest $request;
                                int I$0;
                                int label;

                                {
                                    this.$request = httpRequest0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.downloadProgressLoggingJob.3(this.$request, d0);
                                    d1.I$0 = ((Number)object0).intValue();
                                    return d1;
                                }

                                @m
                                public final Object invoke(int v, @m d d0) {
                                    return ((com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.downloadProgressLoggingJob.3)this.create(v, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((Number)object0).intValue(), ((d)object1));
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    if(this.label != 0) {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                    f0.n(object0);
                                    DeviceLog.debug(("Downloaded " + this.I$0 + "% of " + this.$request.getBaseURL()));
                                    return S0.a;
                                }
                            });
                            i00 = i1 == null ? null : k.U0(i1, P.a(file0.dispatchers.getIo()));
                        }
                    }
                    n n0 = responseBody0.source();
                    if(m0 == null) {
                        l1 = l0;
                    }
                    else {
                        l1 = m0.D();
                        if(l1 == null) {
                            l1 = l0;
                        }
                    }
                    for(Object object2: kotlin.sequences.p.Z2(kotlin.sequences.p.l(new a(l1) {
                        final okio.l $buffer;
                        final n $source;

                        {
                            this.$source = n0;
                            this.$buffer = l0;
                            super(0);
                        }

                        @m
                        public final Long invoke() {
                            return this.$source.read(this.$buffer, 0x2000L);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.invoke();
                        }
                    }), com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2.INSTANCE)) {
                        v1 += ((Number)object2).longValue();
                        if(m0 != null) {
                            m0.n2();
                        }
                        if(e0 != null) {
                            e0.d(v1);
                        }
                    }
                    if(m0 != null) {
                        m0.close();
                    }
                    if(i00 != null) {
                        kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                    }
                    n0.close();
                    responseBody0.close();
                    File file1 = m0 == null ? new byte[0] : httpRequest0;
                    Object object3 = e0.b(new RequestComplete(response0, file1));
                    this.resumeWith(object3);
                    return;
                }
                catch(IOException iOException0) {
                }
                Object object4 = e0.b(f0.a(iOException0));
                this.resumeWith(object4);

                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
                public final class com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1 implements kotlinx.coroutines.flow.i {
                    public com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1(kotlinx.coroutines.flow.i i0) {
                    }

                    @Override  // kotlinx.coroutines.flow.i
                    @m
                    public Object collect(@l j j0, @l d d0) {
                        com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1.2 okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$20 = new j() {
                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public final Object emit(Object object0, @l d d0) {
                                com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1.2.1 okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10;
                                if(d0 instanceof com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1.2.1) {
                                    okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10 = (com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse..inlined.filter.1.2.1)d0;
                                    int v = okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10.label;
                                    if((v & 0x80000000) == 0) {
                                        okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                            Object L$0;
                                            Object L$1;
                                            int label;
                                            Object result;

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                this.result = object0;
                                                this.label |= 0x80000000;
                                                return d0.emit(null, this);
                                            }
                                        };
                                    }
                                    else {
                                        okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                        Object L$0;
                                        Object L$1;
                                        int label;
                                        Object result;

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            this.result = object0;
                                            this.label |= 0x80000000;
                                            return d0.emit(null, this);
                                        }
                                    };
                                }
                                Object object1 = okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10.result;
                                Object object2 = b.l();
                                switch(okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10.label) {
                                    case 0: {
                                        f0.n(object1);
                                        j j0 = this.$this_unsafeFlow;
                                        if(((Number)object0).longValue() != 0L) {
                                            okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10.label = 1;
                                            if(j0.emit(object0, okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$10) == object2) {
                                                return object2;
                                            }
                                        }
                                        return S0.a;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        };
                        Object object0 = this.$this_unsafeTransform$inlined.collect(okHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$20, d0);
                        return object0 == b.l() ? object0 : S0.a;
                    }
                }


                final class com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2 extends N implements Function1 {
                    public static final com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2 INSTANCE;

                    static {
                        com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2.INSTANCE = new com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2();
                    }

                    com.unity3d.services.core.network.core.OkHttp3Client.makeRequest.2.1.onResponse.2() {
                        super(1);
                    }

                    @l
                    public final Boolean invoke(long v) {
                        return v == -1L ? false : true;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((Number)object0).longValue());
                    }
                }

            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

