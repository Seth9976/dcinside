package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Z;
import okio.m0;
import okio.o0;
import okio.q0;
import y4.l;
import y4.m;

public final class CacheInterceptor implements Interceptor {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final Headers combine(Headers headers0, Headers headers1) {
            Builder headers$Builder0 = new Builder();
            int v = headers0.size();
            for(int v2 = 0; v2 < v; ++v2) {
                String s = headers0.name(v2);
                String s1 = headers0.value(v2);
                if((!v.O1("Warning", s, true) || !v.v2(s1, "1", false, 2, null)) && (this.isContentSpecificHeader(s) || !this.isEndToEnd(s) || headers1.get(s) == null)) {
                    headers$Builder0.addLenient$okhttp(s, s1);
                }
            }
            int v3 = headers1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                String s2 = headers1.name(v1);
                if(!this.isContentSpecificHeader(s2) && this.isEndToEnd(s2)) {
                    headers$Builder0.addLenient$okhttp(s2, headers1.value(v1));
                }
            }
            return headers$Builder0.build();
        }

        // 去混淆评级： 低(30)
        private final boolean isContentSpecificHeader(String s) {
            return v.O1("Content-Length", s, true) || v.O1("Content-Encoding", s, true) || v.O1("Content-Type", s, true);
        }

        // 去混淆评级： 中等(80)
        private final boolean isEndToEnd(String s) {
            return !v.O1("Connection", s, true) && !v.O1("Keep-Alive", s, true) && !v.O1("Proxy-Authenticate", s, true) && !v.O1("Proxy-Authorization", s, true) && !v.O1("TE", s, true) && !v.O1("Trailers", s, true) && !v.O1("Transfer-Encoding", s, true) && !v.O1("Upgrade", s, true);
        }

        private final Response stripBody(Response response0) {
            return (response0 == null ? null : response0.body()) == null ? response0 : response0.newBuilder().body(null).build();
        }
    }

    @l
    public static final Companion Companion;
    @m
    private final Cache cache;

    static {
        CacheInterceptor.Companion = new Companion(null);
    }

    public CacheInterceptor(@m Cache cache0) {
        this.cache = cache0;
    }

    private final Response cacheWritingResponse(CacheRequest cacheRequest0, Response response0) throws IOException {
        if(cacheRequest0 == null) {
            return response0;
        }
        m0 m00 = cacheRequest0.body();
        ResponseBody responseBody0 = response0.body();
        L.m(responseBody0);
        okhttp3.internal.cache.CacheInterceptor.cacheWritingResponse.cacheWritingSource.1 cacheInterceptor$cacheWritingResponse$cacheWritingSource$10 = new o0() {
            private boolean cacheRequestClosed;

            @Override  // okio.o0
            public void close() throws IOException {
                if(!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    Z.d(m00).abort();
                }
                cacheRequest0.close();
            }

            @Override  // okio.o0
            public long read(@l okio.l l0, long v) throws IOException {
                long v1;
                L.p(l0, "sink");
                try {
                    v1 = cacheRequest0.read(l0, v);
                }
                catch(IOException iOException0) {
                    if(!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        Z.d(m00).abort();
                    }
                    throw iOException0;
                }
                if(v1 == -1L) {
                    if(!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        this.$cacheBody.close();
                    }
                    return -1L;
                }
                l0.q(this.$cacheBody.E(), l0.size() - v1, v1);
                this.$cacheBody.n2();
                return v1;
            }

            @Override  // okio.o0
            @l
            public q0 timeout() {
                return cacheRequest0.timeout();
            }
        };
        String s = Response.header$default(response0, "Content-Type", null, 2, null);
        long v = response0.body().contentLength();
        return response0.newBuilder().body(new RealResponseBody(s, v, Z.e(cacheInterceptor$cacheWritingResponse$cacheWritingSource$10))).build();
    }

    @m
    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        Response response4;
        EventListener eventListener0;
        L.p(interceptor$Chain0, "chain");
        Call call0 = interceptor$Chain0.call();
        RealCall realCall0 = null;
        Response response0 = this.cache == null ? null : this.cache.get$okhttp(interceptor$Chain0.request());
        CacheStrategy cacheStrategy0 = new Factory(System.currentTimeMillis(), interceptor$Chain0.request(), response0).compute();
        Request request0 = cacheStrategy0.getNetworkRequest();
        Response response1 = cacheStrategy0.getCacheResponse();
        Cache cache0 = this.cache;
        if(cache0 != null) {
            cache0.trackResponse$okhttp(cacheStrategy0);
        }
        if(call0 instanceof RealCall) {
            realCall0 = (RealCall)call0;
        }
        if(realCall0 == null) {
            eventListener0 = EventListener.NONE;
        }
        else {
            eventListener0 = realCall0.getEventListener$okhttp();
            if(eventListener0 == null) {
                eventListener0 = EventListener.NONE;
            }
        }
        if(response0 != null && response1 == null) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                Util.closeQuietly(responseBody0);
            }
        }
        if(request0 == null && response1 == null) {
            Response response2 = new okhttp3.Response.Builder().request(interceptor$Chain0.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener0.satisfactionFailure(call0, response2);
            return response2;
        }
        if(request0 == null) {
            L.m(response1);
            Response response3 = response1.newBuilder().cacheResponse(CacheInterceptor.Companion.stripBody(response1)).build();
            eventListener0.cacheHit(call0, response3);
            return response3;
        }
        if(response1 != null) {
            eventListener0.cacheConditionalHit(call0, response1);
        }
        else if(this.cache != null) {
            eventListener0.cacheMiss(call0);
        }
        try {
            response4 = interceptor$Chain0.proceed(request0);
        }
        catch(Throwable throwable0) {
            if(response0 != null) {
                ResponseBody responseBody1 = response0.body();
                if(responseBody1 != null) {
                    Util.closeQuietly(responseBody1);
                }
            }
            throw throwable0;
        }
        if(response4 == null && response0 != null) {
            ResponseBody responseBody2 = response0.body();
            if(responseBody2 != null) {
                Util.closeQuietly(responseBody2);
            }
        }
        if(response1 != null) {
            if(response4 != null && response4.code() == 304) {
                Response response5 = response1.newBuilder().headers(CacheInterceptor.Companion.combine(response1.headers(), response4.headers())).sentRequestAtMillis(response4.sentRequestAtMillis()).receivedResponseAtMillis(response4.receivedResponseAtMillis()).cacheResponse(CacheInterceptor.Companion.stripBody(response1)).networkResponse(CacheInterceptor.Companion.stripBody(response4)).build();
                ResponseBody responseBody3 = response4.body();
                L.m(responseBody3);
                responseBody3.close();
                L.m(this.cache);
                this.cache.trackConditionalCacheHit$okhttp();
                this.cache.update$okhttp(response1, response5);
                eventListener0.cacheHit(call0, response5);
                return response5;
            }
            ResponseBody responseBody4 = response1.body();
            if(responseBody4 != null) {
                Util.closeQuietly(responseBody4);
            }
        }
        L.m(response4);
        Response response6 = response4.newBuilder().cacheResponse(CacheInterceptor.Companion.stripBody(response1)).networkResponse(CacheInterceptor.Companion.stripBody(response4)).build();
        if(this.cache != null) {
            if(HttpHeaders.promisesBody(response6) && CacheStrategy.Companion.isCacheable(response6, request0)) {
                Response response7 = this.cacheWritingResponse(this.cache.put$okhttp(response6), response6);
                if(response1 != null) {
                    eventListener0.cacheMiss(call0);
                }
                return response7;
            }
            if(HttpMethod.INSTANCE.invalidatesCache(request0.method())) {
                try {
                    this.cache.remove$okhttp(request0);
                }
                catch(IOException unused_ex) {
                }
            }
        }
        return response6;
    }
}

