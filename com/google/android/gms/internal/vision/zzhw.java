package com.google.android.gms.internal.vision;

final class zzhw extends zzid {
    private final int zzc;
    private final int zzd;

    zzhw(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzht.zzb(v, v + v1, arr_b.length);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.vision.zzid
    public final byte zza(int v) {
        int v1 = this.zza();
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.vision.zzid
    public final int zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.vision.zzid
    protected final void zza(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zzb, this.zze(), arr_b, 0, v2);
    }

    @Override  // com.google.android.gms.internal.vision.zzid
    final byte zzb(int v) {
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.vision.zzid
    protected final int zze() {
        return this.zzc;
    }
}

