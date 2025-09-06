package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.v;
import y4.l;
import z3.f;
import z3.i;
import z3.n;

public final class CipherSuite {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final CipherSuite forJavaName(@l String s) {
            synchronized(this) {
                L.p(s, "javaName");
                CipherSuite cipherSuite0 = (CipherSuite)CipherSuite.INSTANCES.get(s);
                if(cipherSuite0 == null) {
                    cipherSuite0 = (CipherSuite)CipherSuite.INSTANCES.get(this.secondaryName(s));
                    if(cipherSuite0 == null) {
                        cipherSuite0 = new CipherSuite(s, null);
                    }
                    CipherSuite.INSTANCES.put(s, cipherSuite0);
                }
                return cipherSuite0;
            }
        }

        @l
        public final Comparator getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }

        private final CipherSuite init(String s, int v) {
            CipherSuite cipherSuite0 = new CipherSuite(s, null);
            CipherSuite.INSTANCES.put(s, cipherSuite0);
            return cipherSuite0;
        }

        private final String secondaryName(String s) {
            if(v.v2(s, "TLS_", false, 2, null)) {
                String s1 = s.substring(4);
                L.o(s1, "this as java.lang.String).substring(startIndex)");
                return "SSL_" + s1;
            }
            if(v.v2(s, "SSL_", false, 2, null)) {
                String s2 = s.substring(4);
                L.o(s2, "this as java.lang.String).substring(startIndex)");
                return "TLS_" + s2;
            }
            return s;
        }
    }

    @l
    public static final Companion Companion;
    @l
    private static final Map INSTANCES;
    @l
    private static final Comparator ORDER_BY_NAME;
    @l
    @f
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256;
    @l
    @f
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    @l
    @f
    public static final CipherSuite TLS_FALLBACK_SCSV;
    @l
    @f
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    @l
    @f
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    @l
    @f
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    @l
    @f
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    @l
    @f
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    @l
    @f
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    @l
    private final String javaName;

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "javaName", imports = {}))
    @l
    @i(name = "-deprecated_javaName")
    public final String -deprecated_javaName() {
        return this.javaName;
    }

    static {
        Companion cipherSuite$Companion0 = new Companion(null);
        CipherSuite.Companion = cipherSuite$Companion0;
        CipherSuite.ORDER_BY_NAME = new CipherSuite.Companion.ORDER_BY_NAME.1();
        CipherSuite.INSTANCES = new LinkedHashMap();
        CipherSuite.TLS_RSA_WITH_NULL_MD5 = cipherSuite$Companion0.init("SSL_RSA_WITH_NULL_MD5", 1);
        CipherSuite.TLS_RSA_WITH_NULL_SHA = cipherSuite$Companion0.init("SSL_RSA_WITH_NULL_SHA", 2);
        CipherSuite.TLS_RSA_EXPORT_WITH_RC4_40_MD5 = cipherSuite$Companion0.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        CipherSuite.TLS_RSA_WITH_RC4_128_MD5 = cipherSuite$Companion0.init("SSL_RSA_WITH_RC4_128_MD5", 4);
        CipherSuite.TLS_RSA_WITH_RC4_128_SHA = cipherSuite$Companion0.init("SSL_RSA_WITH_RC4_128_SHA", 5);
        CipherSuite.TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = cipherSuite$Companion0.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        CipherSuite.TLS_RSA_WITH_DES_CBC_SHA = cipherSuite$Companion0.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
        CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        CipherSuite.TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        CipherSuite.TLS_DHE_DSS_WITH_DES_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        CipherSuite.TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        CipherSuite.TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        CipherSuite.TLS_DHE_RSA_WITH_DES_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        CipherSuite.TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        CipherSuite.TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = cipherSuite$Companion0.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        CipherSuite.TLS_DH_anon_WITH_RC4_128_MD5 = cipherSuite$Companion0.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        CipherSuite.TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = cipherSuite$Companion0.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        CipherSuite.TLS_DH_anon_WITH_DES_CBC_SHA = cipherSuite$Companion0.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        CipherSuite.TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        CipherSuite.TLS_KRB5_WITH_DES_CBC_SHA = cipherSuite$Companion0.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0x1F);
        CipherSuite.TLS_KRB5_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_KRB5_WITH_RC4_128_SHA", 0x20);
        CipherSuite.TLS_KRB5_WITH_DES_CBC_MD5 = cipherSuite$Companion0.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = cipherSuite$Companion0.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        CipherSuite.TLS_KRB5_WITH_RC4_128_MD5 = cipherSuite$Companion0.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
        CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = cipherSuite$Companion0.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_SHA = cipherSuite$Companion0.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = cipherSuite$Companion0.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = cipherSuite$Companion0.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_128_CBC_SHA", 0x2F);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        CipherSuite.TLS_RSA_WITH_NULL_SHA256 = cipherSuite$Companion0.init("TLS_RSA_WITH_NULL_SHA256", 59);
        CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256 = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0x40);
        CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = cipherSuite$Companion0.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA256 = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = cipherSuite$Companion0.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0x84);
        CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0x87);
        CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0x88);
        CipherSuite.TLS_PSK_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_PSK_WITH_RC4_128_SHA", 0x8A);
        CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0x8B);
        CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_PSK_WITH_AES_256_CBC_SHA", 0x8D);
        CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA = cipherSuite$Companion0.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 0x9C);
        CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 0x9D);
        CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 0x9E);
        CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0x9F);
        CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0xA2);
        CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0xA3);
        CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0xA6);
        CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0xA7);
        CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV = cipherSuite$Companion0.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0xFF);
        CipherSuite.TLS_FALLBACK_SCSV = cipherSuite$Companion0.init("TLS_FALLBACK_SCSV", 0x5600);
        CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 0xC001);
        CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0xC002);
        CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xC003);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0xC004);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0xC005);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0xC006);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0xC007);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0xC008);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0xC009);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0xC00A);
        CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_NULL_SHA", 0xC00B);
        CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 0xC00C);
        CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0xC00D);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0xC00E);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0xC00F);
        CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 0xC010);
        CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0xC011);
        CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0xC012);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0xC013);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 0xC014);
        CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA = cipherSuite$Companion0.init("TLS_ECDH_anon_WITH_NULL_SHA", 0xC015);
        CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA = cipherSuite$Companion0.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 0xC016);
        CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0xC017);
        CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0xC018);
        CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0xC019);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0xC023);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0xC024);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0xC025);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0xC026);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0xC027);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0xC028);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0xC029);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0xC02A);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0xC02B);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 0xC02C);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 0xC02D);
        CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0xC02E);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0xC02F);
        CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 0xC030);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 0xC031);
        CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0xC032);
        CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0xC035);
        CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = cipherSuite$Companion0.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0xC036);
        CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCA8);
        CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCA9);
        CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = cipherSuite$Companion0.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0xCCAA);
        CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = cipherSuite$Companion0.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0xCCAC);
        CipherSuite.TLS_AES_128_GCM_SHA256 = cipherSuite$Companion0.init("TLS_AES_128_GCM_SHA256", 0x1301);
        CipherSuite.TLS_AES_256_GCM_SHA384 = cipherSuite$Companion0.init("TLS_AES_256_GCM_SHA384", 0x1302);
        CipherSuite.TLS_CHACHA20_POLY1305_SHA256 = cipherSuite$Companion0.init("TLS_CHACHA20_POLY1305_SHA256", 0x1303);
        CipherSuite.TLS_AES_128_CCM_SHA256 = cipherSuite$Companion0.init("TLS_AES_128_CCM_SHA256", 0x1304);
        CipherSuite.TLS_AES_128_CCM_8_SHA256 = cipherSuite$Companion0.init("TLS_AES_128_CCM_8_SHA256", 0x1305);
    }

    private CipherSuite(String s) {
        this.javaName = s;
    }

    public CipherSuite(String s, w w0) {
        this(s);
    }

    @l
    @n
    public static final CipherSuite forJavaName(@l String s) {
        synchronized(CipherSuite.class) {
            return CipherSuite.Companion.forJavaName(s);
        }
    }

    @l
    @i(name = "javaName")
    public final String javaName() {
        return this.javaName;
    }

    @Override
    @l
    public String toString() {
        return this.javaName;
    }
}

