package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public abstract class EventListener {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public interface Factory {
        @l
        EventListener create(@l Call arg1);
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final EventListener NONE;

    static {
        EventListener.Companion = new Companion(null);
        EventListener.NONE = new EventListener.Companion.NONE.1();
    }

    public void cacheConditionalHit(@l Call call0, @l Response response0) {
        L.p(call0, "call");
        L.p(response0, "cachedResponse");
    }

    public void cacheHit(@l Call call0, @l Response response0) {
        L.p(call0, "call");
        L.p(response0, "response");
    }

    public void cacheMiss(@l Call call0) {
        L.p(call0, "call");
    }

    public void callEnd(@l Call call0) {
        L.p(call0, "call");
    }

    public void callFailed(@l Call call0, @l IOException iOException0) {
        L.p(call0, "call");
        L.p(iOException0, "ioe");
    }

    public void callStart(@l Call call0) {
        L.p(call0, "call");
    }

    public void canceled(@l Call call0) {
        L.p(call0, "call");
    }

    public void connectEnd(@l Call call0, @l InetSocketAddress inetSocketAddress0, @l Proxy proxy0, @m Protocol protocol0) {
        L.p(call0, "call");
        L.p(inetSocketAddress0, "inetSocketAddress");
        L.p(proxy0, "proxy");
    }

    public void connectFailed(@l Call call0, @l InetSocketAddress inetSocketAddress0, @l Proxy proxy0, @m Protocol protocol0, @l IOException iOException0) {
        L.p(call0, "call");
        L.p(inetSocketAddress0, "inetSocketAddress");
        L.p(proxy0, "proxy");
        L.p(iOException0, "ioe");
    }

    public void connectStart(@l Call call0, @l InetSocketAddress inetSocketAddress0, @l Proxy proxy0) {
        L.p(call0, "call");
        L.p(inetSocketAddress0, "inetSocketAddress");
        L.p(proxy0, "proxy");
    }

    public void connectionAcquired(@l Call call0, @l Connection connection0) {
        L.p(call0, "call");
        L.p(connection0, "connection");
    }

    public void connectionReleased(@l Call call0, @l Connection connection0) {
        L.p(call0, "call");
        L.p(connection0, "connection");
    }

    public void dnsEnd(@l Call call0, @l String s, @l List list0) {
        L.p(call0, "call");
        L.p(s, "domainName");
        L.p(list0, "inetAddressList");
    }

    public void dnsStart(@l Call call0, @l String s) {
        L.p(call0, "call");
        L.p(s, "domainName");
    }

    public void proxySelectEnd(@l Call call0, @l HttpUrl httpUrl0, @l List list0) {
        L.p(call0, "call");
        L.p(httpUrl0, "url");
        L.p(list0, "proxies");
    }

    public void proxySelectStart(@l Call call0, @l HttpUrl httpUrl0) {
        L.p(call0, "call");
        L.p(httpUrl0, "url");
    }

    public void requestBodyEnd(@l Call call0, long v) {
        L.p(call0, "call");
    }

    public void requestBodyStart(@l Call call0) {
        L.p(call0, "call");
    }

    public void requestFailed(@l Call call0, @l IOException iOException0) {
        L.p(call0, "call");
        L.p(iOException0, "ioe");
    }

    public void requestHeadersEnd(@l Call call0, @l Request request0) {
        L.p(call0, "call");
        L.p(request0, "request");
    }

    public void requestHeadersStart(@l Call call0) {
        L.p(call0, "call");
    }

    public void responseBodyEnd(@l Call call0, long v) {
        L.p(call0, "call");
    }

    public void responseBodyStart(@l Call call0) {
        L.p(call0, "call");
    }

    public void responseFailed(@l Call call0, @l IOException iOException0) {
        L.p(call0, "call");
        L.p(iOException0, "ioe");
    }

    public void responseHeadersEnd(@l Call call0, @l Response response0) {
        L.p(call0, "call");
        L.p(response0, "response");
    }

    public void responseHeadersStart(@l Call call0) {
        L.p(call0, "call");
    }

    public void satisfactionFailure(@l Call call0, @l Response response0) {
        L.p(call0, "call");
        L.p(response0, "response");
    }

    public void secureConnectEnd(@l Call call0, @m Handshake handshake0) {
        L.p(call0, "call");
    }

    public void secureConnectStart(@l Call call0) {
        L.p(call0, "call");
    }
}

