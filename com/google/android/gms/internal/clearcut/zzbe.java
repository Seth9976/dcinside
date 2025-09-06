package com.google.android.gms.internal.clearcut;

final class zzbe extends zzbi {
    private final int zzfm;
    private final int zzfn;

    zzbe(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzbb.zzb(v, v + v1, arr_b.length);
        this.zzfm = v;
        this.zzfn = v1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbi
    public final int size() {
        return this.zzfn;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbi
    protected final int zzac() {
        return this.zzfm;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbi
    public final byte zzj(int v) {
        int v1 = this.size();
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.zzfp[this.zzfm + v];
    }
}

