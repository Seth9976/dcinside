package com.google.android.gms.internal.ads;

public final class zzhag extends RuntimeException {
    public zzhag(zzgzc zzgzc0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyg zza() {
        return new zzgyg(this.getMessage());
    }
}

