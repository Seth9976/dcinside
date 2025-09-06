package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzak;
import java.util.HashMap;

@KeepForSdk
@ShowFirstParty
public class GmsSignatureVerifier {
    private static final zzaa zza;
    private static final zzaa zzb;
    private static final HashMap zzc;

    static {
        zzy zzy0 = new zzy();
        zzy0.zzd("com.google.android.gms");
        zzy0.zza(204200000L);
        zzy0.zzc(zzak.zzn(zzn.zzd.zzf(), zzn.zzb.zzf()));
        zzy0.zzb(zzak.zzn(zzn.zzc.zzf(), zzn.zza.zzf()));
        GmsSignatureVerifier.zza = zzy0.zze();
        zzy zzy1 = new zzy();
        zzy1.zzd("com.android.vending");
        zzy1.zza(82240000L);
        zzy1.zzc(zzak.zzm(zzn.zzd.zzf()));
        zzy1.zzb(zzak.zzm(zzn.zzc.zzf()));
        GmsSignatureVerifier.zzb = zzy1.zze();
        GmsSignatureVerifier.zzc = new HashMap();
    }
}

