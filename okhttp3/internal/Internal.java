package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.L;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import y4.l;
import y4.m;
import z3.i;

@i(name = "Internal")
public final class Internal {
    @l
    public static final Builder addHeaderLenient(@l Builder headers$Builder0, @l String s) {
        L.p(headers$Builder0, "builder");
        L.p(s, "line");
        return headers$Builder0.addLenient$okhttp(s);
    }

    @l
    public static final Builder addHeaderLenient(@l Builder headers$Builder0, @l String s, @l String s1) {
        L.p(headers$Builder0, "builder");
        L.p(s, "name");
        L.p(s1, "value");
        return headers$Builder0.addLenient$okhttp(s, s1);
    }

    public static final void applyConnectionSpec(@l ConnectionSpec connectionSpec0, @l SSLSocket sSLSocket0, boolean z) {
        L.p(connectionSpec0, "connectionSpec");
        L.p(sSLSocket0, "sslSocket");
        connectionSpec0.apply$okhttp(sSLSocket0, z);
    }

    @m
    public static final Response cacheGet(@l Cache cache0, @l Request request0) {
        L.p(cache0, "cache");
        L.p(request0, "request");
        return cache0.get$okhttp(request0);
    }

    @l
    public static final String cookieToString(@l Cookie cookie0, boolean z) {
        L.p(cookie0, "cookie");
        return cookie0.toString$okhttp(z);
    }

    @m
    public static final Cookie parseCookie(long v, @l HttpUrl httpUrl0, @l String s) {
        L.p(httpUrl0, "url");
        L.p(s, "setCookie");
        return Cookie.Companion.parse$okhttp(v, httpUrl0, s);
    }
}

