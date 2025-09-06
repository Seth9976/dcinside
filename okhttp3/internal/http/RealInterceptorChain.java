package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import y4.l;
import y4.m;

@s0({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class RealInterceptorChain implements Chain {
    @l
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    @m
    private final Exchange exchange;
    private final int index;
    @l
    private final List interceptors;
    private final int readTimeoutMillis;
    @l
    private final Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(@l RealCall realCall0, @l List list0, int v, @m Exchange exchange0, @l Request request0, int v1, int v2, int v3) {
        L.p(realCall0, "call");
        L.p(list0, "interceptors");
        L.p(request0, "request");
        super();
        this.call = realCall0;
        this.interceptors = list0;
        this.index = v;
        this.exchange = exchange0;
        this.request = request0;
        this.connectTimeoutMillis = v1;
        this.readTimeoutMillis = v2;
        this.writeTimeoutMillis = v3;
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Call call() {
        return this.call;
    }

    @Override  // okhttp3.Interceptor$Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override  // okhttp3.Interceptor$Chain
    @m
    public Connection connection() {
        Exchange exchange0 = this.exchange;
        return exchange0 != null ? exchange0.getConnection$okhttp() : null;
    }

    @l
    public final RealInterceptorChain copy$okhttp(int v, @m Exchange exchange0, @l Request request0, int v1, int v2, int v3) {
        L.p(request0, "request");
        return new RealInterceptorChain(this.call, this.interceptors, v, exchange0, request0, v1, v2, v3);
    }

    public static RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain0, int v, Exchange exchange0, Request request0, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = realInterceptorChain0.index;
        }
        if((v4 & 2) != 0) {
            exchange0 = realInterceptorChain0.exchange;
        }
        if((v4 & 4) != 0) {
            request0 = realInterceptorChain0.request;
        }
        if((v4 & 8) != 0) {
            v1 = realInterceptorChain0.connectTimeoutMillis;
        }
        if((v4 & 16) != 0) {
            v2 = realInterceptorChain0.readTimeoutMillis;
        }
        if((v4 & 0x20) != 0) {
            v3 = realInterceptorChain0.writeTimeoutMillis;
        }
        return realInterceptorChain0.copy$okhttp(v, exchange0, request0, v1, v2, v3);
    }

    @l
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @m
    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    @l
    public final Request getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Response proceed(@l Request request0) throws IOException {
        L.p(request0, "request");
        if(this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        ++this.calls;
        Exchange exchange0 = this.exchange;
        if(exchange0 != null) {
            if(!exchange0.getFinder$okhttp().sameHostAndPort(request0.url())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if(this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChain0 = RealInterceptorChain.copy$okhttp$default(this, this.index + 1, null, request0, 0, 0, 0, 58, null);
        Interceptor interceptor0 = (Interceptor)this.interceptors.get(this.index);
        Response response0 = interceptor0.intercept(realInterceptorChain0);
        if(response0 == null) {
            throw new NullPointerException("interceptor " + interceptor0 + " returned null");
        }
        if(this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChain0.calls != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor0 + " must call proceed() exactly once").toString());
        }
        if(response0.body() == null) {
            throw new IllegalStateException(("interceptor " + interceptor0 + " returned a response with no body").toString());
        }
        return response0;
    }

    @Override  // okhttp3.Interceptor$Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Request request() {
        return this.request;
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Chain withConnectTimeout(int v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        if(this.exchange != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", ((long)v), timeUnit0), 0, 0, 55, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Chain withReadTimeout(int v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        if(this.exchange != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", ((long)v), timeUnit0), 0, 0x2F, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    @l
    public Chain withWriteTimeout(int v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        if(this.exchange != null) {
            throw new IllegalStateException("Timeouts can\'t be adjusted in a network interceptor");
        }
        return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", ((long)v), timeUnit0), 0x1F, null);
    }

    @Override  // okhttp3.Interceptor$Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}

