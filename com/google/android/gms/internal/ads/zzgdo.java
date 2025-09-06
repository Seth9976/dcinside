package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class zzgdo {
    private final InputStream zza;

    private zzgdo(InputStream inputStream0) {
        this.zza = inputStream0;
    }

    public final zzgsx zza() throws IOException {
        try {
            return zzgsx.zzg(this.zza, zzgxb.zza());
        }
        finally {
            this.zza.close();
        }
    }

    public static zzgdo zzb(byte[] arr_b) {
        return new zzgdo(new ByteArrayInputStream(arr_b));
    }
}

