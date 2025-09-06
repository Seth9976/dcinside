package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

public final class zzgeq {
    public static zzgek zza(byte[] arr_b) throws GeneralSecurityException {
        zzgsp zzgsp0;
        try {
            zzgsp0 = zzgsp.zzf(arr_b, zzgxb.zza());
        }
        catch(IOException iOException0) {
            throw new GeneralSecurityException("Failed to parse proto", iOException0);
        }
        zzgmk zzgmk0 = zzgmk.zzc();
        zzgni zzgni0 = zzgni.zza(zzgsp0);
        return !zzgmk0.zzk(zzgni0) ? new zzgll(zzgni0) : zzgmk0.zzb(zzgni0);
    }

    public static byte[] zzb(zzgek zzgek0) throws GeneralSecurityException {
        return ((zzgni)zzgmk.zzc().zze(zzgek0, zzgni.class)).zzc().zzaV();
    }
}

