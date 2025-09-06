package com.google.android.gms.internal.ads;

final class zzgcx extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    public zzgcx(Runnable runnable0) {
        runnable0.getClass();
        this.zza = runnable0;
    }

    @Override
    public final void run() {
        try {
            this.zza.run();
        }
        catch(Throwable throwable0) {
            this.zzd(throwable0);
            throw throwable0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }
}

