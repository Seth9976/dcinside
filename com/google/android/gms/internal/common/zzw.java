package com.google.android.gms.internal.common;

final class zzw extends zzz {
    final zzr zza;

    zzw(zzx zzx0, zzaa zzaa0, CharSequence charSequence0, zzr zzr0) {
        this.zza = zzr0;
        super(zzaa0, charSequence0);
    }

    @Override  // com.google.android.gms.internal.common.zzz
    final int zzc(int v) {
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.common.zzz
    final int zzd(int v) {
        CharSequence charSequence0 = this.zzb;
        int v1 = charSequence0.length();
        zzv.zzb(v, v1, "index");
        while(v < v1) {
            int v2 = charSequence0.charAt(v);
            if(!this.zza.zza(((char)v2))) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }
}

