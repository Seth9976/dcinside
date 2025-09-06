package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import y4.l;
import y4.m;

public final class JavaNetAuthenticator implements Authenticator {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Proxy.Type.values().length];
            try {
                arr_v[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    private final Dns defaultDns;

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    public JavaNetAuthenticator(@l Dns dns0) {
        L.p(dns0, "defaultDns");
        super();
        this.defaultDns = dns0;
    }

    public JavaNetAuthenticator(Dns dns0, int v, w w0) {
        if((v & 1) != 0) {
            dns0 = Dns.SYSTEM;
        }
        this(dns0);
    }

    @Override  // okhttp3.Authenticator
    @m
    public Request authenticate(@m Route route0, @l Response response0) throws IOException {
        PasswordAuthentication passwordAuthentication0;
        Dns dns1;
        Proxy proxy0;
        L.p(response0, "response");
        List list0 = response0.challenges();
        Request request0 = response0.request();
        HttpUrl httpUrl0 = request0.url();
        boolean z = response0.code() == 407;
        if(route0 == null) {
            proxy0 = Proxy.NO_PROXY;
        }
        else {
            proxy0 = route0.proxy();
            if(proxy0 == null) {
                proxy0 = Proxy.NO_PROXY;
            }
        }
        for(Object object0: list0) {
            Challenge challenge0 = (Challenge)object0;
            if(v.O1("Basic", challenge0.scheme(), true)) {
                if(route0 == null) {
                    dns1 = this.defaultDns;
                }
                else {
                    Address address0 = route0.address();
                    if(address0 != null) {
                        Dns dns0 = address0.dns();
                        if(dns0 != null) {
                            dns1 = dns0;
                        }
                    }
                }
                if(z) {
                    SocketAddress socketAddress0 = proxy0.address();
                    L.n(socketAddress0, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    String s = ((InetSocketAddress)socketAddress0).getHostName();
                    L.o(proxy0, "proxy");
                    passwordAuthentication0 = java.net.Authenticator.requestPasswordAuthentication(s, this.connectToInetAddress(proxy0, httpUrl0, dns1), ((InetSocketAddress)socketAddress0).getPort(), httpUrl0.scheme(), challenge0.realm(), challenge0.scheme(), httpUrl0.url(), Authenticator.RequestorType.PROXY);
                }
                else {
                    L.o(proxy0, "proxy");
                    passwordAuthentication0 = java.net.Authenticator.requestPasswordAuthentication(httpUrl0.host(), this.connectToInetAddress(proxy0, httpUrl0, dns1), httpUrl0.port(), httpUrl0.scheme(), challenge0.realm(), challenge0.scheme(), httpUrl0.url(), Authenticator.RequestorType.SERVER);
                }
                if(passwordAuthentication0 != null) {
                    String s1 = passwordAuthentication0.getUserName();
                    L.o(s1, "auth.userName");
                    char[] arr_c = passwordAuthentication0.getPassword();
                    L.o(arr_c, "auth.password");
                    String s2 = Credentials.basic(s1, new String(arr_c), challenge0.charset());
                    return request0.newBuilder().header((z ? "Proxy-Authorization" : "Authorization"), s2).build();
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    private final InetAddress connectToInetAddress(Proxy proxy0, HttpUrl httpUrl0, Dns dns0) throws IOException {
        Proxy.Type proxy$Type0 = proxy0.type();
        if((proxy$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[proxy$Type0.ordinal()]) == 1) {
            return (InetAddress)u.B2(dns0.lookup(httpUrl0.host()));
        }
        SocketAddress socketAddress0 = proxy0.address();
        L.n(socketAddress0, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress inetAddress0 = ((InetSocketAddress)socketAddress0).getAddress();
        L.o(inetAddress0, "address() as InetSocketAddress).address");
        return inetAddress0;
    }
}

