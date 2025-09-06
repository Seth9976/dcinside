package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzgac extends FilterInputStream {
    private long zza;
    private long zzb;

    zzgac(InputStream inputStream0, long v) {
        super(inputStream0);
        this.zzb = -1L;
        inputStream0.getClass();
        zzfun.zzf(v >= 0L, "limit must be non-negative");
        this.zza = v;
    }

    @Override
    public final int available() throws IOException {
        return (int)Math.min(this.in.available(), this.zza);
    }

    @Override
    public final void mark(int v) {
        synchronized(this) {
            this.in.mark(v);
            this.zzb = this.zza;
        }
    }

    @Override
    public final int read() throws IOException {
        if(this.zza == 0L) {
            return -1;
        }
        int v = this.in.read();
        if(v != -1) {
            --this.zza;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        long v2 = this.zza;
        if(v2 == 0L) {
            return -1;
        }
        int v3 = this.in.read(arr_b, v, ((int)Math.min(v1, v2)));
        if(v3 != -1) {
            this.zza -= (long)v3;
        }
        return v3;
    }

    @Override
    public final void reset() throws IOException {
        synchronized(this) {
            if(this.in.markSupported()) {
                if(this.zzb == -1L) {
                    throw new IOException("Mark not set");
                }
                this.in.reset();
                this.zza = this.zzb;
                return;
            }
        }
        throw new IOException("Mark not supported");
    }

    @Override
    public final long skip(long v) throws IOException {
        long v1 = this.in.skip(Math.min(v, this.zza));
        this.zza -= v1;
        return v1;
    }
}

