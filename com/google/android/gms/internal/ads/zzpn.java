package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class zzpn {
    private final AudioTrack zza;
    private final AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpn(AudioTrack audioTrack0) {
        this.zza = audioTrack0;
        this.zzb = new AudioTimestamp();
    }

    public final long zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzb.nanoTime / 1000L;
    }

    public final boolean zzc() {
        boolean z = this.zza.getTimestamp(this.zzb);
        if(z) {
            long v = this.zzb.framePosition;
            if(this.zzd > v) {
                ++this.zzc;
            }
            this.zzd = v;
            this.zze = v + this.zzf + (this.zzc << 0x20);
        }
        return z;
    }
}

