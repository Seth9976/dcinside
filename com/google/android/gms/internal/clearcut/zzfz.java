package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class zzfz {
    protected volatile int zzrs;

    public zzfz() {
        this.zzrs = -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzep();
    }

    @Override
    public String toString() {
        return zzga.zza(this);
    }

    public static final void zza(zzfz zzfz0, byte[] arr_b, int v, int v1) {
        try {
            zzfs zzfs0 = zzfs.zzh(arr_b, 0, v1);
            zzfz0.zza(zzfs0);
            zzfs0.zzem();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public void zza(zzfs zzfs0) throws IOException {
    }

    public final int zzas() {
        int v = this.zzen();
        this.zzrs = v;
        return v;
    }

    protected int zzen() {
        return 0;
    }

    public zzfz zzep() throws CloneNotSupportedException {
        return (zzfz)super.clone();
    }
}

