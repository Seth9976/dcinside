package com.google.android.gms.internal.clearcut;

final class zzbg {
    private final byte[] buffer;
    private final zzbn zzfo;

    private zzbg(int v) {
        byte[] arr_b = new byte[v];
        this.buffer = arr_b;
        this.zzfo = zzbn.zzc(arr_b);
    }

    zzbg(int v, zzbc zzbc0) {
        this(v);
    }

    public final zzbb zzad() {
        if(this.zzfo.zzag() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new zzbi(this.buffer);
    }

    public final zzbn zzae() {
        return this.zzfo;
    }
}

