package com.google.android.gms.internal.clearcut;

final class zzbm extends zzbk {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzfu;
    private int zzfv;
    private int zzfw;
    private int zzfx;

    private zzbm(byte[] arr_b, int v, int v1, boolean z) {
        super(null);
        this.zzfx = 0x7FFFFFFF;
        this.buffer = arr_b;
        this.limit = v1 + v;
        this.pos = v;
        this.zzfw = v;
        this.zzfu = z;
    }

    zzbm(byte[] arr_b, int v, int v1, boolean z, zzbl zzbl0) {
        this(arr_b, v, v1, z);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.pos - this.zzfw;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int v) throws zzco {
        if(v < 0) {
            throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int v1 = v + this.zzaf();
        int v2 = this.zzfx;
        if(v1 > v2) {
            throw zzco.zzbl();
        }
        this.zzfx = v1;
        int v3 = this.limit + this.zzfv;
        this.limit = v3;
        int v4 = v3 - this.zzfw;
        if(v4 > v1) {
            int v5 = v4 - v1;
            this.zzfv = v5;
            this.limit = v3 - v5;
            return v2;
        }
        this.zzfv = 0;
        return v2;
    }
}

