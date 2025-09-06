package okhttp3;

import j..time.Duration;
import j..util.DesugarCollections;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform.Companion;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class OkHttpClient implements Cloneable, Factory, okhttp3.WebSocket.Factory {
    @s0({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class Builder {
        @l
        private Authenticator authenticator;
        @m
        private Cache cache;
        private int callTimeout;
        @m
        private CertificateChainCleaner certificateChainCleaner;
        @l
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        @l
        private ConnectionPool connectionPool;
        @l
        private List connectionSpecs;
        @l
        private CookieJar cookieJar;
        @l
        private Dispatcher dispatcher;
        @l
        private Dns dns;
        @l
        private okhttp3.EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        @l
        private HostnameVerifier hostnameVerifier;
        @l
        private final List interceptors;
        private long minWebSocketMessageToCompress;
        @l
        private final List networkInterceptors;
        private int pingInterval;
        @l
        private List protocols;
        @m
        private Proxy proxy;
        @l
        private Authenticator proxyAuthenticator;
        @m
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        @m
        private RouteDatabase routeDatabase;
        @l
        private SocketFactory socketFactory;
        @m
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        @m
        private X509TrustManager x509TrustManagerOrNull;

        @l
        @i(name = "-addInterceptor")
        public final Builder -addInterceptor(@l Function1 function10) {
            L.p(function10, "block");
            return this.addInterceptor(new Interceptor() {
                @Override  // okhttp3.Interceptor
                @l
                public final Response intercept(@l Chain interceptor$Chain0) {
                    L.p(interceptor$Chain0, "chain");
                    return (Response)this.$block.invoke(interceptor$Chain0);
                }
            });
        }

        @l
        @i(name = "-addNetworkInterceptor")
        public final Builder -addNetworkInterceptor(@l Function1 function10) {
            L.p(function10, "block");
            return this.addNetworkInterceptor(new Interceptor() {
                @Override  // okhttp3.Interceptor
                @l
                public final Response intercept(@l Chain interceptor$Chain0) {
                    L.p(interceptor$Chain0, "chain");
                    return (Response)this.$block.invoke(interceptor$Chain0);
                }
            });
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory0 = SocketFactory.getDefault();
            L.o(socketFactory0, "getDefault()");
            this.socketFactory = socketFactory0;
            this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 0x400L;
        }

        public Builder(@l OkHttpClient okHttpClient0) {
            L.p(okHttpClient0, "okHttpClient");
            this();
            this.dispatcher = okHttpClient0.dispatcher();
            this.connectionPool = okHttpClient0.connectionPool();
            u.q0(this.interceptors, okHttpClient0.interceptors());
            u.q0(this.networkInterceptors, okHttpClient0.networkInterceptors());
            this.eventListenerFactory = okHttpClient0.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient0.retryOnConnectionFailure();
            this.authenticator = okHttpClient0.authenticator();
            this.followRedirects = okHttpClient0.followRedirects();
            this.followSslRedirects = okHttpClient0.followSslRedirects();
            this.cookieJar = okHttpClient0.cookieJar();
            this.cache = okHttpClient0.cache();
            this.dns = okHttpClient0.dns();
            this.proxy = okHttpClient0.proxy();
            this.proxySelector = okHttpClient0.proxySelector();
            this.proxyAuthenticator = okHttpClient0.proxyAuthenticator();
            this.socketFactory = okHttpClient0.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient0.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient0.x509TrustManager();
            this.connectionSpecs = okHttpClient0.connectionSpecs();
            this.protocols = okHttpClient0.protocols();
            this.hostnameVerifier = okHttpClient0.hostnameVerifier();
            this.certificatePinner = okHttpClient0.certificatePinner();
            this.certificateChainCleaner = okHttpClient0.certificateChainCleaner();
            this.callTimeout = okHttpClient0.callTimeoutMillis();
            this.connectTimeout = okHttpClient0.connectTimeoutMillis();
            this.readTimeout = okHttpClient0.readTimeoutMillis();
            this.writeTimeout = okHttpClient0.writeTimeoutMillis();
            this.pingInterval = okHttpClient0.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient0.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient0.getRouteDatabase();
        }

        @l
        public final Builder addInterceptor(@l Interceptor interceptor0) {
            L.p(interceptor0, "interceptor");
            this.interceptors.add(interceptor0);
            return this;
        }

        @l
        public final Builder addNetworkInterceptor(@l Interceptor interceptor0) {
            L.p(interceptor0, "interceptor");
            this.networkInterceptors.add(interceptor0);
            return this;
        }

        @l
        public final Builder authenticator(@l Authenticator authenticator0) {
            L.p(authenticator0, "authenticator");
            this.authenticator = authenticator0;
            return this;
        }

        @l
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @l
        public final Builder cache(@m Cache cache0) {
            this.cache = cache0;
            return this;
        }

        @l
        public final Builder callTimeout(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            this.callTimeout = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder callTimeout(@l Duration duration0) {
            L.p(duration0, "duration");
            this.callTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        public final Builder certificatePinner(@l CertificatePinner certificatePinner0) {
            L.p(certificatePinner0, "certificatePinner");
            if(!L.g(certificatePinner0, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner0;
            return this;
        }

        @l
        public final Builder connectTimeout(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            this.connectTimeout = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder connectTimeout(@l Duration duration0) {
            L.p(duration0, "duration");
            this.connectTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        public final Builder connectionPool(@l ConnectionPool connectionPool0) {
            L.p(connectionPool0, "connectionPool");
            this.connectionPool = connectionPool0;
            return this;
        }

        @l
        public final Builder connectionSpecs(@l List list0) {
            L.p(list0, "connectionSpecs");
            if(!L.g(list0, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(list0);
            return this;
        }

        @l
        public final Builder cookieJar(@l CookieJar cookieJar0) {
            L.p(cookieJar0, "cookieJar");
            this.cookieJar = cookieJar0;
            return this;
        }

        @l
        public final Builder dispatcher(@l Dispatcher dispatcher0) {
            L.p(dispatcher0, "dispatcher");
            this.dispatcher = dispatcher0;
            return this;
        }

        @l
        public final Builder dns(@l Dns dns0) {
            L.p(dns0, "dns");
            if(!L.g(dns0, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns0;
            return this;
        }

        @l
        public final Builder eventListener(@l EventListener eventListener0) {
            L.p(eventListener0, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener0);
            return this;
        }

        @l
        public final Builder eventListenerFactory(@l okhttp3.EventListener.Factory eventListener$Factory0) {
            L.p(eventListener$Factory0, "eventListenerFactory");
            this.eventListenerFactory = eventListener$Factory0;
            return this;
        }

        @l
        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        @l
        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        @l
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @m
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @m
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @l
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @l
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @l
        public final List getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @l
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @l
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @l
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @l
        public final okhttp3.EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @l
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @l
        public final List getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @l
        public final List getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @l
        public final List getProtocols$okhttp() {
            return this.protocols;
        }

        @m
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @l
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @m
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @m
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @l
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @m
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @m
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @l
        public final Builder hostnameVerifier(@l HostnameVerifier hostnameVerifier0) {
            L.p(hostnameVerifier0, "hostnameVerifier");
            if(!L.g(hostnameVerifier0, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier0;
            return this;
        }

        @l
        public final List interceptors() {
            return this.interceptors;
        }

        @l
        public final Builder minWebSocketMessageToCompress(long v) {
            if(v < 0L) {
                throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + v).toString());
            }
            this.minWebSocketMessageToCompress = v;
            return this;
        }

        @l
        public final List networkInterceptors() {
            return this.networkInterceptors;
        }

        @l
        public final Builder pingInterval(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            this.pingInterval = Util.checkDuration("interval", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder pingInterval(@l Duration duration0) {
            L.p(duration0, "duration");
            this.pingInterval(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        public final Builder protocols(@l List list0) {
            L.p(list0, "protocols");
            List list1 = u.Y5(list0);
            Protocol protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
            if(!list1.contains(protocol0) && !list1.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + list1).toString());
            }
            if(list1.contains(protocol0) && list1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + list1).toString());
            }
            if(list1.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + list1).toString());
            }
            L.n(list1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if(list1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            list1.remove(Protocol.SPDY_3);
            if(!L.g(list1, this.protocols)) {
                this.routeDatabase = null;
            }
            List list2 = DesugarCollections.unmodifiableList(list1);
            L.o(list2, "unmodifiableList(protocolsCopy)");
            this.protocols = list2;
            return this;
        }

        @l
        public final Builder proxy(@m Proxy proxy0) {
            if(!L.g(proxy0, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy0;
            return this;
        }

        @l
        public final Builder proxyAuthenticator(@l Authenticator authenticator0) {
            L.p(authenticator0, "proxyAuthenticator");
            if(!L.g(authenticator0, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator0;
            return this;
        }

        @l
        public final Builder proxySelector(@l ProxySelector proxySelector0) {
            L.p(proxySelector0, "proxySelector");
            if(!L.g(proxySelector0, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector0;
            return this;
        }

        @l
        public final Builder readTimeout(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            this.readTimeout = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder readTimeout(@l Duration duration0) {
            L.p(duration0, "duration");
            this.readTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@l Authenticator authenticator0) {
            L.p(authenticator0, "<set-?>");
            this.authenticator = authenticator0;
        }

        public final void setCache$okhttp(@m Cache cache0) {
            this.cache = cache0;
        }

        public final void setCallTimeout$okhttp(int v) {
            this.callTimeout = v;
        }

        public final void setCertificateChainCleaner$okhttp(@m CertificateChainCleaner certificateChainCleaner0) {
            this.certificateChainCleaner = certificateChainCleaner0;
        }

        public final void setCertificatePinner$okhttp(@l CertificatePinner certificatePinner0) {
            L.p(certificatePinner0, "<set-?>");
            this.certificatePinner = certificatePinner0;
        }

        public final void setConnectTimeout$okhttp(int v) {
            this.connectTimeout = v;
        }

        public final void setConnectionPool$okhttp(@l ConnectionPool connectionPool0) {
            L.p(connectionPool0, "<set-?>");
            this.connectionPool = connectionPool0;
        }

        public final void setConnectionSpecs$okhttp(@l List list0) {
            L.p(list0, "<set-?>");
            this.connectionSpecs = list0;
        }

        public final void setCookieJar$okhttp(@l CookieJar cookieJar0) {
            L.p(cookieJar0, "<set-?>");
            this.cookieJar = cookieJar0;
        }

        public final void setDispatcher$okhttp(@l Dispatcher dispatcher0) {
            L.p(dispatcher0, "<set-?>");
            this.dispatcher = dispatcher0;
        }

        public final void setDns$okhttp(@l Dns dns0) {
            L.p(dns0, "<set-?>");
            this.dns = dns0;
        }

        public final void setEventListenerFactory$okhttp(@l okhttp3.EventListener.Factory eventListener$Factory0) {
            L.p(eventListener$Factory0, "<set-?>");
            this.eventListenerFactory = eventListener$Factory0;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(@l HostnameVerifier hostnameVerifier0) {
            L.p(hostnameVerifier0, "<set-?>");
            this.hostnameVerifier = hostnameVerifier0;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long v) {
            this.minWebSocketMessageToCompress = v;
        }

        public final void setPingInterval$okhttp(int v) {
            this.pingInterval = v;
        }

        public final void setProtocols$okhttp(@l List list0) {
            L.p(list0, "<set-?>");
            this.protocols = list0;
        }

        public final void setProxy$okhttp(@m Proxy proxy0) {
            this.proxy = proxy0;
        }

        public final void setProxyAuthenticator$okhttp(@l Authenticator authenticator0) {
            L.p(authenticator0, "<set-?>");
            this.proxyAuthenticator = authenticator0;
        }

        public final void setProxySelector$okhttp(@m ProxySelector proxySelector0) {
            this.proxySelector = proxySelector0;
        }

        public final void setReadTimeout$okhttp(int v) {
            this.readTimeout = v;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(@m RouteDatabase routeDatabase0) {
            this.routeDatabase = routeDatabase0;
        }

        public final void setSocketFactory$okhttp(@l SocketFactory socketFactory0) {
            L.p(socketFactory0, "<set-?>");
            this.socketFactory = socketFactory0;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@m SSLSocketFactory sSLSocketFactory0) {
            this.sslSocketFactoryOrNull = sSLSocketFactory0;
        }

        public final void setWriteTimeout$okhttp(int v) {
            this.writeTimeout = v;
        }

        public final void setX509TrustManagerOrNull$okhttp(@m X509TrustManager x509TrustManager0) {
            this.x509TrustManagerOrNull = x509TrustManager0;
        }

        @l
        public final Builder socketFactory(@l SocketFactory socketFactory0) {
            L.p(socketFactory0, "socketFactory");
            if(socketFactory0 instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if(!L.g(socketFactory0, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory0;
            return this;
        }

        @k(level = kotlin.m.b, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @l
        public final Builder sslSocketFactory(@l SSLSocketFactory sSLSocketFactory0) {
            L.p(sSLSocketFactory0, "sslSocketFactory");
            if(!L.g(sSLSocketFactory0, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory0;
            Companion platform$Companion0 = Platform.Companion;
            X509TrustManager x509TrustManager0 = platform$Companion0.get().trustManager(sSLSocketFactory0);
            if(x509TrustManager0 == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + platform$Companion0.get() + ", sslSocketFactory is " + sSLSocketFactory0.getClass());
            }
            this.x509TrustManagerOrNull = x509TrustManager0;
            Platform platform0 = platform$Companion0.get();
            X509TrustManager x509TrustManager1 = this.x509TrustManagerOrNull;
            L.m(x509TrustManager1);
            this.certificateChainCleaner = platform0.buildCertificateChainCleaner(x509TrustManager1);
            return this;
        }

        @l
        public final Builder sslSocketFactory(@l SSLSocketFactory sSLSocketFactory0, @l X509TrustManager x509TrustManager0) {
            L.p(sSLSocketFactory0, "sslSocketFactory");
            L.p(x509TrustManager0, "trustManager");
            if(!L.g(sSLSocketFactory0, this.sslSocketFactoryOrNull) || !L.g(x509TrustManager0, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory0;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager0);
            this.x509TrustManagerOrNull = x509TrustManager0;
            return this;
        }

        @l
        public final Builder writeTimeout(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            this.writeTimeout = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @l
        public final Builder writeTimeout(@l Duration duration0) {
            L.p(duration0, "duration");
            this.writeTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    public static final class okhttp3.OkHttpClient.Companion {
        private okhttp3.OkHttpClient.Companion() {
        }

        public okhttp3.OkHttpClient.Companion(w w0) {
        }

        @l
        public final List getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @l
        public final List getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    @l
    public static final okhttp3.OkHttpClient.Companion Companion;
    @l
    private static final List DEFAULT_CONNECTION_SPECS;
    @l
    private static final List DEFAULT_PROTOCOLS;
    @l
    private final Authenticator authenticator;
    @m
    private final Cache cache;
    private final int callTimeoutMillis;
    @m
    private final CertificateChainCleaner certificateChainCleaner;
    @l
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    @l
    private final ConnectionPool connectionPool;
    @l
    private final List connectionSpecs;
    @l
    private final CookieJar cookieJar;
    @l
    private final Dispatcher dispatcher;
    @l
    private final Dns dns;
    @l
    private final okhttp3.EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    @l
    private final HostnameVerifier hostnameVerifier;
    @l
    private final List interceptors;
    private final long minWebSocketMessageToCompress;
    @l
    private final List networkInterceptors;
    private final int pingIntervalMillis;
    @l
    private final List protocols;
    @m
    private final Proxy proxy;
    @l
    private final Authenticator proxyAuthenticator;
    @l
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    @l
    private final RouteDatabase routeDatabase;
    @l
    private final SocketFactory socketFactory;
    @m
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    @m
    private final X509TrustManager x509TrustManager;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "authenticator", imports = {}))
    @l
    @i(name = "-deprecated_authenticator")
    public final Authenticator -deprecated_authenticator() {
        return this.authenticator;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cache", imports = {}))
    @m
    @i(name = "-deprecated_cache")
    public final Cache -deprecated_cache() {
        return this.cache;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "callTimeoutMillis", imports = {}))
    @i(name = "-deprecated_callTimeoutMillis")
    public final int -deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "certificatePinner", imports = {}))
    @l
    @i(name = "-deprecated_certificatePinner")
    public final CertificatePinner -deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "connectTimeoutMillis", imports = {}))
    @i(name = "-deprecated_connectTimeoutMillis")
    public final int -deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "connectionPool", imports = {}))
    @l
    @i(name = "-deprecated_connectionPool")
    public final ConnectionPool -deprecated_connectionPool() {
        return this.connectionPool;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "connectionSpecs", imports = {}))
    @l
    @i(name = "-deprecated_connectionSpecs")
    public final List -deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cookieJar", imports = {}))
    @l
    @i(name = "-deprecated_cookieJar")
    public final CookieJar -deprecated_cookieJar() {
        return this.cookieJar;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "dispatcher", imports = {}))
    @l
    @i(name = "-deprecated_dispatcher")
    public final Dispatcher -deprecated_dispatcher() {
        return this.dispatcher;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "dns", imports = {}))
    @l
    @i(name = "-deprecated_dns")
    public final Dns -deprecated_dns() {
        return this.dns;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "eventListenerFactory", imports = {}))
    @l
    @i(name = "-deprecated_eventListenerFactory")
    public final okhttp3.EventListener.Factory -deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "followRedirects", imports = {}))
    @i(name = "-deprecated_followRedirects")
    public final boolean -deprecated_followRedirects() {
        return this.followRedirects;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "followSslRedirects", imports = {}))
    @i(name = "-deprecated_followSslRedirects")
    public final boolean -deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "hostnameVerifier", imports = {}))
    @l
    @i(name = "-deprecated_hostnameVerifier")
    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "interceptors", imports = {}))
    @l
    @i(name = "-deprecated_interceptors")
    public final List -deprecated_interceptors() {
        return this.interceptors;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "networkInterceptors", imports = {}))
    @l
    @i(name = "-deprecated_networkInterceptors")
    public final List -deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "pingIntervalMillis", imports = {}))
    @i(name = "-deprecated_pingIntervalMillis")
    public final int -deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "protocols", imports = {}))
    @l
    @i(name = "-deprecated_protocols")
    public final List -deprecated_protocols() {
        return this.protocols;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxy", imports = {}))
    @m
    @i(name = "-deprecated_proxy")
    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxyAuthenticator", imports = {}))
    @l
    @i(name = "-deprecated_proxyAuthenticator")
    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxySelector", imports = {}))
    @l
    @i(name = "-deprecated_proxySelector")
    public final ProxySelector -deprecated_proxySelector() {
        return this.proxySelector;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "readTimeoutMillis", imports = {}))
    @i(name = "-deprecated_readTimeoutMillis")
    public final int -deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "retryOnConnectionFailure", imports = {}))
    @i(name = "-deprecated_retryOnConnectionFailure")
    public final boolean -deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "socketFactory", imports = {}))
    @l
    @i(name = "-deprecated_socketFactory")
    public final SocketFactory -deprecated_socketFactory() {
        return this.socketFactory;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "sslSocketFactory", imports = {}))
    @l
    @i(name = "-deprecated_sslSocketFactory")
    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "writeTimeoutMillis", imports = {}))
    @i(name = "-deprecated_writeTimeoutMillis")
    public final int -deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    static {
        OkHttpClient.Companion = new okhttp3.OkHttpClient.Companion(null);
        OkHttpClient.DEFAULT_PROTOCOLS = Util.immutableListOf(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
        OkHttpClient.DEFAULT_CONNECTION_SPECS = Util.immutableListOf(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT});
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(@l Builder okHttpClient$Builder0) {
        L.p(okHttpClient$Builder0, "builder");
        ProxySelector proxySelector0;
        super();
        this.dispatcher = okHttpClient$Builder0.getDispatcher$okhttp();
        this.connectionPool = okHttpClient$Builder0.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(okHttpClient$Builder0.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(okHttpClient$Builder0.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = okHttpClient$Builder0.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = okHttpClient$Builder0.getRetryOnConnectionFailure$okhttp();
        this.authenticator = okHttpClient$Builder0.getAuthenticator$okhttp();
        this.followRedirects = okHttpClient$Builder0.getFollowRedirects$okhttp();
        this.followSslRedirects = okHttpClient$Builder0.getFollowSslRedirects$okhttp();
        this.cookieJar = okHttpClient$Builder0.getCookieJar$okhttp();
        this.cache = okHttpClient$Builder0.getCache$okhttp();
        this.dns = okHttpClient$Builder0.getDns$okhttp();
        this.proxy = okHttpClient$Builder0.getProxy$okhttp();
        if(okHttpClient$Builder0.getProxy$okhttp() == null) {
            proxySelector0 = okHttpClient$Builder0.getProxySelector$okhttp() == null ? ProxySelector.getDefault() : okHttpClient$Builder0.getProxySelector$okhttp();
            if(proxySelector0 == null) {
                proxySelector0 = NullProxySelector.INSTANCE;
            }
        }
        else {
            proxySelector0 = NullProxySelector.INSTANCE;
        }
        this.proxySelector = proxySelector0;
        this.proxyAuthenticator = okHttpClient$Builder0.getProxyAuthenticator$okhttp();
        this.socketFactory = okHttpClient$Builder0.getSocketFactory$okhttp();
        List list0 = okHttpClient$Builder0.getConnectionSpecs$okhttp();
        this.connectionSpecs = list0;
        this.protocols = okHttpClient$Builder0.getProtocols$okhttp();
        this.hostnameVerifier = okHttpClient$Builder0.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = okHttpClient$Builder0.getCallTimeout$okhttp();
        this.connectTimeoutMillis = okHttpClient$Builder0.getConnectTimeout$okhttp();
        this.readTimeoutMillis = okHttpClient$Builder0.getReadTimeout$okhttp();
        this.writeTimeoutMillis = okHttpClient$Builder0.getWriteTimeout$okhttp();
        this.pingIntervalMillis = okHttpClient$Builder0.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = okHttpClient$Builder0.getMinWebSocketMessageToCompress$okhttp();
        this.routeDatabase = okHttpClient$Builder0.getRouteDatabase$okhttp() == null ? new RouteDatabase() : okHttpClient$Builder0.getRouteDatabase$okhttp();
        if(list0 instanceof Collection && list0.isEmpty()) {
        label_62:
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_62;
                }
                Object object0 = iterator0.next();
                if(((ConnectionSpec)object0).isTls()) {
                    if(okHttpClient$Builder0.getSslSocketFactoryOrNull$okhttp() == null) {
                        X509TrustManager x509TrustManager1 = Platform.Companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManager1;
                        Platform platform0 = Platform.Companion.get();
                        L.m(x509TrustManager1);
                        this.sslSocketFactoryOrNull = platform0.newSslSocketFactory(x509TrustManager1);
                        L.m(x509TrustManager1);
                        CertificateChainCleaner certificateChainCleaner1 = CertificateChainCleaner.Companion.get(x509TrustManager1);
                        this.certificateChainCleaner = certificateChainCleaner1;
                        L.m(certificateChainCleaner1);
                        this.certificatePinner = okHttpClient$Builder0.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner1);
                    }
                    else {
                        this.sslSocketFactoryOrNull = okHttpClient$Builder0.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner0 = okHttpClient$Builder0.getCertificateChainCleaner$okhttp();
                        L.m(certificateChainCleaner0);
                        this.certificateChainCleaner = certificateChainCleaner0;
                        X509TrustManager x509TrustManager0 = okHttpClient$Builder0.getX509TrustManagerOrNull$okhttp();
                        L.m(x509TrustManager0);
                        this.x509TrustManager = x509TrustManager0;
                        L.m(certificateChainCleaner0);
                        this.certificatePinner = okHttpClient$Builder0.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner0);
                    }
                    break;
                }
            }
        }
        this.verifyClientState();
    }

    @l
    @i(name = "authenticator")
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @m
    @i(name = "cache")
    public final Cache cache() {
        return this.cache;
    }

    @i(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @m
    @i(name = "certificateChainCleaner")
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @l
    @i(name = "certificatePinner")
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @Override
    @l
    public Object clone() {
        return super.clone();
    }

    @i(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @l
    @i(name = "connectionPool")
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @l
    @i(name = "connectionSpecs")
    public final List connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @i(name = "cookieJar")
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @l
    @i(name = "dispatcher")
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @l
    @i(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    @l
    @i(name = "eventListenerFactory")
    public final okhttp3.EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @i(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @i(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @l
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @l
    @i(name = "hostnameVerifier")
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @i(name = "interceptors")
    public final List interceptors() {
        return this.interceptors;
    }

    @i(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @l
    @i(name = "networkInterceptors")
    public final List networkInterceptors() {
        return this.networkInterceptors;
    }

    @l
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override  // okhttp3.Call$Factory
    @l
    public Call newCall(@l Request request0) {
        L.p(request0, "request");
        return new RealCall(this, request0, false);
    }

    @Override  // okhttp3.WebSocket$Factory
    @l
    public WebSocket newWebSocket(@l Request request0, @l WebSocketListener webSocketListener0) {
        L.p(request0, "request");
        L.p(webSocketListener0, "listener");
        Random random0 = new Random();
        WebSocket webSocket0 = new RealWebSocket(TaskRunner.INSTANCE, request0, webSocketListener0, random0, ((long)this.pingIntervalMillis), null, this.minWebSocketMessageToCompress);
        ((RealWebSocket)webSocket0).connect(this);
        return webSocket0;
    }

    @i(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @l
    @i(name = "protocols")
    public final List protocols() {
        return this.protocols;
    }

    @m
    @i(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    @l
    @i(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @i(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @i(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @i(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @l
    @i(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @l
    @i(name = "sslSocketFactory")
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory0 = this.sslSocketFactoryOrNull;
        if(sSLSocketFactory0 == null) {
            throw new IllegalStateException("CLEARTEXT-only client");
        }
        return sSLSocketFactory0;
    }

    private final void verifyClientState() {
        L.n(this.interceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if(this.interceptors.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        L.n(this.networkInterceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if(this.networkInterceptors.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        Iterable iterable0 = this.connectionSpecs;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!((ConnectionSpec)object0).isTls()) {
                    continue;
                }
                if(this.sslSocketFactoryOrNull == null) {
                    throw new IllegalStateException("sslSocketFactory == null");
                }
                if(this.certificateChainCleaner == null) {
                    throw new IllegalStateException("certificateChainCleaner == null");
                }
                if(this.x509TrustManager == null) {
                    throw new IllegalStateException("x509TrustManager == null");
                }
                return;
            }
        }
        if(this.sslSocketFactoryOrNull != null || this.certificateChainCleaner != null || this.x509TrustManager != null || !L.g(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @i(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @m
    @i(name = "x509TrustManager")
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }
}

