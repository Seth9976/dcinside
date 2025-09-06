package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

public final class zzaqx extends zzhec implements Closeable {
    static {
        zzhej.zzb(zzaqx.class);
    }

    public zzaqx(zzhed zzhed0, zzaqw zzaqw0) throws IOException {
        this.zze(zzhed0, zzhed0.zzc(), zzaqw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhec
    public final void close() throws IOException {
    }

    @Override  // com.google.android.gms.internal.ads.zzhec
    public final String toString() {
        return "model(" + this.zzc.toString() + ")";
    }
}

