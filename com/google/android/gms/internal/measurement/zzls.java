package com.google.android.gms.internal.measurement;

final class zzls implements zzla {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzls(zzlc zzlc0, String s, Object[] arr_object) {
        this.zza = zzlc0;
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

    @Override  // com.google.android.gms.internal.measurement.zzla
    public final zzlc zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzla
    public final zzln zzb() {
        int v = this.zzd;
        if((v & 1) != 0) {
            return zzln.zza;
        }
        return (v & 4) == 4 ? zzln.zzc : zzln.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzla
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}

