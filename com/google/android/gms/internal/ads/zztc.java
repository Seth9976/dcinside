package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

public final class zztc implements zzsd {
    private final MediaCodec zza;
    @Nullable
    private final zzrz zzb;

    zztc(MediaCodec mediaCodec0, zzrz zzrz0, zztb zztb0) {
        this.zza = mediaCodec0;
        this.zzb = zzrz0;
        if(zzei.zza >= 35 && zzrz0 != null) {
            zzrz0.zza(mediaCodec0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        int v;
        do {
            v = this.zza.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
        }
        while(v == -3);
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzf(int v) {
        return this.zza.getInputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzg(int v) {
        return this.zza.getOutputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(35)
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzj() {
        this.zza.flush();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int v, int v1, int v2, long v3, int v4) {
        this.zza.queueInputBuffer(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int v, int v1, zzhe zzhe0, long v2, int v3) {
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzhe0.zza();
        this.zza.queueSecureInputBuffer(v, 0, mediaCodec$CryptoInfo0, v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        try {
            int v = zzei.zza;
            if(v >= 30 && v < 33) {
                this.zza.stop();
            }
        }
        catch(Throwable throwable0) {
            if(zzei.zza >= 35) {
                zzrz zzrz0 = this.zzb;
                if(zzrz0 != null) {
                    zzrz0.zzc(this.zza);
                }
            }
            this.zza.release();
            throw throwable0;
        }
        if(v >= 35) {
            zzrz zzrz1 = this.zzb;
            if(zzrz1 != null) {
                zzrz1.zzc(this.zza);
            }
        }
        this.zza.release();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzn(int v, long v1) {
        this.zza.releaseOutputBuffer(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzo(int v, boolean z) {
        this.zza.releaseOutputBuffer(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(23)
    public final void zzp(Surface surface0) {
        this.zza.setOutputSurface(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzq(Bundle bundle0) {
        this.zza.setParameters(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int v) {
        this.zza.setVideoScalingMode(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final boolean zzs(zzsc zzsc0) {
        return false;
    }
}

