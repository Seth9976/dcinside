package com.google.android.gms.internal.ads;

final class zzgax.zzc {
    static final zzgax.zzc zza;
    final Throwable zzb;

    static {
        zzgax.zzc.zza = new zzgax.zzc(new Throwable("Failure occurred while trying to finish a future.") {
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override
            public final Throwable fillInStackTrace() {
                synchronized(this) {
                }
                return this;
            }
        });
    }

    zzgax.zzc(Throwable throwable0) {
        throwable0.getClass();
        this.zzb = throwable0;
    }
}

