package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class zzgvj extends ThreadLocal {
    final zzgvk zza;

    zzgvj(zzgvk zzgvk0) {
        this.zza = zzgvk0;
        super();
    }

    @Override
    protected final Object initialValue() {
        return this.zza();
    }

    protected final Mac zza() {
        try {
            Mac mac0 = (Mac)zzguw.zzb.zza(this.zza.zzb);
            mac0.init(this.zza.zzc);
            return mac0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

