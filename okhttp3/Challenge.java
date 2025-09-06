package okhttp3;

import j..util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.i;

public final class Challenge {
    @l
    private final Map authParams;
    @l
    private final String scheme;

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "authParams", imports = {}))
    @l
    @i(name = "-deprecated_authParams")
    public final Map -deprecated_authParams() {
        return this.authParams;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "charset", imports = {}))
    @l
    @i(name = "-deprecated_charset")
    public final Charset -deprecated_charset() {
        return this.charset();
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "realm", imports = {}))
    @y4.m
    @i(name = "-deprecated_realm")
    public final String -deprecated_realm() {
        return this.realm();
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "scheme", imports = {}))
    @l
    @i(name = "-deprecated_scheme")
    public final String -deprecated_scheme() {
        return this.scheme;
    }

    public Challenge(@l String s, @l String s1) {
        L.p(s, "scheme");
        L.p(s1, "realm");
        Map map0 = Collections.singletonMap("realm", s1);
        L.o(map0, "singletonMap(\"realm\", realm)");
        this(s, map0);
    }

    public Challenge(@l String s, @l Map map0) {
        L.p(s, "scheme");
        String s3;
        L.p(map0, "authParams");
        super();
        this.scheme = s;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            String s2 = (String)((Map.Entry)object0).getValue();
            if(s1 == null) {
                s3 = null;
            }
            else {
                Locale locale0 = Locale.US;
                L.o(locale0, "US");
                s3 = s1.toLowerCase(locale0);
                L.o(s3, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap0.put(s3, s2);
        }
        Map map1 = DesugarCollections.unmodifiableMap(linkedHashMap0);
        L.o(map1, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = map1;
    }

    @l
    @i(name = "authParams")
    public final Map authParams() {
        return this.authParams;
    }

    @l
    @i(name = "charset")
    public final Charset charset() {
        String s = (String)this.authParams.get("charset");
        if(s != null) {
            try {
                Charset charset0 = Charset.forName(s);
                L.o(charset0, "forName(charset)");
                return charset0;
            }
            catch(Exception unused_ex) {
            }
        }
        Charset charset1 = StandardCharsets.ISO_8859_1;
        L.o(charset1, "ISO_8859_1");
        return charset1;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof Challenge && L.g(((Challenge)object0).scheme, this.scheme) && L.g(((Challenge)object0).authParams, this.authParams);
    }

    @Override
    public int hashCode() {
        return (this.scheme.hashCode() + 899) * 0x1F + this.authParams.hashCode();
    }

    @y4.m
    @i(name = "realm")
    public final String realm() {
        return (String)this.authParams.get("realm");
    }

    @l
    @i(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @Override
    @l
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @l
    public final Challenge withCharset(@l Charset charset0) {
        L.p(charset0, "charset");
        Map map0 = Y.J0(this.authParams);
        String s = charset0.name();
        L.o(s, "charset.name()");
        map0.put("charset", s);
        return new Challenge(this.scheme, map0);
    }
}

