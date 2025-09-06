package com.google.android.gms.internal.consent_sdk;

public final class zzdo implements zzdn {
    private final Object zza;

    private zzdo(Object object0) {
        this.zza = object0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zza;
    }

    public static zzdn zzb(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("instance cannot be null");
        }
        return new zzdo(object0);
    }
}

