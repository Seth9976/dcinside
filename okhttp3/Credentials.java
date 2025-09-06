package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.L;
import okio.o;
import y4.l;
import z3.j;
import z3.n;

public final class Credentials {
    @l
    public static final Credentials INSTANCE;

    static {
        Credentials.INSTANCE = new Credentials();
    }

    @l
    @j
    @n
    public static final String basic(@l String s, @l String s1) {
        L.p(s, "username");
        L.p(s1, "password");
        return Credentials.basic$default(s, s1, null, 4, null);
    }

    @l
    @j
    @n
    public static final String basic(@l String s, @l String s1, @l Charset charset0) {
        L.p(s, "username");
        L.p(s1, "password");
        L.p(charset0, "charset");
        return "Basic " + o.d.j(s + ':' + s1, charset0).d();
    }

    public static String basic$default(String s, String s1, Charset charset0, int v, Object object0) {
        if((v & 4) != 0) {
            charset0 = StandardCharsets.ISO_8859_1;
            L.o(charset0, "ISO_8859_1");
        }
        return Credentials.basic(s, s1, charset0);
    }
}

