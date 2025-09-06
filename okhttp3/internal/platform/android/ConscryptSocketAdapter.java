package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import y4.l;
import y4.m;

@s0({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class ConscryptSocketAdapter implements SocketAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Factory getFactory() {
            return ConscryptSocketAdapter.factory;
        }
    }

    @l
    public static final Companion Companion;
    @l
    private static final Factory factory;

    static {
        ConscryptSocketAdapter.Companion = new Companion(null);
        ConscryptSocketAdapter.factory = new ConscryptSocketAdapter.Companion.factory.1();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        if(this.matchesSocket(sSLSocket0)) {
            Conscrypt.setUseSessionTickets(sSLSocket0, true);
            Conscrypt.setApplicationProtocols(sSLSocket0, ((String[])Platform.Companion.alpnProtocolNames(list0).toArray(new String[0])));
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return this.matchesSocket(sSLSocket0) ? Conscrypt.getApplicationProtocol(sSLSocket0) : null;
    }

    // 去混淆评级： 低(20)
    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return false;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket0);
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

