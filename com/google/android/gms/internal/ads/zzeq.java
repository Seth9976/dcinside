package com.google.android.gms.internal.ads;

public class zzeq {
    public final int zzd;

    zzeq(int v, zzep zzep0) {
        this.zzd = v;
    }

    @Override
    public String toString() {
        return zzeq.zze(this.zzd);
    }

    public static String zze(int v) {
        return ((char)(v >> 24 & 0xFF)) + ((char)(v >> 16 & 0xFF)) + ((char)(v >> 8 & 0xFF)) + ((char)(v & 0xFF));
    }
}

