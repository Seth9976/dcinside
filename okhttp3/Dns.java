package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public interface Dns {
    public static final class Companion {
        static final class DnsSystem implements Dns {
            @Override  // okhttp3.Dns
            @l
            public List lookup(@l String s) {
                L.p(s, "hostname");
                try {
                    InetAddress[] arr_inetAddress = InetAddress.getAllByName(s);
                    L.o(arr_inetAddress, "getAllByName(hostname)");
                    return kotlin.collections.l.Ky(arr_inetAddress);
                }
                catch(NullPointerException nullPointerException0) {
                    UnknownHostException unknownHostException0 = new UnknownHostException("Broken system behaviour for dns lookup of " + s);
                    unknownHostException0.initCause(nullPointerException0);
                    throw unknownHostException0;
                }
            }
        }

        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final Dns SYSTEM;

    static {
        Dns.Companion = Companion.$$INSTANCE;
        Dns.SYSTEM = new DnsSystem();
    }

    @l
    List lookup(@l String arg1) throws UnknownHostException;
}

