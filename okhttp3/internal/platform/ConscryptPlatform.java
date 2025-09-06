package okhttp3.internal.platform;

import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import org.conscrypt.Conscrypt.Version;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import y4.l;
import y4.m;

@s0({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
public final class ConscryptPlatform extends Platform {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final boolean atLeastVersion(int v, int v1, int v2) {
            Conscrypt.Version conscrypt$Version0 = Conscrypt.version();
            if(conscrypt$Version0.major() != v) {
                return conscrypt$Version0.major() > v;
            }
            return conscrypt$Version0.minor() == v1 ? conscrypt$Version0.patch() >= v2 : conscrypt$Version0.minor() > v1;
        }

        public static boolean atLeastVersion$default(Companion conscryptPlatform$Companion0, int v, int v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v1 = 0;
            }
            if((v3 & 4) != 0) {
                v2 = 0;
            }
            return conscryptPlatform$Companion0.atLeastVersion(v, v1, v2);
        }

        // 去混淆评级： 低(40)
        @m
        public final ConscryptPlatform buildIfSupported() {
            return null;
        }

        public final boolean isSupported() [...] // 潜在的解密器
    }

    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {
        @l
        public static final DisabledHostnameVerifier INSTANCE;

        static {
            DisabledHostnameVerifier.INSTANCE = new DisabledHostnameVerifier();
        }

        public final boolean verify(@m String s, @m SSLSession sSLSession0) {
            return true;
        }

        public boolean verify(@m X509Certificate[] arr_x509Certificate, @m String s, @m SSLSession sSLSession0) {
            return true;
        }
    }

    @l
    public static final Companion Companion;
    private static final boolean isSupported;
    @l
    private final Provider provider;

    static {
        Companion conscryptPlatform$Companion0 = new Companion(null);
        ConscryptPlatform.Companion = conscryptPlatform$Companion0;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, conscryptPlatform$Companion0.getClass().getClassLoader());
            if(Conscrypt.isAvailable() && conscryptPlatform$Companion0.atLeastVersion(2, 1, 0)) {
                z = true;
            }
        }
        catch(NoClassDefFoundError | ClassNotFoundException unused_ex) {
        }
        ConscryptPlatform.isSupported = z;
    }

    private ConscryptPlatform() {
        Provider provider0 = Conscrypt.newProvider();
        L.o(provider0, "newProvider()");
        this.provider = provider0;
    }

    public ConscryptPlatform(w w0) {
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        if(Conscrypt.isConscrypt(sSLSocket0)) {
            Conscrypt.setUseSessionTickets(sSLSocket0, true);
            Conscrypt.setApplicationProtocols(sSLSocket0, ((String[])Platform.Companion.alpnProtocolNames(list0).toArray(new String[0])));
            return;
        }
        super.configureTlsExtensions(sSLSocket0, s, list0);
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket0) ? Conscrypt.getApplicationProtocol(sSLSocket0) : super.getSelectedProtocol(sSLSocket0);
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public SSLContext newSSLContext() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS", this.provider);
        L.o(sSLContext0, "getInstance(\"TLS\", provider)");
        return sSLContext0;
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public SSLSocketFactory newSslSocketFactory(@l X509TrustManager x509TrustManager0) {
        L.p(x509TrustManager0, "trustManager");
        SSLContext sSLContext0 = this.newSSLContext();
        sSLContext0.init(null, new TrustManager[]{x509TrustManager0}, null);
        SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
        L.o(sSLSocketFactory0, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return sSLSocketFactory0;
    }

    @Override  // okhttp3.internal.platform.Platform
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
                Conscrypt.setHostnameVerifier(((X509TrustManager)trustManager0), DisabledHostnameVerifier.INSTANCE);
                return (X509TrustManager)trustManager0;
            }
        }
        String s = Arrays.toString(arr_trustManager);
        L.o(s, "toString(this)");
        throw new IllegalStateException(("Unexpected default trust managers: " + s).toString());
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        return null;
    }
}

