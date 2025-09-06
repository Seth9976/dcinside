package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

final class zzcao implements Runnable {
    final MediaPlayer zza;
    final zzcaw zzb;

    zzcao(zzcaw zzcaw0, MediaPlayer mediaPlayer0) {
        this.zza = mediaPlayer0;
        this.zzb = zzcaw0;
        super();
    }

    @Override
    public final void run() {
        zzcaw.zzl(this.zzb, this.zza);
        zzcaw zzcaw0 = this.zzb;
        if(zzcaw0.zzq != null) {
            zzcaw0.zzq.zzf();
        }
    }
}

