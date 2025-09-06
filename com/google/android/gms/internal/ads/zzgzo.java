package com.google.android.gms.internal.ads;

final class zzgzo implements zzgyz {
    private final zzgzc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzgzo(zzgzc zzgzc0, String s, Object[] arr_object) {
        this.zza = zzgzc0;
        this.zzb = s;
        this.zzc = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.zzd = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v3 = 13;
        int v4;
        for(int v2 = 1; (v4 = s.charAt(v2)) >= 0xD800; ++v2) {
            v1 |= (v4 & 0x1FFF) << v3;
            v3 += 13;
        }
        this.zzd = v1 | v4 << v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyz
    public final zzgzc zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyz
    public final int zzc() {
        int v = this.zzd;
        if((v & 1) != 0) {
            return 1;
        }
        return (v & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}

