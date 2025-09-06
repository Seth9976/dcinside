package okhttp3;

import j..util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.i;

public final class Address {
    @m
    private final CertificatePinner certificatePinner;
    @l
    private final List connectionSpecs;
    @l
    private final Dns dns;
    @m
    private final HostnameVerifier hostnameVerifier;
    @l
    private final List protocols;
    @m
    private final Proxy proxy;
    @l
    private final Authenticator proxyAuthenticator;
    @l
    private final ProxySelector proxySelector;
    @l
    private final SocketFactory socketFactory;
    @m
    private final SSLSocketFactory sslSocketFactory;
    @l
    private final HttpUrl url;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "certificatePinner", imports = {}))
    @m
    @i(name = "-deprecated_certificatePinner")
    public final CertificatePinner -deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "connectionSpecs", imports = {}))
    @l
    @i(name = "-deprecated_connectionSpecs")
    public final List -deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "dns", imports = {}))
    @l
    @i(name = "-deprecated_dns")
    public final Dns -deprecated_dns() {
        return this.dns;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "hostnameVerifier", imports = {}))
    @m
    @i(name = "-deprecated_hostnameVerifier")
    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "protocols", imports = {}))
    @l
    @i(name = "-deprecated_protocols")
    public final List -deprecated_protocols() {
        return this.protocols;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxy", imports = {}))
    @m
    @i(name = "-deprecated_proxy")
    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxyAuthenticator", imports = {}))
    @l
    @i(name = "-deprecated_proxyAuthenticator")
    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "proxySelector", imports = {}))
    @l
    @i(name = "-deprecated_proxySelector")
    public final ProxySelector -deprecated_proxySelector() {
        return this.proxySelector;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "socketFactory", imports = {}))
    @l
    @i(name = "-deprecated_socketFactory")
    public final SocketFactory -deprecated_socketFactory() {
        return this.socketFactory;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "sslSocketFactory", imports = {}))
    @m
    @i(name = "-deprecated_sslSocketFactory")
    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "url", imports = {}))
    @l
    @i(name = "-deprecated_url")
    public final HttpUrl -deprecated_url() {
        return this.url;
    }

    public Address(@l String s, int v, @l Dns dns0, @l SocketFactory socketFactory0, @m SSLSocketFactory sSLSocketFactory0, @m HostnameVerifier hostnameVerifier0, @m CertificatePinner certificatePinner0, @l Authenticator authenticator0, @m Proxy proxy0, @l List list0, @l List list1, @l ProxySelector proxySelector0) {
        L.p(s, "uriHost");
        L.p(dns0, "dns");
        L.p(socketFactory0, "socketFactory");
        L.p(authenticator0, "proxyAuthenticator");
        L.p(list0, "protocols");
        L.p(list1, "connectionSpecs");
        L.p(proxySelector0, "proxySelector");
        super();
        this.dns = dns0;
        this.socketFactory = socketFactory0;
        this.sslSocketFactory = sSLSocketFactory0;
        this.hostnameVerifier = hostnameVerifier0;
        this.certificatePinner = certificatePinner0;
        this.proxyAuthenticator = authenticator0;
        this.proxy = proxy0;
        this.proxySelector = proxySelector0;
        this.url = new Builder().scheme((sSLSocketFactory0 == null ? "http" : "https")).host(s).port(v).build();
        this.protocols = Util.toImmutableList(list0);
        this.connectionSpecs = Util.toImmutableList(list1);
    }

    @m
    @i(name = "certificatePinner")
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @l
    @i(name = "connectionSpecs")
    public final List connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @i(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof Address && L.g(this.url, ((Address)object0).url) && this.equalsNonHost$okhttp(((Address)object0));
    }

    // 去混淆评级： 低(45)
    public final boolean equalsNonHost$okhttp(@l Address address0) {
        L.p(address0, "that");
        return L.g(this.dns, address0.dns) && L.g(this.proxyAuthenticator, address0.proxyAuthenticator) && L.g(this.protocols, address0.protocols) && L.g(this.connectionSpecs, address0.connectionSpecs) && L.g(this.proxySelector, address0.proxySelector) && L.g(this.proxy, address0.proxy) && L.g(this.sslSocketFactory, address0.sslSocketFactory) && L.g(this.hostnameVerifier, address0.hostnameVerifier) && L.g(this.certificatePinner, address0.certificatePinner) && this.url.port() == address0.url.port();
    }

    @Override
    public int hashCode() {
        return (((((((((this.url.hashCode() + 0x20F) * 0x1F + this.dns.hashCode()) * 0x1F + this.proxyAuthenticator.hashCode()) * 0x1F + this.protocols.hashCode()) * 0x1F + this.connectionSpecs.hashCode()) * 0x1F + this.proxySelector.hashCode()) * 0x1F + Objects.hashCode(this.proxy)) * 0x1F + Objects.hashCode(this.sslSocketFactory)) * 0x1F + Objects.hashCode(this.hostnameVerifier)) * 0x1F + Objects.hashCode(this.certificatePinner);
    }

    @m
    @i(name = "hostnameVerifier")
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @i(name = "protocols")
    public final List protocols() {
        return this.protocols;
    }

    @m
    @i(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    @l
    @i(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @i(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @l
    @i(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @m
    @i(name = "sslSocketFactory")
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Override
    @l
    public String toString() {
        Proxy proxy0;
        StringBuilder stringBuilder1;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Address{");
        stringBuilder0.append(this.url.host());
        stringBuilder0.append(':');
        stringBuilder0.append(this.url.port());
        stringBuilder0.append(", ");
        if(this.proxy == null) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("proxySelector=");
            proxy0 = this.proxySelector;
        }
        else {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("proxy=");
            proxy0 = this.proxy;
        }
        stringBuilder1.append(proxy0);
        stringBuilder0.append(stringBuilder1.toString());
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @l
    @i(name = "url")
    public final HttpUrl url() {
        return this.url;
    }
}

