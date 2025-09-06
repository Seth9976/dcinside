package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class zzaok implements zzaol {
    private final ByteBuffer zza;

    public zzaok(ByteBuffer byteBuffer0) {
        this.zza = byteBuffer0.slice();
    }

    @Override  // com.google.android.gms.internal.ads.zzaol
    public final long zza() {
        return (long)this.zza.capacity();
    }

    @Override  // com.google.android.gms.internal.ads.zzaol
    public final void zzb(MessageDigest[] arr_messageDigest, long v, int v1) throws IOException {
        ByteBuffer byteBuffer0;
        synchronized(this.zza) {
            this.zza.position(((int)v));
            this.zza.limit(((int)v) + v1);
            byteBuffer0 = this.zza.slice();
        }
        for(int v3 = 0; v3 < arr_messageDigest.length; ++v3) {
            MessageDigest messageDigest0 = arr_messageDigest[v3];
            byteBuffer0.position(0);
            messageDigest0.update(byteBuffer0);
        }
    }
}

