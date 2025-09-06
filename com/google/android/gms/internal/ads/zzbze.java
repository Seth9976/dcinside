package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzbze {
    final zzbzf zza;
    private long zzb;
    private long zzc;

    public zzbze(zzbzf zzbzf0) {
        this.zza = zzbzf0;
        super();
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("topen", this.zzb);
        bundle0.putLong("tclose", this.zzc);
        return bundle0;
    }

    public final void zzc() {
        this.zzc = this.zza.zza.elapsedRealtime();
    }

    public final void zzd() {
        this.zzb = this.zza.zza.elapsedRealtime();
    }
}

