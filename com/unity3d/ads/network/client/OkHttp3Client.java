package com.unity3d.ads.network.client;

import A3.o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import y4.l;
import y4.m;

@s0({"SMAP\nOkHttp3Client.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/ads/network/client/OkHttp3Client\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,65:1\n314#2,11:66\n*S KotlinDebug\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/ads/network/client/OkHttp3Client\n*L\n48#1:66,11\n*E\n"})
public final class OkHttp3Client implements HttpClient {
    @l
    private final OkHttpClient client;
    @l
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(@l ISDKDispatchers iSDKDispatchers0, @l OkHttpClient okHttpClient0) {
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(okHttpClient0, "client");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.client = okHttpClient0;
    }

    @Override  // com.unity3d.ads.network.HttpClient
    @m
    public Object execute(@l HttpRequest httpRequest0, @l d d0) {
        return i.h(this.dispatchers.getIo(), new o(this, null) {
            final HttpRequest $request;
            int label;

            {
                this.$request = httpRequest0;
                OkHttp3Client.this = okHttp3Client0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.network.client.OkHttp3Client.execute.2(this.$request, OkHttp3Client.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.network.client.OkHttp3Client.execute.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        Request request0 = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                        this.label = 1;
                        object0 = OkHttp3Client.this.makeRequest(request0, ((long)this.$request.getConnectTimeout()), ((long)this.$request.getReadTimeout()), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                int v = ((Response)object0).code();
                Map map0 = ((Response)object0).headers().toMultimap();
                String s = ((Response)object0).request().url().toString();
                ResponseBody responseBody0 = ((Response)object0).body();
                String s1 = responseBody0 == null ? null : responseBody0.string();
                if(s1 == null) {
                    s1 = "";
                }
                L.o(map0, "toMultimap()");
                L.o(s, "toString()");
                return new HttpResponse(s1, v, map0, s);
            }
        }, d0);
    }

    private final Object makeRequest(Request request0, long v, long v1, d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        Builder okHttpClient$Builder0 = this.client.newBuilder();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        FirebasePerfOkHttpClient.enqueue(okHttpClient$Builder0.connectTimeout(v, timeUnit0).readTimeout(v1, timeUnit0).build().newCall(request0), new Callback() {
            @Override  // okhttp3.Callback
            public void onFailure(@l Call call0, @l IOException iOException0) {
                L.p(call0, "call");
                L.p(iOException0, "e");
                Object object0 = e0.b(f0.a(iOException0));
                this.$continuation.resumeWith(object0);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@l Call call0, @l Response response0) {
                L.p(call0, "call");
                L.p(response0, "response");
                this.$continuation.resumeWith(response0);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

