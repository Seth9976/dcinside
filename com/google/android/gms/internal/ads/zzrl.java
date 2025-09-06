package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

public final class zzrl implements zzsb {
    private final zzfvf zza;
    private final zzfvf zzb;
    private boolean zzc;

    public zzrl(int v) {
        zzrj zzrj0 = () -> new HandlerThread(zzrn.zzd(v));
        zzrk zzrk0 = () -> new HandlerThread(zzrn.zze(v));
        super();
        this.zza = zzrj0;
        this.zzb = zzrk0;
        this.zzc = true;
    }

    // 检测为 Lambda 实现
    static HandlerThread zza(int v) [...]

    // 检测为 Lambda 实现
    static HandlerThread zzb(int v) [...]

    public final zzrn zzc(zzsa zzsa0) throws IOException {
        zzrn zzrn1;
        int v;
        zzrr zzrr0;
        MediaCodec mediaCodec0;
        zzrn zzrn0 = null;
        try {
            Trace.beginSection(("createCodec:" + zzsa0.zza.zza));
            mediaCodec0 = null;
            mediaCodec0 = MediaCodec.createByCodecName(zzsa0.zza.zza);
            if(!this.zzc || (zzei.zza < 34 || zzei.zza < 35 && !zzbb.zzi(zzsa0.zzc.zzo))) {
                zzrr0 = new zzrr(mediaCodec0, zzrl.zzb(((zzrk)this.zzb).zza));
                v = 0;
            }
            else {
                zzrr0 = new zztd(mediaCodec0);
                v = 4;
            }
            zzrn1 = new zzrn(mediaCodec0, zzrl.zza(((zzrj)this.zza).zza), zzrr0, zzsa0.zzf, null);
        }
        catch(Exception exception0) {
            goto label_22;
        }
        try {
            Trace.endSection();
            Surface surface0 = zzsa0.zzd;
            if(surface0 == null && zzsa0.zza.zzh && zzei.zza >= 35) {
                v |= 8;
            }
            zzrn.zzh(zzrn1, zzsa0.zzb, surface0, null, v);
            return zzrn1;
        label_21:
            zzrn0 = zzrn1;
        }
        catch(Exception exception0) {
            goto label_21;
        }
    label_22:
        if(zzrn0 != null) {
            zzrn0.zzm();
        }
        else if(mediaCodec0 != null) {
            mediaCodec0.release();
        }
        throw exception0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsb
    public final zzsd zzd(zzsa zzsa0) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzc = true;
    }
}

