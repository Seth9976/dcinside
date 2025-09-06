package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class NullProxySelector extends ProxySelector {
    @l
    public static final NullProxySelector INSTANCE;

    static {
        NullProxySelector.INSTANCE = new NullProxySelector();
    }

    @Override
    public void connectFailed(@m URI uRI0, @m SocketAddress socketAddress0, @m IOException iOException0) {
    }

    @Override
    @l
    public List select(@m URI uRI0) {
        if(uRI0 == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        return u.k(Proxy.NO_PROXY);
    }
}

