package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.Platform;
import y4.l;

public abstract class CertificateChainCleaner {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final CertificateChainCleaner get(@l X509TrustManager x509TrustManager0) {
            L.p(x509TrustManager0, "trustManager");
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager0);
        }

        @l
        public final CertificateChainCleaner get(@l X509Certificate[] arr_x509Certificate) {
            L.p(arr_x509Certificate, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex(((X509Certificate[])Arrays.copyOf(arr_x509Certificate, arr_x509Certificate.length))));
        }
    }

    @l
    public static final Companion Companion;

    static {
        CertificateChainCleaner.Companion = new Companion(null);
    }

    @l
    public abstract List clean(@l List arg1, @l String arg2) throws SSLPeerUnverifiedException;
}

