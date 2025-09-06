package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

final class zzccn implements zzhed {
    private final ByteBuffer zza;

    zzccn(ByteBuffer byteBuffer0) {
        this.zza = byteBuffer0.duplicate();
    }

    @Override
    public final void close() throws IOException {
    }

    @Override  // com.google.android.gms.internal.ads.zzhed
    public final int zza(ByteBuffer byteBuffer0) throws IOException {
        if(this.zza.remaining() == 0 && byteBuffer0.remaining() > 0) {
            return -1;
        }
        int v = Math.min(byteBuffer0.remaining(), this.zza.remaining());
        byte[] arr_b = new byte[v];
        this.zza.get(arr_b);
        byteBuffer0.put(arr_b);
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzhed
    public final long zzb() throws IOException {
        return (long)this.zza.position();
    }

    @Override  // com.google.android.gms.internal.ads.zzhed
    public final long zzc() throws IOException {
        return (long)this.zza.limit();
    }

    @Override  // com.google.android.gms.internal.ads.zzhed
    public final ByteBuffer zzd(long v, long v1) throws IOException {
        this.zza.position(((int)v));
        ByteBuffer byteBuffer0 = this.zza.slice();
        byteBuffer0.limit(((int)v1));
        this.zza.position(this.zza.position());
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhed
    public final void zze(long v) throws IOException {
        this.zza.position(((int)v));
    }
}

