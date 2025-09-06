package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class zzaqq extends ByteArrayOutputStream {
    private final zzaqd zza;

    public zzaqq(zzaqd zzaqd0, int v) {
        this.zza = zzaqd0;
        this.buf = zzaqd0.zzb(Math.max(v, 0x100));
    }

    @Override
    public final void close() throws IOException {
        this.zza.zza(this.buf);
        this.buf = null;
        super.close();
    }

    @Override
    public final void finalize() {
        this.zza.zza(this.buf);
    }

    @Override
    public final void write(int v) {
        synchronized(this) {
            this.zza(1);
            super.write(v);
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            this.zza(v1);
            super.write(arr_b, v, v1);
        }
    }

    private final void zza(int v) {
        int v1 = this.count;
        if(v1 + v <= this.buf.length) {
            return;
        }
        byte[] arr_b = this.zza.zzb(v * 2 + v1 * 2);
        System.arraycopy(this.buf, 0, arr_b, 0, this.count);
        this.zza.zza(this.buf);
        this.buf = arr_b;
    }
}

