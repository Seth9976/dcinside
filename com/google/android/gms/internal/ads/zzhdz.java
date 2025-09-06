package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class zzhdz extends zzhec implements zzaqz {
    protected final String zza;

    public zzhdz(String s) {
        this.zza = "moov";
    }

    @Override  // com.google.android.gms.internal.ads.zzaqz
    public final String zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(zzhed zzhed0, ByteBuffer byteBuffer0, long v, zzaqw zzaqw0) throws IOException {
        zzhed0.zzb();
        byteBuffer0.remaining();
        this.zzc = zzhed0;
        this.zze = zzhed0.zzb();
        zzhed0.zze(zzhed0.zzb() + v);
        this.zzf = zzhed0.zzb();
        this.zzb = zzaqw0;
    }
}

