package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class zzbbc extends PushbackInputStream {
    final zzbbd zza;

    zzbbc(zzbbd zzbbd0, InputStream inputStream0, int v) {
        this.zza = zzbbd0;
        super(inputStream0, 1);
    }

    @Override
    public final void close() throws IOException {
        synchronized(this) {
            zzbbf.zze(this.zza.zzc);
            super.close();
        }
    }
}

