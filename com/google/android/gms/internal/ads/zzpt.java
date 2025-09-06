package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

public final class zzpt implements Runnable {
    public final AudioTrack zza;
    public final zzpj zzb;
    public final Handler zzc;
    public final zzpg zzd;

    public zzpt(AudioTrack audioTrack0, zzpj zzpj0, Handler handler0, zzpg zzpg0) {
        this.zza = audioTrack0;
        this.zzb = zzpj0;
        this.zzc = handler0;
        this.zzd = zzpg0;
    }

    @Override
    public final void run() {
        zzqm.zzI(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

