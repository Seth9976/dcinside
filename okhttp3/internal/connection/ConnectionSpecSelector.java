package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.L;
import okhttp3.ConnectionSpec;
import y4.l;

public final class ConnectionSpecSelector {
    @l
    private final List connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@l List list0) {
        L.p(list0, "connectionSpecs");
        super();
        this.connectionSpecs = list0;
    }

    @l
    public final ConnectionSpec configureSecureSocket(@l SSLSocket sSLSocket0) throws IOException {
        ConnectionSpec connectionSpec0;
        L.p(sSLSocket0, "sslSocket");
        int v = this.nextModeIndex;
        int v1 = this.connectionSpecs.size();
        while(true) {
            connectionSpec0 = null;
            if(v >= v1) {
                break;
            }
            connectionSpec0 = (ConnectionSpec)this.connectionSpecs.get(v);
            if(connectionSpec0.isCompatible(sSLSocket0)) {
                this.nextModeIndex = v + 1;
                break;
            }
            ++v;
        }
        if(connectionSpec0 != null) {
            this.isFallbackPossible = this.isFallbackPossible(sSLSocket0);
            connectionSpec0.apply$okhttp(sSLSocket0, this.isFallback);
            return connectionSpec0;
        }
        String[] arr_s = sSLSocket0.getEnabledProtocols();
        L.m(arr_s);
        String s = Arrays.toString(arr_s);
        L.o(s, "toString(this)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + s);
    }

    // 去混淆评级： 低(23)
    public final boolean connectionFailed(@l IOException iOException0) {
        L.p(iOException0, "e");
        this.isFallback = true;
        return this.isFallbackPossible ? !(iOException0 instanceof ProtocolException) && !(iOException0 instanceof InterruptedIOException) && (!(iOException0 instanceof SSLHandshakeException) || !(iOException0.getCause() instanceof CertificateException)) && !(iOException0 instanceof SSLPeerUnverifiedException) && iOException0 instanceof SSLException : false;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket0) {
        int v = this.nextModeIndex;
        int v1 = this.connectionSpecs.size();
        while(v < v1) {
            if(((ConnectionSpec)this.connectionSpecs.get(v)).isCompatible(sSLSocket0)) {
                return true;
            }
            ++v;
        }
        return false;
    }
}

