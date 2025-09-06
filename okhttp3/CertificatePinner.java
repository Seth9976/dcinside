package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.o.a;
import okio.o;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@s0({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class CertificatePinner {
    public static final class Builder {
        @l
        private final List pins;

        public Builder() {
            this.pins = new ArrayList();
        }

        @l
        public final Builder add(@l String s, @l String[] arr_s) {
            L.p(s, "pattern");
            L.p(arr_s, "pins");
            for(int v = 0; v < arr_s.length; ++v) {
                Pin certificatePinner$Pin0 = new Pin(s, arr_s[v]);
                this.pins.add(certificatePinner$Pin0);
            }
            return this;
        }

        @l
        public final CertificatePinner build() {
            return new CertificatePinner(u.a6(this.pins), null, 2, null);
        }

        @l
        public final List getPins() {
            return this.pins;
        }
    }

    @s0({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final String pin(@l Certificate certificate0) {
            L.p(certificate0, "certificate");
            if(!(certificate0 instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + this.sha256Hash(((X509Certificate)certificate0)).d();
        }

        @l
        @n
        public final o sha1Hash(@l X509Certificate x509Certificate0) {
            L.p(x509Certificate0, "<this>");
            byte[] arr_b = x509Certificate0.getPublicKey().getEncoded();
            L.o(arr_b, "publicKey.encoded");
            return a.p(o.d, arr_b, 0, 0, 3, null).e0();
        }

        @l
        @n
        public final o sha256Hash(@l X509Certificate x509Certificate0) {
            L.p(x509Certificate0, "<this>");
            byte[] arr_b = x509Certificate0.getPublicKey().getEncoded();
            L.o(arr_b, "publicKey.encoded");
            return a.p(o.d, arr_b, 0, 0, 3, null).f0();
        }
    }

    public static final class Pin {
        @l
        private final o hash;
        @l
        private final String hashAlgorithm;
        @l
        private final String pattern;

        public Pin(@l String s, @l String s1) {
            L.p(s, "pattern");
            L.p(s1, "pin");
            super();
            if((!v.v2(s, "*.", false, 2, null) || v.s3(s, "*", 1, false, 4, null) != -1) && (!v.v2(s, "**.", false, 2, null) || v.s3(s, "*", 2, false, 4, null) != -1) && v.s3(s, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + s).toString());
            }
            String s2 = HostnamesKt.toCanonicalHost(s);
            if(s2 == null) {
                throw new IllegalArgumentException("Invalid pattern: " + s);
            }
            this.pattern = s2;
            if(v.v2(s1, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                String s3 = s1.substring(5);
                L.o(s3, "this as java.lang.String).substring(startIndex)");
                o o0 = o.d.h(s3);
                if(o0 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: " + s1);
                }
                this.hash = o0;
                return;
            }
            if(!v.v2(s1, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with \'sha256/\' or \'sha1/\': " + s1);
            }
            this.hashAlgorithm = "sha256";
            String s4 = s1.substring(7);
            L.o(s4, "this as java.lang.String).substring(startIndex)");
            o o1 = o.d.h(s4);
            if(o1 == null) {
                throw new IllegalArgumentException("Invalid pin hash: " + s1);
            }
            this.hash = o1;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Pin)) {
                return false;
            }
            if(!L.g(this.pattern, ((Pin)object0).pattern)) {
                return false;
            }
            return L.g(this.hashAlgorithm, ((Pin)object0).hashAlgorithm) ? L.g(this.hash, ((Pin)object0).hash) : false;
        }

        @l
        public final o getHash() {
            return this.hash;
        }

        @l
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @l
        public final String getPattern() {
            return this.pattern;
        }

        @Override
        public int hashCode() {
            return (this.pattern.hashCode() * 0x1F + this.hashAlgorithm.hashCode()) * 0x1F + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@l X509Certificate x509Certificate0) {
            L.p(x509Certificate0, "certificate");
            String s = this.hashAlgorithm;
            if(L.g(s, "sha256")) {
                o o0 = CertificatePinner.Companion.sha256Hash(x509Certificate0);
                return L.g(this.hash, o0);
            }
            if(L.g(s, "sha1")) {
                o o1 = CertificatePinner.Companion.sha1Hash(x509Certificate0);
                return L.g(this.hash, o1);
            }
            return false;
        }

        public final boolean matchesHostname(@l String s) {
            L.p(s, "hostname");
            if(v.v2(this.pattern, "**.", false, 2, null)) {
                int v = this.pattern.length();
                int v1 = s.length() - (v - 3);
                return v.g2(s, s.length() - (v - 3), this.pattern, 3, v - 3, false, 16, null) && (v1 == 0 || s.charAt(v1 - 1) == 46);
            }
            if(v.v2(this.pattern, "*.", false, 2, null)) {
                int v2 = this.pattern.length();
                return v.g2(s, s.length() - (v2 - 1), this.pattern, 1, v2 - 1, false, 16, null) && v.G3(s, '.', s.length() - (v2 - 1) - 1, false, 4, null) == -1;
            }
            return L.g(s, this.pattern);
        }

        @Override
        @l
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.d();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final CertificatePinner DEFAULT;
    @m
    private final CertificateChainCleaner certificateChainCleaner;
    @l
    private final Set pins;

    static {
        CertificatePinner.Companion = new Companion(null);
        CertificatePinner.DEFAULT = new Builder().build();
    }

    public CertificatePinner(@l Set set0, @m CertificateChainCleaner certificateChainCleaner0) {
        L.p(set0, "pins");
        super();
        this.pins = set0;
        this.certificateChainCleaner = certificateChainCleaner0;
    }

    public CertificatePinner(Set set0, CertificateChainCleaner certificateChainCleaner0, int v, w w0) {
        if((v & 2) != 0) {
            certificateChainCleaner0 = null;
        }
        this(set0, certificateChainCleaner0);
    }

    public final void check(@l String s, @l List list0) throws SSLPeerUnverifiedException {
        L.p(s, "hostname");
        L.p(list0, "peerCertificates");
        this.check$okhttp(s, new A3.a(list0, s) {
            final String $hostname;
            final List $peerCertificates;

            {
                CertificatePinner.this = certificatePinner0;
                this.$peerCertificates = list0;
                this.$hostname = s;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final List invoke() {
                List list0;
                CertificateChainCleaner certificateChainCleaner0 = CertificatePinner.this.getCertificateChainCleaner$okhttp();
                if(certificateChainCleaner0 == null) {
                    list0 = this.$peerCertificates;
                }
                else {
                    list0 = certificateChainCleaner0.clean(this.$peerCertificates, this.$hostname);
                    if(list0 == null) {
                        list0 = this.$peerCertificates;
                    }
                }
                List list1 = new ArrayList(u.b0(list0, 10));
                for(Object object0: list0) {
                    L.n(((Certificate)object0), "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    list1.add(((X509Certificate)(((Certificate)object0))));
                }
                return list1;
            }
        });
    }

    @k(message = "replaced with {@link #check(String, List)}.", replaceWith = @c0(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@l String s, @l Certificate[] arr_certificate) throws SSLPeerUnverifiedException {
        L.p(s, "hostname");
        L.p(arr_certificate, "peerCertificates");
        this.check(s, kotlin.collections.l.Ky(arr_certificate));
    }

    public final void check$okhttp(@l String s, @l A3.a a0) {
        L.p(s, "hostname");
        L.p(a0, "cleanedPeerCertificatesFn");
        List list0 = this.findMatchingPins(s);
        if(list0.isEmpty()) {
            return;
        }
        List list1 = (List)a0.invoke();
        for(Object object0: list1) {
            X509Certificate x509Certificate0 = (X509Certificate)object0;
            o o0 = null;
            o o1 = null;
            for(Object object1: list0) {
                Pin certificatePinner$Pin0 = (Pin)object1;
                String s1 = certificatePinner$Pin0.getHashAlgorithm();
                if(L.g(s1, "sha256")) {
                    if(o0 == null) {
                        o0 = CertificatePinner.Companion.sha256Hash(x509Certificate0);
                    }
                    if(!L.g(certificatePinner$Pin0.getHash(), o0)) {
                        continue;
                    }
                    return;
                }
                if(!L.g(s1, "sha1")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + certificatePinner$Pin0.getHashAlgorithm());
                }
                if(o1 == null) {
                    o1 = CertificatePinner.Companion.sha1Hash(x509Certificate0);
                }
                if(!L.g(certificatePinner$Pin0.getHash(), o1)) {
                    continue;
                }
                return;
            }
            if(false) {
                break;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Certificate pinning failure!");
        stringBuilder0.append("\n  Peer certificate chain:");
        for(Object object2: list1) {
            stringBuilder0.append("\n    ");
            stringBuilder0.append(CertificatePinner.Companion.pin(((X509Certificate)object2)));
            stringBuilder0.append(": ");
            stringBuilder0.append(((X509Certificate)object2).getSubjectDN().getName());
        }
        stringBuilder0.append("\n  Pinned certificates for ");
        stringBuilder0.append(s);
        stringBuilder0.append(":");
        for(Object object3: list0) {
            stringBuilder0.append("\n    ");
            stringBuilder0.append(((Pin)object3));
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(s2);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof CertificatePinner && L.g(((CertificatePinner)object0).pins, this.pins) && L.g(((CertificatePinner)object0).certificateChainCleaner, this.certificateChainCleaner);
    }

    @l
    public final List findMatchingPins(@l String s) {
        L.p(s, "hostname");
        List list0 = u.H();
        for(Object object0: this.pins) {
            if(((Pin)object0).matchesHostname(s)) {
                if(list0.isEmpty()) {
                    list0 = new ArrayList();
                }
                L.n(list0, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                v0.g(list0).add(object0);
            }
        }
        return list0;
    }

    @m
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    @l
    public final Set getPins() {
        return this.pins;
    }

    @Override
    public int hashCode() {
        int v = this.pins.hashCode();
        return this.certificateChainCleaner == null ? (v + 0x5ED) * 41 : (v + 0x5ED) * 41 + this.certificateChainCleaner.hashCode();
    }

    @l
    @n
    public static final String pin(@l Certificate certificate0) {
        return CertificatePinner.Companion.pin(certificate0);
    }

    @l
    @n
    public static final o sha1Hash(@l X509Certificate x509Certificate0) {
        return CertificatePinner.Companion.sha1Hash(x509Certificate0);
    }

    @l
    @n
    public static final o sha256Hash(@l X509Certificate x509Certificate0) {
        return CertificatePinner.Companion.sha256Hash(x509Certificate0);
    }

    @l
    public final CertificatePinner withCertificateChainCleaner$okhttp(@l CertificateChainCleaner certificateChainCleaner0) {
        L.p(certificateChainCleaner0, "certificateChainCleaner");
        return L.g(this.certificateChainCleaner, certificateChainCleaner0) ? this : new CertificatePinner(this.pins, certificateChainCleaner0);
    }
}

