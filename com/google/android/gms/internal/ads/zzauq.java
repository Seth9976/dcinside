package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

final class zzauq implements zzfpd {
    final zzfnd zza;

    zzauq(zzaus zzaus0, zzfnd zzfnd0) {
        this.zza = zzfnd0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfpd
    public final boolean zza(File file0) {
        try {
            return this.zza.zza(file0);
        }
        catch(GeneralSecurityException unused_ex) {
            return false;
        }
    }
}

