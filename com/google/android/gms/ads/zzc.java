package com.google.android.gms.ads;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
public final class zzc {
    public static int zza(AdSize adSize0) {
        return adSize0.zzb();
    }

    public static int zzb(AdSize adSize0) {
        return adSize0.zza();
    }

    public static AdSize zzc(int v, int v1, String s) {
        return new AdSize(v, v1, s);
    }

    public static AdSize zzd(int v, int v1) {
        AdSize adSize0 = new AdSize(v, v1);
        adSize0.zze(true);
        adSize0.zzc(v1);
        return adSize0;
    }

    public static AdSize zze(int v, int v1) {
        AdSize adSize0 = new AdSize(v, v1);
        adSize0.zzf(true);
        adSize0.zzd(v1);
        return adSize0;
    }

    public static boolean zzf(AdSize adSize0) {
        return adSize0.zzg();
    }

    public static boolean zzg(AdSize adSize0) {
        return adSize0.zzh();
    }

    public static boolean zzh(AdSize adSize0) {
        return adSize0.zzi();
    }
}

