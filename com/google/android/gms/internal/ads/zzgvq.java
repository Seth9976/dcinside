package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzgvq extends FilterInputStream {
    private int zza;

    zzgvq(InputStream inputStream0, int v) {
        super(inputStream0);
        this.zza = v;
    }

    @Override
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override
    public final int read() throws IOException {
        if(this.zza <= 0) {
            return -1;
        }
        int v = super.read();
        if(v >= 0) {
            --this.zza;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.zza;
        if(v2 <= 0) {
            return -1;
        }
        int v3 = super.read(arr_b, v, Math.min(v1, v2));
        if(v3 >= 0) {
            this.zza -= v3;
        }
        return v3;
    }

    @Override
    public final long skip(long v) throws IOException {
        int v1 = (int)super.skip(Math.min(v, this.zza));
        if(v1 >= 0) {
            this.zza -= v1;
        }
        return (long)v1;
    }
}

