package com.google.android.gms.internal.ads;

import android.media.AudioTrack.StreamEventCallback;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import j..util.Objects;

@RequiresApi(29)
final class zzqk {
    final zzqm zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    public zzqk(zzqm zzqm0) {
        this.zza = zzqm0;
        super();
        this.zzb = new Handler(Looper.myLooper());
        this.zzc = new zzqj(this);
    }

    public final void zza(AudioTrack audioTrack0) {
        Objects.requireNonNull(this.zzb);
        audioTrack0.registerStreamEventCallback(new zzqi(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack0) {
        audioTrack0.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}

