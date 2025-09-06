package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import y4.l;

public final class RouteSelector {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final String getSocketHost(@l InetSocketAddress inetSocketAddress0) {
            L.p(inetSocketAddress0, "<this>");
            InetAddress inetAddress0 = inetSocketAddress0.getAddress();
            if(inetAddress0 == null) {
                String s = inetSocketAddress0.getHostName();
                L.o(s, "hostName");
                return s;
            }
            String s1 = inetAddress0.getHostAddress();
            L.o(s1, "address.hostAddress");
            return s1;
        }
    }

    public static final class Selection {
        private int nextRouteIndex;
        @l
        private final List routes;

        public Selection(@l List list0) {
            L.p(list0, "routes");
            super();
            this.routes = list0;
        }

        @l
        public final List getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        @l
        public final Route next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int v = this.nextRouteIndex;
            this.nextRouteIndex = v + 1;
            return (Route)this.routes.get(v);
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final Address address;
    @l
    private final Call call;
    @l
    private final EventListener eventListener;
    @l
    private List inetSocketAddresses;
    private int nextProxyIndex;
    @l
    private final List postponedRoutes;
    @l
    private List proxies;
    @l
    private final RouteDatabase routeDatabase;

    static {
        RouteSelector.Companion = new Companion(null);
    }

    public RouteSelector(@l Address address0, @l RouteDatabase routeDatabase0, @l Call call0, @l EventListener eventListener0) {
        L.p(address0, "address");
        L.p(routeDatabase0, "routeDatabase");
        L.p(call0, "call");
        L.p(eventListener0, "eventListener");
        super();
        this.address = address0;
        this.routeDatabase = routeDatabase0;
        this.call = call0;
        this.eventListener = eventListener0;
        this.proxies = u.H();
        this.inetSocketAddresses = u.H();
        this.postponedRoutes = new ArrayList();
        this.resetNextProxy(address0.url(), address0.proxy());
    }

    // 去混淆评级： 低(20)
    public final boolean hasNext() {
        return this.hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    @l
    public final Selection next() throws IOException {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList0 = new ArrayList();
        while(this.hasNextProxy()) {
            Proxy proxy0 = this.nextProxy();
            for(Object object0: this.inetSocketAddresses) {
                Route route0 = new Route(this.address, proxy0, ((InetSocketAddress)object0));
                if(this.routeDatabase.shouldPostpone(route0)) {
                    this.postponedRoutes.add(route0);
                }
                else {
                    arrayList0.add(route0);
                }
            }
            if(!arrayList0.isEmpty()) {
                break;
            }
        }
        if(arrayList0.isEmpty()) {
            u.q0(arrayList0, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList0);
    }

    private final Proxy nextProxy() throws IOException {
        if(!this.hasNextProxy()) {
            throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
        }
        int v = this.nextProxyIndex;
        this.nextProxyIndex = v + 1;
        Proxy proxy0 = (Proxy)this.proxies.get(v);
        this.resetNextInetSocketAddress(proxy0);
        return proxy0;
    }

    private final void resetNextInetSocketAddress(Proxy proxy0) throws IOException {
        List list0;
        int v;
        String s;
        ArrayList arrayList0 = new ArrayList();
        this.inetSocketAddresses = arrayList0;
        if(proxy0.type() == Proxy.Type.DIRECT || proxy0.type() == Proxy.Type.SOCKS) {
            s = this.address.url().host();
            v = this.address.url().port();
        }
        else {
            SocketAddress socketAddress0 = proxy0.address();
            if(!(socketAddress0 instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddress0.getClass()).toString());
            }
            L.o(socketAddress0, "proxyAddress");
            s = RouteSelector.Companion.getSocketHost(((InetSocketAddress)socketAddress0));
            v = ((InetSocketAddress)socketAddress0).getPort();
        }
        if(1 > v || v >= 0x10000) {
            throw new SocketException("No route to " + s + ':' + v + "; port is out of range");
        }
        if(proxy0.type() == Proxy.Type.SOCKS) {
            arrayList0.add(InetSocketAddress.createUnresolved(s, v));
            return;
        }
        if(Util.canParseAsIpAddress(s)) {
            list0 = u.k(InetAddress.getByName(s));
        }
        else {
            this.eventListener.dnsStart(this.call, s);
            list0 = this.address.dns().lookup(s);
            if(list0.isEmpty()) {
                throw new UnknownHostException(this.address.dns() + " returned no addresses for " + s);
            }
            this.eventListener.dnsEnd(this.call, s, list0);
        }
        for(Object object0: list0) {
            arrayList0.add(new InetSocketAddress(((InetAddress)object0), v));
        }
    }

    private final void resetNextProxy(HttpUrl httpUrl0, Proxy proxy0) {
        this.eventListener.proxySelectStart(this.call, httpUrl0);
        List list0 = RouteSelector.resetNextProxy$selectProxies(proxy0, httpUrl0, this);
        this.proxies = list0;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl0, list0);
    }

    private static final List resetNextProxy$selectProxies(Proxy proxy0, HttpUrl httpUrl0, RouteSelector routeSelector0) {
        if(proxy0 != null) {
            return u.k(proxy0);
        }
        URI uRI0 = httpUrl0.uri();
        if(uRI0.getHost() == null) {
            return Util.immutableListOf(new Proxy[]{Proxy.NO_PROXY});
        }
        List list0 = routeSelector0.address.proxySelector().select(uRI0);
        if(list0 != null && !list0.isEmpty()) {
            L.o(list0, "proxiesOrNull");
            return Util.toImmutableList(list0);
        }
        return Util.immutableListOf(new Proxy[]{Proxy.NO_PROXY});
    }
}

