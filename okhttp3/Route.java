package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.i;

public final class Route {
    @l
    private final Address address;
    @l
    private final Proxy proxy;
    @l
    private final InetSocketAddress socketAddress;

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "address", imports = {}))
    @l
    @i(name = "-deprecated_address")
    public final Address -deprecated_address() {
        return this.address;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "proxy", imports = {}))
    @l
    @i(name = "-deprecated_proxy")
    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "socketAddress", imports = {}))
    @l
    @i(name = "-deprecated_socketAddress")
    public final InetSocketAddress -deprecated_socketAddress() {
        return this.socketAddress;
    }

    public Route(@l Address address0, @l Proxy proxy0, @l InetSocketAddress inetSocketAddress0) {
        L.p(address0, "address");
        L.p(proxy0, "proxy");
        L.p(inetSocketAddress0, "socketAddress");
        super();
        this.address = address0;
        this.proxy = proxy0;
        this.socketAddress = inetSocketAddress0;
    }

    @l
    @i(name = "address")
    public final Address address() {
        return this.address;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof Route && L.g(((Route)object0).address, this.address) && L.g(((Route)object0).proxy, this.proxy) && L.g(((Route)object0).socketAddress, this.socketAddress);
    }

    @Override
    public int hashCode() {
        return ((this.address.hashCode() + 0x20F) * 0x1F + this.proxy.hashCode()) * 0x1F + this.socketAddress.hashCode();
    }

    @l
    @i(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @l
    @i(name = "socketAddress")
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @Override
    @l
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}

