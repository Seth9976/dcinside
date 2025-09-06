package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

final class zzaop extends zzaoq {
    private final byte[] zza;

    public zzaop(X509Certificate x509Certificate0, byte[] arr_b) {
        super(x509Certificate0);
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzaoq
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }
}

