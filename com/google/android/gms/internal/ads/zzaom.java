package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

final class zzaom implements zzaol {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaom(FileChannel fileChannel0, long v, long v1) {
        this.zza = fileChannel0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaol
    public final long zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaol
    public final void zzb(MessageDigest[] arr_messageDigest, long v, int v1) throws IOException {
        MappedByteBuffer mappedByteBuffer0 = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + v, ((long)v1));
        mappedByteBuffer0.load();
        for(int v2 = 0; v2 < arr_messageDigest.length; ++v2) {
            MessageDigest messageDigest0 = arr_messageDigest[v2];
            mappedByteBuffer0.position(0);
            messageDigest0.update(mappedByteBuffer0);
        }
    }
}

