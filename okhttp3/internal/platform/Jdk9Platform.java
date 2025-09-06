package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.internal.SuppressSignatureCheck;
import y4.l;
import y4.m;

@s0({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
public class Jdk9Platform extends Platform {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        @m
        public final Jdk9Platform buildIfSupported() {
            return this.isAvailable() ? new Jdk9Platform() : null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }
    }

    @l
    public static final Companion Companion;
    private static final boolean isAvailable;

    static {
        Jdk9Platform.Companion = new Companion(null);
        Integer integer0 = v.b1("0.9");
        boolean z = false;
        if(integer0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }
        else if(((int)integer0) >= 9) {
            z = true;
            Jdk9Platform.isAvailable = z;
            return;
        }
        Jdk9Platform.isAvailable = z;
    }

    @Override  // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        SSLParameters sSLParameters0 = sSLSocket0.getSSLParameters();
        sSLParameters0.setApplicationProtocols(((String[])Platform.Companion.alpnProtocolNames(list0).toArray(new String[0])));
        sSLSocket0.setSSLParameters(sSLParameters0);
    }

    @Override  // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        try {
            String s = sSLSocket0.getApplicationProtocol();
            return (s == null ? true : L.g(s, "")) ? null : s;
        }
        catch(UnsupportedOperationException unused_ex) {
            return null;
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        L.p(sSLSocketFactory0, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}

