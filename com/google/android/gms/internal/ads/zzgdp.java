package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

public final class zzgdp {
    private final OutputStream zza;

    private zzgdp(OutputStream outputStream0) {
        this.zza = outputStream0;
    }

    public final void zza(zzgsx zzgsx0) throws IOException {
        try {
            zzgsx0.zzaU(this.zza);
        }
        finally {
            this.zza.close();
        }
    }

    public static zzgdp zzb(OutputStream outputStream0) {
        return new zzgdp(outputStream0);
    }
}

