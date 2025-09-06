package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import y4.l;
import y4.m;
import z3.n;

public class Platform {
    @s0({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final List alpnProtocolNames(@l List list0) {
            L.p(list0, "protocols");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((Protocol)object0) != Protocol.HTTP_1_0) {
                    arrayList0.add(object0);
                }
            }
            List list1 = new ArrayList(u.b0(arrayList0, 10));
            for(Object object1: arrayList0) {
                list1.add(((Protocol)object1).toString());
            }
            return list1;
        }

        @l
        public final byte[] concatLengthPrefixed(@l List list0) {
            L.p(list0, "protocols");
            okio.l l0 = new okio.l();
            for(Object object0: this.alpnProtocolNames(list0)) {
                l0.e2(((String)object0).length());
                l0.b3(((String)object0));
            }
            return new byte[0];
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform platform0 = Android10Platform.Companion.buildIfSupported();
            if(platform0 == null) {
                platform0 = AndroidPlatform.Companion.buildIfSupported();
                L.m(platform0);
            }
            return platform0;
        }

        private final Platform findJvmPlatform() {
            if(this.isConscryptPreferred()) {
                Platform platform0 = ConscryptPlatform.Companion.buildIfSupported();
                if(platform0 != null) {
                    return platform0;
                }
            }
            if(this.isBouncyCastlePreferred()) {
                Platform platform1 = BouncyCastlePlatform.Companion.buildIfSupported();
                if(platform1 != null) {
                    return platform1;
                }
            }
            if(this.isOpenJSSEPreferred()) {
                Platform platform2 = OpenJSSEPlatform.Companion.buildIfSupported();
                if(platform2 != null) {
                    return platform2;
                }
            }
            Platform platform3 = Jdk9Platform.Companion.buildIfSupported();
            if(platform3 != null) {
                return platform3;
            }
            Platform platform4 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            return platform4 == null ? new Platform() : platform4;
        }

        // 去混淆评级： 低(20)
        private final Platform findPlatform() {
            return this.isAndroid() ? this.findAndroidPlatform() : this.findJvmPlatform();
        }

        @l
        @n
        public final Platform get() {
            return Platform.platform;
        }

        // 去混淆评级： 低(20)
        public final boolean isAndroid() {
            return L.g("Dalvik", "Dalvik");
        }

        // 去混淆评级： 低(20)
        private final boolean isBouncyCastlePreferred() {
            return L.g("BC", "SUN");
        }

        // 去混淆评级： 低(20)
        private final boolean isConscryptPreferred() {
            return L.g("Conscrypt", "SUN");
        }

        // 去混淆评级： 低(20)
        private final boolean isOpenJSSEPreferred() {
            return L.g("OpenJSSE", "SUN");
        }

        public final void resetForTests(@l Platform platform0) {
            L.p(platform0, "platform");
            Platform.platform = platform0;
        }

        public static void resetForTests$default(Companion platform$Companion0, Platform platform0, int v, Object object0) {
            if((v & 1) != 0) {
                platform0 = platform$Companion0.findPlatform();
            }
            platform$Companion0.resetForTests(platform0);
        }
    }

    @l
    public static final Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    @l
    private static volatile Platform platform;

    static {
        Companion platform$Companion0 = new Companion(null);
        Platform.Companion = platform$Companion0;
        Platform.platform = platform$Companion0.findPlatform();
        Platform.logger = Logger.getLogger("okhttp3.OkHttpClient");
    }

    public void afterHandshake(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
    }

    @l
    public CertificateChainCleaner buildCertificateChainCleaner(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        return new BasicCertificateChainCleaner(this.buildTrustRootIndex(x509TrustManager0));
    }

    @l
    public TrustRootIndex buildTrustRootIndex(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        X509Certificate[] arr_x509Certificate = x509TrustManager0.getAcceptedIssuers();
        L.o(arr_x509Certificate, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex(((X509Certificate[])Arrays.copyOf(arr_x509Certificate, arr_x509Certificate.length)));
    }

    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
    }

    public void connectSocket(@l Socket socket0, @l InetSocketAddress inetSocketAddress0, int v) throws IOException {
        L.p(socket0, "socket");
        L.p(inetSocketAddress0, "address");
        socket0.connect(inetSocketAddress0, v);
    }

    @l
    @n
    public static final Platform get() {
        return Platform.Companion.get();
    }

    @l
    public final String getPrefix() [...] // 潜在的解密器

    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return null;
    }

    @m
    public Object getStackTraceForCloseable(@l String s) {
        L.p(s, "closer");
        return Platform.logger.isLoggable(Level.FINE) ? new Throwable(s) : null;
    }

    public boolean isCleartextTrafficPermitted(@l String s) {
        L.p(s, "hostname");
        return true;
    }

    public void log(@l String s, int v, @m Throwable throwable0) {
        L.p(s, "message");
        Platform.logger.log((v == 5 ? Level.WARNING : Level.INFO), s, throwable0);
    }

    public static void log$default(Platform platform0, String s, int v, Throwable throwable0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if((v1 & 2) != 0) {
            v = 4;
        }
        if((v1 & 4) != 0) {
            throwable0 = null;
        }
        platform0.log(s, v, throwable0);
    }

    public void logCloseableLeak(@l String s, @m Object object0) {
        L.p(s, "message");
        if(object0 == null) {
            s = s + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        this.log(s, 5, ((Throwable)object0));
    }

    @l
    public SSLContext newSSLContext() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS");
        L.o(sSLContext0, "getInstance(\"TLS\")");
        return sSLContext0;
    }

    @l
    public SSLSocketFactory newSslSocketFactory(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        try {
            SSLContext sSLContext0 = this.newSSLContext();
            sSLContext0.init(null, new TrustManager[]{x509TrustManager0}, null);
            SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
            L.o(sSLSocketFactory0, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return sSLSocketFactory0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new AssertionError("No System TLS: " + generalSecurityException0, generalSecurityException0);
        }
    }

    @l
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance("PKIX");
        trustManagerFactory0.init(null);
        TrustManager[] arr_trustManager = trustManagerFactory0.getTrustManagers();
        L.m(arr_trustManager);
        if(arr_trustManager.length == 1) {
            TrustManager trustManager0 = arr_trustManager[0];
            if(trustManager0 instanceof X509TrustManager) {
                L.n(trustManager0, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager)trustManager0;
            }
        }
        L.o("[sun.security.ssl.X509TrustManagerImpl@4f38443f]", "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: [sun.security.ssl.X509TrustManagerImpl@4f38443f]");
    }

    @Override
    @l
    public String toString() {
        String s = this.getClass().getSimpleName();
        L.o(s, "javaClass.simpleName");
        return s;
    }

    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        try {
            Class class0 = Class.forName("sun.security.ssl.SSLContextImpl");
            L.o(class0, "sslContextClass");
            Object object0 = Util.readFieldOrNull(sSLSocketFactory0, class0, "context");
            return object0 == null ? null : ((X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "trustManager"));
        }
        catch(ClassNotFoundException runtimeException0) {
            if(!L.g(runtimeException0.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw runtimeException0;
            }
        }
        catch(RuntimeException unused_ex) {
        }
        return null;
    }
}

