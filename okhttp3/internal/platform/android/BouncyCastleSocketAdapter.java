package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import y4.l;
import y4.m;

@s0({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Factory getFactory() {
            return BouncyCastleSocketAdapter.factory;
        }
    }

    @l
    public static final Companion Companion;
    @l
    private static final Factory factory;

    static {
        BouncyCastleSocketAdapter.Companion = new Companion(null);
        BouncyCastleSocketAdapter.factory = new BouncyCastleSocketAdapter.Companion.factory.1();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        if(this.matchesSocket(sSLSocket0)) {
            BCSSLParameters bCSSLParameters0 = ((BCSSLSocket)sSLSocket0).getParameters();
            bCSSLParameters0.setApplicationProtocols(((String[])Platform.Companion.alpnProtocolNames(list0).toArray(new String[0])));
            ((BCSSLSocket)sSLSocket0).setParameters(bCSSLParameters0);
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        String s = ((BCSSLSocket)sSLSocket0).getApplicationProtocol();
        return (s == null ? true : L.g(s, "")) ? null : s;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return BouncyCastlePlatform.Companion.isSupported();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return false;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@l SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.matchesSocketFactory(this, sSLSocketFactory0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.trustManager(this, sSLSocketFactory0);
    }
}

