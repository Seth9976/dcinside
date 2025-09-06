package okhttp3.internal.connection;

import A3.a;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection.Listener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket.Streams;
import okio.Z;
import okio.n;
import okio.q0;
import y4.l;
import y4.m;

@s0({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class RealConnection extends Listener implements Connection {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final RealConnection newTestConnection(@l RealConnectionPool realConnectionPool0, @l Route route0, @l Socket socket0, long v) {
            L.p(realConnectionPool0, "connectionPool");
            L.p(route0, "route");
            L.p(socket0, "socket");
            RealConnection realConnection0 = new RealConnection(realConnectionPool0, route0);
            realConnection0.socket = socket0;
            realConnection0.setIdleAtNs$okhttp(v);
            return realConnection0;
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Proxy.Type.values().length];
            try {
                arr_v[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Proxy.Type.HTTP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    public static final Companion Companion = null;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    @l
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    @l
    private final List calls;
    @l
    private final RealConnectionPool connectionPool;
    @m
    private Handshake handshake;
    @m
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    @m
    private Protocol protocol;
    @m
    private Socket rawSocket;
    private int refusedStreamCount;
    @l
    private final Route route;
    private int routeFailureCount;
    @m
    private okio.m sink;
    @m
    private Socket socket;
    @m
    private n source;
    private int successCount;

    static {
        RealConnection.Companion = new Companion(null);
    }

    public RealConnection(@l RealConnectionPool realConnectionPool0, @l Route route0) {
        L.p(realConnectionPool0, "connectionPool");
        L.p(route0, "route");
        super();
        this.connectionPool = realConnectionPool0;
        this.route = route0;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = 0x7FFFFFFFFFFFFFFFL;
    }

    public final void cancel() {
        Socket socket0 = this.rawSocket;
        if(socket0 != null) {
            Util.closeQuietly(socket0);
        }
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl0, Handshake handshake0) {
        List list0 = handshake0.peerCertificates();
        if(!list0.isEmpty()) {
            Object object0 = list0.get(0);
            L.n(object0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return OkHostnameVerifier.INSTANCE.verify(httpUrl0.host(), ((X509Certificate)object0));
        }
        return false;
    }

    public final void connect(int v, int v1, int v2, int v3, boolean z, @l Call call0, @l EventListener eventListener0) {
        L.p(call0, "call");
        L.p(eventListener0, "eventListener");
        if(this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        List list0 = this.route.address().connectionSpecs();
        ConnectionSpecSelector connectionSpecSelector0 = new ConnectionSpecSelector(list0);
        if(this.route.address().sslSocketFactory() == null) {
            if(!list0.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String s = this.route.address().url().host();
            if(!Platform.Companion.get().isCleartextTrafficPermitted(s)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + s + " not permitted by network security policy"));
            }
        }
        else if(this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException0 = null;
        while(true) {
            try {
                if(this.route.requiresTunnel()) {
                    this.connectTunnel(v, v1, v2, call0, eventListener0);
                    if(this.rawSocket != null) {
                        this.establishProtocol(connectionSpecSelector0, v3, call0, eventListener0);
                        eventListener0.connectEnd(call0, this.route.socketAddress(), this.route.proxy(), this.protocol);
                        break;
                    }
                    break;
                }
                else {
                    this.connectSocket(v, v1, call0, eventListener0);
                }
                this.establishProtocol(connectionSpecSelector0, v3, call0, eventListener0);
                eventListener0.connectEnd(call0, this.route.socketAddress(), this.route.proxy(), this.protocol);
                break;
            }
            catch(IOException iOException0) {
                Socket socket0 = this.socket;
                if(socket0 != null) {
                    Util.closeQuietly(socket0);
                }
                Socket socket1 = this.rawSocket;
                if(socket1 != null) {
                    Util.closeQuietly(socket1);
                }
                this.socket = null;
                this.rawSocket = null;
                this.source = null;
                this.sink = null;
                this.handshake = null;
                this.protocol = null;
                this.http2Connection = null;
                this.allocationLimit = 1;
                eventListener0.connectFailed(call0, this.route.socketAddress(), this.route.proxy(), null, iOException0);
                if(routeException0 == null) {
                    routeException0 = new RouteException(iOException0);
                }
                else {
                    routeException0.addConnectException(iOException0);
                }
                if(!z || !connectionSpecSelector0.connectionFailed(iOException0)) {
                    throw routeException0;
                }
            }
        }
        if(this.route.requiresTunnel() && this.rawSocket == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void connectFailed$okhttp(@l OkHttpClient okHttpClient0, @l Route route0, @l IOException iOException0) {
        L.p(okHttpClient0, "client");
        L.p(route0, "failedRoute");
        L.p(iOException0, "failure");
        if(route0.proxy().type() != Proxy.Type.DIRECT) {
            Address address0 = route0.address();
            address0.proxySelector().connectFailed(address0.url().uri(), route0.proxy().address(), iOException0);
        }
        okHttpClient0.getRouteDatabase().failed(route0);
    }

    private final void connectSocket(int v, int v1, Call call0, EventListener eventListener0) throws IOException {
        Socket socket0;
        Proxy proxy0 = this.route.proxy();
        Address address0 = this.route.address();
        Proxy.Type proxy$Type0 = proxy0.type();
        int v2 = proxy$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[proxy$Type0.ordinal()];
        if(v2 == 1 || v2 == 2) {
            socket0 = address0.socketFactory().createSocket();
            L.m(socket0);
        }
        else {
            socket0 = new Socket(proxy0);
        }
        this.rawSocket = socket0;
        eventListener0.connectStart(call0, this.route.socketAddress(), proxy0);
        socket0.setSoTimeout(v1);
        try {
            Platform.Companion.get().connectSocket(socket0, this.route.socketAddress(), v);
        }
        catch(ConnectException connectException0) {
            ConnectException connectException1 = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException1.initCause(connectException0);
            throw connectException1;
        }
        try {
            this.source = Z.e(Z.v(socket0));
            this.sink = Z.d(Z.q(socket0));
        }
        catch(NullPointerException nullPointerException0) {
            if(L.g(nullPointerException0.getMessage(), "throw with null exception")) {
                throw new IOException(nullPointerException0);
            }
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector0) throws IOException {
        SSLSocket sSLSocket1;
        Address address0 = this.route.address();
        SSLSocketFactory sSLSocketFactory0 = address0.sslSocketFactory();
        SSLSocket sSLSocket0 = null;
        try {
            L.m(sSLSocketFactory0);
            Socket socket0 = sSLSocketFactory0.createSocket(this.rawSocket, address0.url().host(), address0.url().port(), true);
            L.n(socket0, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket1 = (SSLSocket)socket0;
        }
        catch(Throwable throwable0) {
            goto label_39;
        }
        try {
            ConnectionSpec connectionSpec0 = connectionSpecSelector0.configureSecureSocket(sSLSocket1);
            if(connectionSpec0.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket1, address0.url().host(), address0.protocols());
            }
            sSLSocket1.startHandshake();
            SSLSession sSLSession0 = sSLSocket1.getSession();
            L.o(sSLSession0, "sslSocketSession");
            Handshake handshake0 = Handshake.Companion.get(sSLSession0);
            HostnameVerifier hostnameVerifier0 = address0.hostnameVerifier();
            L.m(hostnameVerifier0);
            if(!hostnameVerifier0.verify(address0.url().host(), sSLSession0)) {
                List list0 = handshake0.peerCertificates();
                if(list0.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address0.url().host() + " not verified (no certificates)");
                }
                Object object0 = list0.get(0);
                L.n(object0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                throw new SSLPeerUnverifiedException(v.r(("\n              |Hostname " + address0.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(((X509Certificate)object0)) + "\n              |    DN: " + ((X509Certificate)object0).getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(((X509Certificate)object0)) + "\n              "), null, 1, null));
            }
            CertificatePinner certificatePinner0 = address0.certificatePinner();
            L.m(certificatePinner0);
            this.handshake = new Handshake(handshake0.tlsVersion(), handshake0.cipherSuite(), handshake0.localCertificates(), new a(handshake0, address0) {
                final Address $address;
                final CertificatePinner $certificatePinner;
                final Handshake $unverifiedHandshake;

                {
                    this.$certificatePinner = certificatePinner0;
                    this.$unverifiedHandshake = handshake0;
                    this.$address = address0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.invoke();
                }

                @l
                public final List invoke() {
                    CertificateChainCleaner certificateChainCleaner0 = this.$certificatePinner.getCertificateChainCleaner$okhttp();
                    L.m(certificateChainCleaner0);
                    return certificateChainCleaner0.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
                }
            });
            certificatePinner0.check$okhttp(address0.url().host(), new a() {
                {
                    RealConnection.this = realConnection0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.invoke();
                }

                @l
                public final List invoke() {
                    Handshake handshake0 = RealConnection.this.handshake;
                    L.m(handshake0);
                    Iterable iterable0 = handshake0.peerCertificates();
                    List list0 = new ArrayList(u.b0(iterable0, 10));
                    for(Object object0: iterable0) {
                        L.n(((Certificate)object0), "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        list0.add(((X509Certificate)(((Certificate)object0))));
                    }
                    return list0;
                }
            });
            if(connectionSpec0.supportsTlsExtensions()) {
                sSLSocket0 = Platform.Companion.get().getSelectedProtocol(sSLSocket1);
            }
            this.socket = sSLSocket1;
            this.source = Z.e(Z.v(sSLSocket1));
            this.sink = Z.d(Z.q(sSLSocket1));
            this.protocol = sSLSocket0 == null ? Protocol.HTTP_1_1 : Protocol.Companion.get(((String)sSLSocket0));
            goto label_44;
        }
        catch(Throwable throwable0) {
            sSLSocket0 = sSLSocket1;
        }
    label_39:
        if(sSLSocket0 != null) {
            Platform.Companion.get().afterHandshake(sSLSocket0);
        }
        if(sSLSocket0 != null) {
            Util.closeQuietly(sSLSocket0);
        }
        throw throwable0;
    label_44:
        Platform.Companion.get().afterHandshake(sSLSocket1);
    }

    private final void connectTunnel(int v, int v1, int v2, Call call0, EventListener eventListener0) throws IOException {
        Request request0 = this.createTunnelRequest();
        HttpUrl httpUrl0 = request0.url();
        for(int v3 = 0; v3 < 21; ++v3) {
            this.connectSocket(v, v1, call0, eventListener0);
            request0 = this.createTunnel(v1, v2, request0, httpUrl0);
            if(request0 == null) {
                break;
            }
            Socket socket0 = this.rawSocket;
            if(socket0 != null) {
                Util.closeQuietly(socket0);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener0.connectEnd(call0, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int v, int v1, Request request0, HttpUrl httpUrl0) throws IOException {
        Request request1;
        String s = "CONNECT " + Util.toHostHeader(httpUrl0, true) + " HTTP/1.1";
    alab1:
        while(true) {
            n n0 = this.source;
            L.m(n0);
            okio.m m0 = this.sink;
            L.m(m0);
            Http1ExchangeCodec http1ExchangeCodec0 = new Http1ExchangeCodec(null, this, n0, m0);
            q0 q00 = n0.timeout();
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            q00.timeout(((long)v), timeUnit0);
            m0.timeout().timeout(((long)v1), timeUnit0);
            http1ExchangeCodec0.writeRequest(request0.headers(), s);
            http1ExchangeCodec0.finishRequest();
            Builder response$Builder0 = http1ExchangeCodec0.readResponseHeaders(false);
            L.m(response$Builder0);
            Response response0 = response$Builder0.request(request0).build();
            http1ExchangeCodec0.skipConnectBody(response0);
            switch(response0.code()) {
                case 200: {
                    if(!n0.E().j3() || !m0.E().j3()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    return null;
                }
                case 407: {
                    request1 = this.route.address().proxyAuthenticator().authenticate(this.route, response0);
                    if(request1 == null) {
                        break alab1;
                    }
                    if(v.O1("close", Response.header$default(response0, "Connection", null, 2, null), true)) {
                        return request1;
                    }
                    break;
                }
                default: {
                    throw new IOException("Unexpected response code for CONNECT: " + response0.code());
                }
            }
            request0 = request1;
        }
        throw new IOException("Failed to authenticate with proxy");
    }

    private final Request createTunnelRequest() throws IOException {
        Request request0 = new okhttp3.Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", "okhttp/4.12.0").build();
        Response response0 = new Builder().request(request0).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build();
        Request request1 = this.route.address().proxyAuthenticator().authenticate(this.route, response0);
        return request1 == null ? request0 : request1;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector0, int v, Call call0, EventListener eventListener0) throws IOException {
        if(this.route.address().sslSocketFactory() == null) {
            Protocol protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
            if(this.route.address().protocols().contains(protocol0)) {
                this.socket = this.rawSocket;
                this.protocol = protocol0;
                this.startHttp2(v);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener0.secureConnectStart(call0);
        this.connectTls(connectionSpecSelector0);
        eventListener0.secureConnectEnd(call0, this.handshake);
        if(this.protocol == Protocol.HTTP_2) {
            this.startHttp2(v);
        }
    }

    @l
    public final List getCalls() {
        return this.calls;
    }

    @l
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override  // okhttp3.Connection
    @m
    public Handshake handshake() {
        return this.handshake;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized(this) {
            ++this.successCount;
        }
    }

    public final boolean isEligible$okhttp(@l Address address0, @m List list0) {
        L.p(address0, "address");
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12504 MUST hold lock on " + this);
        }
        if(this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address0)) {
            return false;
        }
        if(L.g(address0.url().host(), this.route().address().url().host())) {
            return true;
        }
        if(this.http2Connection == null) {
            return false;
        }
        if(list0 == null || !this.routeMatchesAny(list0) || address0.hostnameVerifier() != OkHostnameVerifier.INSTANCE) {
            return false;
        }
        if(!this.supportsUrl(address0.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner0 = address0.certificatePinner();
            L.m(certificatePinner0);
            Handshake handshake0 = this.handshake();
            L.m(handshake0);
            certificatePinner0.check(address0.url().host(), handshake0.peerCertificates());
            return true;
        }
        catch(SSLPeerUnverifiedException unused_ex) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z) {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12481 MUST NOT hold lock on " + this);
        }
        long v = System.nanoTime();
        Socket socket0 = this.rawSocket;
        L.m(socket0);
        Socket socket1 = this.socket;
        L.m(socket1);
        n n0 = this.source;
        L.m(n0);
        if(!socket0.isClosed() && !socket1.isClosed() && !socket1.isInputShutdown() && !socket1.isOutputShutdown()) {
            Http2Connection http2Connection0 = this.http2Connection;
            if(http2Connection0 != null) {
                return http2Connection0.isHealthy(v);
            }
            return v - this.idleAtNs < 10000000000L || !z ? true : Util.isHealthy(socket1, n0);
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    @l
    public final ExchangeCodec newCodec$okhttp(@l OkHttpClient okHttpClient0, @l RealInterceptorChain realInterceptorChain0) throws SocketException {
        L.p(okHttpClient0, "client");
        L.p(realInterceptorChain0, "chain");
        Socket socket0 = this.socket;
        L.m(socket0);
        n n0 = this.source;
        L.m(n0);
        okio.m m0 = this.sink;
        L.m(m0);
        Http2Connection http2Connection0 = this.http2Connection;
        if(http2Connection0 != null) {
            return new Http2ExchangeCodec(okHttpClient0, this, realInterceptorChain0, http2Connection0);
        }
        socket0.setSoTimeout(realInterceptorChain0.readTimeoutMillis());
        q0 q00 = n0.timeout();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        q00.timeout(((long)realInterceptorChain0.getReadTimeoutMillis$okhttp()), timeUnit0);
        m0.timeout().timeout(((long)realInterceptorChain0.getWriteTimeoutMillis$okhttp()), timeUnit0);
        return new Http1ExchangeCodec(okHttpClient0, this, n0, m0);
    }

    @l
    public final Streams newWebSocketStreams$okhttp(@l Exchange exchange0) throws SocketException {
        L.p(exchange0, "exchange");
        Socket socket0 = this.socket;
        L.m(socket0);
        n n0 = this.source;
        L.m(n0);
        okio.m m0 = this.sink;
        L.m(m0);
        socket0.setSoTimeout(0);
        this.noNewExchanges$okhttp();
        return new Streams(m0, exchange0) {
            final Exchange $exchange;

            {
                this.$exchange = exchange0;
                super(true, n0, m0);
            }

            @Override
            public void close() {
                this.$exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized(this) {
            this.noCoalescedConnections = true;
        }
    }

    public final void noNewExchanges$okhttp() {
        synchronized(this) {
            this.noNewExchanges = true;
        }
    }

    @Override  // okhttp3.internal.http2.Http2Connection$Listener
    public void onSettings(@l Http2Connection http2Connection0, @l Settings settings0) {
        synchronized(this) {
            L.p(http2Connection0, "connection");
            L.p(settings0, "settings");
            this.allocationLimit = settings0.getMaxConcurrentStreams();
        }
    }

    @Override  // okhttp3.internal.http2.Http2Connection$Listener
    public void onStream(@l Http2Stream http2Stream0) throws IOException {
        L.p(http2Stream0, "stream");
        http2Stream0.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override  // okhttp3.Connection
    @l
    public Protocol protocol() {
        Protocol protocol0 = this.protocol;
        L.m(protocol0);
        return protocol0;
    }

    @Override  // okhttp3.Connection
    @l
    public Route route() {
        return this.route;
    }

    private final boolean routeMatchesAny(List list0) {
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                Proxy.Type proxy$Type0 = ((Route)object0).proxy().type();
                Proxy.Type proxy$Type1 = Proxy.Type.DIRECT;
                if(proxy$Type0 == proxy$Type1 && this.route.proxy().type() == proxy$Type1 && L.g(this.route.socketAddress(), ((Route)object0).socketAddress())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final void setIdleAtNs$okhttp(long v) {
        this.idleAtNs = v;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int v) {
        this.routeFailureCount = v;
    }

    @Override  // okhttp3.Connection
    @l
    public Socket socket() {
        Socket socket0 = this.socket;
        L.m(socket0);
        return socket0;
    }

    private final void startHttp2(int v) throws IOException {
        Socket socket0 = this.socket;
        L.m(socket0);
        n n0 = this.source;
        L.m(n0);
        okio.m m0 = this.sink;
        L.m(m0);
        socket0.setSoTimeout(0);
        Http2Connection http2Connection0 = new okhttp3.internal.http2.Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket0, this.route.address().url().host(), n0, m0).listener(this).pingIntervalMillis(v).build();
        this.http2Connection = http2Connection0;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2Connection0, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl0) {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12483 MUST hold lock on " + this);
        }
        HttpUrl httpUrl1 = this.route.address().url();
        if(httpUrl0.port() != httpUrl1.port()) {
            return false;
        }
        if(L.g(httpUrl0.host(), httpUrl1.host())) {
            return true;
        }
        if(!this.noCoalescedConnections) {
            Handshake handshake0 = this.handshake;
            if(handshake0 != null) {
                L.m(handshake0);
                return this.certificateSupportHost(httpUrl0, handshake0);
            }
        }
        return false;
    }

    @Override
    @l
    public String toString() {
        CipherSuite cipherSuite0;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Connection{");
        stringBuilder0.append(this.route.address().url().host());
        stringBuilder0.append(':');
        stringBuilder0.append(this.route.address().url().port());
        stringBuilder0.append(", proxy=");
        stringBuilder0.append(this.route.proxy());
        stringBuilder0.append(" hostAddress=");
        stringBuilder0.append(this.route.socketAddress());
        stringBuilder0.append(" cipherSuite=");
        Handshake handshake0 = this.handshake;
        if(handshake0 == null) {
            cipherSuite0 = "none";
        }
        else {
            cipherSuite0 = handshake0.cipherSuite();
            if(cipherSuite0 == null) {
                cipherSuite0 = "none";
            }
        }
        stringBuilder0.append(cipherSuite0);
        stringBuilder0.append(" protocol=");
        stringBuilder0.append(this.protocol);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final void trackFailure$okhttp(@l RealCall realCall0, @m IOException iOException0) {
        synchronized(this) {
            L.p(realCall0, "call");
            if(!(iOException0 instanceof StreamResetException)) {
                if(!this.isMultiplexed$okhttp() || iOException0 instanceof ConnectionShutdownException) {
                    this.noNewExchanges = true;
                    if(this.successCount == 0) {
                        if(iOException0 != null) {
                            this.connectFailed$okhttp(realCall0.getClient(), this.route, iOException0);
                        }
                        ++this.routeFailureCount;
                    }
                }
            }
            else if(((StreamResetException)iOException0).errorCode == ErrorCode.REFUSED_STREAM) {
                int v1 = this.refusedStreamCount + 1;
                this.refusedStreamCount = v1;
                if(v1 > 1) {
                    this.noNewExchanges = true;
                    ++this.routeFailureCount;
                }
            }
            else if(((StreamResetException)iOException0).errorCode != ErrorCode.CANCEL || !realCall0.isCanceled()) {
                this.noNewExchanges = true;
                ++this.routeFailureCount;
            }
        }
    }
}

