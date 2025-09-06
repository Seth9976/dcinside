package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

class b extends ProxySelector {
    private final ProxySelector a;
    private final String b;
    private final int c;
    private static final List d;

    static {
        b.d = Collections.singletonList(Proxy.NO_PROXY);
    }

    private b(String s, int v) {
        this.a = ProxySelector.getDefault();
        this.b = s;
        this.c = v;
    }

    static void a(String s, int v) {
        ProxySelector.setDefault(new b(s, v));
    }

    @Override
    public void connectFailed(URI uRI0, SocketAddress socketAddress0, IOException iOException0) {
        this.a.connectFailed(uRI0, socketAddress0, iOException0);
    }

    @Override
    public List select(URI uRI0) {
        if(uRI0 == null) {
            throw new IllegalArgumentException("URI can\'t be null");
        }
        String s = uRI0.getHost();
        if(this.b.equalsIgnoreCase(s)) {
            int v = uRI0.getPort();
            return this.c == v ? b.d : this.a.select(uRI0);
        }
        return this.a.select(uRI0);
    }
}

