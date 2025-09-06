package okhttp3;

import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.f;
import z3.i;

@s0({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class ConnectionSpec {
    @s0({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class Builder {
        @m
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        @m
        private String[] tlsVersions;

        public Builder(@l ConnectionSpec connectionSpec0) {
            L.p(connectionSpec0, "connectionSpec");
            super();
            this.tls = connectionSpec0.isTls();
            this.cipherSuites = connectionSpec0.cipherSuitesAsString;
            this.tlsVersions = connectionSpec0.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec0.supportsTlsExtensions();
        }

        public Builder(boolean z) {
            this.tls = z;
        }

        @l
        public final Builder allEnabledCipherSuites() {
            if(!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.cipherSuites = null;
            return this;
        }

        @l
        public final Builder allEnabledTlsVersions() {
            if(!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.tlsVersions = null;
            return this;
        }

        @l
        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @l
        public final Builder cipherSuites(@l String[] arr_s) {
            L.p(arr_s, "cipherSuites");
            if(!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if(arr_s.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.cipherSuites = (String[])arr_s.clone();
            return this;
        }

        @l
        public final Builder cipherSuites(@l CipherSuite[] arr_cipherSuite) {
            L.p(arr_cipherSuite, "cipherSuites");
            if(!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList0 = new ArrayList(arr_cipherSuite.length);
            for(int v = 0; v < arr_cipherSuite.length; ++v) {
                arrayList0.add(arr_cipherSuite[v].javaName());
            }
            String[] arr_s = (String[])arrayList0.toArray(new String[0]);
            return this.cipherSuites(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }

        @m
        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        @m
        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(@m String[] arr_s) {
            this.cipherSuites = arr_s;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        public final void setTlsVersions$okhttp(@m String[] arr_s) {
            this.tlsVersions = arr_s;
        }

        @k(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @l
        public final Builder supportsTlsExtensions(boolean z) {
            if(!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = z;
            return this;
        }

        @l
        public final Builder tlsVersions(@l String[] arr_s) {
            L.p(arr_s, "tlsVersions");
            if(!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if(arr_s.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.tlsVersions = (String[])arr_s.clone();
            return this;
        }

        @l
        public final Builder tlsVersions(@l TlsVersion[] arr_tlsVersion) {
            L.p(arr_tlsVersion, "tlsVersions");
            if(!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList0 = new ArrayList(arr_tlsVersion.length);
            for(int v = 0; v < arr_tlsVersion.length; ++v) {
                arrayList0.add(arr_tlsVersion[v].javaName());
            }
            String[] arr_s = (String[])arrayList0.toArray(new String[0]);
            return this.tlsVersions(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    @l
    @f
    public static final ConnectionSpec CLEARTEXT;
    @l
    @f
    public static final ConnectionSpec COMPATIBLE_TLS;
    @l
    public static final Companion Companion;
    @l
    @f
    public static final ConnectionSpec MODERN_TLS;
    @l
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    @l
    @f
    public static final ConnectionSpec RESTRICTED_TLS;
    @m
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    @m
    private final String[] tlsVersionsAsString;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cipherSuites", imports = {}))
    @m
    @i(name = "-deprecated_cipherSuites")
    public final List -deprecated_cipherSuites() {
        return this.cipherSuites();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "supportsTlsExtensions", imports = {}))
    @i(name = "-deprecated_supportsTlsExtensions")
    public final boolean -deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "tlsVersions", imports = {}))
    @m
    @i(name = "-deprecated_tlsVersions")
    public final List -deprecated_tlsVersions() {
        return this.tlsVersions();
    }

    static {
        ConnectionSpec.Companion = new Companion(null);
        CipherSuite[] arr_cipherSuite = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
        ConnectionSpec.RESTRICTED_CIPHER_SUITES = arr_cipherSuite;
        CipherSuite[] arr_cipherSuite1 = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        ConnectionSpec.APPROVED_CIPHER_SUITES = arr_cipherSuite1;
        ConnectionSpec.RESTRICTED_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(arr_cipherSuite, 9))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2}).supportsTlsExtensions(true).build();
        ConnectionSpec.MODERN_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(arr_cipherSuite1, 16))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2}).supportsTlsExtensions(true).build();
        ConnectionSpec.COMPATIBLE_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(arr_cipherSuite1, 16))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0}).supportsTlsExtensions(true).build();
        ConnectionSpec.CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z, boolean z1, @m String[] arr_s, @m String[] arr_s1) {
        this.isTls = z;
        this.supportsTlsExtensions = z1;
        this.cipherSuitesAsString = arr_s;
        this.tlsVersionsAsString = arr_s1;
    }

    public final void apply$okhttp(@l SSLSocket sSLSocket0, boolean z) {
        L.p(sSLSocket0, "sslSocket");
        ConnectionSpec connectionSpec0 = this.supportedSpec(sSLSocket0, z);
        if(connectionSpec0.tlsVersions() != null) {
            sSLSocket0.setEnabledProtocols(connectionSpec0.tlsVersionsAsString);
        }
        if(connectionSpec0.cipherSuites() != null) {
            sSLSocket0.setEnabledCipherSuites(connectionSpec0.cipherSuitesAsString);
        }
    }

    @m
    @i(name = "cipherSuites")
    public final List cipherSuites() {
        String[] arr_s = this.cipherSuitesAsString;
        if(arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(CipherSuite.Companion.forJavaName(arr_s[v]));
            }
            return u.V5(arrayList0);
        }
        return null;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(!(object0 instanceof ConnectionSpec)) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        boolean z = this.isTls;
        if(z != ((ConnectionSpec)object0).isTls) {
            return false;
        }
        if(z) {
            if(!Arrays.equals(this.cipherSuitesAsString, ((ConnectionSpec)object0).cipherSuitesAsString)) {
                return false;
            }
            return Arrays.equals(this.tlsVersionsAsString, ((ConnectionSpec)object0).tlsVersionsAsString) ? this.supportsTlsExtensions == ((ConnectionSpec)object0).supportsTlsExtensions : false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if(this.isTls) {
            int v = 0;
            int v1 = this.cipherSuitesAsString == null ? 0 : Arrays.hashCode(this.cipherSuitesAsString);
            String[] arr_s = this.tlsVersionsAsString;
            if(arr_s != null) {
                v = Arrays.hashCode(arr_s);
            }
            return ((v1 + 0x20F) * 0x1F + v) * 0x1F + !this.supportsTlsExtensions;
        }
        return 17;
    }

    public final boolean isCompatible(@l SSLSocket sSLSocket0) {
        L.p(sSLSocket0, "socket");
        if(!this.isTls) {
            return false;
        }
        return this.tlsVersionsAsString == null || Util.hasIntersection(this.tlsVersionsAsString, sSLSocket0.getEnabledProtocols(), a.q()) ? this.cipherSuitesAsString == null || Util.hasIntersection(this.cipherSuitesAsString, sSLSocket0.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : false;
    }

    @i(name = "isTls")
    public final boolean isTls() {
        return this.isTls;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket0, boolean z) {
        String[] arr_s3;
        String[] arr_s1;
        if(this.cipherSuitesAsString == null) {
            arr_s1 = sSLSocket0.getEnabledCipherSuites();
        }
        else {
            String[] arr_s = sSLSocket0.getEnabledCipherSuites();
            L.o(arr_s, "sslSocket.enabledCipherSuites");
            arr_s1 = Util.intersect(arr_s, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        }
        if(this.tlsVersionsAsString == null) {
            arr_s3 = sSLSocket0.getEnabledProtocols();
        }
        else {
            String[] arr_s2 = sSLSocket0.getEnabledProtocols();
            L.o(arr_s2, "sslSocket.enabledProtocols");
            Comparator comparator0 = a.q();
            arr_s3 = Util.intersect(arr_s2, this.tlsVersionsAsString, comparator0);
        }
        String[] arr_s4 = sSLSocket0.getSupportedCipherSuites();
        L.o(arr_s4, "supportedCipherSuites");
        int v = Util.indexOf(arr_s4, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if(z && v != -1) {
            L.o(arr_s1, "cipherSuitesIntersection");
            String s = arr_s4[v];
            L.o(s, "supportedCipherSuites[indexOfFallbackScsv]");
            arr_s1 = Util.concat(arr_s1, s);
        }
        Builder connectionSpec$Builder0 = new Builder(this);
        L.o(arr_s1, "cipherSuitesIntersection");
        Builder connectionSpec$Builder1 = connectionSpec$Builder0.cipherSuites(((String[])Arrays.copyOf(arr_s1, arr_s1.length)));
        L.o(arr_s3, "tlsVersionsIntersection");
        return connectionSpec$Builder1.tlsVersions(((String[])Arrays.copyOf(arr_s3, arr_s3.length))).build();
    }

    @i(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @m
    @i(name = "tlsVersions")
    public final List tlsVersions() {
        String[] arr_s = this.tlsVersionsAsString;
        if(arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(TlsVersion.Companion.forJavaName(arr_s[v]));
            }
            return u.V5(arrayList0);
        }
        return null;
    }

    @Override
    @l
    public String toString() {
        return this.isTls ? "ConnectionSpec(cipherSuites=" + Objects.toString(this.cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(this.tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')' : "ConnectionSpec()";
    }
}

