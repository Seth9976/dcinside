package com.google.android.gms.internal.ads;

final class zzccr extends zzaqv {
    static final zzccr zzb;

    static {
        zzccr.zzb = new zzccr();
    }

    @Override  // com.google.android.gms.internal.ads.zzaqv
    public final zzaqz zza(String s, byte[] arr_b, String s1) {
        if("moov".equals(s)) {
            return new zzarb();
        }
        return "mvhd".equals(s) ? new zzarc() : new zzard(s);
    }
}

