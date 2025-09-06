package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface SocketAdapter {
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(@l SocketAdapter socketAdapter0, @l SSLSocketFactory sSLSocketFactory0) {
            L.p(sSLSocketFactory0, "sslSocketFactory");
            return false;
        }

        @m
        public static X509TrustManager trustManager(@l SocketAdapter socketAdapter0, @l SSLSocketFactory sSLSocketFactory0) {
            L.p(sSLSocketFactory0, "sslSocketFactory");
            return null;
        }
    }

    void configureTlsExtensions(@l SSLSocket arg1, @m String arg2, @l List arg3);

    @m
    String getSelectedProtocol(@l SSLSocket arg1);

    boolean isSupported();

    boolean matchesSocket(@l SSLSocket arg1);

    boolean matchesSocketFactory(@l SSLSocketFactory arg1);

    @m
    X509TrustManager trustManager(@l SSLSocketFactory arg1);
}

