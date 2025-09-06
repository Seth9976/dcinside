package com.google.android.gms.internal.vision;

final class zzla implements zzki {
    private final zzkk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzla(zzkk zzkk0, String s, Object[] arr_object) {
        this.zza = zzkk0;
        this.zzb = s;
        this.zzc = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.zzd = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v2 = 13;
        int v4;
        for(int v3 = 1; (v4 = s.charAt(v3)) >= 0xD800; ++v3) {
            v1 |= (v4 & 0x1FFF) << v2;
            v2 += 13;
        }
        this.zzd = v1 | v4 << v2;
    }

    @Override  // com.google.android.gms.internal.vision.zzki
    public final int zza() {
        return (this.zzd & 1) == 1 ? zzkz.zza : zzkz.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzki
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override  // com.google.android.gms.internal.vision.zzki
    public final zzkk zzc() {
        return this.zza;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}

