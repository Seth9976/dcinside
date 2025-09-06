package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

public final class zzaci implements zzadt {
    private final byte[] zza;

    public zzaci() {
        this.zza = new byte[0x1000];
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzf(zzl zzl0, int v, boolean z) {
        return zzadr.zza(this, zzl0, v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final int zzg(zzl zzl0, int v, boolean z, int v1) throws IOException {
        int v2 = zzl0.zza(this.zza, 0, Math.min(0x1000, v));
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzl(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzm(zzab zzab0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzr(zzdy zzdy0, int v) {
        zzadr.zzb(this, zzdy0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzs(zzdy zzdy0, int v, int v1) {
        zzdy0.zzM(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadt
    public final void zzt(long v, int v1, int v2, int v3, @Nullable zzads zzads0) {
    }
}

