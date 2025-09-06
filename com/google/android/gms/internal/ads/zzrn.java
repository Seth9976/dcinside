package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

@RequiresApi(23)
final class zzrn implements zzsd {
    private final MediaCodec zza;
    private final zzrt zzb;
    private final zzse zzc;
    @Nullable
    private final zzrz zzd;
    private boolean zze;
    private int zzf;

    zzrn(MediaCodec mediaCodec0, HandlerThread handlerThread0, zzse zzse0, zzrz zzrz0, zzrm zzrm0) {
        this.zza = mediaCodec0;
        this.zzb = new zzrt(handlerThread0);
        this.zzc = zzse0;
        this.zzd = zzrz0;
        this.zzf = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        this.zzc.zzc();
        return this.zzb.zzb(mediaCodec$BufferInfo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    static String zzd(int v) {
        return zzrn.zzt(v, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    static String zze(int v) {
        return zzrn.zzt(v, "ExoPlayer:MediaCodecQueueingThread:");
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

    static void zzh(zzrn zzrn0, MediaFormat mediaFormat0, Surface surface0, MediaCrypto mediaCrypto0, int v) {
        zzrn0.zzb.zzf(zzrn0.zza);
        Trace.beginSection("configureCodec");
        zzrn0.zza.configure(mediaFormat0, surface0, null, v);
        Trace.endSection();
        zzrn0.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrn0.zza.start();
        Trace.endSection();
        if(zzei.zza >= 35) {
            zzrz zzrz0 = zzrn0.zzd;
            if(zzrz0 != null) {
                zzrz0.zza(zzrn0.zza);
            }
        }
        zzrn0.zzf = 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(35)
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzj() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int v, int v1, int v2, long v3, int v4) {
        this.zzc.zzd(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int v, int v1, zzhe zzhe0, long v2, int v3) {
        this.zzc.zze(v, 0, zzhe0, v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        try {
            if(this.zzf == 1) {
                this.zzc.zzg();
                this.zzb.zzh();
                goto label_16;
            label_5:
                if(this.zze) {
                    throw throwable0;
                }
                goto label_6;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_5;
        }
        try {
        label_6:
            int v = zzei.zza;
            if(v >= 30 && v < 33) {
                this.zza.stop();
            }
        }
        catch(Throwable throwable1) {
            goto label_23;
        }
        if(v >= 35) {
            zzrz zzrz0 = this.zzd;
            if(zzrz0 != null) {
                zzrz0.zzc(this.zza);
            }
        }
        this.zza.release();
        this.zze = true;
        throw throwable0;
    label_16:
        this.zzf = 2;
        if(!this.zze) {
            try {
                int v1 = zzei.zza;
                if(v1 >= 30 && v1 < 33) {
                    this.zza.stop();
                }
            }
            catch(Throwable throwable1) {
            label_23:
                if(zzei.zza >= 35) {
                    zzrz zzrz1 = this.zzd;
                    if(zzrz1 != null) {
                        zzrz1.zzc(this.zza);
                    }
                }
                this.zza.release();
                this.zze = true;
                throw throwable1;
            }
            if(v1 >= 35) {
                zzrz zzrz2 = this.zzd;
                if(zzrz2 != null) {
                    zzrz2.zzc(this.zza);
                }
            }
            this.zza.release();
            this.zze = true;
        }
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
    public final void zzp(Surface surface0) {
        this.zza.setOutputSurface(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzq(Bundle bundle0) {
        this.zzc.zzf(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int v) {
        this.zza.setVideoScalingMode(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsd
    public final boolean zzs(zzsc zzsc0) {
        this.zzb.zzg(zzsc0);
        return true;
    }

    private static String zzt(int v, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(v == 1) {
            stringBuilder0.append("Audio");
            return stringBuilder0.toString();
        }
        if(v == 2) {
            stringBuilder0.append("Video");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("Unknown(");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

