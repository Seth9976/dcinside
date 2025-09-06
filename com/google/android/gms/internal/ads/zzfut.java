package com.google.android.gms.internal.ads;

final class zzfut extends zzfva {
    final zzfty zza;

    zzfut(zzfuu zzfuu0, zzfvc zzfvc0, CharSequence charSequence0, zzfty zzfty0) {
        this.zza = zzfty0;
        super(zzfvc0, charSequence0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfva
    final int zzc(int v) {
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfva
    final int zzd(int v) {
        CharSequence charSequence0 = this.zzb;
        int v1 = charSequence0.length();
        zzfun.zzb(v, v1, "index");
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(!this.zza.zzb(((char)v2))) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }
}

