package com.google.android.gms.internal.ads;

public abstract class zzfty implements zzfuo {
    @Override  // com.google.android.gms.internal.ads.zzfuo
    @Deprecated
    public final boolean zza(Object object0) {
        return this.zzb(((Character)object0).charValue());
    }

    public abstract boolean zzb(char arg1);

    public static zzfty zzc(char c) {
        return new zzftv(c);
    }
}

