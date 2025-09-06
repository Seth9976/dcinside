package com.google.android.gms.internal.ads;

public final class zzop {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzop zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzop zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzop zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzor zzd() {
        if(!this.zza && (this.zzb || this.zzc)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzor(this, null);
    }
}

