package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zzgew implements zzgdn {
    private final zzgnf zza;

    zzgew(zzgnf zzgnf0, zzgex zzgex0) {
        this.zza = zzgnf0;
        if(zzgnf0.zzg()) {
            zzglq zzglq0 = zzgmf.zzb().zza();
            zzglu zzglu0 = zzglx.zza(zzgnf0);
            zzglq0.zza(zzglu0, "aead", "encrypt");
            zzglq0.zza(zzglu0, "aead", "decrypt");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length > 5) {
            byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
            for(Object object0: this.zza.zzf(arr_b2)) {
                zzgnd zzgnd0 = (zzgnd)object0;
                try {
                    return ((zzgdn)zzgnd0.zzd()).zza(arr_b, arr_b1);
                }
                catch(GeneralSecurityException unused_ex) {
                }
            }
        }
        for(Object object1: this.zza.zzf(zzgds.zza)) {
            zzgnd zzgnd1 = (zzgnd)object1;
            try {
                return ((zzgdn)zzgnd1.zzd()).zza(arr_b, arr_b1);
            }
            catch(GeneralSecurityException unused_ex) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

