package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import y4.l;

public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    private static final int MAX_FOLLOW_UPS = 20;
    @l
    private final OkHttpClient client;

    static {
        RetryAndFollowUpInterceptor.Companion = new Companion(null);
    }

    public RetryAndFollowUpInterceptor(@l OkHttpClient okHttpClient0) {
        L.p(okHttpClient0, "client");
        super();
        this.client = okHttpClient0;
    }

    private final Request buildRedirectRequest(Response response0, String s) {
        RequestBody requestBody0 = null;
        if(!this.client.followRedirects()) {
            return null;
        }
        String s1 = Response.header$default(response0, "Location", null, 2, null);
        if(s1 == null) {
            return null;
        }
        HttpUrl httpUrl0 = response0.request().url().resolve(s1);
        if(httpUrl0 == null) {
            return null;
        }
        if(!L.g(httpUrl0.scheme(), response0.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Builder request$Builder0 = response0.request().newBuilder();
        if(HttpMethod.permitsRequestBody(s)) {
            int v = response0.code();
            boolean z = HttpMethod.INSTANCE.redirectsWithBody(s) || (v == 307 || v == 308);
            if(!HttpMethod.INSTANCE.redirectsToGet(s) || (v == 307 || v == 308)) {
                if(z) {
                    requestBody0 = response0.request().body();
                }
                request$Builder0.method(s, requestBody0);
            }
            else {
                request$Builder0.method("GET", null);
            }
            if(!z) {
                request$Builder0.removeHeader("Transfer-Encoding");
                request$Builder0.removeHeader("Content-Length");
                request$Builder0.removeHeader("Content-Type");
            }
        }
        if(!Util.canReuseConnectionFor(response0.request().url(), httpUrl0)) {
            request$Builder0.removeHeader("Authorization");
        }
        return request$Builder0.url(httpUrl0).build();
    }

    private final Request followUpRequest(Response response0, Exchange exchange0) throws IOException {
        Route route0;
        if(exchange0 == null) {
            route0 = null;
        }
        else {
            RealConnection realConnection0 = exchange0.getConnection$okhttp();
            route0 = realConnection0 == null ? null : realConnection0.route();
        }
        int v = response0.code();
        String s = response0.request().method();
        switch(v) {
            case 307: 
            case 308: {
                return this.buildRedirectRequest(response0, s);
            }
            case 401: {
                return this.client.authenticator().authenticate(route0, response0);
            }
            case 407: {
                L.m(route0);
                if(route0.proxy().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route0, response0);
            }
            case 408: {
                if(!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                boolean z = response0.request().body() == null;
                Response response1 = response0.priorResponse();
                if(response1 != null && response1.code() == 408) {
                    return null;
                }
                return this.retryAfter(response0, 0) <= 0 ? response0.request() : null;
            }
            case 421: {
                boolean z1 = response0.request().body() == null;
                if(exchange0 != null && exchange0.isCoalescedConnection$okhttp()) {
                    exchange0.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response0.request();
                }
                return null;
            }
            case 503: {
                Response response2 = response0.priorResponse();
                if(response2 != null && response2.code() == 503) {
                    return null;
                }
                return this.retryAfter(response0, 0x7FFFFFFF) == 0 ? response0.request() : null;
            }
            default: {
                return v == 300 || v == 301 || v == 302 || v == 303 ? this.buildRedirectRequest(response0, s) : null;
            }
        }
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        Request request1;
        Response response1;
        L.p(interceptor$Chain0, "chain");
        RealInterceptorChain realInterceptorChain0 = (RealInterceptorChain)interceptor$Chain0;
        Request request0 = realInterceptorChain0.getRequest$okhttp();
        RealCall realCall0 = realInterceptorChain0.getCall$okhttp();
        List list0 = u.H();
        Response response0 = null;
        boolean z = true;
        int v = 0;
        while(true) {
            realCall0.enterNetworkInterceptorExchange(request0, z);
            if(realCall0.isCanceled()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    response1 = realInterceptorChain0.proceed(request0);
                    goto label_24;
                }
                catch(RouteException routeException0) {
                    if(!this.recover(routeException0.getLastConnectException(), realCall0, request0, false)) {
                        throw Util.withSuppressed(routeException0.getFirstConnectException(), list0);
                    }
                    list0 = u.E4(list0, routeException0.getFirstConnectException());
                }
                catch(IOException iOException0) {
                    if(!this.recover(iOException0, realCall0, request0, !(iOException0 instanceof ConnectionShutdownException))) {
                        throw Util.withSuppressed(iOException0, list0);
                    }
                    list0 = u.E4(list0, iOException0);
                }
            }
            catch(Throwable throwable0) {
                break;
            }
            realCall0.exitNetworkInterceptorExchange$okhttp(true);
            z = false;
            continue;
        label_24:
            if(response0 != null) {
                try {
                    response1 = response1.newBuilder().priorResponse(response0.newBuilder().body(null).build()).build();
                label_26:
                    response0 = response1;
                    Exchange exchange0 = realCall0.getInterceptorScopedExchange$okhttp();
                    request1 = this.followUpRequest(response0, exchange0);
                    if(request1 == null) {
                        if(exchange0 != null && exchange0.isDuplex$okhttp()) {
                            realCall0.timeoutEarlyExit();
                        }
                        goto label_32;
                    }
                    goto label_34;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            goto label_26;
        label_32:
            realCall0.exitNetworkInterceptorExchange$okhttp(false);
            return response0;
            try {
            label_34:
                boolean z1 = request1.body() == null;
                ResponseBody responseBody0 = response0.body();
                if(responseBody0 != null) {
                    Util.closeQuietly(responseBody0);
                }
            }
            catch(Throwable throwable0) {
                break;
            }
            ++v;
            if(v > 20) {
                try {
                    throw new ProtocolException("Too many follow-up requests: " + v);
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            realCall0.exitNetworkInterceptorExchange$okhttp(true);
            request0 = request1;
            z = true;
        }
        realCall0.exitNetworkInterceptorExchange$okhttp(true);
        throw throwable0;
    }

    private final boolean isRecoverable(IOException iOException0, boolean z) {
        if(iOException0 instanceof ProtocolException) {
            return false;
        }
        if(iOException0 instanceof InterruptedIOException) {
            return iOException0 instanceof SocketTimeoutException && !z;
        }
        return !(iOException0 instanceof SSLHandshakeException) || !(iOException0.getCause() instanceof CertificateException) ? !(iOException0 instanceof SSLPeerUnverifiedException) : false;
    }

    private final boolean recover(IOException iOException0, RealCall realCall0, Request request0, boolean z) {
        if(!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if(z && this.requestIsOneShot(iOException0, request0)) {
            return false;
        }
        return this.isRecoverable(iOException0, z) ? realCall0.retryAfterFailure() : false;
    }

    private final boolean requestIsOneShot(IOException iOException0, Request request0) {
        boolean z = request0.body() == null;
        return iOException0 instanceof FileNotFoundException;
    }

    private final int retryAfter(Response response0, int v) {
        String s = Response.header$default(response0, "Retry-After", null, 2, null);
        if(s == null) {
            return v;
        }
        if(new r("\\d+").k(s)) {
            Integer integer0 = Integer.valueOf(s);
            L.o(integer0, "valueOf(header)");
            return integer0.intValue();
        }
        return 0x7FFFFFFF;
    }
}

