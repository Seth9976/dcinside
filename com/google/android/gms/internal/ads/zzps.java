package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;

public final class zzps {
    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzps() {
        this.zza = null;
    }

    public zzps(@Nullable Context context0) {
        this.zza = context0;
    }

    public final zzor zza(zzab zzab0, zze zze0) {
        AudioFormat audioFormat0;
        boolean z1;
        zzab0.getClass();
        zze0.getClass();
        int v = zzei.zza;
        if(v >= 29 && zzab0.zzE != -1) {
            Context context0 = this.zza;
            Boolean boolean0 = this.zzb;
            boolean z = false;
            if(boolean0 == null) {
                if(context0 == null) {
                    this.zzb = Boolean.FALSE;
                }
                else {
                    AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
                    if(audioManager0 == null) {
                        this.zzb = Boolean.FALSE;
                    }
                    else {
                        String s = audioManager0.getParameters("offloadVariableRateSupported");
                        this.zzb = Boolean.valueOf(s != null && s.equals("offloadVariableRateSupported=1"));
                    }
                }
                z1 = this.zzb.booleanValue();
            }
            else {
                z1 = boolean0.booleanValue();
            }
            zzab0.zzo.getClass();
            int v1 = zzbb.zza(zzab0.zzo, zzab0.zzk);
            if(v1 != 0 && v >= zzei.zzh(v1)) {
                int v2 = zzei.zzi(zzab0.zzD);
                if(v2 == 0) {
                    return zzor.zza;
                }
                try {
                    audioFormat0 = zzei.zzx(zzab0.zzE, v2, v1);
                }
                catch(IllegalArgumentException unused_ex) {
                    return zzor.zza;
                }
                if(v >= 0x1F) {
                    int v3 = AudioManager.getPlaybackOffloadSupport(audioFormat0, zze0.zza().zza);
                    if(v3 == 0) {
                        return zzor.zza;
                    }
                    zzop zzop0 = new zzop();
                    if(v > 0x20 && v3 == 2) {
                        z = true;
                    }
                    zzop0.zza(true);
                    zzop0.zzb(z);
                    zzop0.zzc(z1);
                    return zzop0.zzd();
                }
                if(!AudioManager.isOffloadedPlaybackSupported(audioFormat0, zze0.zza().zza)) {
                    return zzor.zza;
                }
                zzop zzop1 = new zzop();
                zzop1.zza(true);
                zzop1.zzc(z1);
                return zzop1.zzd();
            }
            return zzor.zza;
        }
        return zzor.zza;
    }
}

