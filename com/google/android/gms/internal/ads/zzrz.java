package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;

@RequiresApi(35)
public final class zzrz {
    private final HashSet zza;
    @Nullable
    private LoudnessCodecController zzb;

    public zzrz() {
        throw null;
    }

    public zzrz(zzry zzry0) {
        this.zza = new HashSet();
    }

    public final void zza(MediaCodec mediaCodec0) {
        if(this.zzb != null && !this.zzb.addMediaCodec(mediaCodec0)) {
            return;
        }
        zzcw.zzf(this.zza.add(mediaCodec0));
    }

    public final void zzb() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController0 = this.zzb;
        if(loudnessCodecController0 != null) {
            loudnessCodecController0.close();
        }
    }

    public final void zzc(MediaCodec mediaCodec0) {
        if(this.zza.remove(mediaCodec0)) {
            LoudnessCodecController loudnessCodecController0 = this.zzb;
            if(loudnessCodecController0 != null) {
                loudnessCodecController0.removeMediaCodec(mediaCodec0);
            }
        }
    }

    public final void zzd(int v) {
        LoudnessCodecController loudnessCodecController0 = this.zzb;
        if(loudnessCodecController0 != null) {
            loudnessCodecController0.close();
            this.zzb = null;
        }
        LoudnessCodecController loudnessCodecController1 = LoudnessCodecController.create(v, zzgcz.zzc(), new zzrw(this));
        this.zzb = loudnessCodecController1;
        Iterator iterator0 = this.zza.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!loudnessCodecController1.addMediaCodec(((MediaCodec)object0))) {
                iterator0.remove();
            }
        }
    }
}

