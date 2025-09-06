package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

public final class zzab {
    private boolean zza;
    private float zzb;

    public zzab() {
        this.zza = false;
        this.zzb = 1.0f;
    }

    public final float zza() {
        synchronized(this) {
            return this.zzf() ? this.zzb : 1.0f;
        }
    }

    public static float zzb(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        if(audioManager0 != null) {
            int v = audioManager0.getStreamMaxVolume(3);
            return v == 0 ? 0.0f : ((float)audioManager0.getStreamVolume(3)) / ((float)v);
        }
        return 0.0f;
    }

    public final void zzc(boolean z) {
        synchronized(this) {
            this.zza = z;
        }
    }

    public final void zzd(float f) {
        synchronized(this) {
            this.zzb = f;
        }
    }

    public final boolean zze() {
        synchronized(this) {
        }
        return this.zza;
    }

    private final boolean zzf() {
        synchronized(this) {
        }
        return Float.compare(this.zzb, 0.0f) >= 0;
    }
}

