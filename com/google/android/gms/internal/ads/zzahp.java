package com.google.android.gms.internal.ads;

final class zzahp extends zzacb implements zzahu {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahp(long v, long v1, int v2, int v3, boolean z) {
        super(v, v1, v2, v3, false);
        this.zza = v1;
        this.zzb = v2;
        this.zzc = v3;
        if(v == -1L) {
            v = -1L;
        }
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zze(long v) {
        return this.zzb(v);
    }

    public final zzahp zzf(long v) {
        return new zzahp(v, this.zza, this.zzb, this.zzc, false);
    }
}

