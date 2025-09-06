package com.google.android.gms.internal.ads;

public final class zzgnt extends RuntimeException {
    public zzgnt(String s) {
        super(s);
    }

    public zzgnt(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public zzgnt(Throwable throwable0) {
        super(throwable0);
    }

    public static Object zza(zzgns zzgns0) {
        try {
            return zzgns0.zza();
        }
        catch(Exception exception0) {
            throw new zzgnt(exception0);
        }
    }
}

