package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;

public final class zzc {
    public final AudioAttributes zza;

    zzc(zze zze0, zzd zzd0) {
        AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int v = zzei.zza;
        if(v >= 29) {
            audioAttributes$Builder0.setAllowedCapturePolicy(1);
        }
        if(v >= 0x20) {
            audioAttributes$Builder0.setSpatializationBehavior(0);
        }
        this.zza = audioAttributes$Builder0.build();
    }
}

