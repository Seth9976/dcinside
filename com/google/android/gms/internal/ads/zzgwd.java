package com.google.android.gms.internal.ads;

final class zzgwd extends zzgwg {
    private final int zzc;
    private final int zzd;

    zzgwd(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzgwj.zzq(v, v + v1, arr_b.length);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwg
    public final byte zza(int v) {
        zzgwj.zzy(v, this.zzd);
        return this.zza[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgwg
    final byte zzb(int v) {
        return this.zza[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgwg
    protected final int zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwg
    public final int zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwg
    protected final void zze(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zza, this.zzc + v, arr_b, v1, v2);
    }
}

