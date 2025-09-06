package okhttp3;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.i;
import z3.n;

public enum TlsVersion {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final TlsVersion forJavaName(@l String s) {
            L.p(s, "javaName");
            switch(s) {
                case "SSLv3": {
                    return TlsVersion.SSL_3_0;
                }
                case "TLSv1": {
                    return TlsVersion.TLS_1_0;
                }
                case "TLSv1.1": {
                    return TlsVersion.TLS_1_1;
                }
                case "TLSv1.2": {
                    return TlsVersion.TLS_1_2;
                }
                case "TLSv1.3": {
                    return TlsVersion.TLS_1_3;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected TLS version: " + s);
                }
            }
        }
    }

    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    @l
    public static final Companion Companion;
    @l
    private final String javaName;

    private static final TlsVersion[] $values() [...] // Inlined contents

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "javaName", imports = {}))
    @l
    @i(name = "-deprecated_javaName")
    public final String -deprecated_javaName() {
        return this.javaName;
    }

    static {
        TlsVersion.Companion = new Companion(null);
    }

    private TlsVersion(String s1) {
        this.javaName = s1;
    }

    @l
    @n
    public static final TlsVersion forJavaName(@l String s) {
        return TlsVersion.Companion.forJavaName(s);
    }

    @l
    @i(name = "javaName")
    public final String javaName() {
        return this.javaName;
    }
}

