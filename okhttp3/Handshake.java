package okhttp3;

import A3.a;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.D;
import kotlin.E;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import okhttp3.internal.Util;
import y4.l;
import z3.i;
import z3.n;

@s0({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
public final class Handshake {
    @s0({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class Companion {
        @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "sslSession.handshake()", imports = {}))
        @l
        @i(name = "-deprecated_get")
        public final Handshake -deprecated_get(@l SSLSession sSLSession0) throws IOException {
            L.p(sSLSession0, "sslSession");
            return this.get(sSLSession0);
        }

        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @i(name = "get")
        @n
        public final Handshake get(@l SSLSession sSLSession0) throws IOException {
            List list0;
            L.p(sSLSession0, "<this>");
            String s = sSLSession0.getCipherSuite();
            if(s == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if((L.g(s, "TLS_NULL_WITH_NULL_NULL") ? true : L.g(s, "SSL_NULL_WITH_NULL_NULL"))) {
                throw new IOException("cipherSuite == " + s);
            }
            CipherSuite cipherSuite0 = CipherSuite.Companion.forJavaName(s);
            String s1 = sSLSession0.getProtocol();
            if(s1 == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if(!L.g("NONE", s1)) {
                TlsVersion tlsVersion0 = TlsVersion.Companion.forJavaName(s1);
                try {
                    list0 = this.toImmutableList(sSLSession0.getPeerCertificates());
                    return new Handshake(tlsVersion0, cipherSuite0, this.toImmutableList(sSLSession0.getLocalCertificates()), new a() {
                        final List $peerCertificatesCopy;

                        {
                            this.$peerCertificatesCopy = list0;
                            super(0);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.invoke();
                        }

                        @l
                        public final List invoke() {
                            return this.$peerCertificatesCopy;
                        }
                    });
                }
                catch(SSLPeerUnverifiedException unused_ex) {
                    list0 = u.H();
                    return new Handshake(tlsVersion0, cipherSuite0, this.toImmutableList(sSLSession0.getLocalCertificates()), new a() {
                        final List $peerCertificatesCopy;

                        {
                            this.$peerCertificatesCopy = list0;
                            super(0);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.invoke();
                        }

                        @l
                        public final List invoke() {
                            return this.$peerCertificatesCopy;
                        }
                    });
                }
            }
            throw new IOException("tlsVersion == NONE");
        }

        @l
        @n
        public final Handshake get(@l TlsVersion tlsVersion0, @l CipherSuite cipherSuite0, @l List list0, @l List list1) {
            L.p(tlsVersion0, "tlsVersion");
            L.p(cipherSuite0, "cipherSuite");
            L.p(list0, "peerCertificates");
            L.p(list1, "localCertificates");
            List list2 = Util.toImmutableList(list0);
            return new Handshake(tlsVersion0, cipherSuite0, Util.toImmutableList(list1), new a() {
                final List $peerCertificatesCopy;

                {
                    this.$peerCertificatesCopy = list0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.invoke();
                }

                @l
                public final List invoke() {
                    return this.$peerCertificatesCopy;
                }
            });
        }

        private final List toImmutableList(Certificate[] arr_certificate) {
            return arr_certificate == null ? u.H() : Util.immutableListOf(Arrays.copyOf(arr_certificate, arr_certificate.length));
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final CipherSuite cipherSuite;
    @l
    private final List localCertificates;
    @l
    private final D peerCertificates$delegate;
    @l
    private final TlsVersion tlsVersion;

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "cipherSuite", imports = {}))
    @l
    @i(name = "-deprecated_cipherSuite")
    public final CipherSuite -deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "localCertificates", imports = {}))
    @l
    @i(name = "-deprecated_localCertificates")
    public final List -deprecated_localCertificates() {
        return this.localCertificates;
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "localPrincipal", imports = {}))
    @y4.m
    @i(name = "-deprecated_localPrincipal")
    public final Principal -deprecated_localPrincipal() {
        return this.localPrincipal();
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "peerCertificates", imports = {}))
    @l
    @i(name = "-deprecated_peerCertificates")
    public final List -deprecated_peerCertificates() {
        return this.peerCertificates();
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "peerPrincipal", imports = {}))
    @y4.m
    @i(name = "-deprecated_peerPrincipal")
    public final Principal -deprecated_peerPrincipal() {
        return this.peerPrincipal();
    }

    @k(level = m.b, message = "moved to val", replaceWith = @c0(expression = "tlsVersion", imports = {}))
    @l
    @i(name = "-deprecated_tlsVersion")
    public final TlsVersion -deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    static {
        Handshake.Companion = new Companion(null);
    }

    public Handshake(@l TlsVersion tlsVersion0, @l CipherSuite cipherSuite0, @l List list0, @l a a0) {
        L.p(tlsVersion0, "tlsVersion");
        L.p(cipherSuite0, "cipherSuite");
        L.p(list0, "localCertificates");
        L.p(a0, "peerCertificatesFn");
        super();
        this.tlsVersion = tlsVersion0;
        this.cipherSuite = cipherSuite0;
        this.localCertificates = list0;
        this.peerCertificates$delegate = E.a(new a() {
            final a $peerCertificatesFn;

            {
                this.$peerCertificatesFn = a0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final List invoke() {
                try {
                    return (List)this.$peerCertificatesFn.invoke();
                }
                catch(SSLPeerUnverifiedException unused_ex) {
                    return u.H();
                }
            }
        });
    }

    @l
    @i(name = "cipherSuite")
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof Handshake && ((Handshake)object0).tlsVersion == this.tlsVersion && L.g(((Handshake)object0).cipherSuite, this.cipherSuite) && L.g(((Handshake)object0).peerCertificates(), this.peerCertificates()) && L.g(((Handshake)object0).localCertificates, this.localCertificates);
    }

    @l
    @i(name = "get")
    @n
    public static final Handshake get(@l SSLSession sSLSession0) throws IOException {
        return Handshake.Companion.get(sSLSession0);
    }

    @l
    @n
    public static final Handshake get(@l TlsVersion tlsVersion0, @l CipherSuite cipherSuite0, @l List list0, @l List list1) {
        return Handshake.Companion.get(tlsVersion0, cipherSuite0, list0, list1);
    }

    private final String getName(Certificate certificate0) {
        if(certificate0 instanceof X509Certificate) {
            return ((X509Certificate)certificate0).getSubjectDN().toString();
        }
        String s = certificate0.getType();
        L.o(s, "type");
        return s;
    }

    @Override
    public int hashCode() {
        int v = this.peerCertificates().hashCode();
        return (((this.tlsVersion.hashCode() + 0x20F) * 0x1F + this.cipherSuite.hashCode()) * 0x1F + v) * 0x1F + this.localCertificates.hashCode();
    }

    @l
    @i(name = "localCertificates")
    public final List localCertificates() {
        return this.localCertificates;
    }

    @y4.m
    @i(name = "localPrincipal")
    public final Principal localPrincipal() {
        Object object0 = u.G2(this.localCertificates);
        X509Certificate x509Certificate0 = object0 instanceof X509Certificate ? ((X509Certificate)object0) : null;
        return x509Certificate0 != null ? x509Certificate0.getSubjectX500Principal() : null;
    }

    @l
    @i(name = "peerCertificates")
    public final List peerCertificates() {
        return (List)this.peerCertificates$delegate.getValue();
    }

    @y4.m
    @i(name = "peerPrincipal")
    public final Principal peerPrincipal() {
        Object object0 = u.G2(this.peerCertificates());
        X509Certificate x509Certificate0 = object0 instanceof X509Certificate ? ((X509Certificate)object0) : null;
        return x509Certificate0 != null ? x509Certificate0.getSubjectX500Principal() : null;
    }

    @l
    @i(name = "tlsVersion")
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @Override
    @l
    public String toString() {
        Iterable iterable0 = this.peerCertificates();
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(this.getName(((Certificate)object0)));
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Handshake{tlsVersion=");
        stringBuilder0.append(this.tlsVersion);
        stringBuilder0.append(" cipherSuite=");
        stringBuilder0.append(this.cipherSuite);
        stringBuilder0.append(" peerCertificates=");
        stringBuilder0.append(arrayList0.toString());
        stringBuilder0.append(" localCertificates=");
        ArrayList arrayList1 = new ArrayList(u.b0(this.localCertificates, 10));
        for(Object object1: this.localCertificates) {
            arrayList1.add(this.getName(((Certificate)object1)));
        }
        stringBuilder0.append(arrayList1);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

