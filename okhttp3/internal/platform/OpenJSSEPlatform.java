package okhttp3.internal.platform;

import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import org.openjsse.net.ssl.OpenJSSE;
import y4.l;
import y4.m;

@s0({"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
public final class OpenJSSEPlatform extends Platform {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        @m
        public final OpenJSSEPlatform buildIfSupported() {
            return this.isSupported() ? new OpenJSSEPlatform(null) : null;
        }

        public final boolean isSupported() {
            return OpenJSSEPlatform.isSupported;
        }
    }

    @l
    public static final Companion Companion;
    private static final boolean isSupported;
    @l
    private final Provider provider;

    static {
        Companion openJSSEPlatform$Companion0 = new Companion(null);
        OpenJSSEPlatform.Companion = openJSSEPlatform$Companion0;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, openJSSEPlatform$Companion0.getClass().getClassLoader());
            z = true;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        OpenJSSEPlatform.isSupported = z;
    }

    private OpenJSSEPlatform() {
        this.provider = (Provider)new OpenJSSE();
    }

    public OpenJSSEPlatform(w w0) {
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        super.configureTlsExtensions(sSLSocket0, s, list0);
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return super.getSelectedProtocol(sSLSocket0);
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public SSLContext newSSLContext() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLSv1.3", this.provider);
        L.o(sSLContext0, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext0;
    }

    @Override  // okhttp3.internal.platform.Platform
    @l
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance("PKIX", this.provider);
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
        String s = Arrays.toString(arr_trustManager);
        L.o(s, "toString(this)");
        throw new IllegalStateException(("Unexpected default trust managers: " + s).toString());
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }
}

