package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
@SuppressSignatureCheck
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @SuppressSignatureCheck
        @m
        public final AndroidCertificateChainCleaner buildIfSupported(@l X509TrustManager x509TrustManager0) {
            X509TrustManagerExtensions x509TrustManagerExtensions0;
            L.p(x509TrustManager0, "trustManager");
            try {
                x509TrustManagerExtensions0 = null;
                x509TrustManagerExtensions0 = new X509TrustManagerExtensions(x509TrustManager0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
            return x509TrustManagerExtensions0 == null ? null : new AndroidCertificateChainCleaner(x509TrustManager0, x509TrustManagerExtensions0);
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final X509TrustManager trustManager;
    @l
    private final X509TrustManagerExtensions x509TrustManagerExtensions;

    static {
        AndroidCertificateChainCleaner.Companion = new Companion(null);
    }

    public AndroidCertificateChainCleaner(@l X509TrustManager x509TrustManager0, @l X509TrustManagerExtensions x509TrustManagerExtensions0) {
        L.p(x509TrustManager0, "trustManager");
        L.p(x509TrustManagerExtensions0, "x509TrustManagerExtensions");
        super();
        this.trustManager = x509TrustManager0;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions0;
    }

    @Override  // okhttp3.internal.tls.CertificateChainCleaner
    @SuppressSignatureCheck
    @l
    public List clean(@l List list0, @l String s) throws SSLPeerUnverifiedException {
        L.p(list0, "chain");
        L.p(s, "hostname");
        X509Certificate[] arr_x509Certificate = (X509Certificate[])list0.toArray(new X509Certificate[0]);
        try {
            List list1 = this.x509TrustManagerExtensions.checkServerTrusted(arr_x509Certificate, "RSA", s);
            L.o(list1, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return list1;
        }
        catch(CertificateException certificateException0) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException0 = new SSLPeerUnverifiedException(certificateException0.getMessage());
            sSLPeerUnverifiedException0.initCause(certificateException0);
            throw sSLPeerUnverifiedException0;
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof AndroidCertificateChainCleaner && ((AndroidCertificateChainCleaner)object0).trustManager == this.trustManager;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.trustManager);
    }
}

