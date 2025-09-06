package com.google.android.gms.internal.ads;

final class zzgah {
    static long zza(double f) {
        zzfun.zzf(zzgah.zzb(f), "not a normal value");
        long v = Double.doubleToRawLongBits(f);
        return Math.getExponent(f) == 0xFFFFFC01 ? (v & 0xFFFFFFFFFFFFFL) + (v & 0xFFFFFFFFFFFFFL) : v & 0xFFFFFFFFFFFFFL | 0x10000000000000L;
    }

    static boolean zzb(double f) {
        return Math.getExponent(f) <= 0x3FF;
    }
}

