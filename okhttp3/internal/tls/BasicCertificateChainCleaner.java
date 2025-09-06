package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    private static final int MAX_SIGNERS = 9;
    @l
    private final TrustRootIndex trustRootIndex;

    static {
        BasicCertificateChainCleaner.Companion = new Companion(null);
    }

    public BasicCertificateChainCleaner(@l TrustRootIndex trustRootIndex0) {
        L.p(trustRootIndex0, "trustRootIndex");
        super();
        this.trustRootIndex = trustRootIndex0;
    }

    @Override  // okhttp3.internal.tls.CertificateChainCleaner
    @l
    public List clean(@l List list0, @l String s) throws SSLPeerUnverifiedException {
        L.p(list0, "chain");
        L.p(s, "hostname");
        ArrayDeque arrayDeque0 = new ArrayDeque(list0);
        List list1 = new ArrayList();
        Object object0 = arrayDeque0.removeFirst();
        L.o(object0, "queue.removeFirst()");
        list1.add(object0);
        boolean z = false;
        int v = 0;
        while(v < 9) {
            Object object1 = list1.get(list1.size() - 1);
            L.n(object1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate0 = (X509Certificate)object1;
            X509Certificate x509Certificate1 = this.trustRootIndex.findByIssuerAndSignature(x509Certificate0);
            if(x509Certificate1 == null) {
                Iterator iterator0 = arrayDeque0.iterator();
                L.o(iterator0, "queue.iterator()");
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_32;
                    }
                    Object object2 = iterator0.next();
                    L.n(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate)object2;
                    if(this.verifySignature(x509Certificate0, x509Certificate2)) {
                        iterator0.remove();
                        list1.add(x509Certificate2);
                        break;
                    }
                }
            }
            else {
                if(list1.size() > 1 || !L.g(x509Certificate0, x509Certificate1)) {
                    list1.add(x509Certificate1);
                }
                if(this.verifySignature(x509Certificate1, x509Certificate1)) {
                    return list1;
                }
                z = true;
            }
            ++v;
            continue;
        label_32:
            if(!z) {
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate0);
            }
            return list1;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + list1);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof BasicCertificateChainCleaner && L.g(((BasicCertificateChainCleaner)object0).trustRootIndex, this.trustRootIndex);
    }

    @Override
    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }

    private final boolean verifySignature(X509Certificate x509Certificate0, X509Certificate x509Certificate1) {
        if(!L.g(x509Certificate0.getIssuerDN(), x509Certificate1.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate0.verify(x509Certificate1.getPublicKey());
            return true;
        }
        catch(GeneralSecurityException unused_ex) {
            return false;
        }
    }
}

