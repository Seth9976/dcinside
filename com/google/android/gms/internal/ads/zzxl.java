package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j..util.Objects;

@RequiresApi(0x20)
final class zzxl {
    private final Spatializer zza;
    private final boolean zzb;
    @Nullable
    private Handler zzc;
    @Nullable
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxl(Spatializer spatializer0) {
        this.zza = spatializer0;
        this.zzb = spatializer0.getImmersiveAudioLevel() != 0;
    }

    @Nullable
    public static zzxl zza(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        return audioManager0 == null ? null : new zzxl(audioManager0.getSpatializer());
    }

    public final void zzb(zzxt zzxt0, Looper looper0) {
        if(this.zzd == null && this.zzc == null) {
            this.zzd = new zzxk(this, zzxt0);
            Handler handler0 = new Handler(looper0);
            this.zzc = handler0;
            Objects.requireNonNull(handler0);
            zzxj zzxj0 = new zzxj(handler0);
            this.zza.addOnSpatializerStateChangedListener(zzxj0, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener0 = this.zzd;
        if(spatializer$OnSpatializerStateChangedListener0 != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener0);
            this.zzc.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zze zze0, zzab zzab0) {
        int v;
        if(!Objects.equals(zzab0.zzo, "audio/eac3-joc") || zzab0.zzD != 16) {
            v = !Objects.equals(zzab0.zzo, "audio/iamf") || zzab0.zzD != -1 ? zzab0.zzD : 6;
        }
        else {
            v = 12;
        }
        int v1 = zzei.zzi(v);
        if(v1 == 0) {
            return false;
        }
        AudioFormat.Builder audioFormat$Builder0 = new AudioFormat.Builder().setEncoding(2).setChannelMask(v1);
        int v2 = zzab0.zzE;
        if(v2 != -1) {
            audioFormat$Builder0.setSampleRate(v2);
        }
        zzc zzc0 = zze0.zza();
        AudioFormat audioFormat0 = audioFormat$Builder0.build();
        return this.zza.canBeSpatialized(zzc0.zza, audioFormat0);
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}

