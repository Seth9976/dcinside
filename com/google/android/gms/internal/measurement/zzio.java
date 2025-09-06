package com.google.android.gms.internal.measurement;

final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    zzio(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzik.zza(v, v + v1, arr_b.length);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.measurement.zziv
    public final byte zza(int v) {
        int v1 = this.zzb();
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.measurement.zziv
    final byte zzb(int v) {
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.measurement.zziv
    public final int zzb() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zziv
    protected final int zzc() {
        return this.zzc;
    }
}

