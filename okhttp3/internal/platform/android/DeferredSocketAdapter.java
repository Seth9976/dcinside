package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DeferredSocketAdapter implements SocketAdapter {
    public interface Factory {
        @l
        SocketAdapter create(@l SSLSocket arg1);

        boolean matchesSocket(@l SSLSocket arg1);
    }

    @m
    private SocketAdapter delegate;
    @l
    private final Factory socketAdapterFactory;

    public DeferredSocketAdapter(@l Factory deferredSocketAdapter$Factory0) {
        L.p(deferredSocketAdapter$Factory0, "socketAdapterFactory");
        super();
        this.socketAdapterFactory = deferredSocketAdapter$Factory0;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@l SSLSocket sSLSocket0, @m String s, @l List list0) {
        L.p(sSLSocket0, "sslSocket");
        L.p(list0, "protocols");
        SocketAdapter socketAdapter0 = this.getDelegate(sSLSocket0);
        if(socketAdapter0 != null) {
            socketAdapter0.configureTlsExtensions(sSLSocket0, s, list0);
        }
    }

    private final SocketAdapter getDelegate(SSLSocket sSLSocket0) {
        synchronized(this) {
            if(this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket0)) {
                this.delegate = this.socketAdapterFactory.create(sSLSocket0);
            }
            return this.delegate;
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @m
    public String getSelectedProtocol(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        SocketAdapter socketAdapter0 = this.getDelegate(sSLSocket0);
        return socketAdapter0 == null ? null : socketAdapter0.getSelectedProtocol(sSLSocket0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return true;
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sSLSocket0);
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

