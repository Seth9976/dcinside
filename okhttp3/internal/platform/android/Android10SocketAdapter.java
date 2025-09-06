package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build.VERSION;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import y4.l;
import y4.m;

@SuppressLint({"NewApi"})
@s0({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
@SuppressSignatureCheck
public final class Android10SocketAdapter implements SocketAdapter {
    @SuppressSignatureCheck
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @m
        public final SocketAdapter buildIfSupported() {
            return this.isSupported() ? new Android10SocketAdapter() : null;
        }

        public final boolean isSupported() {
            return Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @l
    public static final Companion Companion;

    static {
        Android10SocketAdapter.Companion = new Companion(null);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @SuppressLint({"NewApi"})
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket0, true);
            SSLParameters sSLParameters0 = sSLSocket0.getSSLParameters();
            sSLParameters0.setApplicationProtocols(((String[])Platform.Companion.alpnProtocolNames(list0).toArray(new String[0])));
            sSLSocket0.setSSLParameters(sSLParameters0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IOException("Android internal error", illegalArgumentException0);
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @SuppressLint({"NewApi"})
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        String s = sSLSocket0.getApplicationProtocol();
        return (s == null ? true : L.g(s, "")) ? null : s;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return Android10SocketAdapter.Companion.isSupported();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket0);
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

