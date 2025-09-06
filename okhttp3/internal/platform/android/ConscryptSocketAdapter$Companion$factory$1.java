package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.L;
import y4.l;

public final class ConscryptSocketAdapter.Companion.factory.1 implements Factory {
    @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    @l
    public SocketAdapter create(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return new ConscryptSocketAdapter();
    }

    // 去混淆评级： 低(20)
    @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
    public boolean matchesSocket(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "sslSocket");
        return false;
    }
}

