package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import y4.l;
import y4.m;

public interface TrustRootIndex {
    @m
    X509Certificate findByIssuerAndSignature(@l X509Certificate arg1);
}

