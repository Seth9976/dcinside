package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class BasicTrustRootIndex implements TrustRootIndex {
    @l
    private final Map subjectToCaCerts;

    public BasicTrustRootIndex(@l X509Certificate[] arr_x509Certificate) {
        L.p(arr_x509Certificate, "caCerts");
        super();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v = 0; v < arr_x509Certificate.length; ++v) {
            X509Certificate x509Certificate0 = arr_x509Certificate[v];
            X500Principal x500Principal0 = x509Certificate0.getSubjectX500Principal();
            L.o(x500Principal0, "caCert.subjectX500Principal");
            LinkedHashSet linkedHashSet0 = linkedHashMap0.get(x500Principal0);
            if(linkedHashSet0 == null) {
                linkedHashSet0 = new LinkedHashSet();
                linkedHashMap0.put(x500Principal0, linkedHashSet0);
            }
            linkedHashSet0.add(x509Certificate0);
        }
        this.subjectToCaCerts = linkedHashMap0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof BasicTrustRootIndex && L.g(((BasicTrustRootIndex)object0).subjectToCaCerts, this.subjectToCaCerts);
    }

    @Override  // okhttp3.internal.tls.TrustRootIndex
    @m
    public X509Certificate findByIssuerAndSignature(@l X509Certificate x509Certificate0) {
        L.p(x509Certificate0, "cert");
        X500Principal x500Principal0 = x509Certificate0.getIssuerX500Principal();
        Set set0 = (Set)this.subjectToCaCerts.get(x500Principal0);
        if(set0 == null) {
            return null;
        }
        for(Object object0: set0) {
            X509Certificate x509Certificate1 = (X509Certificate)object0;
            try {
                x509Certificate0.verify(x509Certificate1.getPublicKey());
                return (X509Certificate)object0;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}

