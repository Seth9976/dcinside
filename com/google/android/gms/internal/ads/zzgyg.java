package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgyg extends IOException {
    private boolean zza;

    public zzgyg(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
    }

    public zzgyg(String s) {
        super(s);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }
}

